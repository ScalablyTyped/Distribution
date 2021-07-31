package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartitionId extends StObject {
  
  /** If not empty, the ID of the namespace to which the entities belong. */
  var namespaceId: js.UndefOr[String] = js.undefined
  
  /** The ID of the project to which the entities belong. */
  var projectId: js.UndefOr[String] = js.undefined
}
object PartitionId {
  
  @scala.inline
  def apply(): PartitionId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartitionId]
  }
  
  @scala.inline
  implicit class PartitionIdMutableBuilder[Self <: PartitionId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNamespaceId(value: String): Self = StObject.set(x, "namespaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceIdUndefined: Self = StObject.set(x, "namespaceId", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
