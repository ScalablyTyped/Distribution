package typings.heremaps.HNs.mapNs.renderNs.RenderEngineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InteractionModifiers extends js.Object

/**
  * This object defines the modifiers to use for H.map.ViewPort#startInteraction.
  */
@JSGlobal("H.map.render.RenderEngine.InteractionModifiers")
@js.native
object InteractionModifiers extends js.Object {
  /** changes incline angle during the interaction */
  @js.native
  sealed trait COORD extends InteractionModifiers
  
  /** changes map center during the interaction */
  @js.native
  sealed trait HEADING extends InteractionModifiers
  
  /** changes tilt angle during the interaction */
  @js.native
  sealed trait INCLINE extends InteractionModifiers
  
  /** changes heading angle during the interaction */
  @js.native
  sealed trait TILT extends InteractionModifiers
  
  /** changes zoom level during the interaction */
  @js.native
  sealed trait ZOOM extends InteractionModifiers
  
  /* 4 */ val COORD: typings.heremaps.HNs.mapNs.renderNs.RenderEngineNs.InteractionModifiers.COORD with Double = js.native
  /* 1 */ val HEADING: typings.heremaps.HNs.mapNs.renderNs.RenderEngineNs.InteractionModifiers.HEADING with Double = js.native
  /* 3 */ val INCLINE: typings.heremaps.HNs.mapNs.renderNs.RenderEngineNs.InteractionModifiers.INCLINE with Double = js.native
  /* 2 */ val TILT: typings.heremaps.HNs.mapNs.renderNs.RenderEngineNs.InteractionModifiers.TILT with Double = js.native
  /* 0 */ val ZOOM: typings.heremaps.HNs.mapNs.renderNs.RenderEngineNs.InteractionModifiers.ZOOM with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InteractionModifiers with Double] = js.native
}

