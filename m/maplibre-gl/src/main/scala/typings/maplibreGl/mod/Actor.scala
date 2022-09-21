package typings.maplibreGl.mod

import typings.maplibreGl.anon.Number
import typings.maplibreGl.anon.NumberCancelable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "Actor")
@js.native
open class Actor protected () extends StObject {
  def this(target: Any, parent: Any) = this()
  def this(target: Any, parent: Any, mapId: Double) = this()
  
  var callbacks: Number = js.native
  
  var cancelCallbacks: NumberCancelable = js.native
  
  var globalScope: Any = js.native
  
  var invoker: ThrottledInvoker = js.native
  
  var mapId: Double = js.native
  
  var name: String = js.native
  
  var parent: Any = js.native
  
  def process(): scala.Unit = js.native
  
  def processTask(id: Double, task: Any): scala.Unit = js.native
  
  def receive(message: Any): scala.Unit = js.native
  
  def remove(): scala.Unit = js.native
  
  /**
  	 * Sends a message from a main-thread map to a Worker or from a Worker back to
  	 * a main-thread map instance.
  	 *
  	 * @param type The name of the target method to invoke or '[source-type].[source-name].name' for a method on a WorkerSource.
  	 * @param targetMapId A particular mapId to which to send this message.
  	 * @private
  	 */
  def send(`type`: String, data: Any): Cancelable = js.native
  def send(`type`: String, data: Any, callback: js.Function): Cancelable = js.native
  def send(`type`: String, data: Any, callback: js.Function, targetMapId: String): Cancelable = js.native
  def send(`type`: String, data: Any, callback: js.Function, targetMapId: String, mustQueue: Boolean): Cancelable = js.native
  def send(`type`: String, data: Any, callback: js.Function, targetMapId: Null, mustQueue: Boolean): Cancelable = js.native
  def send(`type`: String, data: Any, callback: js.Function, targetMapId: scala.Unit, mustQueue: Boolean): Cancelable = js.native
  def send(`type`: String, data: Any, callback: Null, targetMapId: String): Cancelable = js.native
  def send(`type`: String, data: Any, callback: Null, targetMapId: String, mustQueue: Boolean): Cancelable = js.native
  def send(`type`: String, data: Any, callback: Null, targetMapId: Null, mustQueue: Boolean): Cancelable = js.native
  def send(`type`: String, data: Any, callback: Null, targetMapId: scala.Unit, mustQueue: Boolean): Cancelable = js.native
  def send(`type`: String, data: Any, callback: scala.Unit, targetMapId: String): Cancelable = js.native
  def send(`type`: String, data: Any, callback: scala.Unit, targetMapId: String, mustQueue: Boolean): Cancelable = js.native
  def send(`type`: String, data: Any, callback: scala.Unit, targetMapId: Null, mustQueue: Boolean): Cancelable = js.native
  def send(`type`: String, data: Any, callback: scala.Unit, targetMapId: scala.Unit, mustQueue: Boolean): Cancelable = js.native
  
  var target: Any = js.native
  
  var taskQueue: js.Array[Double] = js.native
  
  var tasks: Number = js.native
}
