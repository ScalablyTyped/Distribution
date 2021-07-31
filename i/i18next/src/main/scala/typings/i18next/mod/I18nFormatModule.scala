package typings.i18next.mod

import typings.i18next.i18nextStrings.i18nFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait I18nFormatModule
  extends StObject
     with Module {
  
  @JSName("type")
  var type_I18nFormatModule: i18nFormat
}
object I18nFormatModule {
  
  @scala.inline
  def apply(): I18nFormatModule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("i18nFormat")
    __obj.asInstanceOf[I18nFormatModule]
  }
  
  @scala.inline
  implicit class I18nFormatModuleMutableBuilder[Self <: I18nFormatModule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: i18nFormat): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
