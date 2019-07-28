package typings.atJupyterlabCoreutils.libMarkdowncodeblocksMod

import typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.BACKTICKBACKTICKBACKTICK
import typings.atJupyterlabCoreutils.libMarkdowncodeblocksMod.MarkdownCodeBlocksNs.MarkdownCodeBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils/lib/markdowncodeblocks", "MarkdownCodeBlocks")
@js.native
object MarkdownCodeBlocksNs extends js.Object {
  @js.native
  class MarkdownCodeBlock protected () extends js.Object {
    def this(startLine: Double) = this()
    var code: String = js.native
    var endLine: Double = js.native
    var startLine: Double = js.native
  }
  
  val CODE_BLOCK_MARKER: BACKTICKBACKTICKBACKTICK = js.native
  /**
    * Construct all code snippets from current text
    * (this could be potentially optimized if we can cache and detect differences)
    * @param text - A string to parse codeblocks from
    *
    * @returns An array of MarkdownCodeBlocks.
    */
  def findMarkdownCodeBlocks(text: String): js.Array[MarkdownCodeBlock] = js.native
  /**
    * Check whether the given file extension is a markdown extension
    * @param extension - A file extension
    *
    * @returns true/false depending on whether this is a supported markdown extension
    */
  def isMarkdown(extension: String): Boolean = js.native
}

