package typings.jodata.jo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpandSettings extends ISettings {
  
  var DefaultExpand: String = js.native
  
  var Expand: String = js.native
}
object ExpandSettings {
  
  @scala.inline
  def apply(DefaultExpand: String, Expand: String, isSet: () => Boolean, reset: () => Unit): ExpandSettings = {
    val __obj = js.Dynamic.literal(DefaultExpand = DefaultExpand.asInstanceOf[js.Any], Expand = Expand.asInstanceOf[js.Any], isSet = js.Any.fromFunction0(isSet), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[ExpandSettings]
  }
  
  @scala.inline
  implicit class ExpandSettingsOps[Self <: ExpandSettings] (val x: Self) extends AnyVal {
    
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
    def setDefaultExpand(value: String): Self = this.set("DefaultExpand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpand(value: String): Self = this.set("Expand", value.asInstanceOf[js.Any])
  }
}
