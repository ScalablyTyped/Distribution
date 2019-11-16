package typings.jestDashSnapshot.buildStateMod

import typings.atJestTypes.buildConfigMod.SnapshotUpdateState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotStateOptions extends js.Object {
  var expand: js.UndefOr[Boolean] = js.undefined
  var updateSnapshot: SnapshotUpdateState
  def getBabelTraverse(): js.Function
  def getPrettier(): Null | js.Any
}

object SnapshotStateOptions {
  @scala.inline
  def apply(
    getBabelTraverse: () => js.Function,
    getPrettier: () => Null | js.Any,
    updateSnapshot: SnapshotUpdateState,
    expand: js.UndefOr[Boolean] = js.undefined
  ): SnapshotStateOptions = {
    val __obj = js.Dynamic.literal(getBabelTraverse = js.Any.fromFunction0(getBabelTraverse), getPrettier = js.Any.fromFunction0(getPrettier), updateSnapshot = updateSnapshot)
    if (!js.isUndefined(expand)) __obj.updateDynamic("expand")(expand)
    __obj.asInstanceOf[SnapshotStateOptions]
  }
}

