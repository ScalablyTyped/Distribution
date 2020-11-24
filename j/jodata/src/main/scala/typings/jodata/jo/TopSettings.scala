package typings.jodata.jo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopSettings extends ISettings {
  
  var DefaultTop: Double = js.native
  
  var Top: Double = js.native
}
object TopSettings {
  
  @scala.inline
  def apply(DefaultTop: Double, Top: Double, isSet: () => Boolean, reset: () => Unit): TopSettings = {
    val __obj = js.Dynamic.literal(DefaultTop = DefaultTop.asInstanceOf[js.Any], Top = Top.asInstanceOf[js.Any], isSet = js.Any.fromFunction0(isSet), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[TopSettings]
  }
  
  @scala.inline
  implicit class TopSettingsOps[Self <: TopSettings] (val x: Self) extends AnyVal {
    
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
    def setDefaultTop(value: Double): Self = this.set("DefaultTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Double): Self = this.set("Top", value.asInstanceOf[js.Any])
  }
}
