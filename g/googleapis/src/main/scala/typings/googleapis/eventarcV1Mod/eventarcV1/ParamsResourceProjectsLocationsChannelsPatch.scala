package typings.googleapis.eventarcV1Mod.eventarcV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsChannelsPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the channel. Must be unique within the location on the project and must be in `projects/{project\}/locations/{location\}/channels/{channel_id\}` format.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaChannel] = js.undefined
  
  /**
    * The fields to be updated; only fields explicitly provided are updated. If no field mask is provided, all provided fields in the request are updated. To update all fields, provide a field mask of "*".
    */
  var updateMask: js.UndefOr[String] = js.undefined
  
  /**
    * Required. If set, validate the request and preview the review, but do not post it.
    */
  var validateOnly: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceProjectsLocationsChannelsPatch {
  
  inline def apply(): ParamsResourceProjectsLocationsChannelsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsChannelsPatch]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsChannelsPatch](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaChannel): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
    
    inline def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    inline def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
  }
}
