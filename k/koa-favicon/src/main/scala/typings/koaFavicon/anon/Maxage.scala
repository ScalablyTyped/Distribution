package typings.koaFavicon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Maxage extends js.Object {
  /**
    * cache-control max-age directive in ms, defaulting to 1 day.
    */
  var maxage: js.UndefOr[Double] = js.undefined
}

object Maxage {
  @scala.inline
  def apply(maxage: js.UndefOr[Double] = js.undefined): Maxage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxage)) __obj.updateDynamic("maxage")(maxage.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Maxage]
  }
}

