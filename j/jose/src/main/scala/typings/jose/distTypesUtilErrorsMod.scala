package typings.jose

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilErrorsMod {
  
  @JSImport("jose/dist/types/util/errors", "JOSEAlgNotAllowed")
  @js.native
  open class JOSEAlgNotAllowed () extends JOSEError {
    def this(message: String) = this()
  }
  
  @JSImport("jose/dist/types/util/errors", "JOSEError")
  @js.native
  open class JOSEError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /** A unique error code for the particular error subclass. */
    var code: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("jose/dist/types/util/errors", "JOSENotSupported")
  @js.native
  open class JOSENotSupported () extends JOSEError {
    def this(message: String) = this()
  }
  
  @JSImport("jose/dist/types/util/errors", "JWEDecryptionFailed")
  @js.native
  open class JWEDecryptionFailed () extends JOSEError {
    def this(message: String) = this()
  }
  
  @JSImport("jose/dist/types/util/errors", "JWEInvalid")
  @js.native
  open class JWEInvalid () extends JOSEError {
    def this(message: String) = this()
  }
  
  @JSImport("jose/dist/types/util/errors", "JWKInvalid")
  @js.native
  open class JWKInvalid () extends JOSEError {
    def this(message: String) = this()
  }
  
  @JSImport("jose/dist/types/util/errors", "JWKSInvalid")
  @js.native
  open class JWKSInvalid () extends JOSEError {
    def this(message: String) = this()
  }
  
  @JSImport("jose/dist/types/util/errors", "JWKSMultipleMatchingKeys")
  @js.native
  open class JWKSMultipleMatchingKeys () extends JOSEError {
    def this(message: String) = this()
  }
  
  @JSImport("jose/dist/types/util/errors", "JWKSNoMatchingKey")
  @js.native
  open class JWKSNoMatchingKey () extends JOSEError {
    def this(message: String) = this()
  }
  
  @JSImport("jose/dist/types/util/errors", "JWKSTimeout")
  @js.native
  open class JWKSTimeout () extends JOSEError {
    def this(message: String) = this()
  }
  
  @JSImport("jose/dist/types/util/errors", "JWSInvalid")
  @js.native
  open class JWSInvalid () extends JOSEError {
    def this(message: String) = this()
  }
  
  @JSImport("jose/dist/types/util/errors", "JWSSignatureVerificationFailed")
  @js.native
  open class JWSSignatureVerificationFailed () extends JOSEError {
    def this(message: String) = this()
  }
  
  @JSImport("jose/dist/types/util/errors", "JWTClaimValidationFailed")
  @js.native
  open class JWTClaimValidationFailed protected () extends JOSEError {
    def this(message: String) = this()
    def this(message: String, claim: String) = this()
    def this(message: String, claim: String, reason: String) = this()
    def this(message: String, claim: Unit, reason: String) = this()
    
    /** The Claim for which the validation failed. */
    var claim: String = js.native
    
    /** Reason code for the validation failure. */
    var reason: String = js.native
  }
  
  @JSImport("jose/dist/types/util/errors", "JWTExpired")
  @js.native
  open class JWTExpired protected () extends JWTClaimValidationFailed {
    def this(message: String) = this()
    def this(message: String, claim: String) = this()
    def this(message: String, claim: String, reason: String) = this()
    def this(message: String, claim: Unit, reason: String) = this()
  }
  
  @JSImport("jose/dist/types/util/errors", "JWTInvalid")
  @js.native
  open class JWTInvalid () extends JOSEError {
    def this(message: String) = this()
  }
}
