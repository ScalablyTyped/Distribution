package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComplianceVersion extends StObject {
  
  /** The name of the document that defines this benchmark, e.g. "CIS Container-Optimized OS". */
  var benchmarkDocument: js.UndefOr[String] = js.undefined
  
  /** The CPE URI (https://cpe.mitre.org/specification/) this benchmark is applicable to. */
  var cpeUri: js.UndefOr[String] = js.undefined
  
  /** The version of the benchmark. This is set to the version of the OS-specific CIS document the benchmark is defined in. */
  var version: js.UndefOr[String] = js.undefined
}
object ComplianceVersion {
  
  inline def apply(): ComplianceVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComplianceVersion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComplianceVersion] (val x: Self) extends AnyVal {
    
    inline def setBenchmarkDocument(value: String): Self = StObject.set(x, "benchmarkDocument", value.asInstanceOf[js.Any])
    
    inline def setBenchmarkDocumentUndefined: Self = StObject.set(x, "benchmarkDocument", js.undefined)
    
    inline def setCpeUri(value: String): Self = StObject.set(x, "cpeUri", value.asInstanceOf[js.Any])
    
    inline def setCpeUriUndefined: Self = StObject.set(x, "cpeUri", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
