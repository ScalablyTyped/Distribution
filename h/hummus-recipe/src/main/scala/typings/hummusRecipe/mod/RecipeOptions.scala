package typings.hummusRecipe.mod

import typings.hummusRecipe.hummusRecipeStrings.cmyk
import typings.hummusRecipe.hummusRecipeStrings.grey
import typings.hummusRecipe.hummusRecipeStrings.rgb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecipeOptions extends StObject {
  
  var author: js.UndefOr[String] = js.undefined
  
  var colorspace: js.UndefOr[rgb | cmyk | grey] = js.undefined
  
  var fontSrcPath: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var keywords: js.UndefOr[js.Array[String]] = js.undefined
  
  var ownerPassword: js.UndefOr[String] = js.undefined
  
  var password: js.UndefOr[String] = js.undefined
  
  var subject: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var userPassword: js.UndefOr[String] = js.undefined
  
  var userProtectionFlag: js.UndefOr[String] = js.undefined
  
  var version: js.UndefOr[Double] = js.undefined
}
object RecipeOptions {
  
  inline def apply(): RecipeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecipeOptions] (val x: Self) extends AnyVal {
    
    inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setColorspace(value: rgb | cmyk | grey): Self = StObject.set(x, "colorspace", value.asInstanceOf[js.Any])
    
    inline def setColorspaceUndefined: Self = StObject.set(x, "colorspace", js.undefined)
    
    inline def setFontSrcPath(value: String | js.Array[String]): Self = StObject.set(x, "fontSrcPath", value.asInstanceOf[js.Any])
    
    inline def setFontSrcPathUndefined: Self = StObject.set(x, "fontSrcPath", js.undefined)
    
    inline def setFontSrcPathVarargs(value: String*): Self = StObject.set(x, "fontSrcPath", js.Array(value*))
    
    inline def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    inline def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value*))
    
    inline def setOwnerPassword(value: String): Self = StObject.set(x, "ownerPassword", value.asInstanceOf[js.Any])
    
    inline def setOwnerPasswordUndefined: Self = StObject.set(x, "ownerPassword", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUserPassword(value: String): Self = StObject.set(x, "userPassword", value.asInstanceOf[js.Any])
    
    inline def setUserPasswordUndefined: Self = StObject.set(x, "userPassword", js.undefined)
    
    inline def setUserProtectionFlag(value: String): Self = StObject.set(x, "userProtectionFlag", value.asInstanceOf[js.Any])
    
    inline def setUserProtectionFlagUndefined: Self = StObject.set(x, "userProtectionFlag", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
