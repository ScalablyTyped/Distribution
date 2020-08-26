package typings.logform.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimestampOptions extends js.Object {
  /**
    * The name of an alias for the timestamp property, that will be added to the `info` object.
    */
  var alias: js.UndefOr[String] = js.native
  /**
    * Either the format as a string accepted by the [fecha](https://github.com/taylorhakes/fecha)
    * module or a function that returns a formatted date. If no format is provided `new
    * Date().toISOString()` will be used.
    */
  var format: js.UndefOr[String | js.Function0[String]] = js.native
}

object TimestampOptions {
  @scala.inline
  def apply(): TimestampOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimestampOptions]
  }
  @scala.inline
  implicit class TimestampOptionsOps[Self <: TimestampOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlias(value: String): Self = this.set("alias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlias: Self = this.set("alias", js.undefined)
    @scala.inline
    def setFormatFunction0(value: () => String): Self = this.set("format", js.Any.fromFunction0(value))
    @scala.inline
    def setFormat(value: String | js.Function0[String]): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
  }
  
}

