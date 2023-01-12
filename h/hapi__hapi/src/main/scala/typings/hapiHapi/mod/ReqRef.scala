package typings.hapiHapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Record<keyof @hapi/hapi.@hapi/hapi.ReqRefDefaults, unknown>> */
trait ReqRef extends StObject {
  
  var AuthApi: js.UndefOr[Any] = js.undefined
  
  var AuthApp: js.UndefOr[Any] = js.undefined
  
  var AuthArtifactsExtra: js.UndefOr[Any] = js.undefined
  
  var AuthCredentialsExtra: js.UndefOr[Any] = js.undefined
  
  var AuthUser: js.UndefOr[Any] = js.undefined
  
  var Bind: js.UndefOr[Any] = js.undefined
  
  var Headers: js.UndefOr[Any] = js.undefined
  
  var Params: js.UndefOr[Any] = js.undefined
  
  var Payload: js.UndefOr[Any] = js.undefined
  
  var Pres: js.UndefOr[Any] = js.undefined
  
  var Query: js.UndefOr[Any] = js.undefined
  
  var RequestApp: js.UndefOr[Any] = js.undefined
  
  var Rules: js.UndefOr[Any] = js.undefined
}
object ReqRef {
  
  inline def apply(): ReqRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReqRef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReqRef] (val x: Self) extends AnyVal {
    
    inline def setAuthApi(value: Any): Self = StObject.set(x, "AuthApi", value.asInstanceOf[js.Any])
    
    inline def setAuthApiUndefined: Self = StObject.set(x, "AuthApi", js.undefined)
    
    inline def setAuthApp(value: Any): Self = StObject.set(x, "AuthApp", value.asInstanceOf[js.Any])
    
    inline def setAuthAppUndefined: Self = StObject.set(x, "AuthApp", js.undefined)
    
    inline def setAuthArtifactsExtra(value: Any): Self = StObject.set(x, "AuthArtifactsExtra", value.asInstanceOf[js.Any])
    
    inline def setAuthArtifactsExtraUndefined: Self = StObject.set(x, "AuthArtifactsExtra", js.undefined)
    
    inline def setAuthCredentialsExtra(value: Any): Self = StObject.set(x, "AuthCredentialsExtra", value.asInstanceOf[js.Any])
    
    inline def setAuthCredentialsExtraUndefined: Self = StObject.set(x, "AuthCredentialsExtra", js.undefined)
    
    inline def setAuthUser(value: Any): Self = StObject.set(x, "AuthUser", value.asInstanceOf[js.Any])
    
    inline def setAuthUserUndefined: Self = StObject.set(x, "AuthUser", js.undefined)
    
    inline def setBind(value: Any): Self = StObject.set(x, "Bind", value.asInstanceOf[js.Any])
    
    inline def setBindUndefined: Self = StObject.set(x, "Bind", js.undefined)
    
    inline def setHeaders(value: Any): Self = StObject.set(x, "Headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "Headers", js.undefined)
    
    inline def setParams(value: Any): Self = StObject.set(x, "Params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "Params", js.undefined)
    
    inline def setPayload(value: Any): Self = StObject.set(x, "Payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "Payload", js.undefined)
    
    inline def setPres(value: Any): Self = StObject.set(x, "Pres", value.asInstanceOf[js.Any])
    
    inline def setPresUndefined: Self = StObject.set(x, "Pres", js.undefined)
    
    inline def setQuery(value: Any): Self = StObject.set(x, "Query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "Query", js.undefined)
    
    inline def setRequestApp(value: Any): Self = StObject.set(x, "RequestApp", value.asInstanceOf[js.Any])
    
    inline def setRequestAppUndefined: Self = StObject.set(x, "RequestApp", js.undefined)
    
    inline def setRules(value: Any): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
  }
}
