package typings.googleapis.v1beta3Mod.datastoreV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A partition ID identifies a grouping of entities. The grouping is always by
  * project and namespace, however the namespace ID may be empty.  A partition
  * ID contains several dimensions: project ID and namespace ID.  Partition
  * dimensions:  - May be `&quot;&quot;`. - Must be valid UTF-8 bytes. - Must
  * have values that match regex `[A-Za-z\d\.\-_]{1,100}` If the value of any
  * dimension matches regex `__.*__`, the partition is reserved/read-only. A
  * reserved/read-only partition ID is forbidden in certain documented
  * contexts.  Foreign partition IDs (in which the project ID does not match
  * the context project ID ) are discouraged. Reads and writes of foreign
  * partition IDs may fail if the project is not in an active state.
  */
trait SchemaPartitionId extends StObject {
  
  /**
    * If not empty, the ID of the namespace to which the entities belong.
    */
  var namespaceId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the project to which the entities belong.
    */
  var projectId: js.UndefOr[String] = js.undefined
}
object SchemaPartitionId {
  
  inline def apply(): SchemaPartitionId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPartitionId]
  }
  
  extension [Self <: SchemaPartitionId](x: Self) {
    
    inline def setNamespaceId(value: String): Self = StObject.set(x, "namespaceId", value.asInstanceOf[js.Any])
    
    inline def setNamespaceIdUndefined: Self = StObject.set(x, "namespaceId", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
