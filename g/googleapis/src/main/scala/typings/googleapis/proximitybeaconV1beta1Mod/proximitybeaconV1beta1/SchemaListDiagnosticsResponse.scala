package typings.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response that contains the requested diagnostics.
  */
trait SchemaListDiagnosticsResponse extends StObject {
  
  /**
    * The diagnostics matching the given request.
    */
  var diagnostics: js.UndefOr[js.Array[SchemaDiagnostics]] = js.undefined
  
  /**
    * Token that can be used for pagination. Returned only if the request
    * matches more beacons than can be returned in this response.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListDiagnosticsResponse {
  
  inline def apply(): SchemaListDiagnosticsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDiagnosticsResponse]
  }
  
  extension [Self <: SchemaListDiagnosticsResponse](x: Self) {
    
    inline def setDiagnostics(value: js.Array[SchemaDiagnostics]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticsUndefined: Self = StObject.set(x, "diagnostics", js.undefined)
    
    inline def setDiagnosticsVarargs(value: SchemaDiagnostics*): Self = StObject.set(x, "diagnostics", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
