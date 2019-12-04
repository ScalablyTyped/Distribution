package typings.javascriptDashObfuscator

import typings.javascriptDashObfuscator.estreeMod.Identifier
import typings.std.Map
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("javascript-obfuscator/src/types/node-transformers/TReplaceableIdentifiers", JSImport.Namespace)
@js.native
object srcTypesNodeDashTransformersTReplaceableIdentifiersMod extends js.Object {
  type TReplaceableIdentifiers = Map[Node, Map[String, js.Array[Identifier]]]
}

