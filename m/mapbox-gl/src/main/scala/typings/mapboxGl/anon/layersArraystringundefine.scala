package typings.mapboxGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  layers :std.Array<string> | undefined,   filter :std.Array<any> | undefined} & mapbox-gl.mapbox-gl.FilterOptions */
trait layersArraystringundefine extends StObject {
  
  var filter: js.UndefOr[js.Array[Any]] = js.undefined
  
  var layers: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Whether to check if the filter conforms to the Mapbox GL Style Specification.
    * Disabling validation is a performance optimization that should only be used
    * if you have previously validated the values you will be passing to this function.
    */
  var validate: js.UndefOr[Boolean | Null] = js.undefined
}
object layersArraystringundefine {
  
  inline def apply(): layersArraystringundefine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[layersArraystringundefine]
  }
  
  extension [Self <: layersArraystringundefine](x: Self) {
    
    inline def setFilter(value: js.Array[Any]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFilterVarargs(value: Any*): Self = StObject.set(x, "filter", js.Array(value*))
    
    inline def setLayers(value: js.Array[String]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    inline def setLayersVarargs(value: String*): Self = StObject.set(x, "layers", js.Array(value*))
    
    inline def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    
    inline def setValidateNull: Self = StObject.set(x, "validate", null)
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
