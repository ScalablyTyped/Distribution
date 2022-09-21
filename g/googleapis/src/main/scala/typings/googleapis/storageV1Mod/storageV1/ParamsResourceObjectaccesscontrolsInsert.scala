package typings.googleapis.storageV1Mod.storageV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceObjectaccesscontrolsInsert
  extends StObject
     with StandardParameters {
  
  /**
    * Name of a bucket.
    */
  var bucket: js.UndefOr[String] = js.undefined
  
  /**
    * If present, selects a specific revision of this object (as opposed to the latest version, the default).
    */
  var generation: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the object. For information about how to URL encode object names to be path safe, see Encoding URI Path Parts.
    */
  var `object`: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaObjectAccessControl] = js.undefined
  
  /**
    * The project to be billed for this request. Required for Requester Pays buckets.
    */
  var userProject: js.UndefOr[String] = js.undefined
}
object ParamsResourceObjectaccesscontrolsInsert {
  
  inline def apply(): ParamsResourceObjectaccesscontrolsInsert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceObjectaccesscontrolsInsert]
  }
  
  extension [Self <: ParamsResourceObjectaccesscontrolsInsert](x: Self) {
    
    inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
    
    inline def setGeneration(value: String): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
    
    inline def setGenerationUndefined: Self = StObject.set(x, "generation", js.undefined)
    
    inline def setObject(value: String): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
    
    inline def setRequestBody(value: SchemaObjectAccessControl): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
