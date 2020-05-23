package typings.hapi.anon

import typings.hapi.hapiStrings.`private`
import typings.hapi.hapiStrings.default
import typings.hapi.hapiStrings.public
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Otherwise extends js.Object {
  var otherwise: js.UndefOr[String] = js.undefined
  var privacy: js.UndefOr[default | public | `private`] = js.undefined
  var statuses: js.UndefOr[js.Array[Double]] = js.undefined
}

object Otherwise {
  @scala.inline
  def apply(
    otherwise: String = null,
    privacy: default | public | `private` = null,
    statuses: js.Array[Double] = null
  ): Otherwise = {
    val __obj = js.Dynamic.literal()
    if (otherwise != null) __obj.updateDynamic("otherwise")(otherwise.asInstanceOf[js.Any])
    if (privacy != null) __obj.updateDynamic("privacy")(privacy.asInstanceOf[js.Any])
    if (statuses != null) __obj.updateDynamic("statuses")(statuses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Otherwise]
  }
}

