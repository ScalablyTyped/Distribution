package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaCustomGroup extends js.Object {
  /**
    * The sub-attributes.
    */
  var attributes: js.UndefOr[js.Array[SchemaCustomAttribute]] = js.native
  /**
    * The name of the group. Underscores will be replaced by spaces upon
    * insertion.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaCustomGroup {
  @scala.inline
  def apply(attributes: js.Array[SchemaCustomAttribute] = null, name: String = null): SchemaCustomGroup = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCustomGroup]
  }
}

