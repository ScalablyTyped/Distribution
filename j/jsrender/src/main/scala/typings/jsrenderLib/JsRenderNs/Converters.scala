package typings
package jsrenderLib.JsRenderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Converters extends js.Object {
  def apply(namedConverters: js.Any): js.Any = js.native
  def apply(namedConverters: js.Any, parentTemplate: js.Any): js.Any = js.native
  def apply(name: java.lang.String, converterFn: js.Function1[/* value */ js.Any, _]): js.Any = js.native
  def attr(valueToEncode: java.lang.String): java.lang.String = js.native
  def html(valueToEncode: java.lang.String): java.lang.String = js.native
  def url(valueToEncode: java.lang.String): java.lang.String = js.native
}

