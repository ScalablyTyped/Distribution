package typings.kefir

import typings.kefir.kefirMod.Stream
import typings.node.NodeJS.EventEmitter
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_EventName extends js.Object {
  def apply[T, S](target: Anon_Off, eventName: String): Stream[T, S] = js.native
  def apply[T, S](target: Anon_Off, eventName: String, transform: js.Function1[/* value */ T, S]): Stream[T, S] = js.native
  def apply[T, S](target: EventEmitter, eventName: String): Stream[T, S] = js.native
  def apply[T, S](target: EventEmitter, eventName: String, transform: js.Function1[/* value */ T, S]): Stream[T, S] = js.native
  def apply[T, S](target: EventTarget, eventName: String): Stream[T, S] = js.native
  def apply[T, S](target: EventTarget, eventName: String, transform: js.Function1[/* value */ T, S]): Stream[T, S] = js.native
}

