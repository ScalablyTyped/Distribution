package typings
package knockstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockstrapModalDefaultsFooterData extends js.Object {
  var closeLabel: java.lang.String
  var primaryLabel: java.lang.String
}

object KnockstrapModalDefaultsFooterData {
  @scala.inline
  def apply(closeLabel: java.lang.String, primaryLabel: java.lang.String): KnockstrapModalDefaultsFooterData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("closeLabel")(closeLabel)
    __obj.updateDynamic("primaryLabel")(primaryLabel)
    __obj.asInstanceOf[KnockstrapModalDefaultsFooterData]
  }
}

