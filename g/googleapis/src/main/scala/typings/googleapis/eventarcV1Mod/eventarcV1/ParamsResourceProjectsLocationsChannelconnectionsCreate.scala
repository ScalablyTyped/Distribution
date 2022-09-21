package typings.googleapis.eventarcV1Mod.eventarcV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsChannelconnectionsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The user-provided ID to be assigned to the channel connection.
    */
  var channelConnectionId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The parent collection in which to add this channel connection.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaChannelConnection] = js.undefined
}
object ParamsResourceProjectsLocationsChannelconnectionsCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsChannelconnectionsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsChannelconnectionsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsChannelconnectionsCreate](x: Self) {
    
    inline def setChannelConnectionId(value: String): Self = StObject.set(x, "channelConnectionId", value.asInstanceOf[js.Any])
    
    inline def setChannelConnectionIdUndefined: Self = StObject.set(x, "channelConnectionId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaChannelConnection): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
