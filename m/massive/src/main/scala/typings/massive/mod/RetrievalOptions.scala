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
  
  @scala.inline
  def apply(): RetrievalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetrievalOptions]
  }
  
  @scala.inline
  implicit class RetrievalOptionsMutableBuilder[Self <: RetrievalOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExprs(value: AnyObject[String]): Self = StObject.set(x, "exprs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExprsUndefined: Self = StObject.set(x, "exprs", js.undefined)
    
    @scala.inline
    def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setOrder(value: js.Array[OrderingOptions]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setOrderVarargs(value: OrderingOptions*): Self = StObject.set(x, "order", js.Array(value :_*))
    
    @scala.inline
    def setPageLength(value: Double): Self = StObject.set(x, "pageLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageLengthUndefined: Self = StObject.set(x, "pageLength", js.undefined)
  }
}
