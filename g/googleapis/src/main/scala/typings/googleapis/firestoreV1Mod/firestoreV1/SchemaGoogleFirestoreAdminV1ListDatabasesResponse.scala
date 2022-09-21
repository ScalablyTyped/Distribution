package typings.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFirestoreAdminV1ListDatabasesResponse extends StObject {
  
  /**
    * The databases in the project.
    */
  var databases: js.UndefOr[js.Array[SchemaGoogleFirestoreAdminV1Database]] = js.undefined
}
object SchemaGoogleFirestoreAdminV1ListDatabasesResponse {
  
  inline def apply(): SchemaGoogleFirestoreAdminV1ListDatabasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1ListDatabasesResponse]
  }
  
  extension [Self <: SchemaGoogleFirestoreAdminV1ListDatabasesResponse](x: Self) {
    
    inline def setDatabases(value: js.Array[SchemaGoogleFirestoreAdminV1Database]): Self = StObject.set(x, "databases", value.asInstanceOf[js.Any])
    
    inline def setDatabasesUndefined: Self = StObject.set(x, "databases", js.undefined)
    
    inline def setDatabasesVarargs(value: SchemaGoogleFirestoreAdminV1Database*): Self = StObject.set(x, "databases", js.Array(value*))
  }
}
