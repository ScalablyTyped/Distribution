package typings.knuddelsUserappsApi.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * @see https://developer.knuddels.de/docs/classes/ToplistRankChangeEvent.html
	 */
@JSGlobal("ToplistRankChangeEvent")
@js.native
class ToplistRankChangeEvent () extends StObject {
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/ToplistRankChangeEvent.html#method_getNewRank
  		 */
  def getNewRank(): Double = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/ToplistRankChangeEvent.html#method_getNewValue
  		 */
  def getNewValue(): Double = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/ToplistRankChangeEvent.html#method_getOldRank
  		 */
  def getOldRank(): Double = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/ToplistRankChangeEvent.html#method_getOldValue
  		 */
  def getOldValue(): Double = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/ToplistRankChangeEvent.html#method_getToplist
  		 */
  def getToplist(): Toplist = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/ToplistRankChangeEvent.html#method_getUser
  		 */
  def getUser(): User = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/ToplistRankChangeEvent.html#method_getUsersOvertook
  		 */
  def getUsersOvertook(): js.Array[User] = js.native
}
