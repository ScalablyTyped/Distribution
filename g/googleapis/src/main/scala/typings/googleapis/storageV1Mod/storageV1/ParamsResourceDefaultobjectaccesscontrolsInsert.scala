package typings.googleapis.storageV1Mod.storageV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceDefaultobjectaccesscontrolsInsert
  extends StObject
     with StandardParameters {
  
  /**
    * Name of a bucket.
    */
  var bucket: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaObjectAccessControl] = js.undefined
  
  /**
    * The project to be billed for this request. Required for Requester Pays buckets.
    */
  var userProject: js.UndefOr[String] = js.undefined
}
object ParamsResourceDefaultobjectaccesscontrolsInsert {
  
  inline def apply(): ParamsResourceDefaultobjectaccesscontrolsInsert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDefaultobjectaccesscontrolsInsert]
  }
  
  extension [Self <: ParamsResourceDefaultobjectaccesscontrolsInsert](x: Self) {
    
    inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
    
    inline def setRequestBody(value: SchemaObjectAccessControl): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
