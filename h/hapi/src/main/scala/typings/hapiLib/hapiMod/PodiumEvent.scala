package typings
package hapiLib.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PodiumEvent[K /* <: java.lang.String */, T] extends js.Object {
  def emit(criteria: K, listener: js.Function1[/* value */ T, scala.Unit]): scala.Unit = js.native
  def hasListeners(criteria: K): this.type = js.native
  def on(criteria: K, listener: js.Function1[/* value */ T, scala.Unit]): scala.Unit = js.native
  def once(criteria: K): stdLib.Promise[T] = js.native
  def once(criteria: K, listener: js.Function1[/* value */ T, scala.Unit]): scala.Unit = js.native
  def removeAllListeners(criteria: K): this.type = js.native
  def removeListener(criteria: K, listener: podiumLib.podiumMod.PodiumNs.Listener): this.type = js.native
}

