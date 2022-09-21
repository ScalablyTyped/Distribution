package typings.googleapis.containeranalysisV1Mod.containeranalysisV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaComplianceVersion extends StObject {
  
  /**
    * The name of the document that defines this benchmark, e.g. "CIS Container-Optimized OS".
    */
  var benchmarkDocument: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The CPE URI (https://cpe.mitre.org/specification/) this benchmark is applicable to.
    */
  var cpeUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The version of the benchmark. This is set to the version of the OS-specific CIS document the benchmark is defined in.
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaComplianceVersion {
  
  inline def apply(): SchemaComplianceVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaComplianceVersion]
  }
  
  extension [Self <: SchemaComplianceVersion](x: Self) {
    
    inline def setBenchmarkDocument(value: String): Self = StObject.set(x, "benchmarkDocument", value.asInstanceOf[js.Any])
    
    inline def setBenchmarkDocumentNull: Self = StObject.set(x, "benchmarkDocument", null)
    
    inline def setBenchmarkDocumentUndefined: Self = StObject.set(x, "benchmarkDocument", js.undefined)
    
    inline def setCpeUri(value: String): Self = StObject.set(x, "cpeUri", value.asInstanceOf[js.Any])
    
    inline def setCpeUriNull: Self = StObject.set(x, "cpeUri", null)
    
    inline def setCpeUriUndefined: Self = StObject.set(x, "cpeUri", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
