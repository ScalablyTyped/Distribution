package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfoItem extends js.Object {
  var flair: js.UndefOr[String] = js.undefined
  var group: InfoItemGroup
  var key: String
  var path: js.UndefOr[String] = js.undefined
  var value: String
}

object InfoItem {
  @scala.inline
  def apply(group: InfoItemGroup, key: String, value: String, flair: String = null, path: String = null): InfoItem = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (flair != null) __obj.updateDynamic("flair")(flair.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfoItem]
  }
}

