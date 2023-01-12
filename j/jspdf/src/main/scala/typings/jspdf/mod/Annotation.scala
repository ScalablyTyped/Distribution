package typings.jspdf.mod

import typings.jspdf.anon.H
import typings.jspdf.jspdfStrings.freetext
import typings.jspdf.jspdfStrings.link
import typings.jspdf.jspdfStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Annotation extends StObject {
  
  var bounds: H
  
  var color: js.UndefOr[String] = js.undefined
  
  var contents: String
  
  var name: js.UndefOr[String] = js.undefined
  
  var open: js.UndefOr[Boolean] = js.undefined
  
  var pageNumber: js.UndefOr[Double] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var top: js.UndefOr[Double] = js.undefined
  
  var `type`: text | freetext | link
}
object Annotation {
  
  inline def apply(bounds: H, contents: String, `type`: text | freetext | link): Annotation = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], contents = contents.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Annotation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Annotation] (val x: Self) extends AnyVal {
    
    inline def setBounds(value: H): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
    
    inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setType(value: text | freetext | link): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
