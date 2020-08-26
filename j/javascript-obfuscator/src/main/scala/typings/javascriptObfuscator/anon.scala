package typings.javascriptObfuscator

import org.scalablytyped.runtime.Instantiable2
import typings.acorn.anon.Call
import typings.acorn.mod.Node
import typings.acorn.mod.Options
import typings.acorn.mod.Parser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object anon extends js.Object {
  @js.native
  trait TypeofParser extends Instantiable2[/* options */ Options, /* input */ String, Parser] {
    def extend(
      plugins: (js.Function1[/* BaseParser */ typings.acorn.anon.TypeofParser, typings.acorn.anon.TypeofParser])*
    ): typings.acorn.anon.TypeofParser = js.native
    def parse(input: String): Node = js.native
    def parse(input: String, options: Options): Node = js.native
    def parseExpressionAt(input: String, pos: Double): Node = js.native
    def parseExpressionAt(input: String, pos: Double, options: Options): Node = js.native
    def tokenizer(input: String): Call = js.native
    def tokenizer(input: String, options: Options): Call = js.native
  }
  
}

