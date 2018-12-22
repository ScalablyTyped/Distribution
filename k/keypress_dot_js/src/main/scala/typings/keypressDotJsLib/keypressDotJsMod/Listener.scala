package typings
package keypressDotJsLib.keypressDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("keypress.js", "Listener")
@js.native
class Listener () extends js.Object {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, defaults: ListenerDefaults) = this()
  def counting_combo(
    keys: java.lang.String,
    on_count_callback: js.Function2[
      /* event */ js.UndefOr[stdLib.KeyboardEvent], 
      /* count */ js.UndefOr[scala.Double], 
      _
    ]
  ): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def get_registered_combos(): js.Array[Combo] = js.native
  def listen(): scala.Unit = js.native
  def register_combo(combo: Combo): Combo = js.native
  def register_many(combos: js.Array[Combo]): js.Array[Combo] = js.native
  def reset(): scala.Unit = js.native
  def sequence_combo(
    keys: java.lang.String,
    callback: js.Function2[
      /* event */ js.UndefOr[stdLib.KeyboardEvent], 
      /* count */ js.UndefOr[scala.Double], 
      _
    ]
  ): scala.Unit = js.native
  def simple_combo(
    keys: java.lang.String,
    on_keydown_callback: js.Function2[
      /* event */ js.UndefOr[stdLib.KeyboardEvent], 
      /* count */ js.UndefOr[scala.Double], 
      _
    ]
  ): scala.Unit = js.native
  def stop_listening(): scala.Unit = js.native
  def unregister_combo(combo: java.lang.String): scala.Unit = js.native
  def unregister_combo(combo: Combo): scala.Unit = js.native
  def unregister_many(combos: js.Array[Combo | java.lang.String]): scala.Unit = js.native
}

