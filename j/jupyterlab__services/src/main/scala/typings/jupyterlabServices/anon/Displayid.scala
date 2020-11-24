package typings.jupyterlabServices.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Displayid extends js.Object {
  
  var display_id: js.UndefOr[String] = js.native
}
object Displayid {
  
  @scala.inline
  def apply(): Displayid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Displayid]
  }
  
  @scala.inline
  implicit class DisplayidOps[Self <: Displayid] (val x: Self) extends AnyVal {
    
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
    def setDisplay_id(value: String): Self = this.set("display_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay_id: Self = this.set("display_id", js.undefined)
  }
}
