package typings.massive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetrievalOptions extends StObject {
  
  var exprs: js.UndefOr[AnyObject[String]] = js.undefined
  
  var fields: js.UndefOr[js.Array[String]] = js.undefined
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var order: js.UndefOr[js.Array[OrderingOptions]] = js.undefined
  
  var pageLength: js.UndefOr[Double] = js.undefined
}
object RetrievalOptions {
  
  inline def apply(): RetrievalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetrievalOptions]
  }
  
  extension [Self <: RetrievalOptions](x: Self) {
    
    inline def setExprs(value: AnyObject[String]): Self = StObject.set(x, "exprs", value.asInstanceOf[js.Any])
    
    inline def setExprsUndefined: Self = StObject.set(x, "exprs", js.undefined)
    
    inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOrder(value: js.Array[OrderingOptions]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setOrderVarargs(value: OrderingOptions*): Self = StObject.set(x, "order", js.Array(value :_*))
    
    inline def setPageLength(value: Double): Self = StObject.set(x, "pageLength", value.asInstanceOf[js.Any])
    
    inline def setPageLengthUndefined: Self = StObject.set(x, "pageLength", js.undefined)
  }
}
