package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRuntimeInfo extends StObject {
  
  /**
    * Output only. A URI pointing to the location of the diagnostics tarball.
    */
  var diagnosticOutputUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Map of remote access endpoints (such as web interfaces and APIs) to their URIs.
    */
  var endpoints: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Output only. A URI pointing to the location of the stdout and stderr of the workload.
    */
  var outputUri: js.UndefOr[String | Null] = js.undefined
}
object SchemaRuntimeInfo {
  
  inline def apply(): SchemaRuntimeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRuntimeInfo]
  }
  
  extension [Self <: SchemaRuntimeInfo](x: Self) {
    
    inline def setDiagnosticOutputUri(value: String): Self = StObject.set(x, "diagnosticOutputUri", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticOutputUriNull: Self = StObject.set(x, "diagnosticOutputUri", null)
    
    inline def setDiagnosticOutputUriUndefined: Self = StObject.set(x, "diagnosticOutputUri", js.undefined)
    
    inline def setEndpoints(value: StringDictionary[String]): Self = StObject.set(x, "endpoints", value.asInstanceOf[js.Any])
    
    inline def setEndpointsNull: Self = StObject.set(x, "endpoints", null)
    
    inline def setEndpointsUndefined: Self = StObject.set(x, "endpoints", js.undefined)
    
    inline def setOutputUri(value: String): Self = StObject.set(x, "outputUri", value.asInstanceOf[js.Any])
    
    inline def setOutputUriNull: Self = StObject.set(x, "outputUri", null)
    
    inline def setOutputUriUndefined: Self = StObject.set(x, "outputUri", js.undefined)
  }
}
