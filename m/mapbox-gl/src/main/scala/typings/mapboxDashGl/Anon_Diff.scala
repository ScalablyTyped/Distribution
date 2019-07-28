package typings.mapboxDashGl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Diff extends js.Object {
  var diff: js.UndefOr[Boolean] = js.undefined
  var localIdeographFontFamily: js.UndefOr[String] = js.undefined
}

object Anon_Diff {
  @scala.inline
  def apply(diff: js.UndefOr[Boolean] = js.undefined, localIdeographFontFamily: String = null): Anon_Diff = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(diff)) __obj.updateDynamic("diff")(diff)
    if (localIdeographFontFamily != null) __obj.updateDynamic("localIdeographFontFamily")(localIdeographFontFamily)
    __obj.asInstanceOf[Anon_Diff]
  }
}

