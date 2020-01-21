package typings.jestImageSnapshot.mod

import typings.jestImageSnapshot.AnonCounter
import typings.jestImageSnapshot.jestImageSnapshotStrings.horizontal
import typings.jestImageSnapshot.jestImageSnapshotStrings.percent
import typings.jestImageSnapshot.jestImageSnapshotStrings.pixel
import typings.jestImageSnapshot.jestImageSnapshotStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchImageSnapshotOptions extends js.Object {
  /**
    * Applies Gaussian Blur on compared images, accepts radius in pixels as value. Useful when you have noise after
    * scaling images per different resolutions on your target website, usually setting it's value to 1-2 should be
    * enough to solve that problem.
    * Defaults to 0.
    */
  var blur: js.UndefOr[Double] = js.undefined
  /**
    * Custom config passed to 'pixelmatch'
    */
  var customDiffConfig: js.UndefOr[PixelmatchOptions] = js.undefined
  /**
    * A custom absolute path of a directory to keep this diff in
    */
  var customDiffDir: js.UndefOr[String] = js.undefined
  /**
    * A custom name to give this snapshot. If not provided, one is computed automatically. When a function is provided
    * it is called with an object containing testPath, currentTestName, counter and defaultIdentifier as its first
    * argument. The function must return an identifier to use for the snapshot.
    */
  var customSnapshotIdentifier: js.UndefOr[(js.Function1[/* parameters */ AnonCounter, String]) | String] = js.undefined
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
    * Runs the diff in process without spawning a child process.
    * Defaults to false.
    */
  var runInProcess: js.UndefOr[Boolean] = js.undefined
  /**
    * Updates a snapshot even if it passed the threshold against the existing one.
    * Defaults to false.
    */
  var updatePassedSnapshot: js.UndefOr[Boolean] = js.undefined
}

object MatchImageSnapshotOptions {
  @scala.inline
  def apply(
    blur: Int | Double = null,
    customDiffConfig: PixelmatchOptions = null,
    customDiffDir: String = null,
    customSnapshotIdentifier: (js.Function1[/* parameters */ AnonCounter, String]) | String = null,
    customSnapshotsDir: String = null,
    diffDirection: horizontal | vertical = null,
    failureThreshold: Int | Double = null,
    failureThresholdType: pixel | percent = null,
    noColors: js.UndefOr[Boolean] = js.undefined,
    runInProcess: js.UndefOr[Boolean] = js.undefined,
    updatePassedSnapshot: js.UndefOr[Boolean] = js.undefined
  ): MatchImageSnapshotOptions = {
    val __obj = js.Dynamic.literal()
    if (blur != null) __obj.updateDynamic("blur")(blur.asInstanceOf[js.Any])
    if (customDiffConfig != null) __obj.updateDynamic("customDiffConfig")(customDiffConfig.asInstanceOf[js.Any])
    if (customDiffDir != null) __obj.updateDynamic("customDiffDir")(customDiffDir.asInstanceOf[js.Any])
    if (customSnapshotIdentifier != null) __obj.updateDynamic("customSnapshotIdentifier")(customSnapshotIdentifier.asInstanceOf[js.Any])
    if (customSnapshotsDir != null) __obj.updateDynamic("customSnapshotsDir")(customSnapshotsDir.asInstanceOf[js.Any])
    if (diffDirection != null) __obj.updateDynamic("diffDirection")(diffDirection.asInstanceOf[js.Any])
    if (failureThreshold != null) __obj.updateDynamic("failureThreshold")(failureThreshold.asInstanceOf[js.Any])
    if (failureThresholdType != null) __obj.updateDynamic("failureThresholdType")(failureThresholdType.asInstanceOf[js.Any])
    if (!js.isUndefined(noColors)) __obj.updateDynamic("noColors")(noColors.asInstanceOf[js.Any])
    if (!js.isUndefined(runInProcess)) __obj.updateDynamic("runInProcess")(runInProcess.asInstanceOf[js.Any])
    if (!js.isUndefined(updatePassedSnapshot)) __obj.updateDynamic("updatePassedSnapshot")(updatePassedSnapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchImageSnapshotOptions]
  }
}

