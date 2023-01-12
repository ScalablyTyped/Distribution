package typings.mapboxGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  sourceLayer :string | undefined,   filter :std.Array<any> | undefined} & mapbox-gl.mapbox-gl.FilterOptions */
trait sourceLayerstringundefine extends StObject {
  
  var filter: js.UndefOr[js.Array[Any]] = js.undefined
  
  var sourceLayer: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to check if the filter conforms to the Mapbox GL Style Specification.
    * Disabling validation is a performance optimization that should only be used
    * if you have previously validated the values you will be passing to this function.
    */
  var validate: js.UndefOr[Boolean | Null] = js.undefined
}
object sourceLayerstringundefine {
  
  inline def apply(): sourceLayerstringundefine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[sourceLayerstringundefine]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: sourceLayerstringundefine] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: js.Array[Any]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFilterVarargs(value: Any*): Self = StObject.set(x, "filter", js.Array(value*))
    
    inline def setSourceLayer(value: String): Self = StObject.set(x, "sourceLayer", value.asInstanceOf[js.Any])
    
    inline def setSourceLayerUndefined: Self = StObject.set(x, "sourceLayer", js.undefined)
    
    inline def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    
    inline def setValidateNull: Self = StObject.set(x, "validate", null)
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
