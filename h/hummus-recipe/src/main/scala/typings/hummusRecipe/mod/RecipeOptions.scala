package typings.hummusRecipe.mod

import typings.hummusRecipe.hummusRecipeStrings.cmyk
import typings.hummusRecipe.hummusRecipeStrings.grey
import typings.hummusRecipe.hummusRecipeStrings.rgb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecipeOptions extends StObject {
  
  var author: js.UndefOr[String] = js.native
  
  var colorspace: js.UndefOr[rgb | cmyk | grey] = js.native
  
  var fontSrcPath: js.UndefOr[String | js.Array[String]] = js.native
  
  var keywords: js.UndefOr[js.Array[String]] = js.native
  
  var ownerPassword: js.UndefOr[String] = js.native
  
  var password: js.UndefOr[String] = js.native
  
  var subject: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var userPassword: js.UndefOr[String] = js.native
  
  var userProtectionFlag: js.UndefOr[String] = js.native
  
  var version: js.UndefOr[Double] = js.native
}
object RecipeOptions {
  
  @scala.inline
  def apply(): RecipeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipeOptions]
  }
  
  @scala.inline
  implicit class RecipeOptionsMutableBuilder[Self <: RecipeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    @scala.inline
    def setColorspace(value: rgb | cmyk | grey): Self = StObject.set(x, "colorspace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorspaceUndefined: Self = StObject.set(x, "colorspace", js.undefined)
    
    @scala.inline
    def setFontSrcPath(value: String | js.Array[String]): Self = StObject.set(x, "fontSrcPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSrcPathUndefined: Self = StObject.set(x, "fontSrcPath", js.undefined)
    
    @scala.inline
    def setFontSrcPathVarargs(value: String*): Self = StObject.set(x, "fontSrcPath", js.Array(value :_*))
    
    @scala.inline
    def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    @scala.inline
    def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value :_*))
    
    @scala.inline
    def setOwnerPassword(value: String): Self = StObject.set(x, "ownerPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerPasswordUndefined: Self = StObject.set(x, "ownerPassword", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUserPassword(value: String): Self = StObject.set(x, "userPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPasswordUndefined: Self = StObject.set(x, "userPassword", js.undefined)
    
    @scala.inline
    def setUserProtectionFlag(value: String): Self = StObject.set(x, "userProtectionFlag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProtectionFlagUndefined: Self = StObject.set(x, "userProtectionFlag", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
