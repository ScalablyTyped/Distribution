package typings.markdownIt.stateCoreMod

import typings.markdownIt.libMod.MarkdownIt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("markdown-it/lib/rules_core/state_core", JSImport.Namespace)
@js.native
class ^ protected () extends StateCore {
  def this(src: String, md: MarkdownIt, env: js.Any) = this()
  /* CompleteClass */
  override var env: js.Any = js.native
  /* CompleteClass */
  override var level: Double = js.native
  /** Link to parser instance */
  /* CompleteClass */
  override var md: MarkdownIt = js.native
  /** The markdown source code that is being parsed. */
  /* CompleteClass */
  override var src: String = js.native
  /* CompleteClass */
  override var tokens: js.Array[typings.markdownIt.tokenMod.^] = js.native
}

