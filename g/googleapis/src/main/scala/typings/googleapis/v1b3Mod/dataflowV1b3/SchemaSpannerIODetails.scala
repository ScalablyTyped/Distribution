package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata for a Spanner connector used by the job.
  */
@js.native
trait SchemaSpannerIODetails extends StObject {
  
  /**
    * DatabaseId accessed in the connection.
    */
  var databaseId: js.UndefOr[String] = js.native
  
  /**
    * InstanceId accessed in the connection.
    */
  var instanceId: js.UndefOr[String] = js.native
  
  /**
    * ProjectId accessed in the connection.
    */
  var projectId: js.UndefOr[String] = js.native
}
object SchemaSpannerIODetails {
  
  @scala.inline
  def apply(): SchemaSpannerIODetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSpannerIODetails]
  }
  
  @scala.inline
  implicit class SchemaSpannerIODetailsMutableBuilder[Self <: SchemaSpannerIODetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatabaseId(value: String): Self = StObject.set(x, "databaseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseIdUndefined: Self = StObject.set(x, "databaseId", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
