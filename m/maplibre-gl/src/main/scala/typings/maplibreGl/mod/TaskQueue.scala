package typings.maplibreGl.mod

import typings.maplibreGl.maplibreGlBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "TaskQueue")
@js.native
open class TaskQueue () extends StObject {
  
  var _cleared: Boolean = js.native
  
  var _currentlyRunning: js.Array[Task] | `false` = js.native
  
  var _id: TaskID = js.native
  
  var _queue: js.Array[Task] = js.native
  
  def add(callback: js.Function1[/* timeStamp */ Double, scala.Unit]): TaskID = js.native
  
  def clear(): scala.Unit = js.native
  
  def remove(id: TaskID): scala.Unit = js.native
  
  def run(): scala.Unit = js.native
  def run(timeStamp: Double): scala.Unit = js.native
}
