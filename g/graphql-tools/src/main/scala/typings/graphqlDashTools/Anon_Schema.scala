package typings.graphqlDashTools

import typings.graphql.graphqlMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Schema extends js.Object {
  var schema: js.UndefOr[GraphQLSchema] = js.undefined
}

object Anon_Schema {
  @scala.inline
  def apply(schema: GraphQLSchema = null): Anon_Schema = {
    val __obj = js.Dynamic.literal()
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Schema]
  }
}

