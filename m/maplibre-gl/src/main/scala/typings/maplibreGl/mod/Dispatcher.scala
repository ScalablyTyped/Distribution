package typings.maplibreGl.mod

import typings.maplibreGl.anon.InstantiableActor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "Dispatcher")
@js.native
open class Dispatcher protected () extends StObject {
  def this(workerPool: WorkerPool, parent: Any) = this()
  
  var actors: js.Array[Actor] = js.native
  
  /**
  	 * Broadcast a message to all Workers.
  	 * @private
  	 */
  def broadcast(`type`: String, data: Any): scala.Unit = js.native
  def broadcast(`type`: String, data: Any, cb: js.Function1[/* repeated */ Any, Any]): scala.Unit = js.native
  
  var currentActor: Double = js.native
  
  /**
  	 * Acquires an actor to dispatch messages to. The actors are distributed in round-robin fashion.
  	 * @returns An actor object backed by a web worker for processing messages.
  	 */
  def getActor(): Actor = js.native
  
  var id: Double = js.native
  
  def remove(): scala.Unit = js.native
  
  var workerPool: WorkerPool = js.native
}
/* static members */
object Dispatcher {
  
  @JSImport("maplibre-gl", "Dispatcher")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("maplibre-gl", "Dispatcher.Actor")
  @js.native
  def Actor: InstantiableActor = js.native
  inline def Actor_=(x: InstantiableActor): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Actor")(x.asInstanceOf[js.Any])
}
