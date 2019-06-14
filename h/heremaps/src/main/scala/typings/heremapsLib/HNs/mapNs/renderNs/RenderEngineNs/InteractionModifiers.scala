package typings
package heremapsLib.HNs.mapNs.renderNs.RenderEngineNs

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
  sealed trait COORD
    extends heremapsLib.HNs.mapNs.renderNs.RenderEngineNs.InteractionModifiers
  
  /** changes map center during the interaction */
  @js.native
  sealed trait HEADING
    extends heremapsLib.HNs.mapNs.renderNs.RenderEngineNs.InteractionModifiers
  
  /** changes tilt angle during the interaction */
  @js.native
  sealed trait INCLINE
    extends heremapsLib.HNs.mapNs.renderNs.RenderEngineNs.InteractionModifiers
  
  /** changes heading angle during the interaction */
  @js.native
  sealed trait TILT
    extends heremapsLib.HNs.mapNs.renderNs.RenderEngineNs.InteractionModifiers
  
  /** changes zoom level during the interaction */
  @js.native
  sealed trait ZOOM
    extends heremapsLib.HNs.mapNs.renderNs.RenderEngineNs.InteractionModifiers
  
  /* 4 */ val COORD: COORD with scala.Double = js.native
  /* 1 */ val HEADING: HEADING with scala.Double = js.native
  /* 3 */ val INCLINE: INCLINE with scala.Double = js.native
  /* 2 */ val TILT: TILT with scala.Double = js.native
  /* 0 */ val ZOOM: ZOOM with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    heremapsLib.HNs.mapNs.renderNs.RenderEngineNs.InteractionModifiers with scala.Double
  ] = js.native
}

