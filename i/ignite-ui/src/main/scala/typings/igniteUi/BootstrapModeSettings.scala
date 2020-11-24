package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapModeSettings
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  var key: js.UndefOr[String] = js.native
  
  var visibilityTester: js.UndefOr[js.Any] = js.native
}
object BootstrapModeSettings {
  
  @scala.inline
  def apply(): BootstrapModeSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BootstrapModeSettings]
  }
  
  @scala.inline
  implicit class BootstrapModeSettingsOps[Self <: BootstrapModeSettings] (val x: Self) extends AnyVal {
    
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setVisibilityTester(value: js.Any): Self = this.set("visibilityTester", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibilityTester: Self = this.set("visibilityTester", js.undefined)
  }
}
