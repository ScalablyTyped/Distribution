package typings.googleapis.composerV1beta1Mod.composerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSaveSnapshotResponse extends StObject {
  
  /**
    * The fully-resolved Cloud Storage path of the created snapshot, e.g.: "gs://my-bucket/snapshots/project_location_environment_timestamp". This field is populated only if the snapshot creation was successful.
    */
  var snapshotPath: js.UndefOr[String | Null] = js.undefined
}
object SchemaSaveSnapshotResponse {
  
  inline def apply(): SchemaSaveSnapshotResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSaveSnapshotResponse]
  }
  
  extension [Self <: SchemaSaveSnapshotResponse](x: Self) {
    
    inline def setSnapshotPath(value: String): Self = StObject.set(x, "snapshotPath", value.asInstanceOf[js.Any])
    
    inline def setSnapshotPathNull: Self = StObject.set(x, "snapshotPath", null)
    
    inline def setSnapshotPathUndefined: Self = StObject.set(x, "snapshotPath", js.undefined)
  }
}
