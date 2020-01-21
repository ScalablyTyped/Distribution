package typings.jest.mod.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotSerializerColor extends js.Object {
  var close: String
  var open: String
}

object SnapshotSerializerColor {
  @scala.inline
  def apply(close: String, open: String): SnapshotSerializerColor = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SnapshotSerializerColor]
  }
}

