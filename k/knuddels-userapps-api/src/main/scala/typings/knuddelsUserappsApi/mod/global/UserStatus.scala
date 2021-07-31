package typings.knuddelsUserappsApi.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * @see https://developer.knuddels.de/docs/classes/UserStatus.html
	 */
@JSGlobal("UserStatus")
@js.native
class UserStatus () extends StObject {
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserStatus.html#method_getNumericStatus
  		 */
  def getNumericStatus(): Double = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserStatus.html#method_isAtLeast
  		 */
  def isAtLeast(otherUserStatus: UserStatus): Boolean = js.native
}
object UserStatus {
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserStatus.html#property_Admin
  		 */
  /* static member */
  @JSGlobal("UserStatus.Admin")
  @js.native
  val Admin: UserStatus = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserStatus.html#property_Family
  		 */
  /* static member */
  @JSGlobal("UserStatus.Family")
  @js.native
  val Family: UserStatus = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserStatus.html#property_HonoryMember
  		 */
  /* static member */
  @JSGlobal("UserStatus.HonoryMember")
  @js.native
  val HonoryMember: UserStatus = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserStatus.html#property_Newbie
  		 */
  /* static member */
  @JSGlobal("UserStatus.Newbie")
  @js.native
  val Newbie: UserStatus = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserStatus.html#property_Stammi
  		 */
  /* static member */
  @JSGlobal("UserStatus.Stammi")
  @js.native
  val Stammi: UserStatus = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserStatus.html#property_Sysadmin
  		 */
  /* static member */
  @JSGlobal("UserStatus.Sysadmin")
  @js.native
  val Sysadmin: UserStatus = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserStatus.html#property_SystemBot
  		 */
  /* static member */
  @JSGlobal("UserStatus.SystemBot")
  @js.native
  val SystemBot: UserStatus = js.native
}
