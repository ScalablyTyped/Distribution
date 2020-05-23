package typings.grommet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictx
  extends /* x */ StringDictionary[js.UndefOr[BorderSize]] {
  var large: js.UndefOr[BorderSize] = js.undefined
  var medium: js.UndefOr[BorderSize] = js.undefined
  var small: js.UndefOr[BorderSize] = js.undefined
}

object Dictx {
  @scala.inline
  def apply(
    StringDictionary: /* x */ StringDictionary[js.UndefOr[BorderSize]] = null,
    large: BorderSize = null,
    medium: BorderSize = null,
    small: BorderSize = null
  ): Dictx = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (large != null) __obj.updateDynamic("large")(large.asInstanceOf[js.Any])
    if (medium != null) __obj.updateDynamic("medium")(medium.asInstanceOf[js.Any])
    if (small != null) __obj.updateDynamic("small")(small.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictx]
  }
}

