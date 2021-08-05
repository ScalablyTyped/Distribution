package typings.mangopay2NodejsSdk.anon

import typings.mangopay2NodejsSdk.typesMod.DeepPartial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.DeepPartial<std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.Headers>> */
trait DeepPartialPartialHeaders extends StObject {
  
  var Authorization: js.UndefOr[DeepPartial[js.UndefOr[String]]] = js.undefined
  
  var `Content-Type`: js.UndefOr[DeepPartial[js.UndefOr[String]]] = js.undefined
  
  var `Idempotency-Key`: js.UndefOr[DeepPartial[js.UndefOr[String]]] = js.undefined
  
  var `User-Agent`: js.UndefOr[DeepPartial[js.UndefOr[String]]] = js.undefined
}
object DeepPartialPartialHeaders {
  
  inline def apply(): DeepPartialPartialHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeepPartialPartialHeaders]
  }
  
  extension [Self <: DeepPartialPartialHeaders](x: Self) {
    
    inline def setAuthorization(value: DeepPartial[js.UndefOr[String]]): Self = StObject.set(x, "Authorization", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationUndefined: Self = StObject.set(x, "Authorization", js.undefined)
    
    inline def `setContent-Type`(value: DeepPartial[js.UndefOr[String]]): Self = StObject.set(x, "Content-Type", value.asInstanceOf[js.Any])
    
    inline def `setContent-TypeUndefined`: Self = StObject.set(x, "Content-Type", js.undefined)
    
    inline def `setIdempotency-Key`(value: DeepPartial[js.UndefOr[String]]): Self = StObject.set(x, "Idempotency-Key", value.asInstanceOf[js.Any])
    
    inline def `setIdempotency-KeyUndefined`: Self = StObject.set(x, "Idempotency-Key", js.undefined)
    
    inline def `setUser-Agent`(value: DeepPartial[js.UndefOr[String]]): Self = StObject.set(x, "User-Agent", value.asInstanceOf[js.Any])
    
    inline def `setUser-AgentUndefined`: Self = StObject.set(x, "User-Agent", js.undefined)
  }
}
