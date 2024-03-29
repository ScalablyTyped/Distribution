package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDatastoreIODetails extends StObject {
  
  /**
    * Namespace used in the connection.
    */
  var namespace: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ProjectId accessed in the connection.
    */
  var projectId: js.UndefOr[String | Null] = js.undefined
}
object SchemaDatastoreIODetails {
  
  inline def apply(): SchemaDatastoreIODetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatastoreIODetails]
  }
  
  extension [Self <: SchemaDatastoreIODetails](x: Self) {
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceNull: Self = StObject.set(x, "namespace", null)
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
