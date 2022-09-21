package typings.googleapis.vmmigrationV1alpha1Mod.vmmigrationV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAddGroupMigrationRequest extends StObject {
  
  /**
    * The full path name of the MigratingVm to add.
    */
  var migratingVm: js.UndefOr[String | Null] = js.undefined
}
object SchemaAddGroupMigrationRequest {
  
  inline def apply(): SchemaAddGroupMigrationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddGroupMigrationRequest]
  }
  
  extension [Self <: SchemaAddGroupMigrationRequest](x: Self) {
    
    inline def setMigratingVm(value: String): Self = StObject.set(x, "migratingVm", value.asInstanceOf[js.Any])
    
    inline def setMigratingVmNull: Self = StObject.set(x, "migratingVm", null)
    
    inline def setMigratingVmUndefined: Self = StObject.set(x, "migratingVm", js.undefined)
  }
}
