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
  
  val COORD: COORD with java.lang.String = js.native
  val HEADING: HEADING with java.lang.String = js.native
  val INCLINE: INCLINE with java.lang.String = js.native
  val TILT: TILT with java.lang.String = js.native
  val ZOOM: ZOOM with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    heremapsLib.HNs.mapNs.renderNs.RenderEngineNs.InteractionModifiers with java.lang.String
  ] = js.native
}

