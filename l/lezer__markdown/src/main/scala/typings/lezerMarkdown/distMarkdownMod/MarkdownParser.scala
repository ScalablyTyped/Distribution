package typings.lezerMarkdown.distMarkdownMod

import typings.lezerCommon.mod.NodeSet
import typings.lezerCommon.mod.Parser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lezer/markdown/dist/markdown", "MarkdownParser")
@js.native
open class MarkdownParser () extends Parser {
  
  def configure(spec: MarkdownExtension): MarkdownParser = js.native
  
  val nodeSet: NodeSet = js.native
  
  def parseInline(text: String, offset: Double): js.Array[Any] = js.native
}
