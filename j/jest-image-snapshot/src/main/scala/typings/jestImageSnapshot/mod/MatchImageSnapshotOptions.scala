package typings.jestImageSnapshot.mod

import typings.jestImageSnapshot.anon.Counter
import typings.jestImageSnapshot.anon.PartialOptions
import typings.jestImageSnapshot.jestImageSnapshotStrings.horizontal
import typings.jestImageSnapshot.jestImageSnapshotStrings.percent
import typings.jestImageSnapshot.jestImageSnapshotStrings.pixel
import typings.jestImageSnapshot.jestImageSnapshotStrings.pixelmatch
import typings.jestImageSnapshot.jestImageSnapshotStrings.ssim
import typings.jestImageSnapshot.jestImageSnapshotStrings.vertical
import typings.pixelmatch.mod.PixelmatchOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatchImageSnapshotOptions extends js.Object {
  
  /**
    * If set to true, the build will not fail when the screenshots to compare have different sizes.
    * @default false
    */
  var allowSizeMismatch: js.UndefOr[Boolean] = js.native
  
  /**
    * Applies Gaussian Blur on compared images, accepts radius in pixels as value. Useful when you have noise after
    * scaling images per different resolutions on your target website, usually setting its value to 1-2 should be
    * enough to solve that problem.
    * @default 0.
    */
  var blur: js.UndefOr[Double] = js.native
  
  /**
    * The method by which images are compared.
    * `pixelmatch` does a pixel by pixel comparison, whereas `ssim` does a structural similarity comparison.
    * @default 'pixelmatch'
    */
  var comparisonMethod: js.UndefOr[pixelmatch | ssim] = js.native
  
  /**
    * Custom config passed to 'pixelmatch' or 'ssim'
    */
  var customDiffConfig: js.UndefOr[PixelmatchOptions | PartialOptions] = js.native
  
  /**
    * A custom absolute path of a directory to keep this diff in
    */
  var customDiffDir: js.UndefOr[String] = js.native
  
  /**
    * A custom name to give this snapshot. If not provided, one is computed automatically. When a function is provided
    * it is called with an object containing testPath, currentTestName, counter and defaultIdentifier as its first
    * argument. The function must return an identifier to use for the snapshot.
    */
  var customSnapshotIdentifier: js.UndefOr[(js.Function1[/* parameters */ Counter, String]) | String] = js.native
  
  /**
    * Custom snapshots directory.
    * Absolute path of a directory to keep the snapshot in.
    */
  var customSnapshotsDir: js.UndefOr[String] = js.native
  
  /**
    * Changes diff image layout direction.
    * @default 'horizontal'
    */
  var diffDirection: js.UndefOr[horizontal | vertical] = js.native
  
  /**
    * Will output base64 string of a diff image to console in case of failed tests (in addition to creating a diff image).
    * This string can be copy-pasted to a browser address string to preview the diff for a failed test.
    * @default false
    */
  var dumpDiffToConsole: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets the threshold that would trigger a test failure based on the failureThresholdType selected. This is different
    * to the customDiffConfig.threshold above - the customDiffConfig.threshold is the per pixel failure threshold, whereas
    * this is the failure threshold for the entire comparison.
    * @default 0.
    */
  var failureThreshold: js.UndefOr[Double] = js.native
  
  /**
    * Sets the type of threshold that would trigger a failure.
    * @default 'pixel'.
    */
  var failureThresholdType: js.UndefOr[pixel | percent] = js.native
  
  /**
    * Removes coloring from the console output, useful if storing the results to a file.
    * @default false.
    */
  var noColors: js.UndefOr[Boolean] = js.native
  
  /**
    * Runs the diff in process without spawning a child process.
    * @default false.
    */
  var runInProcess: js.UndefOr[Boolean] = js.native
  
  /**
    * Updates a snapshot even if it passed the threshold against the existing one.
    * @default false.
    */
  var updatePassedSnapshot: js.UndefOr[Boolean] = js.native
}
object MatchImageSnapshotOptions {
  
  @scala.inline
  def apply(): MatchImageSnapshotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchImageSnapshotOptions]
  }
  
  @scala.inline
  implicit class MatchImageSnapshotOptionsOps[Self <: MatchImageSnapshotOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowSizeMismatch(value: Boolean): Self = this.set("allowSizeMismatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSizeMismatch: Self = this.set("allowSizeMismatch", js.undefined)
    
    @scala.inline
    def setBlur(value: Double): Self = this.set("blur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlur: Self = this.set("blur", js.undefined)
    
    @scala.inline
    def setComparisonMethod(value: pixelmatch | ssim): Self = this.set("comparisonMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComparisonMethod: Self = this.set("comparisonMethod", js.undefined)
    
    @scala.inline
    def setCustomDiffConfig(value: PixelmatchOptions | PartialOptions): Self = this.set("customDiffConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomDiffConfig: Self = this.set("customDiffConfig", js.undefined)
    
    @scala.inline
    def setCustomDiffDir(value: String): Self = this.set("customDiffDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomDiffDir: Self = this.set("customDiffDir", js.undefined)
    
    @scala.inline
    def setCustomSnapshotIdentifierFunction1(value: /* parameters */ Counter => String): Self = this.set("customSnapshotIdentifier", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCustomSnapshotIdentifier(value: (js.Function1[/* parameters */ Counter, String]) | String): Self = this.set("customSnapshotIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomSnapshotIdentifier: Self = this.set("customSnapshotIdentifier", js.undefined)
    
    @scala.inline
    def setCustomSnapshotsDir(value: String): Self = this.set("customSnapshotsDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomSnapshotsDir: Self = this.set("customSnapshotsDir", js.undefined)
    
    @scala.inline
    def setDiffDirection(value: horizontal | vertical): Self = this.set("diffDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiffDirection: Self = this.set("diffDirection", js.undefined)
    
    @scala.inline
    def setDumpDiffToConsole(value: Boolean): Self = this.set("dumpDiffToConsole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDumpDiffToConsole: Self = this.set("dumpDiffToConsole", js.undefined)
    
    @scala.inline
    def setFailureThreshold(value: Double): Self = this.set("failureThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureThreshold: Self = this.set("failureThreshold", js.undefined)
    
    @scala.inline
    def setFailureThresholdType(value: pixel | percent): Self = this.set("failureThresholdType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureThresholdType: Self = this.set("failureThresholdType", js.undefined)
    
    @scala.inline
    def setNoColors(value: Boolean): Self = this.set("noColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoColors: Self = this.set("noColors", js.undefined)
    
    @scala.inline
    def setRunInProcess(value: Boolean): Self = this.set("runInProcess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunInProcess: Self = this.set("runInProcess", js.undefined)
    
    @scala.inline
    def setUpdatePassedSnapshot(value: Boolean): Self = this.set("updatePassedSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatePassedSnapshot: Self = this.set("updatePassedSnapshot", js.undefined)
  }
}
