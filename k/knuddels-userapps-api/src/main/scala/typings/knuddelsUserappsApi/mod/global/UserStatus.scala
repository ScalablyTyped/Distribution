package typings.knuddelsUserappsApi.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * @see https://developer.knuddels.de/docs/classes/UserStatus.html
	 */
@JSGlobal("UserStatus")
@js.native
class UserStatus () extends js.Object {
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserStatus.html#method_getNumericStatus
  		 */
  def getNumericStatus(): Double = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserStatus.html#method_isAtLeast
  		 */
  def isAtLeast(otherUserStatus: UserStatus): Boolean = js.native
}

/* static members */
@JSGlobal("UserStatus")
@js.native
object UserStatus extends js.Object {
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserStatus.html#property_Admin
  		 */
  val Admin: UserStatus = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserStatus.html#property_Family
  		 */
  val Family: UserStatus = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserStatus.html#property_HonoryMember
  		 */
  val HonoryMember: UserStatus = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserStatus.html#property_Newbie
  		 */
  val Newbie: UserStatus = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserStatus.html#property_Stammi
  		 */
  val Stammi: UserStatus = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserStatus.html#property_Sysadmin
  		 */
  val Sysadmin: UserStatus = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserStatus.html#property_SystemBot
  		 */
  val SystemBot: UserStatus = js.native
}

