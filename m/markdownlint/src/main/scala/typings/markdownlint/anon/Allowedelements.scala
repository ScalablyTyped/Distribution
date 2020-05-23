package typings.markdownlint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Allowedelements extends js.Object {
  var allowed_elements: js.UndefOr[js.Array[String]] = js.undefined
}

object Allowedelements {
  @scala.inline
  def apply(allowed_elements: js.Array[String] = null): Allowedelements = {
    val __obj = js.Dynamic.literal()
    if (allowed_elements != null) __obj.updateDynamic("allowed_elements")(allowed_elements.asInstanceOf[js.Any])
    __obj.asInstanceOf[Allowedelements]
  }
}

