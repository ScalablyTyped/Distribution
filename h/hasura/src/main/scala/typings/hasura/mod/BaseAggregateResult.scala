package typings.hasura.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseAggregateResult[T] extends StObject {
  
  var count: js.UndefOr[Double] = js.undefined
  
  var max: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ key in hasura.hasura.MinMaxAggregateKeys<T> ]:? T[key]} */ js.Any
  ] = js.undefined
  
  var min: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ key in hasura.hasura.MinMaxAggregateKeys<T> ]:? T[key]} */ js.Any
  ] = js.undefined
}
object BaseAggregateResult {
  
  inline def apply[T](): BaseAggregateResult[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseAggregateResult[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseAggregateResult[?], T] (val x: Self & BaseAggregateResult[T]) extends AnyVal {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setMax(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in hasura.hasura.MinMaxAggregateKeys<T> ]:? T[key]} */ js.Any
    ): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in hasura.hasura.MinMaxAggregateKeys<T> ]:? T[key]} */ js.Any
    ): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
