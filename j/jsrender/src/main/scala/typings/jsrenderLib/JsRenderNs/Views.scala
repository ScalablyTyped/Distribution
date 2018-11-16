package typings
package jsrenderLib.JsRenderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Views extends js.Object {
  @JSName("converters")
  var converters_Original: Converters = js.native
  def converters(namedConverters: js.Any): js.Any = js.native
  def converters(namedConverters: js.Any, parentTemplate: js.Any): js.Any = js.native
  def converters(name: java.lang.String, converterFn: js.Function1[/* value */ js.Any, _]): js.Any = js.native
  def helpers(namedHelpers: js.Any): js.Any = js.native
  def helpers(namedHelpers: js.Any, parentTemplate: js.Any): js.Any = js.native
  def helpers(name: java.lang.String, helper: js.Any): js.Any = js.native
  def tags(namedTags: js.Any): js.Any = js.native
  def tags(name: java.lang.String, tagFn: js.Function1[/* value */ js.Any, _]): js.Any = js.native
  def tags(name: java.lang.String, tagOptions: js.Any): js.Any = js.native
}

