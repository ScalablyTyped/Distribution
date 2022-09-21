package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHl7TypesConfig extends StObject {
  
  /**
    * The HL7v2 type definitions.
    */
  var `type`: js.UndefOr[js.Array[SchemaType]] = js.undefined
  
  /**
    * The version selectors that this config applies to. A message must match ALL version sources to apply.
    */
  var version: js.UndefOr[js.Array[SchemaVersionSource]] = js.undefined
}
object SchemaHl7TypesConfig {
  
  inline def apply(): SchemaHl7TypesConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHl7TypesConfig]
  }
  
  extension [Self <: SchemaHl7TypesConfig](x: Self) {
    
    inline def setType(value: js.Array[SchemaType]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeVarargs(value: SchemaType*): Self = StObject.set(x, "type", js.Array(value*))
    
    inline def setVersion(value: js.Array[SchemaVersionSource]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setVersionVarargs(value: SchemaVersionSource*): Self = StObject.set(x, "version", js.Array(value*))
  }
}
