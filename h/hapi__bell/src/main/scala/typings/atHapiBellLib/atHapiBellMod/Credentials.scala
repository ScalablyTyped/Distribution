package typings
package atHapiBellLib.atHapiBellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credentials extends js.Object {
  /**
    * Varying data depending on provider.
    */
  var profile: js.UndefOr[js.Object] = js.undefined
  var provider: Provider | atHapiBellLib.atHapiBellLibStrings.custom
  var query: StringLikeMap
  var token: java.lang.String
}

object Credentials {
  @scala.inline
  def apply(
    provider: Provider | atHapiBellLib.atHapiBellLibStrings.custom,
    query: StringLikeMap,
    token: java.lang.String,
    profile: js.Object = null
  ): Credentials = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], query = query, token = token)
    if (profile != null) __obj.updateDynamic("profile")(profile)
    __obj.asInstanceOf[Credentials]
  }
}

