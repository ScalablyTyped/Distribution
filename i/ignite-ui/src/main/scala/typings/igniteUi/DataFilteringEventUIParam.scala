package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataFilteringEventUIParam extends StObject {
  
  /**
    * Gets the column index. Applicable only when filtering mode is "simple".
    */
  var columnIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets the column key. Applicable only when filtering mode is "simple".
    */
  var columnKey: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the filtering expressions. Filtering expressions could be changed in this event handler and after that data binding is applied. In this way the user could control filtering more easily before applying data-binding.
    */
  var newExpressions: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * Gets reference to GridFiltering.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object DataFilteringEventUIParam {
  
  @scala.inline
  def apply(): DataFilteringEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataFilteringEventUIParam]
  }
  
  @scala.inline
  implicit class DataFilteringEventUIParamMutableBuilder[Self <: DataFilteringEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    @scala.inline
    def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
    
    @scala.inline
    def setNewExpressions(value: js.Array[js.Any]): Self = StObject.set(x, "newExpressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewExpressionsUndefined: Self = StObject.set(x, "newExpressions", js.undefined)
    
    @scala.inline
    def setNewExpressionsVarargs(value: js.Any*): Self = StObject.set(x, "newExpressions", js.Array(value :_*))
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
