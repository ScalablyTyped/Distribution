package typings.googleapis.displayvideoV1Mod.displayvideoV1

import typings.googleapis.anon.Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceMediaUpload
  extends StObject
     with StandardParameters {
  
  /**
    * Media metadata
    */
  var media: js.UndefOr[Body] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleBytestreamMedia] = js.undefined
  
  /**
    * Name of the media that is being downloaded. See ReadRequest.resource_name.
    */
  var resourceName: js.UndefOr[String] = js.undefined
}
object ParamsResourceMediaUpload {
  
  inline def apply(): ParamsResourceMediaUpload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMediaUpload]
  }
  
  extension [Self <: ParamsResourceMediaUpload](x: Self) {
    
    inline def setMedia(value: Body): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleBytestreamMedia): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
  }
}
