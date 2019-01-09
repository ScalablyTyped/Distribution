package typings
package knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * @see https://developer.knuddels.de/docs/classes/UserAccess.html
	 */
@JSGlobal("UserAccess")
@js.native
class UserAccess () extends js.Object {
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserAccess.html#method_eachAccessibleUser
  		 */
  def eachAccessibleUser(
    callback: js.Function4[
      /* user */ User, 
      /* index */ scala.Double, 
      /* accessibleUserCount */ scala.Double, 
      /* key */ js.UndefOr[java.lang.String], 
      scala.Boolean
    ]
  ): scala.Unit = js.native
  def eachAccessibleUser(
    callback: js.Function4[
      /* user */ User, 
      /* index */ scala.Double, 
      /* accessibleUserCount */ scala.Double, 
      /* key */ js.UndefOr[java.lang.String], 
      scala.Boolean
    ],
    parameters: knuddelsDashUserappsDashApiLib.Anon_AccessibleUserCount
  ): scala.Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserAccess.html#method_exists
  		 */
  def exists(nick: java.lang.String): scala.Boolean = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserAccess.html#method_getNick
  		 */
  def getNick(userId: scala.Double): java.lang.String = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserAccess.html#method_getUserById
  		 */
  def getUserById(userId: scala.Double): User = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserAccess.html#method_getUserId
  		 */
  def getUserId(nick: java.lang.String): scala.Double = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserAccess.html#method_isUserDeleted
  		 */
  def isUserDeleted(userId: scala.Double): scala.Boolean = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserAccess.html#method_mayAccess
  		 */
  def mayAccess(userId: scala.Double): scala.Boolean = js.native
}

