package typings.googleapis.youtubeAnalyticsV2Mod.youtubeAnalyticsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceGroupsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * The `id` parameter specifies the YouTube group ID of the group that is being deleted.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * This parameter can only be used in a properly authorized request. **Note:** This parameter is intended exclusively for YouTube content partners that own and manage many different YouTube channels. The `onBehalfOfContentOwner` parameter indicates that the request's authorization credentials identify a YouTube user who is acting on behalf of the content owner specified in the parameter value. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The account that the user authenticates with must be linked to the specified YouTube content owner.
    */
  var onBehalfOfContentOwner: js.UndefOr[String] = js.undefined
}
object ParamsResourceGroupsDelete {
  
  inline def apply(): ParamsResourceGroupsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceGroupsDelete]
  }
  
  extension [Self <: ParamsResourceGroupsDelete](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setOnBehalfOfContentOwner(value: String): Self = StObject.set(x, "onBehalfOfContentOwner", value.asInstanceOf[js.Any])
    
    inline def setOnBehalfOfContentOwnerUndefined: Self = StObject.set(x, "onBehalfOfContentOwner", js.undefined)
  }
}
