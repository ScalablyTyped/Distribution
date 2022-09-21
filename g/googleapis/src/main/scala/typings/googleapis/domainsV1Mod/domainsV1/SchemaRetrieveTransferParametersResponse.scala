package typings.googleapis.domainsV1Mod.domainsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRetrieveTransferParametersResponse extends StObject {
  
  /**
    * Parameters to use when calling the `TransferDomain` method.
    */
  var transferParameters: js.UndefOr[SchemaTransferParameters] = js.undefined
}
object SchemaRetrieveTransferParametersResponse {
  
  inline def apply(): SchemaRetrieveTransferParametersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRetrieveTransferParametersResponse]
  }
  
  extension [Self <: SchemaRetrieveTransferParametersResponse](x: Self) {
    
    inline def setTransferParameters(value: SchemaTransferParameters): Self = StObject.set(x, "transferParameters", value.asInstanceOf[js.Any])
    
    inline def setTransferParametersUndefined: Self = StObject.set(x, "transferParameters", js.undefined)
  }
}
