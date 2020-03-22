package typings.intercomClient.tagMod

import typings.intercomClient.intercomClientStrings.tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<intercom-client.intercom-client/Tag.TagIdentifier> */
trait Tag extends js.Object {
  val id: String
  var name: String
  val `type`: tag
}

object Tag {
  @scala.inline
  def apply(id: String, name: String, `type`: tag): Tag = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
}

