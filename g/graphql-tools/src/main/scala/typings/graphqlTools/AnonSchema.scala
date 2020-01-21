package typings.graphqlTools

import typings.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSchema extends js.Object {
  var schema: js.UndefOr[GraphQLSchema] = js.undefined
}

object AnonSchema {
  @scala.inline
  def apply(schema: GraphQLSchema = null): AnonSchema = {
    val __obj = js.Dynamic.literal()
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSchema]
  }
}

