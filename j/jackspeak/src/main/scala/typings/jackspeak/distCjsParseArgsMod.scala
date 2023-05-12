package typings.jackspeak

import typings.node.utilMod.ParseArgsConfig
import typings.node.utilMod.ParsedResults
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsParseArgsMod {
  
  @JSImport("jackspeak/dist/cjs/parse-args", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseArgs[T /* <: ParseArgsConfig */](): ParsedResults[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")().asInstanceOf[ParsedResults[T]]
  inline def parseArgs[T /* <: ParseArgsConfig */](config: T): ParsedResults[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")(config.asInstanceOf[js.Any]).asInstanceOf[ParsedResults[T]]
}
