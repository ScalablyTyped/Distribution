package typings
package atHapiBellLib.atHapiBellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomProtocol2 extends CustomProtocol {
  @JSName("profile")
  var profile_Original: ProfileGetter[Credentials2] = js.native
  /**
    * the authorization protocol used.
    */
  var protocol: atHapiBellLib.atHapiBellLibStrings.oauth2 = js.native
  /**
    * an array of scope strings.
    */
  var scope: js.UndefOr[
    js.Array[java.lang.String] | (js.Function1[/* query */ StringLikeMap, js.Array[java.lang.String]])
  ] = js.native
  /**
    * the scope separator character. Only required when a provider has a broken OAuth 2.0 implementation. Defaults to space (Facebook and GitHub default to comma).
    */
  var scopeSeparator: js.UndefOr[java.lang.String] = js.native
  /**
    * boolean that determines if OAuth client id and client secret will be sent
    * as parameters as opposed to an Authorization header.
    * Defaults to false.
    */
  var useParamsAuth: js.UndefOr[scala.Boolean] = js.native
  def profile(
    `this`: CustomProviderOptions,
    credentials: Credentials2,
    params: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    get: AuthedRequest
  ): js.Promise[scala.Unit] = js.native
}

