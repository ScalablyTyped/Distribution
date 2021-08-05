package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateConsistencyTokenResponse extends StObject {
  
  /** The generated consistency token. */
  var consistencyToken: js.UndefOr[String] = js.undefined
}
object GenerateConsistencyTokenResponse {
  
  inline def apply(): GenerateConsistencyTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateConsistencyTokenResponse]
  }
  
  extension [Self <: GenerateConsistencyTokenResponse](x: Self) {
    
    inline def setConsistencyToken(value: String): Self = StObject.set(x, "consistencyToken", value.asInstanceOf[js.Any])
    
    inline def setConsistencyTokenUndefined: Self = StObject.set(x, "consistencyToken", js.undefined)
  }
}
