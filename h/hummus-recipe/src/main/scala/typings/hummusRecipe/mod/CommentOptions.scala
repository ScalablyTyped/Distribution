package typings.hummusRecipe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentOptions extends StObject {
  
  var date: js.UndefOr[String] = js.undefined
  
  var flag: js.UndefOr[CommentOptionsFlag] = js.undefined
  
  var open: js.UndefOr[Boolean] = js.undefined
  
  var richText: js.UndefOr[Boolean] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object CommentOptions {
  
  inline def apply(): CommentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentOptions]
  }
  
  extension [Self <: CommentOptions](x: Self) {
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setFlag(value: CommentOptionsFlag): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
    
    inline def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
    
    inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setRichText(value: Boolean): Self = StObject.set(x, "richText", value.asInstanceOf[js.Any])
    
    inline def setRichTextUndefined: Self = StObject.set(x, "richText", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
