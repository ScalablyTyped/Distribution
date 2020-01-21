package typings.gulpPlumber.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** 
    * Handle errors in underlying streams and output them to console. Default true.
    * If function passed, it will be attached to stream on('error')
    * If false passed, error handler will not be attached
    * If undefined passed, default error handler will be attached
    */
  var errorHandler: js.UndefOr[ErrorHandlerFunction | Boolean] = js.undefined
  /** Monkeypatch pipe functions in underlying streams in pipeline. Default true. */
  var inherit: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(errorHandler: ErrorHandlerFunction | Boolean = null, inherit: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (errorHandler != null) __obj.updateDynamic("errorHandler")(errorHandler.asInstanceOf[js.Any])
    if (!js.isUndefined(inherit)) __obj.updateDynamic("inherit")(inherit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

