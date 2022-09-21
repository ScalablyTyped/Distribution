package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "ZoomHistory")
@js.native
open class ZoomHistory () extends StObject {
  
  var first: Boolean = js.native
  
  var lastFloorZoom: Double = js.native
  
  var lastIntegerZoom: Double = js.native
  
  var lastIntegerZoomTime: Double = js.native
  
  var lastZoom: Double = js.native
  
  def update(z: Double, now: Double): Boolean = js.native
}
