package typings
package markdownlintLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Allowedelements extends js.Object {
  var allowed_elements: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_Allowedelements {
  @scala.inline
  def apply(allowed_elements: js.Array[java.lang.String] = null): Anon_Allowedelements = {
    val __obj = js.Dynamic.literal()
    if (allowed_elements != null) __obj.updateDynamic("allowed_elements")(allowed_elements)
    __obj.asInstanceOf[Anon_Allowedelements]
  }
}

