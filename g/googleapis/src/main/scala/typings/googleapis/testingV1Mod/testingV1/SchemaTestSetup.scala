package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A description of how to set up the Android device prior to running the
  * test.
  */
@js.native
trait SchemaTestSetup extends js.Object {
  /**
    * The device will be logged in on this account for the duration of the
    * test.
    */
  var account: js.UndefOr[SchemaAccount] = js.native
  /**
    * APKs to install in addition to those being directly tested. Currently
    * capped at 100.
    */
  var additionalApks: js.UndefOr[js.Array[SchemaApk]] = js.native
  /**
    * List of directories on the device to upload to GCS at the end of the
    * test; they must be absolute paths under /sdcard or /data/local/tmp. Path
    * names are restricted to characters a-z A-Z 0-9 _ - . + and /  Note: The
    * paths /sdcard and /data will be made available and treated as implicit
    * path substitutions. E.g. if /sdcard on a particular device does not map
    * to external storage, the system will replace it with the external storage
    * path prefix for that device.
    */
  var directoriesToPull: js.UndefOr[js.Array[String]] = js.native
  /**
    * Environment variables to set for the test (only applicable for
    * instrumentation tests).
    */
  var environmentVariables: js.UndefOr[js.Array[SchemaEnvironmentVariable]] = js.native
  /**
    * List of files to push to the device before starting the test.
    */
  var filesToPush: js.UndefOr[js.Array[SchemaDeviceFile]] = js.native
  /**
    * The network traffic profile used for running the test. Available network
    * profiles can be queried by using the NETWORK_CONFIGURATION environment
    * type when calling
    * TestEnvironmentDiscoveryService.GetTestEnvironmentCatalog.
    */
  var networkProfile: js.UndefOr[String] = js.native
}

object SchemaTestSetup {
  @scala.inline
  def apply(
    account: SchemaAccount = null,
    additionalApks: js.Array[SchemaApk] = null,
    directoriesToPull: js.Array[String] = null,
    environmentVariables: js.Array[SchemaEnvironmentVariable] = null,
    filesToPush: js.Array[SchemaDeviceFile] = null,
    networkProfile: String = null
  ): SchemaTestSetup = {
    val __obj = js.Dynamic.literal()
    if (account != null) __obj.updateDynamic("account")(account.asInstanceOf[js.Any])
    if (additionalApks != null) __obj.updateDynamic("additionalApks")(additionalApks.asInstanceOf[js.Any])
    if (directoriesToPull != null) __obj.updateDynamic("directoriesToPull")(directoriesToPull.asInstanceOf[js.Any])
    if (environmentVariables != null) __obj.updateDynamic("environmentVariables")(environmentVariables.asInstanceOf[js.Any])
    if (filesToPush != null) __obj.updateDynamic("filesToPush")(filesToPush.asInstanceOf[js.Any])
    if (networkProfile != null) __obj.updateDynamic("networkProfile")(networkProfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTestSetup]
  }
}

