package typings.heremaps.H.Map

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
  sealed trait P2D extends EngineType
  
  @js.native
  sealed trait PANORAMA extends EngineType
  
  /* 0 */ val P2D: typings.heremaps.H.Map.EngineType.P2D with Double = js.native
  /* 1 */ val PANORAMA: typings.heremaps.H.Map.EngineType.PANORAMA with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EngineType with Double] = js.native
}

