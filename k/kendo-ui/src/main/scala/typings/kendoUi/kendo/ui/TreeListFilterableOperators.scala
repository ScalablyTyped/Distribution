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
  
  @scala.inline
  def apply(): TreeListFilterableOperators = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeListFilterableOperators]
  }
  
  @scala.inline
  implicit class TreeListFilterableOperatorsMutableBuilder[Self <: TreeListFilterableOperators] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: TreeListFilterableOperatorsDate): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setNumber(value: TreeListFilterableOperatorsNumber): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    @scala.inline
    def setString(value: TreeListFilterableOperatorsString): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
  }
}
