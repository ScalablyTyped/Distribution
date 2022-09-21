package typings.hasura.mod

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseOrderByAggregate[T] extends StObject {
  
  var count: js.UndefOr[ScalarOrderBy] = js.undefined
  
  var max: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in hasura.hasura.MinMaxAggregateKeys<T> ]:? hasura.hasura.ScalarOrderBy}
    */ typings.hasura.hasuraStrings.BaseOrderByAggregate & TopLevel[Any]
  ] = js.undefined
  
  var min: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in hasura.hasura.MinMaxAggregateKeys<T> ]:? hasura.hasura.ScalarOrderBy}
    */ typings.hasura.hasuraStrings.BaseOrderByAggregate & TopLevel[Any]
  ] = js.undefined
}
object BaseOrderByAggregate {
  
  inline def apply[T](): BaseOrderByAggregate[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseOrderByAggregate[T]]
  }
  
  extension [Self <: BaseOrderByAggregate[?], T](x: Self & BaseOrderByAggregate[T]) {
    
    inline def setCount(value: ScalarOrderBy): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setMax(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in hasura.hasura.MinMaxAggregateKeys<T> ]:? hasura.hasura.ScalarOrderBy}
      */ typings.hasura.hasuraStrings.BaseOrderByAggregate & TopLevel[Any]
    ): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in hasura.hasura.MinMaxAggregateKeys<T> ]:? hasura.hasura.ScalarOrderBy}
      */ typings.hasura.hasuraStrings.BaseOrderByAggregate & TopLevel[Any]
    ): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
