package typings.logform.logformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimestampOptions extends js.Object {
  /**
    * The name of an alias for the timestamp property, that will be added to the `info` object.
    */
  var alias: js.UndefOr[String] = js.undefined
  /**
    * Either the format as a string accepted by the [fecha](https://github.com/taylorhakes/fecha)
    * module or a function that returns a formatted date. If no format is provided `new
    * Date().toISOString()` will be used.
    */
  var format: js.UndefOr[String] = js.undefined
}

object TimestampOptions {
  @scala.inline
  def apply(alias: String = null, format: String = null): TimestampOptions = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimestampOptions]
  }
}

