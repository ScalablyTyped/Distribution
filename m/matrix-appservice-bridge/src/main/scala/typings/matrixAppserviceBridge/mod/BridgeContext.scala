package typings.matrixAppserviceBridge.mod

import typings.matrixAppserviceBridge.anon.Room
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-appservice-bridge", "BridgeContext")
@js.native
class BridgeContext protected ()
  extends typings.matrixAppserviceBridge.bridgeContextMod.BridgeContext {
  /**
    * @param ctx Event related data
    * @param ctx.sender Matrix user ID of the sender.
    * @param ctx.target Matrix user ID of the target.
    * @param ctx.room Matrix room ID.
    */
  def this(ctx: Room) = this()
}
