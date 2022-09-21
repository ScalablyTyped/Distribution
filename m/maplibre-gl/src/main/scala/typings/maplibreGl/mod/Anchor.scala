package typings.maplibreGl.mod

import typings.mapboxPointGeometry.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "Anchor")
@js.native
open class Anchor protected () extends ^ {
  def this(x: Double, y: Double, angle: Double) = this()
  def this(x: Double, y: Double, angle: Double, segment: Double) = this()
  
  @JSName("angle")
  var angle_FAnchor: Any = js.native
  
  var segment: js.UndefOr[Double] = js.native
}
