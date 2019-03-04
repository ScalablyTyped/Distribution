package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfoItem extends js.Object {
  var flair: js.UndefOr[java.lang.String] = js.undefined
  var group: InfoItemGroup
  var key: java.lang.String
  var path: js.UndefOr[java.lang.String] = js.undefined
  var value: java.lang.String
}

object InfoItem {
  @scala.inline
  def apply(
    group: InfoItemGroup,
    key: java.lang.String,
    value: java.lang.String,
    flair: java.lang.String = null,
    path: java.lang.String = null
  ): InfoItem = {
    val __obj = js.Dynamic.literal(group = group, key = key, value = value)
    if (flair != null) __obj.updateDynamic("flair")(flair)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[InfoItem]
  }
}

