package typings.jestWorker.typesMod

import org.scalablytyped.runtime.Instantiable0
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessagePort extends Instantiable0[EventEmitter] {
  var defaultMaxListeners: Double = js.native
  /** @deprecated since v4.0.0 */
  def listenerCount(emitter: EventEmitter, event: String): Double = js.native
  def listenerCount(emitter: EventEmitter, event: js.Symbol): Double = js.native
  def postMessage(message: js.Any): Unit = js.native
}

