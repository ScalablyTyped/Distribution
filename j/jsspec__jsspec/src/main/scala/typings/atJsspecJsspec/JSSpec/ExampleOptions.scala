package typings.atJsspecJsspec.JSSpec

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
  def apply(timeout: Int | Double = null): ExampleOptions = {
    val __obj = js.Dynamic.literal()
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExampleOptions]
  }
}

