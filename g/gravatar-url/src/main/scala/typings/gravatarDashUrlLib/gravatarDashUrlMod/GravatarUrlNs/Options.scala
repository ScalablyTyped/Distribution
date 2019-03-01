package typings
package gravatarDashUrlLib.gravatarDashUrlMod.GravatarUrlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var default: js.UndefOr[java.lang.String] = js.undefined
  var rating: js.UndefOr[
    gravatarDashUrlLib.gravatarDashUrlLibStrings.g | gravatarDashUrlLib.gravatarDashUrlLibStrings.pg | gravatarDashUrlLib.gravatarDashUrlLibStrings.r | gravatarDashUrlLib.gravatarDashUrlLibStrings.x
  ] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    default: java.lang.String = null,
    rating: gravatarDashUrlLib.gravatarDashUrlLibStrings.g | gravatarDashUrlLib.gravatarDashUrlLibStrings.pg | gravatarDashUrlLib.gravatarDashUrlLibStrings.r | gravatarDashUrlLib.gravatarDashUrlLibStrings.x = null,
    size: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    if (rating != null) __obj.updateDynamic("rating")(rating.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

