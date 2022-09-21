package typings.googleapis.vmmigrationV1Mod.vmmigrationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRemoveGroupMigrationRequest extends StObject {
  
  /**
    * The MigratingVm to remove.
    */
  var migratingVm: js.UndefOr[String | Null] = js.undefined
}
object SchemaRemoveGroupMigrationRequest {
  
  inline def apply(): SchemaRemoveGroupMigrationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRemoveGroupMigrationRequest]
  }
  
  extension [Self <: SchemaRemoveGroupMigrationRequest](x: Self) {
    
    inline def setMigratingVm(value: String): Self = StObject.set(x, "migratingVm", value.asInstanceOf[js.Any])
    
    inline def setMigratingVmNull: Self = StObject.set(x, "migratingVm", null)
    
    inline def setMigratingVmUndefined: Self = StObject.set(x, "migratingVm", js.undefined)
  }
}
