package typings.markdownIt.rendererMod

import org.scalablytyped.runtime.StringDictionary
import typings.markdownIt.libMod.TokenRender
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("markdown-it/lib/renderer", JSImport.Namespace)
@js.native
class ^ () extends Renderer {
  /* CompleteClass */
  override var rules: StringDictionary[TokenRender] = js.native
  /* CompleteClass */
  override def render(tokens: js.Array[typings.markdownIt.tokenMod.^], options: js.Any, env: js.Any): String = js.native
  /* CompleteClass */
  override def renderAttrs(token: typings.markdownIt.tokenMod.^): String = js.native
  /* CompleteClass */
  override def renderInline(tokens: js.Array[typings.markdownIt.tokenMod.^], options: js.Any, env: js.Any): String = js.native
  /* CompleteClass */
  override def renderToken(tokens: js.Array[typings.markdownIt.tokenMod.^], idx: Double, options: js.Any): String = js.native
}

