package typings.hapiJwt.mod.hapiJwt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Artifacts extends StObject {
  
  /**
    * An object that contains decoded token.
    */
  var decoded: DecodedToken
  
  /**
    * An array of information about key(s) used for authentication.
    */
  var keys: js.UndefOr[js.Array[StandardKey]] = js.undefined
  
  /**
    * An object that contains the token that was sent broken out by header, payload, and signature.
    */
  var raw: RawToken
  
  /**
    * The complete token that was sent.
    */
  var token: String
}
object Artifacts {
  
  inline def apply(decoded: DecodedToken, raw: RawToken, token: String): Artifacts = {
    val __obj = js.Dynamic.literal(decoded = decoded.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Artifacts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Artifacts] (val x: Self) extends AnyVal {
    
    inline def setDecoded(value: DecodedToken): Self = StObject.set(x, "decoded", value.asInstanceOf[js.Any])
    
    inline def setKeys(value: js.Array[StandardKey]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setKeysVarargs(value: StandardKey*): Self = StObject.set(x, "keys", js.Array(value*))
    
    inline def setRaw(value: RawToken): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
