package typings.googleapis.composerV1beta1Mod.composerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSaveSnapshotRequest extends StObject {
  
  /**
    * Location in a Cloud Storage where the snapshot is going to be stored, e.g.: "gs://my-bucket/snapshots".
    */
  var snapshotLocation: js.UndefOr[String | Null] = js.undefined
}
object SchemaSaveSnapshotRequest {
  
  inline def apply(): SchemaSaveSnapshotRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSaveSnapshotRequest]
  }
  
  extension [Self <: SchemaSaveSnapshotRequest](x: Self) {
    
    inline def setSnapshotLocation(value: String): Self = StObject.set(x, "snapshotLocation", value.asInstanceOf[js.Any])
    
    inline def setSnapshotLocationNull: Self = StObject.set(x, "snapshotLocation", null)
    
    inline def setSnapshotLocationUndefined: Self = StObject.set(x, "snapshotLocation", js.undefined)
  }
}
