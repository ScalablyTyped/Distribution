package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a snapshot of a job.
  */
trait SchemaSnapshot extends StObject {
  
  /**
    * The time this snapshot was created.
    */
  var creationTime: js.UndefOr[String] = js.undefined
  
  /**
    * The unique ID of this snapshot.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The project this snapshot belongs to.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * The job this snapshot was created from.
    */
  var sourceJobId: js.UndefOr[String] = js.undefined
  
  /**
    * The time after which this snapshot will be automatically deleted.
    */
  var ttl: js.UndefOr[String] = js.undefined
}
object SchemaSnapshot {
  
  inline def apply(): SchemaSnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSnapshot]
  }
  
  extension [Self <: SchemaSnapshot](x: Self) {
    
    inline def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setSourceJobId(value: String): Self = StObject.set(x, "sourceJobId", value.asInstanceOf[js.Any])
    
    inline def setSourceJobIdUndefined: Self = StObject.set(x, "sourceJobId", js.undefined)
    
    inline def setTtl(value: String): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
  }
}
