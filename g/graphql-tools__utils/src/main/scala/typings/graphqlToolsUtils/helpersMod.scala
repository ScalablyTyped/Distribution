package typings.graphqlToolsUtils

import typings.graphql.astMod.ASTNode
import typings.graphqlToolsUtils.graphqlToolsUtilsNumbers.`-1`
import typings.graphqlToolsUtils.graphqlToolsUtilsNumbers.`0`
import typings.graphqlToolsUtils.graphqlToolsUtilsNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/utils/helpers", JSImport.Namespace)
@js.native
object helpersMod extends js.Object {
  def asArray[T](fns: T): js.Array[T] = js.native
  def asArray[T](fns: js.Array[T]): js.Array[T] = js.native
  def compareNodes(a: ASTNode, b: ASTNode): Double = js.native
  def compareNodes(a: ASTNode, b: ASTNode, customFn: js.Function2[/* a */ js.Any, /* b */ js.Any, Double]): Double = js.native
  def compareStrings[A, B](a: A, b: B): `0` | `1` | `-1` = js.native
  def isDocumentString(str: String): Boolean = js.native
  def isEqual[T](a: T, b: T): Boolean = js.native
  def isNotEqual[T](a: T, b: T): Boolean = js.native
  def isValidPath(str: String): Boolean = js.native
  def nodeToString(a: ASTNode): String = js.native
}

