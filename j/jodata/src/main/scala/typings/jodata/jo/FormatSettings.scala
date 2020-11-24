package typings.jodata.jo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormatSettings extends ISettings {
  
  var DefaultFormat: String = js.native
  
  var Format: String = js.native
}
object FormatSettings {
  
  @scala.inline
  def apply(DefaultFormat: String, Format: String, isSet: () => Boolean, reset: () => Unit): FormatSettings = {
    val __obj = js.Dynamic.literal(DefaultFormat = DefaultFormat.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], isSet = js.Any.fromFunction0(isSet), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[FormatSettings]
  }
  
  @scala.inline
  implicit class FormatSettingsOps[Self <: FormatSettings] (val x: Self) extends AnyVal {
    
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
    def setDefaultFormat(value: String): Self = this.set("DefaultFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: String): Self = this.set("Format", value.asInstanceOf[js.Any])
  }
}
