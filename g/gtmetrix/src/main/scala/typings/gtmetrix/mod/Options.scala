package typings.gtmetrix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link https://github.com/fvdm/nodejs-gtmetrix#configuration}
  */
trait Options extends js.Object {
  /**
    * API key
    * @default null
    */
  var apikey: js.UndefOr[String] = js.undefined
  /**
    * API email
    * @default null
    */
  var email: js.UndefOr[String] = js.undefined
  /**
    * Request timeout in ms
    * @default 5000
    */
  var timeout: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(apikey: String = null, email: String = null, timeout: js.UndefOr[Double] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (apikey != null) __obj.updateDynamic("apikey")(apikey.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

