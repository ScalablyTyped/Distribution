package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectPropertyOptions extends StObject {
  
  /**
    * The properties of the sub-object. These properties represent a nested object. For example, if this property represents a postal address, the subobjectProperties might be named
    * *street*, *city*, and *state*. The maximum number of elements is 1000.
    */
  var subobjectProperties: js.UndefOr[js.Array[PropertyDefinition]] = js.undefined
}
object ObjectPropertyOptions {
  
  inline def apply(): ObjectPropertyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectPropertyOptions]
  }
  
  extension [Self <: ObjectPropertyOptions](x: Self) {
    
    inline def setSubobjectProperties(value: js.Array[PropertyDefinition]): Self = StObject.set(x, "subobjectProperties", value.asInstanceOf[js.Any])
    
    inline def setSubobjectPropertiesUndefined: Self = StObject.set(x, "subobjectProperties", js.undefined)
    
    inline def setSubobjectPropertiesVarargs(value: PropertyDefinition*): Self = StObject.set(x, "subobjectProperties", js.Array(value :_*))
  }
}
