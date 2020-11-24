package typings.ipfsHttpServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowUnknown extends js.Object {
  
  var allowUnknown: Boolean = js.native
  
  var stripUnknown: Boolean = js.native
}
object AllowUnknown {
  
  @scala.inline
  def apply(allowUnknown: Boolean, stripUnknown: Boolean): AllowUnknown = {
    val __obj = js.Dynamic.literal(allowUnknown = allowUnknown.asInstanceOf[js.Any], stripUnknown = stripUnknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowUnknown]
  }
  
  @scala.inline
  implicit class AllowUnknownOps[Self <: AllowUnknown] (val x: Self) extends AnyVal {
    
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
    def setAllowUnknown(value: Boolean): Self = this.set("allowUnknown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStripUnknown(value: Boolean): Self = this.set("stripUnknown", value.asInstanceOf[js.Any])
  }
}
