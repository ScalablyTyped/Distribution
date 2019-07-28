package typings.atHapiBell.atHapiBellMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomProtocol extends js.Object {
  /**
    * the authorization endpoint URI.
    */
  var auth: String
  /**
    * a headers object with additional headers required by the provider
    * (e.g. GitHub required the 'User-Agent' header which is set by default).
    */
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * The name of the protocol.
    * @default custom
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * the access token endpoint URI.
    */
  var token: String
}

object CustomProtocol {
  @scala.inline
  def apply(auth: String, token: String, headers: StringDictionary[String] = null, name: String = null): CustomProtocol = {
    val __obj = js.Dynamic.literal(auth = auth, token = token)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[CustomProtocol]
  }
}

