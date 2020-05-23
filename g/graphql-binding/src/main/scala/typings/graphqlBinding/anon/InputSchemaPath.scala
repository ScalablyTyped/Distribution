package typings.graphqlBinding.anon

import typings.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputSchemaPath extends js.Object {
  var inputSchemaPath: String
  var isDefaultExport: scala.Boolean
  var outputBindingPath: String
  var schema: GraphQLSchema
}

object InputSchemaPath {
  @scala.inline
  def apply(
    inputSchemaPath: String,
    isDefaultExport: scala.Boolean,
    outputBindingPath: String,
    schema: GraphQLSchema
  ): InputSchemaPath = {
    val __obj = js.Dynamic.literal(inputSchemaPath = inputSchemaPath.asInstanceOf[js.Any], isDefaultExport = isDefaultExport.asInstanceOf[js.Any], outputBindingPath = outputBindingPath.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputSchemaPath]
  }
}

