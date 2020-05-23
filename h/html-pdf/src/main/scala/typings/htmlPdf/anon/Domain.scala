package typings.htmlPdf.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Domain extends js.Object {
  var domain: js.UndefOr[String] = js.undefined
  var expires: js.UndefOr[Double] = js.undefined
  var httponly: js.UndefOr[Boolean] = js.undefined
  var name: String
  var path: String
  var secure: js.UndefOr[Boolean] = js.undefined
  var value: String
}

object Domain {
  @scala.inline
  def apply(
    name: String,
    path: String,
    value: String,
    domain: String = null,
    expires: js.UndefOr[Double] = js.undefined,
    httponly: js.UndefOr[Boolean] = js.undefined,
    secure: js.UndefOr[Boolean] = js.undefined
  ): Domain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (!js.isUndefined(expires)) __obj.updateDynamic("expires")(expires.get.asInstanceOf[js.Any])
    if (!js.isUndefined(httponly)) __obj.updateDynamic("httponly")(httponly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Domain]
  }
}

