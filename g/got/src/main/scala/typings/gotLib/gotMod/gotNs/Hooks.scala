package typings
package gotLib.gotMod.gotNs

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
trait Hooks[Options, Body /* <: nodeLib.Buffer | java.lang.String | js.Object */] extends js.Object {
  var afterResponse: js.UndefOr[js.Array[AfterResponseHook[Options, Body]]] = js.undefined
  var beforeRedirect: js.UndefOr[js.Array[BeforeRedirectHook[Options]]] = js.undefined
  var beforeRequest: js.UndefOr[js.Array[BeforeRequestHook[Options]]] = js.undefined
  var beforeRetry: js.UndefOr[js.Array[BeforeRetryHook[Options]]] = js.undefined
}

object Hooks {
  @scala.inline
  def apply[Options, Body /* <: nodeLib.Buffer | java.lang.String | js.Object */](
    afterResponse: js.Array[AfterResponseHook[Options, Body]] = null,
    beforeRedirect: js.Array[BeforeRedirectHook[Options]] = null,
    beforeRequest: js.Array[BeforeRequestHook[Options]] = null,
    beforeRetry: js.Array[BeforeRetryHook[Options]] = null
  ): Hooks[Options, Body] = {
    val __obj = js.Dynamic.literal()
    if (afterResponse != null) __obj.updateDynamic("afterResponse")(afterResponse)
    if (beforeRedirect != null) __obj.updateDynamic("beforeRedirect")(beforeRedirect)
    if (beforeRequest != null) __obj.updateDynamic("beforeRequest")(beforeRequest)
    if (beforeRetry != null) __obj.updateDynamic("beforeRetry")(beforeRetry)
    __obj.asInstanceOf[Hooks[Options, Body]]
  }
}

