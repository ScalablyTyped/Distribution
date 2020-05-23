package typings.karmaSnapshot.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotOptions extends js.Object {
  /**
    * Checks existince of the source file associated with tests
    * @default false
    */
  var checkSourceFile: js.UndefOr[Boolean] = js.undefined
  /**
    * Snapshot format
    * @default 'md'
    */
  var format: js.UndefOr[String | SnapshotSerializer] = js.undefined
  /**
    * Limit number of unused snapshots reported in the warning.
    * `-1` means unlimited.
    * @default -1
    */
  var limitUnusedSnapshotsInWarning: js.UndefOr[Double] = js.undefined
  /**
    * Custom path resolver
    */
  var pathResolver: js.UndefOr[SnapshotPathResolver] = js.undefined
  /**
    * Prune unused snapshots
    * @default false
    */
  var prune: js.UndefOr[Boolean] = js.undefined
  /**
    * Run snapshot tests in UPDATE mode
    * @default false
    */
  var update: js.UndefOr[Boolean] = js.undefined
}

object SnapshotOptions {
  @scala.inline
  def apply(
    checkSourceFile: js.UndefOr[Boolean] = js.undefined,
    format: String | SnapshotSerializer = null,
    limitUnusedSnapshotsInWarning: js.UndefOr[Double] = js.undefined,
    pathResolver: (/* basePath */ String, /* suiteName */ String) => String = null,
    prune: js.UndefOr[Boolean] = js.undefined,
    update: js.UndefOr[Boolean] = js.undefined
  ): SnapshotOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkSourceFile)) __obj.updateDynamic("checkSourceFile")(checkSourceFile.get.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(limitUnusedSnapshotsInWarning)) __obj.updateDynamic("limitUnusedSnapshotsInWarning")(limitUnusedSnapshotsInWarning.get.asInstanceOf[js.Any])
    if (pathResolver != null) __obj.updateDynamic("pathResolver")(js.Any.fromFunction2(pathResolver))
    if (!js.isUndefined(prune)) __obj.updateDynamic("prune")(prune.get.asInstanceOf[js.Any])
    if (!js.isUndefined(update)) __obj.updateDynamic("update")(update.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotOptions]
  }
}

