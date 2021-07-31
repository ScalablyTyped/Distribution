package typings.hummusRecipe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotOptions extends StObject {
  
  var flag: js.UndefOr[AnnotOptionsFlag] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var icon: js.UndefOr[AnnotOptionsIcon] = js.undefined
  
  var open: js.UndefOr[Boolean] = js.undefined
  
  var richText: js.UndefOr[Boolean] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object AnnotOptions {
  
  @scala.inline
  def apply(): AnnotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotOptions]
  }
  
  @scala.inline
  implicit class AnnotOptionsMutableBuilder[Self <: AnnotOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlag(value: AnnotOptionsFlag): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setIcon(value: AnnotOptionsIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
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
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
