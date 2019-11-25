package typings.jest.jestMod.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotSerializerColors extends js.Object {
  var comment: SnapshotSerializerColor
  var content: SnapshotSerializerColor
  var prop: SnapshotSerializerColor
  var tag: SnapshotSerializerColor
  var value: SnapshotSerializerColor
}

object SnapshotSerializerColors {
  @scala.inline
  def apply(
    comment: SnapshotSerializerColor,
    content: SnapshotSerializerColor,
    prop: SnapshotSerializerColor,
    tag: SnapshotSerializerColor,
    value: SnapshotSerializerColor
  ): SnapshotSerializerColors = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], prop = prop.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SnapshotSerializerColors]
  }
}

