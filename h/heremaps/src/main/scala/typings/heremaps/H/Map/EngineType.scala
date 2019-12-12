package typings.heremaps.H.Map

import org.scalablytyped.runtime.TopLevel
import typings.heremaps.H.Map.EngineType.P2D
import typings.heremaps.H.Map.EngineType.PANORAMA
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EngineType with Double] = js.native
  /* 0 */ @js.native
  object P2D extends TopLevel[P2D with Double]
  
  /* 1 */ @js.native
  object PANORAMA extends TopLevel[PANORAMA with Double]
  
}

