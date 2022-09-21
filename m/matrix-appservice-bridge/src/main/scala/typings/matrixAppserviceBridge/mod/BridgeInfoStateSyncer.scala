package typings.matrixAppserviceBridge.mod

import typings.matrixAppserviceBridge.bridgeInfoStateMod.Opts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-appservice-bridge", "BridgeInfoStateSyncer")
@js.native
open class BridgeInfoStateSyncer[BridgeMappingInfo] protected ()
  extends typings.matrixAppserviceBridge.bridgeInfoStateMod.BridgeInfoStateSyncer[BridgeMappingInfo] {
  def this(bridge: typings.matrixAppserviceBridge.bridgeMod.Bridge, opts: Opts[BridgeMappingInfo]) = this()
}
/* static members */
object BridgeInfoStateSyncer {
  
  @JSImport("matrix-appservice-bridge", "BridgeInfoStateSyncer.EventType")
  @js.native
  val EventType: /* "uk.half-shot.bridge" */ String = js.native
}
