package typings.googleapis.gkebackupV1Mod.gkebackupV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaClusterResourceRestoreScope extends StObject {
  
  /**
    * A list of "types" of cluster-scoped resources to be restored from the Backup. An empty list means that NO cluster-scoped resources will be restored. Note that Namespaces and PersistentVolume restoration is handled separately and is not governed by this field.
    */
  var selectedGroupKinds: js.UndefOr[js.Array[SchemaGroupKind]] = js.undefined
}
object SchemaClusterResourceRestoreScope {
  
  inline def apply(): SchemaClusterResourceRestoreScope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClusterResourceRestoreScope]
  }
  
  extension [Self <: SchemaClusterResourceRestoreScope](x: Self) {
    
    inline def setSelectedGroupKinds(value: js.Array[SchemaGroupKind]): Self = StObject.set(x, "selectedGroupKinds", value.asInstanceOf[js.Any])
    
    inline def setSelectedGroupKindsUndefined: Self = StObject.set(x, "selectedGroupKinds", js.undefined)
    
    inline def setSelectedGroupKindsVarargs(value: SchemaGroupKind*): Self = StObject.set(x, "selectedGroupKinds", js.Array(value*))
  }
}
