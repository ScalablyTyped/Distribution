package typings.jestSnapshot

import typings.jestSnapshot.stateMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSnapshotState extends js.Object {
  var snapshotState: default
}

object AnonSnapshotState {
  @scala.inline
  def apply(snapshotState: default): AnonSnapshotState = {
    val __obj = js.Dynamic.literal(snapshotState = snapshotState.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSnapshotState]
  }
}

