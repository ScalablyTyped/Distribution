package typings.kurentoClient.mod.KurentoClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var access_token: js.UndefOr[String] = js.undefined
  var duplicates_timeout: js.UndefOr[Double] = js.undefined
  var enableTransactions: js.UndefOr[Boolean] = js.undefined
  var failAfter: js.UndefOr[Double] = js.undefined
  var request_timeout: js.UndefOr[Double] = js.undefined
  var response_timeout: js.UndefOr[Double] = js.undefined
  var socket: js.UndefOr[js.Any] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
  var useImplicitTransactions: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    access_token: String = null,
    duplicates_timeout: Int | Double = null,
    enableTransactions: js.UndefOr[Boolean] = js.undefined,
    failAfter: Int | Double = null,
    request_timeout: Int | Double = null,
    response_timeout: Int | Double = null,
    socket: js.Any = null,
    strict: js.UndefOr[Boolean] = js.undefined,
    useImplicitTransactions: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (duplicates_timeout != null) __obj.updateDynamic("duplicates_timeout")(duplicates_timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTransactions)) __obj.updateDynamic("enableTransactions")(enableTransactions.asInstanceOf[js.Any])
    if (failAfter != null) __obj.updateDynamic("failAfter")(failAfter.asInstanceOf[js.Any])
    if (request_timeout != null) __obj.updateDynamic("request_timeout")(request_timeout.asInstanceOf[js.Any])
    if (response_timeout != null) __obj.updateDynamic("response_timeout")(response_timeout.asInstanceOf[js.Any])
    if (socket != null) __obj.updateDynamic("socket")(socket.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    if (!js.isUndefined(useImplicitTransactions)) __obj.updateDynamic("useImplicitTransactions")(useImplicitTransactions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

