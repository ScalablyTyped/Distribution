package typings.kdbxweb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Settings extends StObject {
  
  var binaries: js.UndefOr[Boolean] = js.native
  
  var customIcons: js.UndefOr[Boolean] = js.native
  
  var historyRules: js.UndefOr[Boolean] = js.native
}
object Settings {
  
  @scala.inline
  def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  
  @scala.inline
  implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBinaries(value: Boolean): Self = StObject.set(x, "binaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinariesUndefined: Self = StObject.set(x, "binaries", js.undefined)
    
    @scala.inline
    def setCustomIcons(value: Boolean): Self = StObject.set(x, "customIcons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomIconsUndefined: Self = StObject.set(x, "customIcons", js.undefined)
    
    @scala.inline
    def setHistoryRules(value: Boolean): Self = StObject.set(x, "historyRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryRulesUndefined: Self = StObject.set(x, "historyRules", js.undefined)
  }
}
