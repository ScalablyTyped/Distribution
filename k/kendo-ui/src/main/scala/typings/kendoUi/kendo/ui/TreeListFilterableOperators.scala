package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeListFilterableOperators extends StObject {
  
  var date: js.UndefOr[TreeListFilterableOperatorsDate] = js.undefined
  
  var number: js.UndefOr[TreeListFilterableOperatorsNumber] = js.undefined
  
  var string: js.UndefOr[TreeListFilterableOperatorsString] = js.undefined
}
object TreeListFilterableOperators {
  
  inline def apply(): TreeListFilterableOperators = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeListFilterableOperators]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TreeListFilterableOperators] (val x: Self) extends AnyVal {
    
    inline def setDate(value: TreeListFilterableOperatorsDate): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setNumber(value: TreeListFilterableOperatorsNumber): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setString(value: TreeListFilterableOperatorsString): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
  }
}
