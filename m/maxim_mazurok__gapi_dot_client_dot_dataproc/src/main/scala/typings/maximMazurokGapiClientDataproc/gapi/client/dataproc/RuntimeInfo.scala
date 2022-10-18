package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuntimeInfo extends StObject {
  
  /** Output only. A URI pointing to the location of the diagnostics tarball. */
  var diagnosticOutputUri: js.UndefOr[String] = js.undefined
  
  /** Output only. Map of remote access endpoints (such as web interfaces and APIs) to their URIs. */
  var endpoints: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** Output only. A URI pointing to the location of the stdout and stderr of the workload. */
  var outputUri: js.UndefOr[String] = js.undefined
}
object RuntimeInfo {
  
  inline def apply(): RuntimeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuntimeInfo]
  }
  
  extension [Self <: RuntimeInfo](x: Self) {
    
    inline def setDiagnosticOutputUri(value: String): Self = StObject.set(x, "diagnosticOutputUri", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticOutputUriUndefined: Self = StObject.set(x, "diagnosticOutputUri", js.undefined)
    
    inline def setEndpoints(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "endpoints", value.asInstanceOf[js.Any])
    
    inline def setEndpointsUndefined: Self = StObject.set(x, "endpoints", js.undefined)
    
    inline def setOutputUri(value: String): Self = StObject.set(x, "outputUri", value.asInstanceOf[js.Any])
    
    inline def setOutputUriUndefined: Self = StObject.set(x, "outputUri", js.undefined)
  }
}
