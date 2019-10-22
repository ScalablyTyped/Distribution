package typings.grommet

import typings.grommet.themesBaseMod.ExtendType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExtendMaxHeight extends js.Object {
  var extend: js.UndefOr[ExtendType] = js.undefined
  var maxHeight: js.UndefOr[String] = js.undefined
}

object Anon_ExtendMaxHeight {
  @scala.inline
  def apply(extend: ExtendType = null, maxHeight: String = null): Anon_ExtendMaxHeight = {
    val __obj = js.Dynamic.literal()
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight)
    __obj.asInstanceOf[Anon_ExtendMaxHeight]
  }
}

