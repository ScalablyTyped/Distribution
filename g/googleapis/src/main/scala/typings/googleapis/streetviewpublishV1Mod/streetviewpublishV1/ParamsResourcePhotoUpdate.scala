package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePhotoUpdate
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Required. A unique identifier for a photo.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaPhoto] = js.undefined
  
  /**
    * Mask that identifies fields on the photo metadata to update. If not
    * present, the old Photo metadata is entirely replaced with the new Photo
    * metadata in this request. The update fails if invalid fields are
    * specified. Multiple fields can be specified in a comma-delimited list.
    * The following fields are valid:  * `pose.heading` * `pose.latLngPair` *
    * `pose.pitch` * `pose.roll` * `pose.level` * `pose.altitude` *
    * `connections` * `places`   <aside class="note"><b>Note:</b> When
    * updateMask contains repeated fields, the entire set of repeated values
    * get replaced with the new contents. For example, if updateMask contains
    * `connections` and `UpdatePhotoRequest.photo.connections` is empty, all
    * connections are removed.</aside>
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourcePhotoUpdate {
  
  inline def apply(): ParamsResourcePhotoUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePhotoUpdate]
  }
  
  extension [Self <: ParamsResourcePhotoUpdate](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setRequestBody(value: SchemaPhoto): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
