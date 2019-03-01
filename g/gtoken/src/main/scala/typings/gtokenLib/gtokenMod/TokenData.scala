package typings
package gtokenLib.gtokenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenData extends js.Object {
  var access_token: js.UndefOr[java.lang.String] = js.undefined
  var expires_in: js.UndefOr[scala.Double] = js.undefined
  var id_token: js.UndefOr[java.lang.String] = js.undefined
  var refresh_token: js.UndefOr[java.lang.String] = js.undefined
  var token_type: js.UndefOr[java.lang.String] = js.undefined
}

object TokenData {
  @scala.inline
  def apply(
    access_token: java.lang.String = null,
    expires_in: scala.Int | scala.Double = null,
    id_token: java.lang.String = null,
    refresh_token: java.lang.String = null,
    token_type: java.lang.String = null
  ): TokenData = {
    val __obj = js.Dynamic.literal()
    if (access_token != null) __obj.updateDynamic("access_token")(access_token)
    if (expires_in != null) __obj.updateDynamic("expires_in")(expires_in.asInstanceOf[js.Any])
    if (id_token != null) __obj.updateDynamic("id_token")(id_token)
    if (refresh_token != null) __obj.updateDynamic("refresh_token")(refresh_token)
    if (token_type != null) __obj.updateDynamic("token_type")(token_type)
    __obj.asInstanceOf[TokenData]
  }
}

