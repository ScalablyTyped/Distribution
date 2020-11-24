package typings.jupyterlabApputils.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Above extends js.Object {
  
  var above: js.UndefOr[Double] = js.native
  
  var below: js.UndefOr[Double] = js.native
}
object Above {
  
  @scala.inline
  def apply(): Above = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Above]
  }
  
  @scala.inline
  implicit class AboveOps[Self <: Above] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAbove(value: Double): Self = this.set("above", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbove: Self = this.set("above", js.undefined)
    
    @scala.inline
    def setBelow(value: Double): Self = this.set("below", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBelow: Self = this.set("below", js.undefined)
  }
}
