package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SummariesMethodSelectionChangedEventUIParam extends StObject {
  
  /**
    * Gets the column key of the column where it is changed selection of summary method.
    */
  var columnKey: js.UndefOr[String] = js.undefined
  
  /**
    * Gets whether method is selected or not.
    */
  var isSelected: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the summary method name.
    */
  var methodName: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the igGridSummaries widget object.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object SummariesMethodSelectionChangedEventUIParam {
  
  inline def apply(): SummariesMethodSelectionChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SummariesMethodSelectionChangedEventUIParam]
  }
  
  extension [Self <: SummariesMethodSelectionChangedEventUIParam](x: Self) {
    
    inline def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
    
    inline def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
    
    inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
    
    inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
    
    inline def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
    
    inline def setMethodNameUndefined: Self = StObject.set(x, "methodName", js.undefined)
    
    inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
