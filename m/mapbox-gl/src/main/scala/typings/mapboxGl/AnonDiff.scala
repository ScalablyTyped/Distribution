package typings.mapboxGl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDiff extends js.Object {
  var diff: js.UndefOr[Boolean] = js.undefined
  var localIdeographFontFamily: js.UndefOr[String] = js.undefined
}

object AnonDiff {
  @scala.inline
  def apply(diff: js.UndefOr[Boolean] = js.undefined, localIdeographFontFamily: String = null): AnonDiff = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(diff)) __obj.updateDynamic("diff")(diff.asInstanceOf[js.Any])
    if (localIdeographFontFamily != null) __obj.updateDynamic("localIdeographFontFamily")(localIdeographFontFamily.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDiff]
  }
}

