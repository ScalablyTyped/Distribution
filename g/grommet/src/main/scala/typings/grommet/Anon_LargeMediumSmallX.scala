package typings.grommet

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LargeMediumSmallX extends /* x */ StringDictionary[String] {
  var large: js.UndefOr[String] = js.undefined
  var medium: js.UndefOr[String] = js.undefined
  var small: js.UndefOr[String] = js.undefined
  var xlarge: js.UndefOr[String] = js.undefined
}

object Anon_LargeMediumSmallX {
  @scala.inline
  def apply(
    StringDictionary: /* x */ StringDictionary[String] = null,
    large: String = null,
    medium: String = null,
    small: String = null,
    xlarge: String = null
  ): Anon_LargeMediumSmallX = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (large != null) __obj.updateDynamic("large")(large)
    if (medium != null) __obj.updateDynamic("medium")(medium)
    if (small != null) __obj.updateDynamic("small")(small)
    if (xlarge != null) __obj.updateDynamic("xlarge")(xlarge)
    __obj.asInstanceOf[Anon_LargeMediumSmallX]
  }
}

