package typings.hapiHapi.mod

import typings.hapiHapi.mod.Util.Dictionary
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Readable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InternalRequestDefaults extends StObject {
  
  var AuthApi: ServerAuthSchemeObjectApi
  
  var AuthApp: AppCredentials
  
  var AuthArtifactsExtra: Record[String, Any]
  
  var AuthCredentialsExtra: Record[String, Any]
  
  var AuthUser: UserCredentials
  
  var Bind: js.Object | Null
  
  var Headers: Dictionary[Any]
  
  var Params: Dictionary[Any]
  
  var Payload: Readable | Buffer | String | js.Object
  
  var Pres: Dictionary[Any]
  
  var Query: RequestQuery
  
  var RequestApp: RequestApplicationState
  
  var Rules: RouteRules
}
object InternalRequestDefaults {
  
  inline def apply(
    AuthApi: ServerAuthSchemeObjectApi,
    AuthApp: AppCredentials,
    AuthArtifactsExtra: Record[String, Any],
    AuthCredentialsExtra: Record[String, Any],
    AuthUser: UserCredentials,
    Headers: Dictionary[Any],
    Params: Dictionary[Any],
    Payload: Readable | Buffer | String | js.Object,
    Pres: Dictionary[Any],
    Query: RequestQuery,
    RequestApp: RequestApplicationState,
    Rules: RouteRules
  ): InternalRequestDefaults = {
    val __obj = js.Dynamic.literal(AuthApi = AuthApi.asInstanceOf[js.Any], AuthApp = AuthApp.asInstanceOf[js.Any], AuthArtifactsExtra = AuthArtifactsExtra.asInstanceOf[js.Any], AuthCredentialsExtra = AuthCredentialsExtra.asInstanceOf[js.Any], AuthUser = AuthUser.asInstanceOf[js.Any], Headers = Headers.asInstanceOf[js.Any], Params = Params.asInstanceOf[js.Any], Payload = Payload.asInstanceOf[js.Any], Pres = Pres.asInstanceOf[js.Any], Query = Query.asInstanceOf[js.Any], RequestApp = RequestApp.asInstanceOf[js.Any], Rules = Rules.asInstanceOf[js.Any], Bind = null)
    __obj.asInstanceOf[InternalRequestDefaults]
  }
  
  extension [Self <: InternalRequestDefaults](x: Self) {
    
    inline def setAuthApi(value: ServerAuthSchemeObjectApi): Self = StObject.set(x, "AuthApi", value.asInstanceOf[js.Any])
    
    inline def setAuthApp(value: AppCredentials): Self = StObject.set(x, "AuthApp", value.asInstanceOf[js.Any])
    
    inline def setAuthArtifactsExtra(value: Record[String, Any]): Self = StObject.set(x, "AuthArtifactsExtra", value.asInstanceOf[js.Any])
    
    inline def setAuthCredentialsExtra(value: Record[String, Any]): Self = StObject.set(x, "AuthCredentialsExtra", value.asInstanceOf[js.Any])
    
    inline def setAuthUser(value: UserCredentials): Self = StObject.set(x, "AuthUser", value.asInstanceOf[js.Any])
    
    inline def setBind(value: js.Object): Self = StObject.set(x, "Bind", value.asInstanceOf[js.Any])
    
    inline def setBindNull: Self = StObject.set(x, "Bind", null)
    
    inline def setHeaders(value: Dictionary[Any]): Self = StObject.set(x, "Headers", value.asInstanceOf[js.Any])
    
    inline def setParams(value: Dictionary[Any]): Self = StObject.set(x, "Params", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: Readable | Buffer | String | js.Object): Self = StObject.set(x, "Payload", value.asInstanceOf[js.Any])
    
    inline def setPres(value: Dictionary[Any]): Self = StObject.set(x, "Pres", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: RequestQuery): Self = StObject.set(x, "Query", value.asInstanceOf[js.Any])
    
    inline def setRequestApp(value: RequestApplicationState): Self = StObject.set(x, "RequestApp", value.asInstanceOf[js.Any])
    
    inline def setRules(value: RouteRules): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
  }
}
