package typings.knuddelsUserappsApi.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * @see https://developer.knuddels.de/docs/classes/ChannelJoinPermission.html
	 */
@JSGlobal("ChannelJoinPermission")
@js.native
class ChannelJoinPermission () extends StObject
object ChannelJoinPermission {
  
  @JSGlobal("ChannelJoinPermission")
  @js.native
  val ^ : js.Any = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/ChannelJoinPermission.html#method_accepted
  		 */
  /* static member */
  @scala.inline
  def accepted(): ChannelJoinPermission = ^.asInstanceOf[js.Dynamic].applyDynamic("accepted")().asInstanceOf[ChannelJoinPermission]
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/ChannelJoinPermission.html#method_denied
  		 */
  /* static member */
  @scala.inline
  def denied(denyReason: java.lang.String): ChannelJoinPermission = ^.asInstanceOf[js.Dynamic].applyDynamic("denied")(denyReason.asInstanceOf[js.Any]).asInstanceOf[ChannelJoinPermission]
}
