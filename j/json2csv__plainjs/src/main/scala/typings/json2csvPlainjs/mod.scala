package typings.json2csvPlainjs

import typings.json2csvPlainjs.srcBaseParserMod.Options
import typings.json2csvPlainjs.srcStreamParserMod.AsyncOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@json2csv/plainjs", "Parser")
  @js.native
  open class Parser ()
    extends typings.json2csvPlainjs.srcMod.Parser
  
  @JSImport("@json2csv/plainjs", "StreamParser")
  @js.native
  open class StreamParser ()
    extends typings.json2csvPlainjs.srcMod.StreamParser {
    def this(opts: Options) = this()
    def this(opts: Unit, asyncOpts: AsyncOptions) = this()
    def this(opts: Options, asyncOpts: AsyncOptions) = this()
  }
}
