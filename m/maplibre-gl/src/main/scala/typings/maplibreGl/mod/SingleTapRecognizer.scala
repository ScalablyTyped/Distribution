package typings.maplibreGl.mod

import typings.mapboxPointGeometry.mod.^
import typings.maplibreGl.anon.NumTouches
import typings.std.Touch
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "SingleTapRecognizer")
@js.native
open class SingleTapRecognizer protected () extends StObject {
  def this(options: NumTouches) = this()
  
  var aborted: Boolean = js.native
  
  var centroid: ^ = js.native
  
  var numTouches: Double = js.native
  
  def reset(): scala.Unit = js.native
  
  var startTime: Double = js.native
  
  def touchend(e: TouchEvent, points: js.Array[^], mapTouches: js.Array[Touch]): ^ = js.native
  
  var touches: /* import warning: importer.ImportType#apply Failed type conversion: {[ k in number | string ]: @mapbox/point-geometry.@mapbox/point-geometry.^} */ js.Any = js.native
  
  def touchmove(e: TouchEvent, points: js.Array[^], mapTouches: js.Array[Touch]): scala.Unit = js.native
  
  def touchstart(e: TouchEvent, points: js.Array[^], mapTouches: js.Array[Touch]): scala.Unit = js.native
}
