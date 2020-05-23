package typings.knuddelsUserappsApi.mod.global

import typings.knuddelsUserappsApi.anon.OnEnd
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
      /* index */ Double, 
      /* accessibleUserCount */ Double, 
      /* key */ js.UndefOr[java.lang.String], 
      Boolean
    ]
  ): Unit = js.native
  def eachAccessibleUser(
    callback: js.Function4[
      /* user */ User, 
      /* index */ Double, 
      /* accessibleUserCount */ Double, 
      /* key */ js.UndefOr[java.lang.String], 
      Boolean
    ],
    parameters: OnEnd
  ): Unit = js.native
  /**
    * @see https://developer.knuddels.de/docs/classes/UserAccess.html#method_exists
    */
  def exists(nick: java.lang.String): Boolean = js.native
  /**
    * @see https://developer.knuddels.de/docs/classes/UserAccess.html#method_getNick
    */
  def getNick(userId: Double): java.lang.String = js.native
  /**
    * @see https://developer.knuddels.de/docs/classes/UserAccess.html#method_getUserById
    */
  def getUserById(userId: Double): User = js.native
  /**
    * @see https://developer.knuddels.de/docs/classes/UserAccess.html#method_getUserId
    */
  def getUserId(nick: java.lang.String): Double = js.native
  /**
    * @see https://developer.knuddels.de/docs/classes/UserAccess.html#method_isUserDeleted
    */
  def isUserDeleted(userId: Double): Boolean = js.native
  /**
    * @see https://developer.knuddels.de/docs/classes/UserAccess.html#method_mayAccess
    */
  def mayAccess(userId: Double): Boolean = js.native
}

