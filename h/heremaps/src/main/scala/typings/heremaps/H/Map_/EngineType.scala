package typings.heremaps.H.Map_

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
  
}

