package typings.mapboxGl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Diff extends js.Object {
  var diff: js.UndefOr[Boolean] = js.undefined
  var localIdeographFontFamily: js.UndefOr[String] = js.undefined
}

object Diff {
  @scala.inline
  def apply(diff: js.UndefOr[Boolean] = js.undefined, localIdeographFontFamily: String = null): Diff = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(diff)) __obj.updateDynamic("diff")(diff.get.asInstanceOf[js.Any])
    if (localIdeographFontFamily != null) __obj.updateDynamic("localIdeographFontFamily")(localIdeographFontFamily.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diff]
  }
}

