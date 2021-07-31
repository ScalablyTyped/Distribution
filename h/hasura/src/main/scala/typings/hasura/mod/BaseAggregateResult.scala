package typings.hasura.mod

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseAggregateResult[T] extends StObject {
  
  var count: js.UndefOr[Double] = js.undefined
  
  var max: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in hasura.hasura.MinMaxAggregateKeys<T> ]:? T[key]}
    */ typings.hasura.hasuraStrings.BaseAggregateResult & TopLevel[T]
  ] = js.undefined
  
  var min: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in hasura.hasura.MinMaxAggregateKeys<T> ]:? T[key]}
    */ typings.hasura.hasuraStrings.BaseAggregateResult & TopLevel[T]
  ] = js.undefined
}
object BaseAggregateResult {
  
  @scala.inline
  def apply[T](): BaseAggregateResult[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseAggregateResult[T]]
  }
  
  @scala.inline
  implicit class BaseAggregateResultMutableBuilder[Self <: BaseAggregateResult[?], T] (val x: Self & BaseAggregateResult[T]) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setMax(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in hasura.hasura.MinMaxAggregateKeys<T> ]:? T[key]}
      */ typings.hasura.hasuraStrings.BaseAggregateResult & TopLevel[T]
    ): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in hasura.hasura.MinMaxAggregateKeys<T> ]:? T[key]}
      */ typings.hasura.hasuraStrings.BaseAggregateResult & TopLevel[T]
    ): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
