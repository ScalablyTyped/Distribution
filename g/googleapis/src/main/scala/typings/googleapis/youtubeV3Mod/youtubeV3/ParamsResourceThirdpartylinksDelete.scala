package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceThirdpartylinksDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Channel ID to which changes should be applied, for delegation.
    */
  var externalChannelId: js.UndefOr[String] = js.undefined
  
  /**
    * Delete the partner links with the given linking token.
    */
  var linkingToken: js.UndefOr[String] = js.undefined
  
  /**
    * Do not use. Required for compatibility.
    */
  var part: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Type of the link to be deleted.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object ParamsResourceThirdpartylinksDelete {
  
  inline def apply(): ParamsResourceThirdpartylinksDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceThirdpartylinksDelete]
  }
  
  extension [Self <: ParamsResourceThirdpartylinksDelete](x: Self) {
    
    inline def setExternalChannelId(value: String): Self = StObject.set(x, "externalChannelId", value.asInstanceOf[js.Any])
    
    inline def setExternalChannelIdUndefined: Self = StObject.set(x, "externalChannelId", js.undefined)
    
    inline def setLinkingToken(value: String): Self = StObject.set(x, "linkingToken", value.asInstanceOf[js.Any])
    
    inline def setLinkingTokenUndefined: Self = StObject.set(x, "linkingToken", js.undefined)
    
    inline def setPart(value: js.Array[String]): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    inline def setPartUndefined: Self = StObject.set(x, "part", js.undefined)
    
    inline def setPartVarargs(value: String*): Self = StObject.set(x, "part", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
