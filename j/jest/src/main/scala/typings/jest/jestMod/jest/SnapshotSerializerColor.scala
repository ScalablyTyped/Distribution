package typings.jest.jestMod.jest

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
    val __obj = js.Dynamic.literal(close = close, open = open)
  
    __obj.asInstanceOf[SnapshotSerializerColor]
  }
}

