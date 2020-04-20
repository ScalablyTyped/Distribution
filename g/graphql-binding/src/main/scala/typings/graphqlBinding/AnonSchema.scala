package typings.graphqlBinding

import typings.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSchema extends js.Object {
  var schema: GraphQLSchema
}

object AnonSchema {
  @scala.inline
  def apply(schema: GraphQLSchema): AnonSchema = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSchema]
  }
}

