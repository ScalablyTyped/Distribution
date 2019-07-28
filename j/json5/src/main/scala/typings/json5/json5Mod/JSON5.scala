package typings.json5.json5Mod

import typings.json5.Anon_Quote
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSON5 extends js.Object {
  // Old JSON methods
  def parse(text: String): js.Any = js.native
  def parse(text: String, reviver: js.Function2[/* key */ js.Any, /* value */ js.Any, _]): js.Any = js.native
  def stringify(value: js.Any): String = js.native
  def stringify(value: js.Any, options: Anon_Quote): String = js.native
  def stringify(value: js.Any, replacer: js.Array[Double | String]): String = js.native
  def stringify(value: js.Any, replacer: js.Array[Double | String], space: String): String = js.native
  def stringify(value: js.Any, replacer: js.Array[Double | String], space: Double): String = js.native
  def stringify(value: js.Any, replacer: js.Function2[/* key */ String, /* value */ js.Any, _]): String = js.native
  def stringify(value: js.Any, replacer: js.Function2[/* key */ String, /* value */ js.Any, _], space: String): String = js.native
  def stringify(value: js.Any, replacer: js.Function2[/* key */ String, /* value */ js.Any, _], space: Double): String = js.native
  def stringify(value: js.Any, replacer: Null, space: String): String = js.native
  def stringify(value: js.Any, replacer: Null, space: Double): String = js.native
}

