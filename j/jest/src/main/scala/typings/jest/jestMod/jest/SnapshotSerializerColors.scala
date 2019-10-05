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
    val __obj = js.Dynamic.literal(comment = comment, content = content, prop = prop, tag = tag, value = value)
  
    __obj.asInstanceOf[SnapshotSerializerColors]
  }
}

