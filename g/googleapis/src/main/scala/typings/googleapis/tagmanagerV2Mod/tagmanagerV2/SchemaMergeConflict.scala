package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMergeConflict extends StObject {
  
  /**
    * The base version entity (since the latest sync operation) that has conflicting changes compared to the workspace. If this field is missing, it means the workspace entity is deleted from the base version.
    */
  var entityInBaseVersion: js.UndefOr[SchemaEntity] = js.undefined
  
  /**
    * The workspace entity that has conflicting changes compared to the base version. If an entity is deleted in a workspace, it will still appear with a deleted change status.
    */
  var entityInWorkspace: js.UndefOr[SchemaEntity] = js.undefined
}
object SchemaMergeConflict {
  
  inline def apply(): SchemaMergeConflict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMergeConflict]
  }
  
  extension [Self <: SchemaMergeConflict](x: Self) {
    
    inline def setEntityInBaseVersion(value: SchemaEntity): Self = StObject.set(x, "entityInBaseVersion", value.asInstanceOf[js.Any])
    
    inline def setEntityInBaseVersionUndefined: Self = StObject.set(x, "entityInBaseVersion", js.undefined)
    
    inline def setEntityInWorkspace(value: SchemaEntity): Self = StObject.set(x, "entityInWorkspace", value.asInstanceOf[js.Any])
    
    inline def setEntityInWorkspaceUndefined: Self = StObject.set(x, "entityInWorkspace", js.undefined)
  }
}
