package typings.lezerMarkdown

import typings.lezerMarkdown.anon.CodeParser
import typings.lezerMarkdown.distMarkdownMod.MarkdownConfig
import typings.lezerMarkdown.distMarkdownMod.MarkdownExtension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@lezer/markdown", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@lezer/markdown", "BlockContext")
  @js.native
  open class BlockContext ()
    extends typings.lezerMarkdown.distMarkdownMod.BlockContext
  
  @JSImport("@lezer/markdown", "Element")
  @js.native
  open class Element ()
    extends typings.lezerMarkdown.distMarkdownMod.Element
  
  @JSImport("@lezer/markdown", "Emoji")
  @js.native
  val Emoji: MarkdownConfig = js.native
  
  @JSImport("@lezer/markdown", "GFM")
  @js.native
  val GFM: js.Array[MarkdownConfig] = js.native
  
  @JSImport("@lezer/markdown", "InlineContext")
  @js.native
  open class InlineContext ()
    extends typings.lezerMarkdown.distMarkdownMod.InlineContext
  
  @JSImport("@lezer/markdown", "LeafBlock")
  @js.native
  open class LeafBlock ()
    extends typings.lezerMarkdown.distMarkdownMod.LeafBlock
  
  @JSImport("@lezer/markdown", "Line")
  @js.native
  open class Line ()
    extends typings.lezerMarkdown.distMarkdownMod.Line
  
  @JSImport("@lezer/markdown", "MarkdownParser")
  @js.native
  open class MarkdownParser ()
    extends typings.lezerMarkdown.distMarkdownMod.MarkdownParser
  
  @JSImport("@lezer/markdown", "Strikethrough")
  @js.native
  val Strikethrough: MarkdownConfig = js.native
  
  @JSImport("@lezer/markdown", "Subscript")
  @js.native
  val Subscript: MarkdownConfig = js.native
  
  @JSImport("@lezer/markdown", "Superscript")
  @js.native
  val Superscript: MarkdownConfig = js.native
  
  @JSImport("@lezer/markdown", "Table")
  @js.native
  val Table: MarkdownConfig = js.native
  
  @JSImport("@lezer/markdown", "TaskList")
  @js.native
  val TaskList: MarkdownConfig = js.native
  
  inline def parseCode(config: CodeParser): MarkdownExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("parseCode")(config.asInstanceOf[js.Any]).asInstanceOf[MarkdownExtension]
  
  @JSImport("@lezer/markdown", "parser")
  @js.native
  val parser: typings.lezerMarkdown.distMarkdownMod.MarkdownParser = js.native
}
