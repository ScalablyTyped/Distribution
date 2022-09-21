package typings.googleapis.securitycenterV1Mod.securitycenterV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCompliance extends StObject {
  
  /**
    * Policies within the standard/benchmark e.g. A.12.4.1
    */
  var ids: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Refers to industry wide standards or benchmarks e.g. "cis", "pci", "owasp", etc.
    */
  var standard: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Version of the standard/benchmark e.g. 1.1
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaCompliance {
  
  inline def apply(): SchemaCompliance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCompliance]
  }
  
  extension [Self <: SchemaCompliance](x: Self) {
    
    inline def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsNull: Self = StObject.set(x, "ids", null)
    
    inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value*))
    
    inline def setStandard(value: String): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
    
    inline def setStandardNull: Self = StObject.set(x, "standard", null)
    
    inline def setStandardUndefined: Self = StObject.set(x, "standard", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
