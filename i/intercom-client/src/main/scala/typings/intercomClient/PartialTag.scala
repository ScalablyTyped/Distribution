package typings.intercomClient

import typings.intercomClient.intercomClientStrings.tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<intercom-client.intercom-client/Tag.Tag> */
trait PartialTag extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[tag] = js.undefined
}

object PartialTag {
  @scala.inline
  def apply(id: String = null, name: String = null, `type`: tag = null): PartialTag = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialTag]
  }
}

