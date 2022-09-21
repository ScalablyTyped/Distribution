package typings.jose

import typings.jose.produceMod.ProduceJWT
import typings.jose.typesMod.JWSHeaderParameters
import typings.jose.typesMod.JWTClaimVerificationOptions
import typings.jose.typesMod.JWTPayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unsecuredMod {
  
  @JSImport("jose/dist/types/jwt/unsecured", "UnsecuredJWT")
  @js.native
  open class UnsecuredJWT protected () extends ProduceJWT {
    /** @param payload The JWT Claims Set object. */
    def this(payload: JWTPayload) = this()
    
    /** Encodes the Unsecured JWT. */
    def encode(): String = js.native
  }
  /* static members */
  object UnsecuredJWT {
    
    @JSImport("jose/dist/types/jwt/unsecured", "UnsecuredJWT")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Decodes an unsecured JWT.
      *
      * @param jwt Unsecured JWT to decode the payload of.
      * @param options JWT Claims Set validation options.
      */
    inline def decode(jwt: String): UnsecuredResult = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(jwt.asInstanceOf[js.Any]).asInstanceOf[UnsecuredResult]
    inline def decode(jwt: String, options: JWTClaimVerificationOptions): UnsecuredResult = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(jwt.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UnsecuredResult]
  }
  
  trait UnsecuredResult extends StObject {
    
    var header: JWSHeaderParameters
    
    var payload: JWTPayload
  }
  object UnsecuredResult {
    
    inline def apply(header: JWSHeaderParameters, payload: JWTPayload): UnsecuredResult = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnsecuredResult]
    }
    
    extension [Self <: UnsecuredResult](x: Self) {
      
      inline def setHeader(value: JWSHeaderParameters): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: JWTPayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
}
