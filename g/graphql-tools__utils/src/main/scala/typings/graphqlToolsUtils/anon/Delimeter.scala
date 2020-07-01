package typings.graphqlToolsUtils.anon

import typings.graphql.astMod.FieldNode
import typings.graphql.astMod.FragmentDefinitionNode
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delimeter extends js.Object {
  var delimeter: js.UndefOr[String] = js.undefined
  var fieldNames: js.UndefOr[js.Array[String]] = js.undefined
  var fieldNode: FieldNode
  var fragments: Record[String, FragmentDefinitionNode]
  var path: js.UndefOr[js.Array[String]] = js.undefined
}

object Delimeter {
  @scala.inline
  def apply(
    fieldNode: FieldNode,
    fragments: Record[String, FragmentDefinitionNode],
    delimeter: String = null,
    fieldNames: js.Array[String] = null,
    path: js.Array[String] = null
  ): Delimeter = {
    val __obj = js.Dynamic.literal(fieldNode = fieldNode.asInstanceOf[js.Any], fragments = fragments.asInstanceOf[js.Any])
    if (delimeter != null) __obj.updateDynamic("delimeter")(delimeter.asInstanceOf[js.Any])
    if (fieldNames != null) __obj.updateDynamic("fieldNames")(fieldNames.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delimeter]
  }
}

