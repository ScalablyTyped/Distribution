package typings.googleapis.datastoreV1Mod.datastoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPartitionId extends StObject {
  
  /**
    * If not empty, the ID of the database to which the entities belong.
    */
  var databaseId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If not empty, the ID of the namespace to which the entities belong.
    */
  var namespaceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the project to which the entities belong.
    */
  var projectId: js.UndefOr[String | Null] = js.undefined
}
object SchemaPartitionId {
  
  inline def apply(): SchemaPartitionId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPartitionId]
  }
  
  extension [Self <: SchemaPartitionId](x: Self) {
    
    inline def setDatabaseId(value: String): Self = StObject.set(x, "databaseId", value.asInstanceOf[js.Any])
    
    inline def setDatabaseIdNull: Self = StObject.set(x, "databaseId", null)
    
    inline def setDatabaseIdUndefined: Self = StObject.set(x, "databaseId", js.undefined)
    
    inline def setNamespaceId(value: String): Self = StObject.set(x, "namespaceId", value.asInstanceOf[js.Any])
    
    inline def setNamespaceIdNull: Self = StObject.set(x, "namespaceId", null)
    
    inline def setNamespaceIdUndefined: Self = StObject.set(x, "namespaceId", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
