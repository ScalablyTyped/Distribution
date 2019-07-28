package typings.jestDashImageDashSnapshot.jestDashImageDashSnapshotMod

import typings.jestDashImageDashSnapshot.jestDashImageDashSnapshotStrings.horizontal
import typings.jestDashImageDashSnapshot.jestDashImageDashSnapshotStrings.percent
import typings.jestDashImageDashSnapshot.jestDashImageDashSnapshotStrings.pixel
import typings.jestDashImageDashSnapshot.jestDashImageDashSnapshotStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchImageSnapshotOptions extends js.Object {
  /**
    * Custom config passed to 'pixelmatch'
    */
  var customDiffConfig: js.UndefOr[PixelmatchOptions] = js.undefined
  /**
    * A custom absolute path of a directory to keep this diff in
    */
  var customDiffDir: js.UndefOr[String] = js.undefined
  /**
    * A custom name to give this snapshot. If not provided, one is computed automatically.
    */
  var customSnapshotIdentifier: js.UndefOr[String] = js.undefined
  /**
    * Custom snapshots directory.
    * Absolute path of a directory to keep the snapshot in.
    */
  var customSnapshotsDir: js.UndefOr[String] = js.undefined
  /**
    * Changes diff image layout direction, default is horizontal.
    */
  var diffDirection: js.UndefOr[horizontal | vertical] = js.undefined
  /**
    * Sets the threshold that would trigger a test failure based on the failureThresholdType selected. This is different
    * to the customDiffConfig.threshold above - the customDiffConfig.threshold is the per pixel failure threshold, whereas
    * this is the failure threshold for the entire comparison.
    * Defaults to 0.
    */
  var failureThreshold: js.UndefOr[Double] = js.undefined
  /**
    * Sets the type of threshold that would trigger a failure.
    * Defaults to 'pixel'.
    */
  var failureThresholdType: js.UndefOr[pixel | percent] = js.undefined
  /**
    * Removes coloring from the console output, useful if storing the results to a file.
    * Defaults to false.
    */
  var noColors: js.UndefOr[Boolean] = js.undefined
  /**
    * Updates a snapshot even if it passed the threshold against the existing one, defaults to false.
    */
  var updatePassedSnapshot: js.UndefOr[Boolean] = js.undefined
}

object MatchImageSnapshotOptions {
  @scala.inline
  def apply(
    customDiffConfig: PixelmatchOptions = null,
    customDiffDir: String = null,
    customSnapshotIdentifier: String = null,
    customSnapshotsDir: String = null,
    diffDirection: horizontal | vertical = null,
    failureThreshold: Int | Double = null,
    failureThresholdType: pixel | percent = null,
    noColors: js.UndefOr[Boolean] = js.undefined,
    updatePassedSnapshot: js.UndefOr[Boolean] = js.undefined
  ): MatchImageSnapshotOptions = {
    val __obj = js.Dynamic.literal()
    if (customDiffConfig != null) __obj.updateDynamic("customDiffConfig")(customDiffConfig)
    if (customDiffDir != null) __obj.updateDynamic("customDiffDir")(customDiffDir)
    if (customSnapshotIdentifier != null) __obj.updateDynamic("customSnapshotIdentifier")(customSnapshotIdentifier)
    if (customSnapshotsDir != null) __obj.updateDynamic("customSnapshotsDir")(customSnapshotsDir)
    if (diffDirection != null) __obj.updateDynamic("diffDirection")(diffDirection.asInstanceOf[js.Any])
    if (failureThreshold != null) __obj.updateDynamic("failureThreshold")(failureThreshold.asInstanceOf[js.Any])
    if (failureThresholdType != null) __obj.updateDynamic("failureThresholdType")(failureThresholdType.asInstanceOf[js.Any])
    if (!js.isUndefined(noColors)) __obj.updateDynamic("noColors")(noColors)
    if (!js.isUndefined(updatePassedSnapshot)) __obj.updateDynamic("updatePassedSnapshot")(updatePassedSnapshot)
    __obj.asInstanceOf[MatchImageSnapshotOptions]
  }
}

