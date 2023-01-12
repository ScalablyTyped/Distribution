package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeListColumnCommandItem extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var click: js.UndefOr[js.Function] = js.undefined
  
  var imageClass: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
}
object TreeListColumnCommandItem {
  
  inline def apply(): TreeListColumnCommandItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeListColumnCommandItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TreeListColumnCommandItem] (val x: Self) extends AnyVal {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setClick(value: js.Function): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    inline def setImageClass(value: String): Self = StObject.set(x, "imageClass", value.asInstanceOf[js.Any])
    
    inline def setImageClassUndefined: Self = StObject.set(x, "imageClass", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
