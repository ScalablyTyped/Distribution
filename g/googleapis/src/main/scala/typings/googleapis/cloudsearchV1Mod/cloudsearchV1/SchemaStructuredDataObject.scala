package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStructuredDataObject extends StObject {
  
  /**
    * The properties for the object. The maximum number of elements is 1000.
    */
  var properties: js.UndefOr[js.Array[SchemaNamedProperty]] = js.undefined
}
object SchemaStructuredDataObject {
  
  inline def apply(): SchemaStructuredDataObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStructuredDataObject]
  }
  
  extension [Self <: SchemaStructuredDataObject](x: Self) {
    
    inline def setProperties(value: js.Array[SchemaNamedProperty]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPropertiesVarargs(value: SchemaNamedProperty*): Self = StObject.set(x, "properties", js.Array(value*))
  }
}
