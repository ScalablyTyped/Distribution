package typings.hastUtilToNlcst

import typings.hastUtilToNlcst.libMod.HastNode
import typings.hastUtilToNlcst.libMod.NlcstRoot
import typings.hastUtilToNlcst.libMod.ParserConstructor
import typings.hastUtilToNlcst.libMod.ParserInstance
import typings.hastUtilToNlcst.libMod.VFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hast-util-to-nlcst", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toNlcst(tree: HastNode, file: VFile, Parser: ParserConstructor): NlcstRoot = (^.asInstanceOf[js.Dynamic].applyDynamic("toNlcst")(tree.asInstanceOf[js.Any], file.asInstanceOf[js.Any], Parser.asInstanceOf[js.Any])).asInstanceOf[NlcstRoot]
  inline def toNlcst(tree: HastNode, file: VFile, Parser: ParserInstance): NlcstRoot = (^.asInstanceOf[js.Dynamic].applyDynamic("toNlcst")(tree.asInstanceOf[js.Any], file.asInstanceOf[js.Any], Parser.asInstanceOf[js.Any])).asInstanceOf[NlcstRoot]
}
