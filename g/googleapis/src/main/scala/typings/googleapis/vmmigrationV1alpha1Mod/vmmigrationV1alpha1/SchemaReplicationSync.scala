package typings.googleapis.vmmigrationV1alpha1Mod.vmmigrationV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReplicationSync extends StObject {
  
  /**
    * The most updated snapshot created time in the source that finished replication.
    */
  var lastSyncTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaReplicationSync {
  
  inline def apply(): SchemaReplicationSync = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReplicationSync]
  }
  
  extension [Self <: SchemaReplicationSync](x: Self) {
    
    inline def setLastSyncTime(value: String): Self = StObject.set(x, "lastSyncTime", value.asInstanceOf[js.Any])
    
    inline def setLastSyncTimeNull: Self = StObject.set(x, "lastSyncTime", null)
    
    inline def setLastSyncTimeUndefined: Self = StObject.set(x, "lastSyncTime", js.undefined)
  }
}
