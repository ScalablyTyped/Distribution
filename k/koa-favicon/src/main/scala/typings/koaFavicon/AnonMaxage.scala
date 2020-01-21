package typings.koaFavicon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaxage extends js.Object {
  /**
    * cache-control max-age directive in ms, defaulting to 1 day.
    */
  var maxage: js.UndefOr[Double] = js.undefined
}

object AnonMaxage {
  @scala.inline
  def apply(maxage: Int | Double = null): AnonMaxage = {
    val __obj = js.Dynamic.literal()
    if (maxage != null) __obj.updateDynamic("maxage")(maxage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMaxage]
  }
}

