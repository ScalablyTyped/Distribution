package typings.hapiBell.mod

import org.scalablytyped.runtime.StringDictionary
import typings.hapiBell.hapiBellStrings.`HMAC-SHA1`
import typings.hapiBell.hapiBellStrings.`RSA-SHA1`
import typings.hapiBell.hapiBellStrings.oauth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomProtocol1 extends CustomProtocol {
  
  def profile(credentials: Credentials1, params: StringDictionary[String], get: AuthedRequest): js.Promise[Unit] = js.native
  @JSName("profile")
  var profile_Original: ProfileGetter[Credentials1] = js.native
  
  /**
    * the authorization protocol used.
    */
  var protocol: oauth = js.native
  
  /**
    * the OAuth signature method. Must be one of:
    * * 'HMAC-SHA1' - default
    * * 'RSA-SHA1' - in that case, the clientSecret is your RSA private key
    */
  var signatureMethod: js.UndefOr[`HMAC-SHA1` | `RSA-SHA1`] = js.native
  
  /**
    * the temporary credentials (request token) endpoint).
    */
  var temporary: js.UndefOr[String] = js.native
}
