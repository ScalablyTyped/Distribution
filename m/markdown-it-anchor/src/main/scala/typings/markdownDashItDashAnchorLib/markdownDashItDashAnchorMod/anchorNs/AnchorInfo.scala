package typings
package markdownDashItDashAnchorLib.markdownDashItDashAnchorMod.anchorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnchorInfo extends js.Object {
  var slug: java.lang.String
  var title: java.lang.String
}

object AnchorInfo {
  @scala.inline
  def apply(slug: java.lang.String, title: java.lang.String): AnchorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("slug")(slug)
    __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[AnchorInfo]
  }
}

