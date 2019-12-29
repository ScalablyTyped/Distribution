package typings.libratoDashNode.libratoDashNodeMod

import typings.libratoDashNode.libratoDashNodeBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LibratoConfig extends js.Object {
  var email: String
  var prefix: js.UndefOr[String] = js.undefined
  var requestOptions: js.UndefOr[LibratoRequestOptions] = js.undefined
  var simulate: js.UndefOr[`false`] = js.undefined
  var source: js.UndefOr[String] = js.undefined
  var token: String
}

object LibratoConfig {
  @scala.inline
  def apply(
    email: String,
    token: String,
    prefix: String = null,
    requestOptions: LibratoRequestOptions = null,
    simulate: `false` = null,
    source: String = null
  ): LibratoConfig = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (requestOptions != null) __obj.updateDynamic("requestOptions")(requestOptions.asInstanceOf[js.Any])
    if (simulate != null) __obj.updateDynamic("simulate")(simulate.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[LibratoConfig]
  }
}

