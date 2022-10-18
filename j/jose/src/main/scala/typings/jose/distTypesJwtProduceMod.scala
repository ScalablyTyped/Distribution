package typings.jose

import typings.jose.distTypesTypesMod.JWTPayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesJwtProduceMod {
  
  @JSImport("jose/dist/types/jwt/produce", "ProduceJWT")
  @js.native
  open class ProduceJWT protected () extends StObject {
    /** @param payload The JWT Claims Set object. */
    def this(payload: JWTPayload) = this()
    
    /* protected */ var _payload: JWTPayload = js.native
    
    /**
      * Set "aud" (Audience) Claim.
      *
      * @param audience "aud" (Audience) Claim value to set on the JWT Claims Set.
      */
    def setAudience(audience: String): this.type = js.native
    def setAudience(audience: js.Array[String]): this.type = js.native
    
    def setExpirationTime(input: String): this.type = js.native
    /**
      * Set "exp" (Expiration Time) Claim.
      *
      * @param input "exp" (Expiration Time) Claim value to set on the JWT Claims Set. When number is
      *   passed that is used as a value, when string is passed it is resolved to a time span and added
      *   to the current timestamp.
      */
    def setExpirationTime(input: Double): this.type = js.native
    
    /**
      * Set "iat" (Issued At) Claim.
      *
      * @param input "iat" (Issued At) Claim value to set on the JWT Claims Set. Default is current timestamp.
      */
    def setIssuedAt(): this.type = js.native
    def setIssuedAt(input: Double): this.type = js.native
    
    /**
      * Set "iss" (Issuer) Claim.
      *
      * @param issuer "Issuer" Claim value to set on the JWT Claims Set.
      */
    def setIssuer(issuer: String): this.type = js.native
    
    /**
      * Set "jti" (JWT ID) Claim.
      *
      * @param jwtId "jti" (JWT ID) Claim value to set on the JWT Claims Set.
      */
    def setJti(jwtId: String): this.type = js.native
    
    def setNotBefore(input: String): this.type = js.native
    /**
      * Set "nbf" (Not Before) Claim.
      *
      * @param input "nbf" (Not Before) Claim value to set on the JWT Claims Set. When number is passed
      *   that is used as a value, when string is passed it is resolved to a time span and added to the
      *   current timestamp.
      */
    def setNotBefore(input: Double): this.type = js.native
    
    /**
      * Set "sub" (Subject) Claim.
      *
      * @param subject "sub" (Subject) Claim value to set on the JWT Claims Set.
      */
    def setSubject(subject: String): this.type = js.native
  }
}
