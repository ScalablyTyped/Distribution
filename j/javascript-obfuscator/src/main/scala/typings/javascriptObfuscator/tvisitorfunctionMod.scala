package typings.javascriptObfuscator

import typings.javascriptObfuscator.tvisitorresultMod.TVisitorResult
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("javascript-obfuscator/src/types/node-transformers/TVisitorFunction", JSImport.Namespace)
@js.native
object tvisitorfunctionMod extends js.Object {
  type TVisitorFunction = js.Function2[/* node */ Node, /* parentNode */ Node | Null, TVisitorResult]
}

