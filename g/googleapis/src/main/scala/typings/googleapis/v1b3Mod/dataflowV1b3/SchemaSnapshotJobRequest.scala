package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to create a snapshot of a job.
  */
@js.native
trait SchemaSnapshotJobRequest extends StObject {
  
  /**
    * The location that contains this job.
    */
  var location: js.UndefOr[String] = js.native
  
  /**
    * TTL for the snapshot.
    */
  var ttl: js.UndefOr[String] = js.native
}
object SchemaSnapshotJobRequest {
  
  @scala.inline
  def apply(): SchemaSnapshotJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSnapshotJobRequest]
  }
  
  @scala.inline
  implicit class SchemaSnapshotJobRequestMutableBuilder[Self <: SchemaSnapshotJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setTtl(value: String): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
  }
}
