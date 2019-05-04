package typings
package atJupyterlabCoreutilsLib.libMarkdowncodeblocksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils/lib/markdowncodeblocks", "MarkdownCodeBlocks")
@js.native
object MarkdownCodeBlocksNs extends js.Object {
  @js.native
  class MarkdownCodeBlock protected () extends js.Object {
    def this(startLine: scala.Double) = this()
    var code: java.lang.String = js.native
    var endLine: scala.Double = js.native
    var startLine: scala.Double = js.native
  }
  
  val CODE_BLOCK_MARKER: atJupyterlabCoreutilsLib.atJupyterlabCoreutilsLibStrings.BACKTICKBACKTICKBACKTICK = js.native
  /**
    * Construct all code snippets from current text
    * (this could be potentially optimized if we can cache and detect differences)
    * @param text - A string to parse codeblocks from
    *
    * @returns An array of MarkdownCodeBlocks.
    */
  def findMarkdownCodeBlocks(text: java.lang.String): js.Array[MarkdownCodeBlock] = js.native
  /**
    * Check whether the given file extension is a markdown extension
    * @param extension - A file extension
    *
    * @returns true/false depending on whether this is a supported markdown extension
    */
  def isMarkdown(extension: java.lang.String): scala.Boolean = js.native
}

