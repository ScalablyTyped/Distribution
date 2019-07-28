package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fixed extends js.Object {
  var fixed: js.UndefOr[String] = js.undefined
  var length: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var options: js.UndefOr[js.Array[Double | String]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var regexp: js.UndefOr[js.Object] = js.undefined
}

object Anon_Fixed {
  @scala.inline
  def apply(
    fixed: String = null,
    length: Double | js.Array[Double] = null,
    options: js.Array[Double | String] = null,
    placeholder: String = null,
    regexp: js.Object = null
  ): Anon_Fixed = {
    val __obj = js.Dynamic.literal()
    if (fixed != null) __obj.updateDynamic("fixed")(fixed)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (regexp != null) __obj.updateDynamic("regexp")(regexp)
    __obj.asInstanceOf[Anon_Fixed]
  }
}

