package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataFilteredEventUIParam extends StObject {
  
  /**
    * Gets the column index. Applicable only when filtering mode is "simple".
    */
  var columnIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets the column key. Applicable only when filtering mode is "simple".
    */
  var columnKey: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the filtered expressions.
    */
  var expressions: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * Gets reference to GridFiltering.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object DataFilteredEventUIParam {
  
  @scala.inline
  def apply(): DataFilteredEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataFilteredEventUIParam]
  }
  
  @scala.inline
  implicit class DataFilteredEventUIParamMutableBuilder[Self <: DataFilteredEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    @scala.inline
    def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
    
    @scala.inline
    def setExpressions(value: js.Array[js.Any]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionsUndefined: Self = StObject.set(x, "expressions", js.undefined)
    
    @scala.inline
    def setExpressionsVarargs(value: js.Any*): Self = StObject.set(x, "expressions", js.Array(value :_*))
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
