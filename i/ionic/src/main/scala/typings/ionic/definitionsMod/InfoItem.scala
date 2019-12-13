package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfoItem extends js.Object {
  var flair: js.UndefOr[String] = js.undefined
  var group: InfoItemGroup
  var hidden: js.UndefOr[Boolean] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var name: String
  var path: js.UndefOr[String] = js.undefined
  var value: String
}

object InfoItem {
  @scala.inline
  def apply(
    group: InfoItemGroup,
    name: String,
    value: String,
    flair: String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    path: String = null
  ): InfoItem = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (flair != null) __obj.updateDynamic("flair")(flair.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfoItem]
  }
}

