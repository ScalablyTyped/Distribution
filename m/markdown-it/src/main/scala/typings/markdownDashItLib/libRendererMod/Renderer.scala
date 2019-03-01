package typings
package markdownDashItLib.libRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Renderer extends js.Object {
  var rules: org.scalablytyped.runtime.StringDictionary[markdownDashItLib.libMod.MarkdownItNs.TokenRender]
  def render(tokens: js.Array[markdownDashItLib.libTokenMod.namespaced], options: js.Any, env: js.Any): java.lang.String
  def renderAttrs(token: markdownDashItLib.libTokenMod.namespaced): java.lang.String
  def renderInline(tokens: js.Array[markdownDashItLib.libTokenMod.namespaced], options: js.Any, env: js.Any): java.lang.String
  def renderToken(tokens: js.Array[markdownDashItLib.libTokenMod.namespaced], idx: scala.Double, options: js.Any): java.lang.String
}

object Renderer {
  @scala.inline
  def apply(
    render: js.Function3[js.Array[markdownDashItLib.libTokenMod.namespaced], js.Any, js.Any, java.lang.String],
    renderAttrs: js.Function1[markdownDashItLib.libTokenMod.namespaced, java.lang.String],
    renderInline: js.Function3[js.Array[markdownDashItLib.libTokenMod.namespaced], js.Any, js.Any, java.lang.String],
    renderToken: js.Function3[
      js.Array[markdownDashItLib.libTokenMod.namespaced], 
      scala.Double, 
      js.Any, 
      java.lang.String
    ],
    rules: org.scalablytyped.runtime.StringDictionary[markdownDashItLib.libMod.MarkdownItNs.TokenRender]
  ): Renderer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("render")(render)
    __obj.updateDynamic("renderAttrs")(renderAttrs)
    __obj.updateDynamic("renderInline")(renderInline)
    __obj.updateDynamic("renderToken")(renderToken)
    __obj.updateDynamic("rules")(rules)
    __obj.asInstanceOf[Renderer]
  }
}

