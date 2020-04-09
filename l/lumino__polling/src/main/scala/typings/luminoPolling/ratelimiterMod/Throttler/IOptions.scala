package typings.luminoPolling.ratelimiterMod.Throttler

import typings.luminoPolling.luminoPollingStrings.leading
import typings.luminoPolling.luminoPollingStrings.trailing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Instantiation options for a `Throttler`.
  */
trait IOptions extends js.Object {
  /**
    * Whether to invoke at the leading or trailing edge of throttle cycle.
    * Defaults to `leading`.
    */
  var edge: js.UndefOr[leading | trailing] = js.undefined
  /**
    * The throttling limit; defaults to 500ms.
    */
  var limit: js.UndefOr[Double] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(edge: leading | trailing = null, limit: Int | Double = null): IOptions = {
    val __obj = js.Dynamic.literal()
    if (edge != null) __obj.updateDynamic("edge")(edge.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

