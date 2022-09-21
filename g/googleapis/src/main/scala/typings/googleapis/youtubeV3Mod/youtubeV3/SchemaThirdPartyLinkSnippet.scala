package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaThirdPartyLinkSnippet extends StObject {
  
  /**
    * Information specific to a link between a channel and a store on a merchandising platform.
    */
  var channelToStoreLink: js.UndefOr[SchemaChannelToStoreLinkDetails] = js.undefined
  
  /**
    * Type of the link named after the entities that are being linked.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaThirdPartyLinkSnippet {
  
  inline def apply(): SchemaThirdPartyLinkSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaThirdPartyLinkSnippet]
  }
  
  extension [Self <: SchemaThirdPartyLinkSnippet](x: Self) {
    
    inline def setChannelToStoreLink(value: SchemaChannelToStoreLinkDetails): Self = StObject.set(x, "channelToStoreLink", value.asInstanceOf[js.Any])
    
    inline def setChannelToStoreLinkUndefined: Self = StObject.set(x, "channelToStoreLink", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
