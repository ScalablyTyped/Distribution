package typings
package kyLib.kyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hooks extends js.Object {
  /**
  	After the response is received.
  	This hook enables you to read and optionally modify the response. The return value of the hook function will be used by Ky as the response object if it's an instance of [`Response`](https://developer.mozilla.org/en-US/docs/Web/API/Response).
  	@default []
  	*/
  var afterResponse: js.UndefOr[js.Array[AfterResponseHook]] = js.undefined
  /**
  	Before the request is sent.
  	This hook enables you to modify the request right before it is sent. Ky will make no further changes to the request after this. The hook function receives the normalized options as the first argument. You could, for example, modify `options.headers` here.
  	@default []
  	*/
  var beforeRequest: js.UndefOr[js.Array[BeforeRequestHook]] = js.undefined
}

object Hooks {
  @scala.inline
  def apply(
    afterResponse: js.Array[AfterResponseHook] = null,
    beforeRequest: js.Array[BeforeRequestHook] = null
  ): Hooks = {
    val __obj = js.Dynamic.literal()
    if (afterResponse != null) __obj.updateDynamic("afterResponse")(afterResponse)
    if (beforeRequest != null) __obj.updateDynamic("beforeRequest")(beforeRequest)
    __obj.asInstanceOf[Hooks]
  }
}

