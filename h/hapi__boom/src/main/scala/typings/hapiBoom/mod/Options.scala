package typings.hapiBoom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[Data] extends js.Object {
  /**
    * Constructor reference used to crop the exception call stack output
    */
  var ctor: js.UndefOr[js.Function] = js.undefined
  /**
    * Additional error information
    */
  var data: js.UndefOr[Data] = js.undefined
  /**
    * Error message string
    *
    * @default none
    */
  var message: js.UndefOr[String] = js.undefined
  /**
    * If false, the err provided is a Boom object, and a statusCode or message are provided, the values are ignored
    *
    * @default true
    */
  var `override`: js.UndefOr[Boolean] = js.undefined
  /**
    * The HTTP status code
    *
    * @default 500
    */
  var statusCode: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply[Data](
    ctor: js.Function = null,
    data: Data = null,
    message: String = null,
    `override`: js.UndefOr[Boolean] = js.undefined,
    statusCode: js.UndefOr[Double] = js.undefined
  ): Options[Data] = {
    val __obj = js.Dynamic.literal()
    if (ctor != null) __obj.updateDynamic("ctor")(ctor.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (!js.isUndefined(`override`)) __obj.updateDynamic("override")(`override`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(statusCode)) __obj.updateDynamic("statusCode")(statusCode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[Data]]
  }
}

