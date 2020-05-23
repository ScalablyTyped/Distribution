package typings.got.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Hooks allow modifications during the request lifecycle. Hook functions may be async and are
  * run serially.
  *
  * @see https://github.com/sindresorhus/got#hooks
  * @template Options Request options.
  * @template Body Response body type.
  */
trait Hooks[Options, Body /* <: Buffer | String | js.Object */] extends js.Object {
  var afterResponse: js.UndefOr[js.Array[AfterResponseHook[Options, Body]]] = js.undefined
  var beforeError: js.UndefOr[js.Array[BeforeErrorHook]] = js.undefined
  var beforeRedirect: js.UndefOr[js.Array[BeforeRedirectHook[Options]]] = js.undefined
  var beforeRequest: js.UndefOr[js.Array[BeforeRequestHook[Options]]] = js.undefined
  var beforeRetry: js.UndefOr[js.Array[BeforeRetryHook[Options]]] = js.undefined
  var init: js.UndefOr[js.Array[InitHook[Options]]] = js.undefined
}

object Hooks {
  @scala.inline
  def apply[Options, Body](
    afterResponse: js.Array[AfterResponseHook[Options, Body]] = null,
    beforeError: js.Array[BeforeErrorHook] = null,
    beforeRedirect: js.Array[BeforeRedirectHook[Options]] = null,
    beforeRequest: js.Array[BeforeRequestHook[Options]] = null,
    beforeRetry: js.Array[BeforeRetryHook[Options]] = null,
    init: js.Array[InitHook[Options]] = null
  ): Hooks[Options, Body] = {
    val __obj = js.Dynamic.literal()
    if (afterResponse != null) __obj.updateDynamic("afterResponse")(afterResponse.asInstanceOf[js.Any])
    if (beforeError != null) __obj.updateDynamic("beforeError")(beforeError.asInstanceOf[js.Any])
    if (beforeRedirect != null) __obj.updateDynamic("beforeRedirect")(beforeRedirect.asInstanceOf[js.Any])
    if (beforeRequest != null) __obj.updateDynamic("beforeRequest")(beforeRequest.asInstanceOf[js.Any])
    if (beforeRetry != null) __obj.updateDynamic("beforeRetry")(beforeRetry.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(init.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hooks[Options, Body]]
  }
}

