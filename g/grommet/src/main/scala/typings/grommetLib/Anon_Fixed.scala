package typings
package grommetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fixed extends js.Object {
  var fixed: js.UndefOr[java.lang.String] = js.undefined
  var length: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  var options: js.UndefOr[js.Array[scala.Double | java.lang.String]] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var regexp: js.UndefOr[js.Object] = js.undefined
}

object Anon_Fixed {
  @scala.inline
  def apply(
    fixed: java.lang.String = null,
    length: scala.Double | js.Array[scala.Double] = null,
    options: js.Array[scala.Double | java.lang.String] = null,
    placeholder: java.lang.String = null,
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

