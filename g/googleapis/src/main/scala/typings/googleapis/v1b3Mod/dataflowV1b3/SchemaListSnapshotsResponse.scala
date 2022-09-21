package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListSnapshotsResponse extends StObject {
  
  /**
    * Returned snapshots.
    */
  var snapshots: js.UndefOr[js.Array[SchemaSnapshot]] = js.undefined
}
object SchemaListSnapshotsResponse {
  
  inline def apply(): SchemaListSnapshotsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListSnapshotsResponse]
  }
  
  extension [Self <: SchemaListSnapshotsResponse](x: Self) {
    
    inline def setSnapshots(value: js.Array[SchemaSnapshot]): Self = StObject.set(x, "snapshots", value.asInstanceOf[js.Any])
    
    inline def setSnapshotsUndefined: Self = StObject.set(x, "snapshots", js.undefined)
    
    inline def setSnapshotsVarargs(value: SchemaSnapshot*): Self = StObject.set(x, "snapshots", js.Array(value*))
  }
}
