package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryResult extends StObject {
  
  var data: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var total: js.UndefOr[Double] = js.undefined
}
object QueryResult {
  
  @scala.inline
  def apply(): QueryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryResult]
  }
  
  @scala.inline
  implicit class QueryResultMutableBuilder[Self <: QueryResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
