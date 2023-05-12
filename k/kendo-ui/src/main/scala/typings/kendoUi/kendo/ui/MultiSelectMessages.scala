package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiSelectMessages extends StObject {
  
  var clear: js.UndefOr[String] = js.undefined
  
  var deleteTag: js.UndefOr[String] = js.undefined
  
  var downArrow: js.UndefOr[String] = js.undefined
  
  var noData: js.UndefOr[String] = js.undefined
  
  var singleTag: js.UndefOr[String] = js.undefined
}
object MultiSelectMessages {
  
  inline def apply(): MultiSelectMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiSelectMessages]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MultiSelectMessages] (val x: Self) extends AnyVal {
    
    inline def setClear(value: String): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
    
    inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
    
    inline def setDeleteTag(value: String): Self = StObject.set(x, "deleteTag", value.asInstanceOf[js.Any])
    
    inline def setDeleteTagUndefined: Self = StObject.set(x, "deleteTag", js.undefined)
    
    inline def setDownArrow(value: String): Self = StObject.set(x, "downArrow", value.asInstanceOf[js.Any])
    
    inline def setDownArrowUndefined: Self = StObject.set(x, "downArrow", js.undefined)
    
    inline def setNoData(value: String): Self = StObject.set(x, "noData", value.asInstanceOf[js.Any])
    
    inline def setNoDataUndefined: Self = StObject.set(x, "noData", js.undefined)
    
    inline def setSingleTag(value: String): Self = StObject.set(x, "singleTag", value.asInstanceOf[js.Any])
    
    inline def setSingleTagUndefined: Self = StObject.set(x, "singleTag", js.undefined)
  }
}
