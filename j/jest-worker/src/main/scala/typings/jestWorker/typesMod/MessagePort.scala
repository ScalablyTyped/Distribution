package typings.jestWorker.typesMod

import org.scalablytyped.runtime.Instantiable0
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {listenerCount (emitter : node.events.EventEmitter, event : string): number, listenerCount (emitter : node.events.EventEmitter, event : symbol): number,   defaultMaxListeners :number,  readonly errorMonitor :symbol, new (): node.events.EventEmitter} & {postMessage (message : unknown): void} */
@js.native
trait MessagePort extends Instantiable0[EventEmitter] {
  
  var defaultMaxListeners: Double = js.native
  
  /**
    * This symbol shall be used to install a listener for only monitoring `'error'`
    * events. Listeners installed using this symbol are called before the regular
    * `'error'` listeners are called.
    *
    * Installing a listener using this symbol does not change the behavior once an
    * `'error'` event is emitted, therefore the process will still crash if no
    * regular `'error'` listener is installed.
    */
  val errorMonitor: js.Symbol = js.native
  
  /** @deprecated since v4.0.0 */
  def listenerCount(emitter: EventEmitter, event: String): Double = js.native
  def listenerCount(emitter: EventEmitter, event: js.Symbol): Double = js.native
  
  def postMessage(message: js.Any): Unit = js.native
}
