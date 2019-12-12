package typings.heremaps.H.map.render

import org.scalablytyped.runtime.TopLevel
import typings.heremaps.H.map.render.RenderState.ACTIVE
import typings.heremaps.H.map.render.RenderState.DONE
import typings.heremaps.H.map.render.RenderState.PENDING
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RenderState with Double] = js.native
  /* 1 */ @js.native
  object ACTIVE extends TopLevel[ACTIVE with Double]
  
  /* 2 */ @js.native
  object DONE extends TopLevel[DONE with Double]
  
  /* 0 */ @js.native
  object PENDING extends TopLevel[PENDING with Double]
  
}

