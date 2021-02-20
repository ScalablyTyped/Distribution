package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A description of how to set up the Android device prior to running the
  * test.
  */
@js.native
trait SchemaTestSetup extends StObject {
  
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
  def apply(): SchemaTestSetup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestSetup]
  }
  
  @scala.inline
  implicit class SchemaTestSetupMutableBuilder[Self <: SchemaTestSetup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount(value: SchemaAccount): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    @scala.inline
    def setAdditionalApks(value: js.Array[SchemaApk]): Self = StObject.set(x, "additionalApks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalApksUndefined: Self = StObject.set(x, "additionalApks", js.undefined)
    
    @scala.inline
    def setAdditionalApksVarargs(value: SchemaApk*): Self = StObject.set(x, "additionalApks", js.Array(value :_*))
    
    @scala.inline
    def setDirectoriesToPull(value: js.Array[String]): Self = StObject.set(x, "directoriesToPull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoriesToPullUndefined: Self = StObject.set(x, "directoriesToPull", js.undefined)
    
    @scala.inline
    def setDirectoriesToPullVarargs(value: String*): Self = StObject.set(x, "directoriesToPull", js.Array(value :_*))
    
    @scala.inline
    def setEnvironmentVariables(value: js.Array[SchemaEnvironmentVariable]): Self = StObject.set(x, "environmentVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentVariablesUndefined: Self = StObject.set(x, "environmentVariables", js.undefined)
    
    @scala.inline
    def setEnvironmentVariablesVarargs(value: SchemaEnvironmentVariable*): Self = StObject.set(x, "environmentVariables", js.Array(value :_*))
    
    @scala.inline
    def setFilesToPush(value: js.Array[SchemaDeviceFile]): Self = StObject.set(x, "filesToPush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesToPushUndefined: Self = StObject.set(x, "filesToPush", js.undefined)
    
    @scala.inline
    def setFilesToPushVarargs(value: SchemaDeviceFile*): Self = StObject.set(x, "filesToPush", js.Array(value :_*))
    
    @scala.inline
    def setNetworkProfile(value: String): Self = StObject.set(x, "networkProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkProfileUndefined: Self = StObject.set(x, "networkProfile", js.undefined)
  }
}
