package typings.jspdf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jspdf", "ShadingPattern")
@js.native
open class ShadingPattern protected ()
  extends StObject
     with Pattern {
  def this(`type`: ShadingPatternType, coords: js.Array[Double], colors: js.Array[ShadingPatterStop]) = this()
  def this(
    `type`: ShadingPatternType,
    coords: js.Array[Double],
    colors: js.Array[ShadingPatterStop],
    gState: GState
  ) = this()
  def this(
    `type`: ShadingPatternType,
    coords: js.Array[Double],
    colors: js.Array[ShadingPatterStop],
    gState: Unit,
    matrix: Matrix
  ) = this()
  def this(
    `type`: ShadingPatternType,
    coords: js.Array[Double],
    colors: js.Array[ShadingPatterStop],
    gState: GState,
    matrix: Matrix
  ) = this()
  
  var colors: js.Array[ShadingPatterStop] = js.native
  
  var coords: js.Array[Double] = js.native
}
