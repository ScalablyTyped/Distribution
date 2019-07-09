package typings
package atJupyterlabCoreutilsLib.libInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPoll[T, U, V /* <: java.lang.String */] extends js.Object {
  /**
    * A signal emitted when the poll is disposed.
    */
  val disposed: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, scala.Unit]
  /**
    * The polling frequency data.
    */
  val frequency: atJupyterlabCoreutilsLib.libInterfacesMod.IPollNs.Frequency
  /**
    * Whether the poll is disposed.
    */
  val isDisposed: scala.Boolean
  /**
    * The name of the poll.
    */
  val name: java.lang.String
  /**
    * The poll state, which is the content of the currently-scheduled poll tick.
    */
  val state: atJupyterlabCoreutilsLib.libInterfacesMod.IPollNs.State[T, U, V]
  /**
    * A promise that resolves when the currently-scheduled tick completes.
    *
    * #### Notes
    * Usually this will resolve after `state.interval` milliseconds from
    * `state.timestamp`. It can resolve earlier if the user starts or refreshes the
    * poll, etc.
    */
  val tick: js.Promise[IPoll[T, U, V]]
  /**
    * A signal emitted when the poll state changes, i.e., a new tick is scheduled.
    */
  val ticked: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[IPoll[T, U, V], atJupyterlabCoreutilsLib.libInterfacesMod.IPollNs.State[T, U, V]]
}

object IPoll {
  @scala.inline
  def apply[T, U, V /* <: java.lang.String */](
    disposed: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[IPoll[T, U, V], scala.Unit],
    frequency: atJupyterlabCoreutilsLib.libInterfacesMod.IPollNs.Frequency,
    isDisposed: scala.Boolean,
    name: java.lang.String,
    state: atJupyterlabCoreutilsLib.libInterfacesMod.IPollNs.State[T, U, V],
    tick: js.Promise[IPoll[T, U, V]],
    ticked: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[IPoll[T, U, V], atJupyterlabCoreutilsLib.libInterfacesMod.IPollNs.State[T, U, V]]
  ): IPoll[T, U, V] = {
    val __obj = js.Dynamic.literal(disposed = disposed, frequency = frequency, isDisposed = isDisposed, name = name, state = state, tick = tick, ticked = ticked)
  
    __obj.asInstanceOf[IPoll[T, U, V]]
  }
}

