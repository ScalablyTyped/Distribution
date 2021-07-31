package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata for a Datastore connector used by the job.
  */
trait SchemaDatastoreIODetails extends StObject {
  
  /**
    * Namespace used in the connection.
    */
  var namespace: js.UndefOr[String] = js.undefined
  
  /**
    * ProjectId accessed in the connection.
    */
  var projectId: js.UndefOr[String] = js.undefined
}
object SchemaDatastoreIODetails {
  
  @scala.inline
  def apply(): SchemaDatastoreIODetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatastoreIODetails]
  }
  
  @scala.inline
  implicit class SchemaDatastoreIODetailsMutableBuilder[Self <: SchemaDatastoreIODetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
