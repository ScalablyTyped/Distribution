package typings.graphqlToolsUtils.anon

import typings.graphql.astMod.OperationTypeNode
import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.buildOperationForFieldMod.Ignore
import typings.graphqlToolsUtils.buildOperationForFieldMod.SelectedFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgNames extends js.Object {
  var argNames: js.UndefOr[js.Array[String]] = js.undefined
  var circularReferenceDepth: js.UndefOr[Double] = js.undefined
  var depthLimit: js.UndefOr[Double] = js.undefined
  var field: String
  var ignore: js.UndefOr[Ignore] = js.undefined
  var kind: OperationTypeNode
  var models: js.UndefOr[js.Array[String]] = js.undefined
  var schema: GraphQLSchema
  var selectedFields: js.UndefOr[SelectedFields] = js.undefined
}

object ArgNames {
  @scala.inline
  def apply(
    field: String,
    kind: OperationTypeNode,
    schema: GraphQLSchema,
    argNames: js.Array[String] = null,
    circularReferenceDepth: js.UndefOr[Double] = js.undefined,
    depthLimit: js.UndefOr[Double] = js.undefined,
    ignore: Ignore = null,
    models: js.Array[String] = null,
    selectedFields: SelectedFields = null
  ): ArgNames = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    if (argNames != null) __obj.updateDynamic("argNames")(argNames.asInstanceOf[js.Any])
    if (!js.isUndefined(circularReferenceDepth)) __obj.updateDynamic("circularReferenceDepth")(circularReferenceDepth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(depthLimit)) __obj.updateDynamic("depthLimit")(depthLimit.get.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (models != null) __obj.updateDynamic("models")(models.asInstanceOf[js.Any])
    if (selectedFields != null) __obj.updateDynamic("selectedFields")(selectedFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgNames]
  }
}

