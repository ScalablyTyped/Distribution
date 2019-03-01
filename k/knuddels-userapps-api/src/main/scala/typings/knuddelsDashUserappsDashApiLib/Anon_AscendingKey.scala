package typings
package knuddelsDashUserappsDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AscendingKey extends js.Object {
  var ascending: js.UndefOr[scala.Boolean] = js.undefined
  var maximumCount: js.UndefOr[scala.Double] = js.undefined
  var maximumValue: js.UndefOr[scala.Double] = js.undefined
  var minimumValue: js.UndefOr[scala.Double] = js.undefined
  var onEnd: js.UndefOr[
    js.Function2[/* totalCount */ scala.Double, /* key */ java.lang.String, scala.Unit]
  ] = js.undefined
  var onStart: js.UndefOr[
    js.Function2[/* totalCount */ scala.Double, /* key */ java.lang.String, scala.Unit]
  ] = js.undefined
}

object Anon_AscendingKey {
  @scala.inline
  def apply(
    ascending: js.UndefOr[scala.Boolean] = js.undefined,
    maximumCount: scala.Int | scala.Double = null,
    maximumValue: scala.Int | scala.Double = null,
    minimumValue: scala.Int | scala.Double = null,
    onEnd: js.Function2[/* totalCount */ scala.Double, /* key */ java.lang.String, scala.Unit] = null,
    onStart: js.Function2[/* totalCount */ scala.Double, /* key */ java.lang.String, scala.Unit] = null
  ): Anon_AscendingKey = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ascending)) __obj.updateDynamic("ascending")(ascending)
    if (maximumCount != null) __obj.updateDynamic("maximumCount")(maximumCount.asInstanceOf[js.Any])
    if (maximumValue != null) __obj.updateDynamic("maximumValue")(maximumValue.asInstanceOf[js.Any])
    if (minimumValue != null) __obj.updateDynamic("minimumValue")(minimumValue.asInstanceOf[js.Any])
    if (onEnd != null) __obj.updateDynamic("onEnd")(onEnd)
    if (onStart != null) __obj.updateDynamic("onStart")(onStart)
    __obj.asInstanceOf[Anon_AscendingKey]
  }
}

