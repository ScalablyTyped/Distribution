package typings.mapboxGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mapbox-gl", "ScrollZoomHandler")
@js.native
class ScrollZoomHandler protected () extends StObject {
  def this(map: Map) = this()
  
  def disable(): Unit = js.native
  
  def enable(): Unit = js.native
  
  def isEnabled(): Boolean = js.native
  
  def setWheelZoomRate(wheelZoomRate: Double): Unit = js.native
  
  def setZoomRate(zoomRate: Double): Unit = js.native
}
