package typings.graphqlBinding

import typings.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInputSchemaPath extends js.Object {
  var inputSchemaPath: String
  var isDefaultExport: Boolean
  var outputBindingPath: String
  var schema: GraphQLSchema
}

object AnonInputSchemaPath {
  @scala.inline
  def apply(
    inputSchemaPath: String,
    isDefaultExport: Boolean,
    outputBindingPath: String,
    schema: GraphQLSchema
  ): AnonInputSchemaPath = {
    val __obj = js.Dynamic.literal(inputSchemaPath = inputSchemaPath.asInstanceOf[js.Any], isDefaultExport = isDefaultExport.asInstanceOf[js.Any], outputBindingPath = outputBindingPath.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInputSchemaPath]
  }
}

