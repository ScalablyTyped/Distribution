package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIosTestSetup extends StObject {
  
  /**
    * iOS apps to install in addition to those being directly tested.
    */
  var additionalIpas: js.UndefOr[js.Array[SchemaFileReference]] = js.undefined
  
  /**
    * The network traffic profile used for running the test. Available network profiles can be queried by using the NETWORK_CONFIGURATION environment type when calling TestEnvironmentDiscoveryService.GetTestEnvironmentCatalog.
    */
  var networkProfile: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of directories on the device to upload to Cloud Storage at the end of the test. Directories should either be in a shared directory (such as /private/var/mobile/Media) or within an accessible directory inside the app's filesystem (such as /Documents) by specifying the bundle ID.
    */
  var pullDirectories: js.UndefOr[js.Array[SchemaIosDeviceFile]] = js.undefined
  
  /**
    * List of files to push to the device before starting the test.
    */
  var pushFiles: js.UndefOr[js.Array[SchemaIosDeviceFile]] = js.undefined
}
object SchemaIosTestSetup {
  
  inline def apply(): SchemaIosTestSetup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIosTestSetup]
  }
  
  extension [Self <: SchemaIosTestSetup](x: Self) {
    
    inline def setAdditionalIpas(value: js.Array[SchemaFileReference]): Self = StObject.set(x, "additionalIpas", value.asInstanceOf[js.Any])
    
    inline def setAdditionalIpasUndefined: Self = StObject.set(x, "additionalIpas", js.undefined)
    
    inline def setAdditionalIpasVarargs(value: SchemaFileReference*): Self = StObject.set(x, "additionalIpas", js.Array(value*))
    
    inline def setNetworkProfile(value: String): Self = StObject.set(x, "networkProfile", value.asInstanceOf[js.Any])
    
    inline def setNetworkProfileNull: Self = StObject.set(x, "networkProfile", null)
    
    inline def setNetworkProfileUndefined: Self = StObject.set(x, "networkProfile", js.undefined)
    
    inline def setPullDirectories(value: js.Array[SchemaIosDeviceFile]): Self = StObject.set(x, "pullDirectories", value.asInstanceOf[js.Any])
    
    inline def setPullDirectoriesUndefined: Self = StObject.set(x, "pullDirectories", js.undefined)
    
    inline def setPullDirectoriesVarargs(value: SchemaIosDeviceFile*): Self = StObject.set(x, "pullDirectories", js.Array(value*))
    
    inline def setPushFiles(value: js.Array[SchemaIosDeviceFile]): Self = StObject.set(x, "pushFiles", value.asInstanceOf[js.Any])
    
    inline def setPushFilesUndefined: Self = StObject.set(x, "pushFiles", js.undefined)
    
    inline def setPushFilesVarargs(value: SchemaIosDeviceFile*): Self = StObject.set(x, "pushFiles", js.Array(value*))
  }
}
