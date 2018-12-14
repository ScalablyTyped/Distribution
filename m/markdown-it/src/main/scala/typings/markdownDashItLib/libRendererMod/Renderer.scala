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

