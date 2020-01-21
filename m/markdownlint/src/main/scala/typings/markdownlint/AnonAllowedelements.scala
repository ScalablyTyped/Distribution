package typings.markdownlint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllowedelements extends js.Object {
  var allowed_elements: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonAllowedelements {
  @scala.inline
  def apply(allowed_elements: js.Array[String] = null): AnonAllowedelements = {
    val __obj = js.Dynamic.literal()
    if (allowed_elements != null) __obj.updateDynamic("allowed_elements")(allowed_elements.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllowedelements]
  }
}

