package typings.jestSnapshot.inlineSnapshotsMod

import typings.jestMessageUtil.typesMod.Frame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineSnapshot extends js.Object {
  var frame: Frame
  var snapshot: String
}

object InlineSnapshot {
  @scala.inline
  def apply(frame: Frame, snapshot: String): InlineSnapshot = {
    val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InlineSnapshot]
  }
}

