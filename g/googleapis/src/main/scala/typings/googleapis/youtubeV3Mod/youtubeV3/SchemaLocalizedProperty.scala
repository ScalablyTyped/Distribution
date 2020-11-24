package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaLocalizedProperty extends js.Object {
  
  var default: js.UndefOr[String] = js.native
  
  /**
    * The language of the default property.
    */
  var defaultLanguage: js.UndefOr[SchemaLanguageTag] = js.native
  
  var localized: js.UndefOr[js.Array[SchemaLocalizedString]] = js.native
}
object SchemaLocalizedProperty {
  
  @scala.inline
  def apply(): SchemaLocalizedProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocalizedProperty]
  }
  
  @scala.inline
  implicit class SchemaLocalizedPropertyOps[Self <: SchemaLocalizedProperty] (val x: Self) extends AnyVal {
    
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
    def setDefault(value: String): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    
    @scala.inline
    def setDefaultLanguage(value: SchemaLanguageTag): Self = this.set("defaultLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultLanguage: Self = this.set("defaultLanguage", js.undefined)
    
    @scala.inline
    def setLocalizedVarargs(value: SchemaLocalizedString*): Self = this.set("localized", js.Array(value :_*))
    
    @scala.inline
    def setLocalized(value: js.Array[SchemaLocalizedString]): Self = this.set("localized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalized: Self = this.set("localized", js.undefined)
  }
}
