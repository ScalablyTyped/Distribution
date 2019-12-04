package typings.graphqlDashBinding

import typings.graphql.graphqlMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InputSchemaPath extends js.Object {
  var inputSchemaPath: String
  var isDefaultExport: Boolean
  var outputBindingPath: String
  var schema: GraphQLSchema
}

object Anon_InputSchemaPath {
  @scala.inline
  def apply(
    inputSchemaPath: String,
    isDefaultExport: Boolean,
    outputBindingPath: String,
    schema: GraphQLSchema
  ): Anon_InputSchemaPath = {
    val __obj = js.Dynamic.literal(inputSchemaPath = inputSchemaPath.asInstanceOf[js.Any], isDefaultExport = isDefaultExport.asInstanceOf[js.Any], outputBindingPath = outputBindingPath.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_InputSchemaPath]
  }
}

