package typings
package jsforceLib.apiMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeployOptions extends js.Object {
  var allowMissingFiles: js.UndefOr[scala.Boolean] = js.undefined
  var autoUpdatePackage: js.UndefOr[scala.Boolean] = js.undefined
  var checkOnly: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreWarnings: js.UndefOr[scala.Boolean] = js.undefined
  var performRetrieve: js.UndefOr[scala.Boolean] = js.undefined
  var purgeOnDelete: js.UndefOr[scala.Boolean] = js.undefined
  var rollbackOnError: js.UndefOr[scala.Boolean] = js.undefined
  var runAllTests: js.UndefOr[scala.Boolean] = js.undefined
  var runTests: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var singlePackage: js.UndefOr[scala.Boolean] = js.undefined
}

object DeployOptions {
  @scala.inline
  def apply(
    allowMissingFiles: js.UndefOr[scala.Boolean] = js.undefined,
    autoUpdatePackage: js.UndefOr[scala.Boolean] = js.undefined,
    checkOnly: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreWarnings: js.UndefOr[scala.Boolean] = js.undefined,
    performRetrieve: js.UndefOr[scala.Boolean] = js.undefined,
    purgeOnDelete: js.UndefOr[scala.Boolean] = js.undefined,
    rollbackOnError: js.UndefOr[scala.Boolean] = js.undefined,
    runAllTests: js.UndefOr[scala.Boolean] = js.undefined,
    runTests: js.Array[java.lang.String] = null,
    singlePackage: js.UndefOr[scala.Boolean] = js.undefined
  ): DeployOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowMissingFiles)) __obj.updateDynamic("allowMissingFiles")(allowMissingFiles)
    if (!js.isUndefined(autoUpdatePackage)) __obj.updateDynamic("autoUpdatePackage")(autoUpdatePackage)
    if (!js.isUndefined(checkOnly)) __obj.updateDynamic("checkOnly")(checkOnly)
    if (!js.isUndefined(ignoreWarnings)) __obj.updateDynamic("ignoreWarnings")(ignoreWarnings)
    if (!js.isUndefined(performRetrieve)) __obj.updateDynamic("performRetrieve")(performRetrieve)
    if (!js.isUndefined(purgeOnDelete)) __obj.updateDynamic("purgeOnDelete")(purgeOnDelete)
    if (!js.isUndefined(rollbackOnError)) __obj.updateDynamic("rollbackOnError")(rollbackOnError)
    if (!js.isUndefined(runAllTests)) __obj.updateDynamic("runAllTests")(runAllTests)
    if (runTests != null) __obj.updateDynamic("runTests")(runTests)
    if (!js.isUndefined(singlePackage)) __obj.updateDynamic("singlePackage")(singlePackage)
    __obj.asInstanceOf[DeployOptions]
  }
}

