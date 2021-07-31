package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLocalizedProperty extends StObject {
  
  var default: js.UndefOr[String] = js.undefined
  
  /**
    * The language of the default property.
    */
  var defaultLanguage: js.UndefOr[SchemaLanguageTag] = js.undefined
  
  var localized: js.UndefOr[js.Array[SchemaLocalizedString]] = js.undefined
}
object SchemaLocalizedProperty {
  
  @scala.inline
  def apply(): SchemaLocalizedProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocalizedProperty]
  }
  
  @scala.inline
  implicit class SchemaLocalizedPropertyMutableBuilder[Self <: SchemaLocalizedProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultLanguage(value: SchemaLanguageTag): Self = StObject.set(x, "defaultLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultLanguageUndefined: Self = StObject.set(x, "defaultLanguage", js.undefined)
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    @scala.inline
    def setLocalized(value: js.Array[SchemaLocalizedString]): Self = StObject.set(x, "localized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalizedUndefined: Self = StObject.set(x, "localized", js.undefined)
    
    @scala.inline
    def setLocalizedVarargs(value: SchemaLocalizedString*): Self = StObject.set(x, "localized", js.Array(value :_*))
  }
}
