package typings
package atHapiHapiLib.atHapiHapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PodiumEvent[K /* <: java.lang.String */, T] extends js.Object {
  def emit(criteria: K, listener: js.Function1[/* value */ T, scala.Unit]): scala.Unit = js.native
  def hasListeners(criteria: K): this.type = js.native
  def on(criteria: K, listener: js.Function1[/* value */ T, scala.Unit]): scala.Unit = js.native
  def once(criteria: K): js.Promise[T] = js.native
  def once(criteria: K, listener: js.Function1[/* value */ T, scala.Unit]): scala.Unit = js.native
  def removeAllListeners(criteria: K): this.type = js.native
  def removeListener(criteria: K, listener: atHapiPodiumLib.atHapiPodiumMod.PodiumNs.Listener): this.type = js.native
}

