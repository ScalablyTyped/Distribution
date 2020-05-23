package typings.jsspecJsspec.JSSpec

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExampleOptions extends js.Object {
  /**
    * fail the test after _timeout_ milliseconds
    */
  var timeout: js.UndefOr[Double] = js.undefined
}

object ExampleOptions {
  @scala.inline
  def apply(timeout: js.UndefOr[Double] = js.undefined): ExampleOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExampleOptions]
  }
}

