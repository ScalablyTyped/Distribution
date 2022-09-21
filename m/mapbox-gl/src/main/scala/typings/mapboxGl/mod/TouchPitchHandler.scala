package typings.mapboxGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mapbox-gl", "TouchPitchHandler")
@js.native
open class TouchPitchHandler protected () extends StObject {
  def this(map: Map) = this()
  
  def disable(): Unit = js.native
  
  def enable(): Unit = js.native
  def enable(options: InteractiveOptions): Unit = js.native
  
  def isActive(): Boolean = js.native
  
  def isEnabled(): Boolean = js.native
}
