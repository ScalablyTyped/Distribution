package typings.koaDashJsonDashError.koaDashJsonDashErrorMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONErrorOptions extends js.Object {
  /**
    * Runs inmediatly after `options.preFormat`. It receives two arguments: the original `err` and the output of     `options.preFormat`. It should `return` a newly formatted error.
    */
  var format: js.UndefOr[js.Function2[/* err */ Error, /* obj */ js.Any, _]] = js.undefined
  /**
    * Runs inmediatly after `options.format`. It receives two arguments: the original `err` and the output of   `options.format`.   It should `return` a newly formatted error.
    */
  var postFormat: js.UndefOr[js.Function2[/* err */ Error, /* obj */ js.Any, _]] = js.undefined
  /**
    * Perform some task before calling `options.format`. Must be a function with the original err as its only argument.
    */
  var preFormat: js.UndefOr[js.Function1[/* err */ Error, _]] = js.undefined
}

object JSONErrorOptions {
  @scala.inline
  def apply(
    format: (/* err */ Error, /* obj */ js.Any) => _ = null,
    postFormat: (/* err */ Error, /* obj */ js.Any) => _ = null,
    preFormat: /* err */ Error => _ = null
  ): JSONErrorOptions = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction2(format))
    if (postFormat != null) __obj.updateDynamic("postFormat")(js.Any.fromFunction2(postFormat))
    if (preFormat != null) __obj.updateDynamic("preFormat")(js.Any.fromFunction1(preFormat))
    __obj.asInstanceOf[JSONErrorOptions]
  }
}

