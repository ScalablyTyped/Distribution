package typings.keenTracking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Created extends StObject {
    
    var created: Boolean
  }
  object Created {
    
    inline def apply(created: Boolean): Created = {
      val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any])
      __obj.asInstanceOf[Created]
    }
    
    extension [Self <: Created](x: Self) {
      
      inline def setCreated(value: Boolean): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProjectId extends StObject {
    
    var projectId: String
    
    var requestType: js.UndefOr[String] = js.undefined
    
    var writeKey: String
  }
  object ProjectId {
    
    inline def apply(projectId: String, writeKey: String): ProjectId = {
      val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any], writeKey = writeKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProjectId]
    }
    
    extension [Self <: ProjectId](x: Self) {
      
      inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
      
      inline def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
      
      inline def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
      
      inline def setWriteKey(value: String): Self = StObject.set(x, "writeKey", value.asInstanceOf[js.Any])
    }
  }
}
