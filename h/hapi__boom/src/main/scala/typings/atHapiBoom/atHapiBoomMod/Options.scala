package typings.atHapiBoom.atHapiBoomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[Data] extends js.Object {
  /** ctor - constructor reference used to crop the exception call stack output. */
  var ctor: js.UndefOr[js.Any] = js.undefined
  /** data - additional error information (assigned to error.data). */
  var data: js.UndefOr[Data] = js.undefined
  /** decorate - an option with extra properties to set on the error object. */
  var decorate: js.UndefOr[js.Object] = js.undefined
  /** message - error message string. If the error already has a message, the provided message is added as a prefix. Defaults to no message. */
  var message: js.UndefOr[String] = js.undefined
  /**
    * override - if false, the err provided is a Boom object, and a statusCode or message are
    * provided, the values are ignored. Defaults to true (apply the provided statusCode and
    * message options to the error regardless of its type, Error or Boom object).
    */
  var `override`: js.UndefOr[Boolean] = js.undefined
  /** statusCode - the HTTP status code. Defaults to 500 if no status code is already set. */
  var statusCode: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply[Data](
    ctor: js.Any = null,
    data: Data = null,
    decorate: js.Object = null,
    message: String = null,
    `override`: js.UndefOr[Boolean] = js.undefined,
    statusCode: Int | Double = null
  ): Options[Data] = {
    val __obj = js.Dynamic.literal()
    if (ctor != null) __obj.updateDynamic("ctor")(ctor)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (decorate != null) __obj.updateDynamic("decorate")(decorate)
    if (message != null) __obj.updateDynamic("message")(message)
    if (!js.isUndefined(`override`)) __obj.updateDynamic("override")(`override`)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[Data]]
  }
}

