package typings.knuddelsUserappsApi.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see https://developer.knuddels.de/docs/classes/ChannelRights.html
  */
@JSGlobal("ChannelRights")
@js.native
open class ChannelRights () extends StObject {
  
  /**
    * @see https://developer.knuddels.de/docs/classes/ChannelRights.html#method_getChannelModerators
    */
  def getChannelModerators(): js.Array[User] = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/ChannelRights.html#method_getChannelOwners
    */
  def getChannelOwners(): js.Array[User] = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/ChannelRights.html#method_getEventModerators
    */
  def getEventModerators(): js.Array[User] = js.native
}
