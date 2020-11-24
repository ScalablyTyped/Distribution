package typings.jsmediatags.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndIx extends js.Object {
  
  var endIx: Double = js.native
  
  var insertIx: js.UndefOr[Double] = js.native
  
  var startIx: Double = js.native
}
object EndIx {
  
  @scala.inline
  def apply(endIx: Double, startIx: Double): EndIx = {
    val __obj = js.Dynamic.literal(endIx = endIx.asInstanceOf[js.Any], startIx = startIx.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndIx]
  }
  
  @scala.inline
  implicit class EndIxOps[Self <: EndIx] (val x: Self) extends AnyVal {
    
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
    def setEndIx(value: Double): Self = this.set("endIx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartIx(value: Double): Self = this.set("startIx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertIx(value: Double): Self = this.set("insertIx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertIx: Self = this.set("insertIx", js.undefined)
  }
}
