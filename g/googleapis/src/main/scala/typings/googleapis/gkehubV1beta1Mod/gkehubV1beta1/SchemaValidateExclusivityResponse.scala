package typings.googleapis.gkehubV1beta1Mod.gkehubV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaValidateExclusivityResponse extends StObject {
  
  /**
    * The validation result. * `OK` means that exclusivity is validated, assuming the manifest produced by GenerateExclusivityManifest is successfully applied. * `ALREADY_EXISTS` means that the Membership CRD is already owned by another Hub. See `status.message` for more information.
    */
  var status: js.UndefOr[SchemaGoogleRpcStatus] = js.undefined
}
object SchemaValidateExclusivityResponse {
  
  inline def apply(): SchemaValidateExclusivityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaValidateExclusivityResponse]
  }
  
  extension [Self <: SchemaValidateExclusivityResponse](x: Self) {
    
    inline def setStatus(value: SchemaGoogleRpcStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
