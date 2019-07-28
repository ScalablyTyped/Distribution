package typings.heremaps.HNs.mapNs.renderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RenderState extends js.Object

/**
  * The rendering states of the layer.
  */
@JSGlobal("H.map.render.RenderState")
@js.native
object RenderState extends js.Object {
  /** Data rendering or animation is in progress. */
  @js.native
  sealed trait ACTIVE extends RenderState
  
  /** Data rendering or animation is done. */
  @js.native
  sealed trait DONE extends RenderState
  
  /**
    * Data loading/processing is still in progress, but there is nothing to render. In this state rendering engine might go to sleep mode after
    * certain amount of time to prevent draining of battery on the user device.
    */
  @js.native
  sealed trait PENDING extends RenderState
  
  /* 1 */ val ACTIVE: typings.heremaps.HNs.mapNs.renderNs.RenderState.ACTIVE with Double = js.native
  /* 2 */ val DONE: typings.heremaps.HNs.mapNs.renderNs.RenderState.DONE with Double = js.native
  /* 0 */ val PENDING: typings.heremaps.HNs.mapNs.renderNs.RenderState.PENDING with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RenderState with Double] = js.native
}

