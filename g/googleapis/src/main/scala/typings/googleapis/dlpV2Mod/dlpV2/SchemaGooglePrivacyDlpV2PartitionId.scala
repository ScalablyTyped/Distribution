package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Datastore partition ID. A partition ID identifies a grouping of entities.
  * The grouping is always by project and namespace, however the namespace ID
  * may be empty.  A partition ID contains several dimensions: project ID and
  * namespace ID.
  */
@js.native
trait SchemaGooglePrivacyDlpV2PartitionId extends StObject {
  
  /**
    * If not empty, the ID of the namespace to which the entities belong.
    */
  var namespaceId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the project to which the entities belong.
    */
  var projectId: js.UndefOr[String] = js.native
}
object SchemaGooglePrivacyDlpV2PartitionId {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2PartitionId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2PartitionId]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2PartitionIdMutableBuilder[Self <: SchemaGooglePrivacyDlpV2PartitionId] (val x: Self) extends AnyVal {
    
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
