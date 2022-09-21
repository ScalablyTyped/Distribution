package typings.jspdf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jspdf", "TilingPattern")
@js.native
open class TilingPattern protected ()
  extends StObject
     with Pattern {
  def this(boundingBox: js.Array[Double], xStep: Double, yStep: Double) = this()
  def this(boundingBox: js.Array[Double], xStep: Double, yStep: Double, gState: GState) = this()
  def this(boundingBox: js.Array[Double], xStep: Double, yStep: Double, gState: Unit, matrix: Matrix) = this()
  def this(boundingBox: js.Array[Double], xStep: Double, yStep: Double, gState: GState, matrix: Matrix) = this()
  
  var boundingBox: js.Array[Double] = js.native
  
  var xStep: Double = js.native
  
  var yStep: Double = js.native
}
