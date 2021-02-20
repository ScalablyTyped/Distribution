package typings.hummusRecipe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommentOptions extends StObject {
  
  var date: js.UndefOr[String] = js.native
  
  var flag: js.UndefOr[CommentOptionsFlag] = js.native
  
  var open: js.UndefOr[Boolean] = js.native
  
  var richText: js.UndefOr[Boolean] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object CommentOptions {
  
  @scala.inline
  def apply(): CommentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentOptions]
  }
  
  @scala.inline
  implicit class CommentOptionsMutableBuilder[Self <: CommentOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setFlag(value: CommentOptionsFlag): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
    
    @scala.inline
    def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    @scala.inline
    def setRichText(value: Boolean): Self = StObject.set(x, "richText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRichTextUndefined: Self = StObject.set(x, "richText", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
