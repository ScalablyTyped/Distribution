package typings.graphqlToolsUtils

import typings.graphql.astMod.FieldNode
import typings.graphqlToolsUtils.anon.Delimeter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/utils/fieldNodes", JSImport.Namespace)
@js.native
object fieldNodesMod extends js.Object {
  def hoistFieldNodes(hasFieldNodeFieldNamesPathDelimeterFragments: Delimeter): js.Array[FieldNode] = js.native
  def preAliasFieldNode(fieldNode: FieldNode, str: String): FieldNode = js.native
  def renameFieldNode(fieldNode: FieldNode, name: String): FieldNode = js.native
  def wrapFieldNode(fieldNode: FieldNode, path: js.Array[String]): FieldNode = js.native
}

