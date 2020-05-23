package typings.hapiShot.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Close extends js.Object {
  /** whether the request will emit a close event. Defaults to undefined, meaning no close event will be emitted. */
  var close: js.UndefOr[Boolean] = js.undefined
  /** indicates whether the request will fire an end event. Defaults to undefined, meaning an end event will fire. */
  var end: js.UndefOr[Boolean] = js.undefined
  /** whether the request will emit an error event. Defaults to undefined, meaning no error event will be emitted. If set to true, the emitted error will have a message of 'Simulated'. */
  var error: js.UndefOr[Boolean] = js.undefined
  /** indicates whether the request payload will be split into chunks. Defaults to `undefined`, meaning payload will not be chunked. */
  var split: js.UndefOr[Boolean] = js.undefined
}

object Close {
  @scala.inline
  def apply(
    close: js.UndefOr[Boolean] = js.undefined,
    end: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    split: js.UndefOr[Boolean] = js.undefined
  ): Close = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(close)) __obj.updateDynamic("close")(close.get.asInstanceOf[js.Any])
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.get.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.get.asInstanceOf[js.Any])
    if (!js.isUndefined(split)) __obj.updateDynamic("split")(split.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Close]
  }
}

