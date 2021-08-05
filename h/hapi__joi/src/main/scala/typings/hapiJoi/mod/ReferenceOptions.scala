package typings.hapiJoi.mod

import typings.hapiJoi.anon.Global
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReferenceOptions
  extends StObject
     with HierarchySeparatorOptions {
  
  /**
    * a function with the signature `function(value)` where `value` is the resolved reference value and the return value is the adjusted value to use.
    * Note that the adjust feature will not perform any type validation on the adjusted value and it must match the value expected by the rule it is used in.
    * Cannot be used with `map`.
    *
    * @example `(value) => value + 5`
    */
  var adjust: js.UndefOr[js.Function1[/* value */ js.Any, js.Any]] = js.undefined
  
  /**
    * If set to a number, sets the reference relative starting point.
    * Cannot be combined with separator prefix characters.
    * Defaults to the reference key prefix (or 1 if none present)
    */
  var ancestor: js.UndefOr[Double] = js.undefined
  
  /**
    * creates an in-reference.
    */
  var in: js.UndefOr[Boolean] = js.undefined
  
  /**
    * when true, the reference resolves by reaching into maps and sets.
    */
  var iterables: js.UndefOr[Boolean] = js.undefined
  
  /**
    * an array of array pairs using the format `[[key, value], [key, value]]` used to maps the resolved reference value to another value.
    * If the resolved value is not in the map, it is returned as-is.
    * Cannot be used with `adjust`.
    */
  var map: js.UndefOr[js.Array[js.Tuple2[js.Any, js.Any]]] = js.undefined
  
  /**
    * overrides default prefix characters.
    */
  var prefix: js.UndefOr[Global] = js.undefined
}
object ReferenceOptions {
  
  inline def apply(): ReferenceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReferenceOptions]
  }
  
  extension [Self <: ReferenceOptions](x: Self) {
    
    inline def setAdjust(value: /* value */ js.Any => js.Any): Self = StObject.set(x, "adjust", js.Any.fromFunction1(value))
    
    inline def setAdjustUndefined: Self = StObject.set(x, "adjust", js.undefined)
    
    inline def setAncestor(value: Double): Self = StObject.set(x, "ancestor", value.asInstanceOf[js.Any])
    
    inline def setAncestorUndefined: Self = StObject.set(x, "ancestor", js.undefined)
    
    inline def setIn(value: Boolean): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
    
    inline def setInUndefined: Self = StObject.set(x, "in", js.undefined)
    
    inline def setIterables(value: Boolean): Self = StObject.set(x, "iterables", value.asInstanceOf[js.Any])
    
    inline def setIterablesUndefined: Self = StObject.set(x, "iterables", js.undefined)
    
    inline def setMap(value: js.Array[js.Tuple2[js.Any, js.Any]]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setMapVarargs(value: (js.Tuple2[js.Any, js.Any])*): Self = StObject.set(x, "map", js.Array(value :_*))
    
    inline def setPrefix(value: Global): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}
