package typings.json2csvNode

import typings.json2csvPlainjs.srcStreamParserMod.Options
import typings.node.nodeColonstreamMod.Stream
import typings.node.streamMod.TransformOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcAsyncParserMod {
  
  @JSImport("@json2csv/node/src/AsyncParser", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with JSON2CSVNodeAsyncParser {
    def this(opts: Options) = this()
    def this(opts: Unit, transformOpts: TransformOptions) = this()
    def this(opts: Options, transformOpts: TransformOptions) = this()
  }
  
  @js.native
  trait JSON2CSVNodeAsyncParser extends StObject {
    
    var opts: js.UndefOr[Options] = js.native
    
    def parse(data: String): typings.json2csvNode.srcTransformMod.default = js.native
    def parse(data: js.Object): typings.json2csvNode.srcTransformMod.default = js.native
    def parse(data: Stream): typings.json2csvNode.srcTransformMod.default = js.native
    
    var transformOpts: js.UndefOr[TransformOptions] = js.native
  }
}
