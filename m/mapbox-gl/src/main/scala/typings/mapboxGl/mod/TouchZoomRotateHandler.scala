package typings.mapboxGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mapbox-gl", "TouchZoomRotateHandler")
@js.native
open class TouchZoomRotateHandler protected () extends StObject {
  def this(map: Map) = this()
  
  def disable(): Unit = js.native
  
  def disableRotation(): Unit = js.native
  
  def enable(): Unit = js.native
  def enable(options: InteractiveOptions): Unit = js.native
  
  def enableRotation(): Unit = js.native
  
  def isEnabled(): Boolean = js.native
}
