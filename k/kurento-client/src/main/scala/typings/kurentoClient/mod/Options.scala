package typings.kurentoClient.mod

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
    duplicates_timeout: js.UndefOr[Double] = js.undefined,
    enableTransactions: js.UndefOr[Boolean] = js.undefined,
    failAfter: js.UndefOr[Double] = js.undefined,
    request_timeout: js.UndefOr[Double] = js.undefined,
    response_timeout: js.UndefOr[Double] = js.undefined,
    socket: js.Any = null,
    strict: js.UndefOr[Boolean] = js.undefined,
    useImplicitTransactions: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (!js.isUndefined(duplicates_timeout)) __obj.updateDynamic("duplicates_timeout")(duplicates_timeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTransactions)) __obj.updateDynamic("enableTransactions")(enableTransactions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(failAfter)) __obj.updateDynamic("failAfter")(failAfter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(request_timeout)) __obj.updateDynamic("request_timeout")(request_timeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(response_timeout)) __obj.updateDynamic("response_timeout")(response_timeout.get.asInstanceOf[js.Any])
    if (socket != null) __obj.updateDynamic("socket")(socket.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useImplicitTransactions)) __obj.updateDynamic("useImplicitTransactions")(useImplicitTransactions.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

