package typings.losslessDashJson.losslessDashJsonMod

import typings.losslessDashJson.Anon_CircularRefs
import typings.losslessDashJson.Anon_CircularRefsBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lossless-json", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def config(): Anon_CircularRefsBoolean = js.native
  def config(hasCircularRefs: Anon_CircularRefs): Anon_CircularRefsBoolean = js.native
  def parse(text: String): js.Any = js.native
  def parse(text: String, reviver: js.Function2[/* key */ String, /* value */ js.Any, _]): js.Any = js.native
  def stringify(value: js.Any): String = js.native
  def stringify(value: js.Any, replacer: js.Array[Double | String]): String = js.native
  def stringify(value: js.Any, replacer: js.Array[String | Double], space: String): String = js.native
  def stringify(value: js.Any, replacer: js.Array[String | Double], space: Double): String = js.native
  def stringify(value: js.Any, replacer: js.Function2[/* key */ String, /* value */ js.Any, _]): String = js.native
  def stringify(value: js.Any, replacer: js.Function2[/* key */ String, /* value */ js.Any, _], space: String): String = js.native
  def stringify(value: js.Any, replacer: js.Function2[/* key */ String, /* value */ js.Any, _], space: Double): String = js.native
}

