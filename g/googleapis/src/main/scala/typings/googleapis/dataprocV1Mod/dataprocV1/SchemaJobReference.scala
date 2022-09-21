package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaJobReference extends StObject {
  
  /**
    * Optional. The job ID, which must be unique within the project.The ID must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), or hyphens (-). The maximum length is 100 characters.If not specified by the caller, the job ID will be provided by the server.
    */
  var jobId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The ID of the Google Cloud Platform project that the job belongs to. If specified, must match the request project ID.
    */
  var projectId: js.UndefOr[String | Null] = js.undefined
}
object SchemaJobReference {
  
  inline def apply(): SchemaJobReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobReference]
  }
  
  extension [Self <: SchemaJobReference](x: Self) {
    
    inline def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdNull: Self = StObject.set(x, "jobId", null)
    
    inline def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
