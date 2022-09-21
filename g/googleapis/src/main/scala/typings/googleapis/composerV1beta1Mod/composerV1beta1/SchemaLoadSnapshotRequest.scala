package typings.googleapis.composerV1beta1Mod.composerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLoadSnapshotRequest extends StObject {
  
  /**
    * Whether or not to skip installing Pypi packages when loading the environment's state.
    */
  var skipPypiPackagesInstallation: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * A Cloud Storage path to a snapshot to load, e.g.: "gs://my-bucket/snapshots/project_location_environment_timestamp".
    */
  var snapshotPath: js.UndefOr[String | Null] = js.undefined
}
object SchemaLoadSnapshotRequest {
  
  inline def apply(): SchemaLoadSnapshotRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLoadSnapshotRequest]
  }
  
  extension [Self <: SchemaLoadSnapshotRequest](x: Self) {
    
    inline def setSkipPypiPackagesInstallation(value: Boolean): Self = StObject.set(x, "skipPypiPackagesInstallation", value.asInstanceOf[js.Any])
    
    inline def setSkipPypiPackagesInstallationNull: Self = StObject.set(x, "skipPypiPackagesInstallation", null)
    
    inline def setSkipPypiPackagesInstallationUndefined: Self = StObject.set(x, "skipPypiPackagesInstallation", js.undefined)
    
    inline def setSnapshotPath(value: String): Self = StObject.set(x, "snapshotPath", value.asInstanceOf[js.Any])
    
    inline def setSnapshotPathNull: Self = StObject.set(x, "snapshotPath", null)
    
    inline def setSnapshotPathUndefined: Self = StObject.set(x, "snapshotPath", js.undefined)
  }
}
