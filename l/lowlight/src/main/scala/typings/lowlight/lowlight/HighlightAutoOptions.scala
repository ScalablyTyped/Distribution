package typings.lowlight.lowlight

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightAutoOptions extends HighlightOptions {
  var subset: js.UndefOr[js.Array[String]] = js.undefined
}

object HighlightAutoOptions {
  @scala.inline
  def apply(prefix: String = null, subset: js.Array[String] = null): HighlightAutoOptions = {
    val __obj = js.Dynamic.literal()
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (subset != null) __obj.updateDynamic("subset")(subset.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightAutoOptions]
  }
}

