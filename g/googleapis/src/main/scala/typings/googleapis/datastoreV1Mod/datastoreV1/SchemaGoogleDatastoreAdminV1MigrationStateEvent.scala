package typings.googleapis.datastoreV1Mod.datastoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleDatastoreAdminV1MigrationStateEvent extends StObject {
  
  /**
    * The new state of the migration.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleDatastoreAdminV1MigrationStateEvent {
  
  inline def apply(): SchemaGoogleDatastoreAdminV1MigrationStateEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDatastoreAdminV1MigrationStateEvent]
  }
  
  extension [Self <: SchemaGoogleDatastoreAdminV1MigrationStateEvent](x: Self) {
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
