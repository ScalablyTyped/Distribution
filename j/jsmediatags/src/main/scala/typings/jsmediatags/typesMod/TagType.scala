package typings.jsmediatags.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagType extends js.Object {
  var tags: Tags
  var `type`: String
}

object TagType {
  @scala.inline
  def apply(tags: Tags, `type`: String): TagType = {
    val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagType]
  }
}

