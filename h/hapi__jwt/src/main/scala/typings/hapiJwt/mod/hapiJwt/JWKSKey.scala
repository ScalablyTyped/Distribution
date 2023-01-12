package typings.hapiJwt.mod.hapiJwt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JWKSKey
  extends StObject
     with Key {
  
  /**
    * Array of accepted algorithms.
    */
  var algorithms: js.UndefOr[js.Array[SupportedAlgorithm]] = js.undefined
  
  /**
    * Object containing the request headers to send to the uri.
    */
  var header: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Boolean that determines if TLS flag indicating whether the client should reject a response from a server with invalid certificates. Default is true.
    */
  var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
  
  /**
    * String that defines your json web key set uri.
    */
  var uri: String
}
object JWKSKey {
  
  inline def apply(uri: String): JWKSKey = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[JWKSKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JWKSKey] (val x: Self) extends AnyVal {
    
    inline def setAlgorithms(value: js.Array[SupportedAlgorithm]): Self = StObject.set(x, "algorithms", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmsUndefined: Self = StObject.set(x, "algorithms", js.undefined)
    
    inline def setAlgorithmsVarargs(value: SupportedAlgorithm*): Self = StObject.set(x, "algorithms", js.Array(value*))
    
    inline def setHeader(value: js.Object): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
    
    inline def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
