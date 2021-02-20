package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaLocalizedString extends StObject {
  
  var language: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[String] = js.native
}
object SchemaLocalizedString {
  
  @scala.inline
  def apply(): SchemaLocalizedString = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocalizedString]
  }
  
  @scala.inline
  implicit class SchemaLocalizedStringMutableBuilder[Self <: SchemaLocalizedString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
