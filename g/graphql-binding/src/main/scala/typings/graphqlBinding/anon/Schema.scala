package typings.graphqlBinding.anon

import typings.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Schema extends js.Object {
  var schema: GraphQLSchema
}

object Schema {
  @scala.inline
  def apply(schema: GraphQLSchema): Schema = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema]
  }
}

