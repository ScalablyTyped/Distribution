package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a snapshot of a job.
  */
@js.native
trait SchemaSnapshot extends StObject {
  
  /**
    * The time this snapshot was created.
    */
  var creationTime: js.UndefOr[String] = js.native
  
  /**
    * The unique ID of this snapshot.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The project this snapshot belongs to.
    */
  var projectId: js.UndefOr[String] = js.native
  
  /**
    * The job this snapshot was created from.
    */
  var sourceJobId: js.UndefOr[String] = js.native
  
  /**
    * The time after which this snapshot will be automatically deleted.
    */
  var ttl: js.UndefOr[String] = js.native
}
object SchemaSnapshot {
  
  @scala.inline
  def apply(): SchemaSnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSnapshot]
  }
  
  @scala.inline
  implicit class SchemaSnapshotMutableBuilder[Self <: SchemaSnapshot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setSourceJobId(value: String): Self = StObject.set(x, "sourceJobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceJobIdUndefined: Self = StObject.set(x, "sourceJobId", js.undefined)
    
    @scala.inline
    def setTtl(value: String): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
  }
}
