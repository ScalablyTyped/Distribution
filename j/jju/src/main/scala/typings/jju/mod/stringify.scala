package typings.jju.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jju", "stringify")
@js.native
object stringify extends js.Object {
  def apply(value: js.Any): String = js.native
  def apply(value: js.Any, options: StringifyOptions): String = js.native
  def apply(value: js.Any, replacer: js.Array[Double | String]): String = js.native
  def apply(value: js.Any, replacer: js.Array[Double | String], space: String): String = js.native
  def apply(value: js.Any, replacer: js.Array[Double | String], space: Double): String = js.native
  def apply(value: js.Any, replacer: js.Function2[/* key */ String, /* value */ js.Any, _]): String = js.native
  def apply(value: js.Any, replacer: js.Function2[/* key */ String, /* value */ js.Any, _], space: String): String = js.native
  def apply(value: js.Any, replacer: js.Function2[/* key */ String, /* value */ js.Any, _], space: Double): String = js.native
  def apply(value: js.Any, replacer: Null, space: String): String = js.native
  def apply(value: js.Any, replacer: Null, space: Double): String = js.native
}

