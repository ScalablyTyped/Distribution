package typings.jju.jjuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jju", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def analyze(text: String): JsonStyle = js.native
  def analyze(text: String, options: ParseOptions): JsonStyle = js.native
  def parse(text: String): js.Any = js.native
  def parse(text: String, options: ParseOptions): js.Any = js.native
  def parse(text: String, reviver: js.Function2[/* key */ js.Any, /* value */ js.Any, _]): js.Any = js.native
  def stringify(value: js.Any): String = js.native
  def stringify(value: js.Any, options: StringifyOptions): String = js.native
  def stringify(value: js.Any, replacer: js.Array[Double | String]): String = js.native
  def stringify(value: js.Any, replacer: js.Array[Double | String], space: String): String = js.native
  def stringify(value: js.Any, replacer: js.Array[Double | String], space: Double): String = js.native
  def stringify(value: js.Any, replacer: js.Function2[/* key */ String, /* value */ js.Any, _]): String = js.native
  def stringify(value: js.Any, replacer: js.Function2[/* key */ String, /* value */ js.Any, _], space: String): String = js.native
  def stringify(value: js.Any, replacer: js.Function2[/* key */ String, /* value */ js.Any, _], space: Double): String = js.native
  def stringify(value: js.Any, replacer: Null, space: String): String = js.native
  def stringify(value: js.Any, replacer: Null, space: Double): String = js.native
  def tokenize(text: String): js.Array[Token] = js.native
  def tokenize(text: String, options: ParseOptions): js.Array[Token] = js.native
  def update(text: String, new_value: js.Any): String = js.native
  def update(text: String, new_value: js.Any, options: ParseOptions with StringifyOptions): String = js.native
}

