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

