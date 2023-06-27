package typings.lezerMarkdown

import typings.lezerMarkdown.anon.CodeParser
import typings.lezerMarkdown.distMarkdownMod.MarkdownExtension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNestMod {
  
  @JSImport("@lezer/markdown/dist/nest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseCode(config: CodeParser): MarkdownExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("parseCode")(config.asInstanceOf[js.Any]).asInstanceOf[MarkdownExtension]
}
