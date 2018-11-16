package typings
package jsrenderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  var render: jsrenderLib.JsRenderNs.RenderStatic = js.native
  var views: jsrenderLib.JsRenderNs.Views = js.native
  def templates(markupOrSelector: java.lang.String): jsrenderLib.JsRenderNs.Template = js.native
  def templates(namedTemplates: js.Any): js.Any = js.native
  def templates(name: java.lang.String, markupOrSelector: java.lang.String): jsrenderLib.JsRenderNs.Template = js.native
}

