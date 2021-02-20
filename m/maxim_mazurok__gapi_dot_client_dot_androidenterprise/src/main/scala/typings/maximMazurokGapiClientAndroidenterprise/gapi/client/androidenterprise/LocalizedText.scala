package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalizedText extends StObject {
  
  /** The BCP47 tag for a locale. (e.g. "en-US", "de"). */
  var locale: js.UndefOr[String] = js.native
  
  /** The text localized in the associated locale. */
  var text: js.UndefOr[String] = js.native
}
object LocalizedText {
  
  @scala.inline
  def apply(): LocalizedText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalizedText]
  }
  
  @scala.inline
  implicit class LocalizedTextMutableBuilder[Self <: LocalizedText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
