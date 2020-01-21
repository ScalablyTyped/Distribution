package typings.highcharts.sonificationMod.highchartsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Earcon configuration, specifying an Earcon and when to play it.
  */
trait EarconConfiguration extends js.Object {
  /**
    * A function to determine whether or not to play this earcon on a
    * point. The function is called for every point, receiving that point
    * as parameter. It should return either a boolean indicating whether or
    * not to play the earcon, or a new Earcon instance - in which case the
    * new Earcon will be played.
    */
  var condition: js.UndefOr[js.Function] = js.undefined
  /**
    * An Earcon instance.
    */
  var earcon: Earcon
  /**
    * The ID of the point to play the Earcon on.
    */
  var onPoint: js.UndefOr[String] = js.undefined
}

object EarconConfiguration {
  @scala.inline
  def apply(earcon: Earcon, condition: js.Function = null, onPoint: String = null): EarconConfiguration = {
    val __obj = js.Dynamic.literal(earcon = earcon.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (onPoint != null) __obj.updateDynamic("onPoint")(onPoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[EarconConfiguration]
  }
}

