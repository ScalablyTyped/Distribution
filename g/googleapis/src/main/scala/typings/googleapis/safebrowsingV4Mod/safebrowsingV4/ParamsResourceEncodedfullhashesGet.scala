package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceEncodedfullhashesGet
  extends StObject
     with StandardParameters {
  
  /**
    * A client ID that (hopefully) uniquely identifies the client implementation of the Safe Browsing API.
    */
  var clientId: js.UndefOr[String] = js.undefined
  
  /**
    * The version of the client implementation.
    */
  var clientVersion: js.UndefOr[String] = js.undefined
  
  /**
    * A serialized FindFullHashesRequest proto.
    */
  var encodedRequest: js.UndefOr[String] = js.undefined
}
object ParamsResourceEncodedfullhashesGet {
  
  inline def apply(): ParamsResourceEncodedfullhashesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEncodedfullhashesGet]
  }
  
  extension [Self <: ParamsResourceEncodedfullhashesGet](x: Self) {
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setClientVersion(value: String): Self = StObject.set(x, "clientVersion", value.asInstanceOf[js.Any])
    
    inline def setClientVersionUndefined: Self = StObject.set(x, "clientVersion", js.undefined)
    
    inline def setEncodedRequest(value: String): Self = StObject.set(x, "encodedRequest", value.asInstanceOf[js.Any])
    
    inline def setEncodedRequestUndefined: Self = StObject.set(x, "encodedRequest", js.undefined)
  }
}
