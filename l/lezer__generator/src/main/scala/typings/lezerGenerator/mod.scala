package typings.lezerGenerator

import typings.lezerGenerator.anon.Parser
import typings.lezerGenerator.distBuildMod.BuildOptions
import typings.lezerLr.mod.LRParser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@lezer/generator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@lezer/generator", "GenError")
  @js.native
  open class GenError ()
    extends typings.lezerGenerator.distErrorMod.GenError
  
  inline def buildParser(text: String): LRParser = ^.asInstanceOf[js.Dynamic].applyDynamic("buildParser")(text.asInstanceOf[js.Any]).asInstanceOf[LRParser]
  inline def buildParser(text: String, options: BuildOptions): LRParser = (^.asInstanceOf[js.Dynamic].applyDynamic("buildParser")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LRParser]
  
  inline def buildParserFile(text: String): Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("buildParserFile")(text.asInstanceOf[js.Any]).asInstanceOf[Parser]
  inline def buildParserFile(text: String, options: BuildOptions): Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("buildParserFile")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Parser]
}
