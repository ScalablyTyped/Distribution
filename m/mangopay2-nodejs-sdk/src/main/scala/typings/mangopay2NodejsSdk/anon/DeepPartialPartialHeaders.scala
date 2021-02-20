package typings.mangopay2NodejsSdk.anon

import typings.mangopay2NodejsSdk.typesMod.DeepPartial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.DeepPartial<std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.Headers>> */
@js.native
trait DeepPartialPartialHeaders extends StObject {
  
  var Authorization: js.UndefOr[DeepPartial[js.UndefOr[String]]] = js.native
  
  var `Content-Type`: js.UndefOr[DeepPartial[js.UndefOr[String]]] = js.native
  
  var `Idempotency-Key`: js.UndefOr[DeepPartial[js.UndefOr[String]]] = js.native
  
  var `User-Agent`: js.UndefOr[DeepPartial[js.UndefOr[String]]] = js.native
}
object DeepPartialPartialHeaders {
  
  @scala.inline
  def apply(): DeepPartialPartialHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeepPartialPartialHeaders]
  }
  
  @scala.inline
  implicit class DeepPartialPartialHeadersMutableBuilder[Self <: DeepPartialPartialHeaders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorization(value: DeepPartial[js.UndefOr[String]]): Self = StObject.set(x, "Authorization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationUndefined: Self = StObject.set(x, "Authorization", js.undefined)
    
    @scala.inline
    def `setContent-Type`(value: DeepPartial[js.UndefOr[String]]): Self = StObject.set(x, "Content-Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setContent-TypeUndefined`: Self = StObject.set(x, "Content-Type", js.undefined)
    
    @scala.inline
    def `setIdempotency-Key`(value: DeepPartial[js.UndefOr[String]]): Self = StObject.set(x, "Idempotency-Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setIdempotency-KeyUndefined`: Self = StObject.set(x, "Idempotency-Key", js.undefined)
    
    @scala.inline
    def `setUser-Agent`(value: DeepPartial[js.UndefOr[String]]): Self = StObject.set(x, "User-Agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setUser-AgentUndefined`: Self = StObject.set(x, "User-Agent", js.undefined)
  }
}
