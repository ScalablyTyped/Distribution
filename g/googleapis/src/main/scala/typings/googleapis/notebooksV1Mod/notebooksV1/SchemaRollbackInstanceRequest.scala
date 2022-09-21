package typings.googleapis.notebooksV1Mod.notebooksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRollbackInstanceRequest extends StObject {
  
  /**
    * Required. The snapshot for rollback. Example: "projects/test-project/global/snapshots/krwlzipynril".
    */
  var targetSnapshot: js.UndefOr[String | Null] = js.undefined
}
object SchemaRollbackInstanceRequest {
  
  inline def apply(): SchemaRollbackInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRollbackInstanceRequest]
  }
  
  extension [Self <: SchemaRollbackInstanceRequest](x: Self) {
    
    inline def setTargetSnapshot(value: String): Self = StObject.set(x, "targetSnapshot", value.asInstanceOf[js.Any])
    
    inline def setTargetSnapshotNull: Self = StObject.set(x, "targetSnapshot", null)
    
    inline def setTargetSnapshotUndefined: Self = StObject.set(x, "targetSnapshot", js.undefined)
  }
}
