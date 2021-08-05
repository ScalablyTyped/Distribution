package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropDownTreeMessages extends StObject {
  
  var clear: js.UndefOr[String] = js.undefined
  
  var deleteTag: js.UndefOr[String] = js.undefined
  
  var singleTag: js.UndefOr[String] = js.undefined
}
object DropDownTreeMessages {
  
  inline def apply(): DropDownTreeMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropDownTreeMessages]
  }
  
  extension [Self <: DropDownTreeMessages](x: Self) {
    
    inline def setClear(value: String): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
    
    inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
    
    inline def setDeleteTag(value: String): Self = StObject.set(x, "deleteTag", value.asInstanceOf[js.Any])
    
    inline def setDeleteTagUndefined: Self = StObject.set(x, "deleteTag", js.undefined)
    
    inline def setSingleTag(value: String): Self = StObject.set(x, "singleTag", value.asInstanceOf[js.Any])
    
    inline def setSingleTagUndefined: Self = StObject.set(x, "singleTag", js.undefined)
  }
}
