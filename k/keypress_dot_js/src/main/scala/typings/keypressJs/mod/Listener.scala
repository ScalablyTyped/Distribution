package typings.keypressJs.mod

import typings.std.Element
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("keypress.js", "Listener")
@js.native
class Listener () extends js.Object {
  def this(element: Element) = this()
  def this(element: js.UndefOr[scala.Nothing], defaults: ListenerDefaults) = this()
  def this(element: Element, defaults: ListenerDefaults) = this()
  def counting_combo(
    keys: String,
    on_count_callback: js.Function2[/* event */ js.UndefOr[KeyboardEvent], /* count */ js.UndefOr[Double], _]
  ): Unit = js.native
  def destroy(): Unit = js.native
  def get_registered_combos(): js.Array[Combo] = js.native
  def listen(): Unit = js.native
  def register_combo(combo: Combo): Combo = js.native
  def register_many(combos: js.Array[Combo]): js.Array[Combo] = js.native
  def reset(): Unit = js.native
  def sequence_combo(
    keys: String,
    callback: js.Function2[/* event */ js.UndefOr[KeyboardEvent], /* count */ js.UndefOr[Double], _]
  ): Unit = js.native
  def simple_combo(
    keys: String,
    on_keydown_callback: js.Function2[/* event */ js.UndefOr[KeyboardEvent], /* count */ js.UndefOr[Double], _]
  ): Unit = js.native
  def stop_listening(): Unit = js.native
  def unregister_combo(combo: String): Unit = js.native
  def unregister_combo(combo: Combo): Unit = js.native
  def unregister_many(combos: js.Array[Combo | String]): Unit = js.native
}

