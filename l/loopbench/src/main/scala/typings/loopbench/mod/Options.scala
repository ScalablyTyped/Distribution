package typings.loopbench.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * The maximum amount of delay that is tolerated before `overLimit` becomes true,
    * and the `load` event is emitted, defaults to `42`.
    */
  var limit: js.UndefOr[Double] = js.undefined
  /**
    * The interval at which the eventLoop should be sampled, defaults to `5`.
    */
  var sampleInterval: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(limit: Int | Double = null, sampleInterval: Int | Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (sampleInterval != null) __obj.updateDynamic("sampleInterval")(sampleInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

