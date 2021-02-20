package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SummariesMethodSelectionChangedEventUIParam extends StObject {
  
  /**
    * Gets the column key of the column where it is changed selection of summary method.
    */
  var columnKey: js.UndefOr[String] = js.native
  
  /**
    * Gets whether method is selected or not.
    */
  var isSelected: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets the summary method name.
    */
  var methodName: js.UndefOr[String] = js.native
  
  /**
    * Gets the igGridSummaries widget object.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object SummariesMethodSelectionChangedEventUIParam {
  
  @scala.inline
  def apply(): SummariesMethodSelectionChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SummariesMethodSelectionChangedEventUIParam]
  }
  
  @scala.inline
  implicit class SummariesMethodSelectionChangedEventUIParamMutableBuilder[Self <: SummariesMethodSelectionChangedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
    
    @scala.inline
    def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
    
    @scala.inline
    def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodNameUndefined: Self = StObject.set(x, "methodName", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
