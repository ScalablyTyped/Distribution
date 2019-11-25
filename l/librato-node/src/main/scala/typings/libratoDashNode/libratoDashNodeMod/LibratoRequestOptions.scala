package typings.libratoDashNode.libratoDashNodeMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LibratoRequestOptions extends js.Object {
  var authorization: js.UndefOr[String] = js.undefined
  var delayStrategy: js.UndefOr[js.Function0[Double]] = js.undefined
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  var maxAttempts: js.UndefOr[Double] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var retryDelay: js.UndefOr[Double] = js.undefined
  var uri: js.UndefOr[String] = js.undefined
  var `user-agent`: js.UndefOr[String] = js.undefined
}

object LibratoRequestOptions {
  @scala.inline
  def apply(
    authorization: String = null,
    delayStrategy: () => Double = null,
    headers: StringDictionary[String] = null,
    maxAttempts: Int | Double = null,
    method: String = null,
    retryDelay: Int | Double = null,
    uri: String = null,
    `user-agent`: String = null
  ): LibratoRequestOptions = {
    val __obj = js.Dynamic.literal()
    if (authorization != null) __obj.updateDynamic("authorization")(authorization.asInstanceOf[js.Any])
    if (delayStrategy != null) __obj.updateDynamic("delayStrategy")(js.Any.fromFunction0(delayStrategy))
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (maxAttempts != null) __obj.updateDynamic("maxAttempts")(maxAttempts.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (retryDelay != null) __obj.updateDynamic("retryDelay")(retryDelay.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    if (`user-agent` != null) __obj.updateDynamic("user-agent")(`user-agent`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LibratoRequestOptions]
  }
}

