package typings.graphql

import typings.graphql.astMod.ASTNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/language/printer", JSImport.Namespace)
@js.native
object printerMod extends js.Object {
  def print(ast: ASTNode): String = js.native
}

