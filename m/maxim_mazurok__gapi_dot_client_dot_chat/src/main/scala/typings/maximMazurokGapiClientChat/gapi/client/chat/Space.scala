package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Space extends StObject {
  
  /** Output only. The display name (only if the space is a room). Please note that this field might not be populated in direct messages between humans. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Resource name of the space, in the form "spaces/ *". Example: spaces/AAAAMpdlehYs */
  var name: js.UndefOr[String] = js.native
  
  /** Whether the space is a DM between a bot and a single human. */
  var singleUserBotDm: js.UndefOr[Boolean] = js.native
  
  /** Whether the messages are threaded in this space. */
  var threaded: js.UndefOr[Boolean] = js.native
  
  /** Output only. The type of a space. This is deprecated. Use `single_user_bot_dm` instead. */
  var `type`: js.UndefOr[String] = js.native
}
object Space {
  
  @scala.inline
  def apply(): Space = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Space]
  }
  
  @scala.inline
  implicit class SpaceMutableBuilder[Self <: Space] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSingleUserBotDm(value: Boolean): Self = StObject.set(x, "singleUserBotDm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleUserBotDmUndefined: Self = StObject.set(x, "singleUserBotDm", js.undefined)
    
    @scala.inline
    def setThreaded(value: Boolean): Self = StObject.set(x, "threaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreadedUndefined: Self = StObject.set(x, "threaded", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
