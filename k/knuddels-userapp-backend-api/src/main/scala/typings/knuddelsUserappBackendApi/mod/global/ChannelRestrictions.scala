package typings.knuddelsUserappBackendApi.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see https://developer.knuddels.de/docs/classes/ChannelRestrictions.html
  */
@JSGlobal("ChannelRestrictions")
@js.native
open class ChannelRestrictions () extends StObject {
  
  /**
    * @see https://developer.knuddels.de/docs/classes/ChannelRestrictions.html#method_getColorMutedUsers
    */
  def getColorMutedUsers(): js.Array[User] = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/ChannelRestrictions.html#method_getLockedUsers
    */
  def getLockedUsers(): js.Array[User] = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/ChannelRestrictions.html#method_getMutedUsers
    */
  def getMutedUsers(): js.Array[User] = js.native
}
