package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalizedText extends StObject {
  
  /** Language localization code (a BCP-47 language tag; for example, "de-AT" for Austrian German). */
  var language: js.UndefOr[String] = js.native
  
  /** The text in the given language. */
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
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
