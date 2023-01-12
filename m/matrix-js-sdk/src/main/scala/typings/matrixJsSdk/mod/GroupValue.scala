package typings.matrixJsSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupValue extends StObject {
  
  var next_batch: js.UndefOr[String] = js.undefined
  
  var order: js.UndefOr[Double] = js.undefined
  
  var results: js.Array[String]
}
object GroupValue {
  
  inline def apply(results: js.Array[String]): GroupValue = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GroupValue] (val x: Self) extends AnyVal {
    
    inline def setNext_batch(value: String): Self = StObject.set(x, "next_batch", value.asInstanceOf[js.Any])
    
    inline def setNext_batchUndefined: Self = StObject.set(x, "next_batch", js.undefined)
    
    inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setResults(value: js.Array[String]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: String*): Self = StObject.set(x, "results", js.Array(value*))
  }
}
