package typings.hasura.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberAggregateResult[T, Keys /* <: /* keyof T */ String */]
  extends StObject
     with BaseAggregateResult[T] {
  
  var avg: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ key in Keys ]:? number} */ js.Any
  ] = js.undefined
  
  var stddev: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ key in Keys ]:? number} */ js.Any
  ] = js.undefined
  
  var stddev_pop: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ key in Keys ]:? number} */ js.Any
  ] = js.undefined
  
  var stddev_samp: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ key in Keys ]:? number} */ js.Any
  ] = js.undefined
  
  var sum: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ key in Keys ]:? number} */ js.Any
  ] = js.undefined
  
  var var_pop: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ key in Keys ]:? number} */ js.Any
  ] = js.undefined
  
  var variance: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ key in Keys ]:? number} */ js.Any
  ] = js.undefined
}
object NumberAggregateResult {
  
  inline def apply[T, Keys /* <: /* keyof T */ String */](): NumberAggregateResult[T, Keys] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberAggregateResult[T, Keys]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NumberAggregateResult[?, ?], T, Keys /* <: /* keyof T */ String */] (val x: Self & (NumberAggregateResult[T, Keys])) extends AnyVal {
    
    inline def setAvg(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in Keys ]:? number} */ js.Any
    ): Self = StObject.set(x, "avg", value.asInstanceOf[js.Any])
    
    inline def setAvgUndefined: Self = StObject.set(x, "avg", js.undefined)
    
    inline def setStddev(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in Keys ]:? number} */ js.Any
    ): Self = StObject.set(x, "stddev", value.asInstanceOf[js.Any])
    
    inline def setStddevUndefined: Self = StObject.set(x, "stddev", js.undefined)
    
    inline def setStddev_pop(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in Keys ]:? number} */ js.Any
    ): Self = StObject.set(x, "stddev_pop", value.asInstanceOf[js.Any])
    
    inline def setStddev_popUndefined: Self = StObject.set(x, "stddev_pop", js.undefined)
    
    inline def setStddev_samp(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in Keys ]:? number} */ js.Any
    ): Self = StObject.set(x, "stddev_samp", value.asInstanceOf[js.Any])
    
    inline def setStddev_sampUndefined: Self = StObject.set(x, "stddev_samp", js.undefined)
    
    inline def setSum(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in Keys ]:? number} */ js.Any
    ): Self = StObject.set(x, "sum", value.asInstanceOf[js.Any])
    
    inline def setSumUndefined: Self = StObject.set(x, "sum", js.undefined)
    
    inline def setVar_pop(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in Keys ]:? number} */ js.Any
    ): Self = StObject.set(x, "var_pop", value.asInstanceOf[js.Any])
    
    inline def setVar_popUndefined: Self = StObject.set(x, "var_pop", js.undefined)
    
    inline def setVariance(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in Keys ]:? number} */ js.Any
    ): Self = StObject.set(x, "variance", value.asInstanceOf[js.Any])
    
    inline def setVarianceUndefined: Self = StObject.set(x, "variance", js.undefined)
  }
}
