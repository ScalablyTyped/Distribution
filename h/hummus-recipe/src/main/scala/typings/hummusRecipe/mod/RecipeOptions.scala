package typings.hummusRecipe.mod

import typings.hummusRecipe.hummusRecipeStrings.cmyk
import typings.hummusRecipe.hummusRecipeStrings.grey
import typings.hummusRecipe.hummusRecipeStrings.rgb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecipeOptions extends js.Object {
  
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
  implicit class RecipeOptionsOps[Self <: RecipeOptions] (val x: Self) extends AnyVal {
    
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
    def setAuthor(value: String): Self = this.set("author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthor: Self = this.set("author", js.undefined)
    
    @scala.inline
    def setColorspace(value: rgb | cmyk | grey): Self = this.set("colorspace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorspace: Self = this.set("colorspace", js.undefined)
    
    @scala.inline
    def setFontSrcPathVarargs(value: String*): Self = this.set("fontSrcPath", js.Array(value :_*))
    
    @scala.inline
    def setFontSrcPath(value: String | js.Array[String]): Self = this.set("fontSrcPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSrcPath: Self = this.set("fontSrcPath", js.undefined)
    
    @scala.inline
    def setKeywordsVarargs(value: String*): Self = this.set("keywords", js.Array(value :_*))
    
    @scala.inline
    def setKeywords(value: js.Array[String]): Self = this.set("keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeywords: Self = this.set("keywords", js.undefined)
    
    @scala.inline
    def setOwnerPassword(value: String): Self = this.set("ownerPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerPassword: Self = this.set("ownerPassword", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setUserPassword(value: String): Self = this.set("userPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserPassword: Self = this.set("userPassword", js.undefined)
    
    @scala.inline
    def setUserProtectionFlag(value: String): Self = this.set("userProtectionFlag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserProtectionFlag: Self = this.set("userProtectionFlag", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
