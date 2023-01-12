package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalizedText extends StObject {
  
  /** The BCP47 tag for a locale. (e.g. "en-US", "de"). */
  var locale: js.UndefOr[String] = js.undefined
  
  /** The text localized in the associated locale. */
  var text: js.UndefOr[String] = js.undefined
}
object LocalizedText {
  
  inline def apply(): LocalizedText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalizedText]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocalizedText] (val x: Self) extends AnyVal {
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
