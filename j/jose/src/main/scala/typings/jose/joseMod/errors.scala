package typings.jose.joseMod

import typings.jose.joseMod.errors.JOSEError
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "errors")
@js.native
object errors extends js.Object {
  @js.native
  class JOSEAlgNotWhitelisted () extends JOSEError
  
  @js.native
  class JOSECritNotUnderstood () extends JOSEError
  
  @js.native
  class JOSEError () extends Error {
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  @js.native
  class JOSEMultiError () extends JOSEError
  
  @js.native
  class JOSENotSupported () extends JOSEError
  
  @js.native
  class JWEDecryptionFailed () extends JOSEError
  
  @js.native
  class JWEInvalid () extends JOSEError
  
  @js.native
  class JWKImportFailed () extends JOSEError
  
  @js.native
  class JWKInvalid () extends JOSEError
  
  @js.native
  class JWKKeySupport () extends JOSEError
  
  @js.native
  class JWKSNoMatchingKey () extends JOSEError
  
  @js.native
  class JWSInvalid () extends JOSEError
  
  @js.native
  class JWSVerificationFailed () extends JOSEError
  
  @js.native
  class JWTClaimInvalid () extends JOSEError
  
  @js.native
  class JWTMalformed () extends JOSEError
  
}

