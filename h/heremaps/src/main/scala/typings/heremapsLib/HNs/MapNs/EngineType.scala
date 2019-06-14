package typings
package heremapsLib.HNs.MapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EngineType extends js.Object

/**
  * Types of engines
  */
@JSGlobal("H.Map.EngineType")
@js.native
object EngineType extends js.Object {
  @js.native
  sealed trait P2D
    extends heremapsLib.HNs.MapNs.EngineType
  
  @js.native
  sealed trait PANORAMA
    extends heremapsLib.HNs.MapNs.EngineType
  
  /* 0 */ val P2D: P2D with scala.Double = js.native
  /* 1 */ val PANORAMA: PANORAMA with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[heremapsLib.HNs.MapNs.EngineType with scala.Double] = js.native
}

