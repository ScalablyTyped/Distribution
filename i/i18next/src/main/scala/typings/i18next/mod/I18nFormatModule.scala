package typings.i18next.mod

import typings.i18next.i18nextStrings.i18nFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait I18nFormatModule extends Module {
  
  @JSName("type")
  var type_I18nFormatModule: i18nFormat = js.native
}
object I18nFormatModule {
  
  @scala.inline
  def apply(`type`: i18nFormat): I18nFormatModule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[I18nFormatModule]
  }
  
  @scala.inline
  implicit class I18nFormatModuleMutableBuilder[Self <: I18nFormatModule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: i18nFormat): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
