package typings.jsforce.metadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeployOptions extends js.Object {
  var allowMissingFiles: js.UndefOr[Boolean] = js.undefined
  var autoUpdatePackage: js.UndefOr[Boolean] = js.undefined
  var checkOnly: js.UndefOr[Boolean] = js.undefined
  var ignoreWarnings: js.UndefOr[Boolean] = js.undefined
  var performRetrieve: js.UndefOr[Boolean] = js.undefined
  var purgeOnDelete: js.UndefOr[Boolean] = js.undefined
  var rollbackOnError: js.UndefOr[Boolean] = js.undefined
  var runAllTests: js.UndefOr[Boolean] = js.undefined
  var runTests: js.UndefOr[js.Array[String]] = js.undefined
  var singlePackage: js.UndefOr[Boolean] = js.undefined
}

object DeployOptions {
  @scala.inline
  def apply(
    allowMissingFiles: js.UndefOr[Boolean] = js.undefined,
    autoUpdatePackage: js.UndefOr[Boolean] = js.undefined,
    checkOnly: js.UndefOr[Boolean] = js.undefined,
    ignoreWarnings: js.UndefOr[Boolean] = js.undefined,
    performRetrieve: js.UndefOr[Boolean] = js.undefined,
    purgeOnDelete: js.UndefOr[Boolean] = js.undefined,
    rollbackOnError: js.UndefOr[Boolean] = js.undefined,
    runAllTests: js.UndefOr[Boolean] = js.undefined,
    runTests: js.Array[String] = null,
    singlePackage: js.UndefOr[Boolean] = js.undefined
  ): DeployOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowMissingFiles)) __obj.updateDynamic("allowMissingFiles")(allowMissingFiles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoUpdatePackage)) __obj.updateDynamic("autoUpdatePackage")(autoUpdatePackage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(checkOnly)) __obj.updateDynamic("checkOnly")(checkOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreWarnings)) __obj.updateDynamic("ignoreWarnings")(ignoreWarnings.get.asInstanceOf[js.Any])
    if (!js.isUndefined(performRetrieve)) __obj.updateDynamic("performRetrieve")(performRetrieve.get.asInstanceOf[js.Any])
    if (!js.isUndefined(purgeOnDelete)) __obj.updateDynamic("purgeOnDelete")(purgeOnDelete.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rollbackOnError)) __obj.updateDynamic("rollbackOnError")(rollbackOnError.get.asInstanceOf[js.Any])
    if (!js.isUndefined(runAllTests)) __obj.updateDynamic("runAllTests")(runAllTests.get.asInstanceOf[js.Any])
    if (runTests != null) __obj.updateDynamic("runTests")(runTests.asInstanceOf[js.Any])
    if (!js.isUndefined(singlePackage)) __obj.updateDynamic("singlePackage")(singlePackage.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeployOptions]
  }
}

