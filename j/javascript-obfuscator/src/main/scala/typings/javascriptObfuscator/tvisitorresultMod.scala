package typings.javascriptObfuscator

import typings.estraverse.mod.VisitorOption
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("javascript-obfuscator/src/types/node-transformers/TVisitorResult", JSImport.Namespace)
@js.native
object tvisitorresultMod extends js.Object {
  type TVisitorResult = Node | VisitorOption | Unit
}

