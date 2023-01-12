package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Space extends StObject {
  
  /** The space's display name. For direct messages between humans, this field might be empty. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Resource name of the space. Format: spaces/{space} */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. Whether the space is a DM between a Chat app and a single human. */
  var singleUserBotDm: js.UndefOr[Boolean] = js.undefined
  
  /** Details about the space including description and rules. */
  var spaceDetails: js.UndefOr[SpaceDetails] = js.undefined
  
  /** Output only. Whether messages are threaded in this space. */
  var threaded: js.UndefOr[Boolean] = js.undefined
  
  /** Output only. Deprecated: Use `singleUserBotDm` or `spaceType` (developer preview) instead. The type of a space. */
  var `type`: js.UndefOr[String] = js.undefined
}
object Space {
  
  inline def apply(): Space = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Space]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Space] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSingleUserBotDm(value: Boolean): Self = StObject.set(x, "singleUserBotDm", value.asInstanceOf[js.Any])
    
    inline def setSingleUserBotDmUndefined: Self = StObject.set(x, "singleUserBotDm", js.undefined)
    
    inline def setSpaceDetails(value: SpaceDetails): Self = StObject.set(x, "spaceDetails", value.asInstanceOf[js.Any])
    
    inline def setSpaceDetailsUndefined: Self = StObject.set(x, "spaceDetails", js.undefined)
    
    inline def setThreaded(value: Boolean): Self = StObject.set(x, "threaded", value.asInstanceOf[js.Any])
    
    inline def setThreadedUndefined: Self = StObject.set(x, "threaded", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
