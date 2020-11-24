package typings.mapboxGl.mod

import typings.mapboxGl.anon.BearingSnap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mapbox-gl", "DragRotateHandler")
@js.native
class DragRotateHandler protected () extends js.Object {
  def this(map: Map) = this()
  def this(map: Map, options: BearingSnap) = this()
  
  def disable(): Unit = js.native
  
  def enable(): Unit = js.native
  
  def isActive(): Boolean = js.native
  
  def isEnabled(): Boolean = js.native
}
