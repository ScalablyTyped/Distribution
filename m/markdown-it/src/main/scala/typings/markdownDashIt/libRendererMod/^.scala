package typings.markdownDashIt.libRendererMod

import org.scalablytyped.runtime.StringDictionary
import typings.markdownDashIt.libMod.TokenRender
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("markdown-it/lib/renderer", JSImport.Namespace)
@js.native
class ^ () extends Renderer {
  /* CompleteClass */
  override var rules: StringDictionary[TokenRender] = js.native
  /* CompleteClass */
  override def render(tokens: js.Array[typings.markdownDashIt.libTokenMod.^], options: js.Any, env: js.Any): String = js.native
  /* CompleteClass */
  override def renderAttrs(token: typings.markdownDashIt.libTokenMod.^): String = js.native
  /* CompleteClass */
  override def renderInline(tokens: js.Array[typings.markdownDashIt.libTokenMod.^], options: js.Any, env: js.Any): String = js.native
  /* CompleteClass */
  override def renderToken(tokens: js.Array[typings.markdownDashIt.libTokenMod.^], idx: Double, options: js.Any): String = js.native
}

