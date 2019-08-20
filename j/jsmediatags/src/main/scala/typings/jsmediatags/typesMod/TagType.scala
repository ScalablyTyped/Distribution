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
    val __obj = js.Dynamic.literal(tags = tags)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TagType]
  }
}

