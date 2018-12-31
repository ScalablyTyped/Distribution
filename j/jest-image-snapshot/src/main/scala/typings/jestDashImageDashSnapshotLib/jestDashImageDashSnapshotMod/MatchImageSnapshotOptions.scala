package typings
package jestDashImageDashSnapshotLib.jestDashImageDashSnapshotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchImageSnapshotOptions extends js.Object {
  /**
    * Custom config passed to 'pixelmatch'
    */
  var customDiffConfig: js.UndefOr[PixelmatchOptions] = js.undefined
  /**
    * A custom name to give this snapshot. If not provided, one is computed automatically.
    */
  var customSnapshotIdentifier: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Custom snapshots directory.
    * Absolute path of a directory to keep the snapshot in.
    */
  var customSnapshotsDir: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sets the threshold that would trigger a test failure based on the failureThresholdType selected. This is different
    * to the customDiffConfig.threshold above - the customDiffConfig.threshold is the per pixel failure threshold, whereas
    * this is the failure threshold for the entire comparison.
    * Defaults to 0.
    */
  var failureThreshold: js.UndefOr[scala.Double] = js.undefined
  /**
    * Sets the type of threshold that would trigger a failure.
    * Defaults to 'pixel'.
    */
  var failureThresholdType: js.UndefOr[
    jestDashImageDashSnapshotLib.jestDashImageDashSnapshotLibStrings.pixel | jestDashImageDashSnapshotLib.jestDashImageDashSnapshotLibStrings.percent
  ] = js.undefined
  /**
    * Removes coloring from the console output, useful if storing the results to a file.
    * Defaults to false.
    */
  var noColors: js.UndefOr[scala.Boolean] = js.undefined
}

