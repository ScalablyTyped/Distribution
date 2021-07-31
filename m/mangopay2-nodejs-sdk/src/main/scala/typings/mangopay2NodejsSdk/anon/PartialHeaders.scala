package typings.mangopay2NodejsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.Headers> */
trait PartialHeaders extends StObject {
  
  var Authorization: js.UndefOr[String] = js.undefined
  
  var `Content-Type`: js.UndefOr[String] = js.undefined
  
  var `Idempotency-Key`: js.UndefOr[String] = js.undefined
  
  var `User-Agent`: js.UndefOr[String] = js.undefined
}
object PartialHeaders {
  
  @scala.inline
  def apply(): PartialHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialHeaders]
  }
  
  @scala.inline
  implicit class PartialHeadersMutableBuilder[Self <: PartialHeaders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorization(value: String): Self = StObject.set(x, "Authorization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationUndefined: Self = StObject.set(x, "Authorization", js.undefined)
    
    @scala.inline
    def `setContent-Type`(value: String): Self = StObject.set(x, "Content-Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setContent-TypeUndefined`: Self = StObject.set(x, "Content-Type", js.undefined)
    
    @scala.inline
    def `setIdempotency-Key`(value: String): Self = StObject.set(x, "Idempotency-Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setIdempotency-KeyUndefined`: Self = StObject.set(x, "Idempotency-Key", js.undefined)
    
    @scala.inline
    def `setUser-Agent`(value: String): Self = StObject.set(x, "User-Agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setUser-AgentUndefined`: Self = StObject.set(x, "User-Agent", js.undefined)
  }
}
