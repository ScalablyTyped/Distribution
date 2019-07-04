package typings
package losslessDashJsonLib.losslessDashJsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lossless-json", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def config(): losslessDashJsonLib.Anon_CircularRefsBoolean = js.native
  def config(hasCircularRefs: losslessDashJsonLib.Anon_CircularRefs): losslessDashJsonLib.Anon_CircularRefsBoolean = js.native
  def parse(text: java.lang.String): js.Any = js.native
  def parse(text: java.lang.String, reviver: js.Function2[/* key */ java.lang.String, /* value */ js.Any, _]): js.Any = js.native
  def stringify(value: js.Any): java.lang.String = js.native
  def stringify(value: js.Any, replacer: js.Array[scala.Double | java.lang.String]): java.lang.String = js.native
  def stringify(value: js.Any, replacer: js.Array[java.lang.String | scala.Double], space: java.lang.String): java.lang.String = js.native
  def stringify(value: js.Any, replacer: js.Array[java.lang.String | scala.Double], space: scala.Double): java.lang.String = js.native
  def stringify(value: js.Any, replacer: js.Function2[/* key */ java.lang.String, /* value */ js.Any, _]): java.lang.String = js.native
  def stringify(
    value: js.Any,
    replacer: js.Function2[/* key */ java.lang.String, /* value */ js.Any, _],
    space: java.lang.String
  ): java.lang.String = js.native
  def stringify(
    value: js.Any,
    replacer: js.Function2[/* key */ java.lang.String, /* value */ js.Any, _],
    space: scala.Double
  ): java.lang.String = js.native
}

