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
    val __obj = js.Dynamic.literal(group = group, key = key, value = value)
    if (flair != null) __obj.updateDynamic("flair")(flair)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[InfoItem]
  }
}

