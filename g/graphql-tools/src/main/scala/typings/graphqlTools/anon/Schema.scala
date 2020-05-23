package typings.graphqlTools.anon

import typings.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Schema extends js.Object {
  var schema: js.UndefOr[GraphQLSchema] = js.undefined
}

object Schema {
  @scala.inline
  def apply(schema: GraphQLSchema = null): Schema = {
    val __obj = js.Dynamic.literal()
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema]
  }
}

