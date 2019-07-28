package typings.graphqlDashApiDashKoa.graphqlDashApiDashKoaMod

import typings.graphql.graphqlMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecuteOptions extends js.Object {
  var contextValue: js.UndefOr[js.Any] = js.undefined
  var fieldResolver: js.UndefOr[js.Any] = js.undefined
  var rootValue: js.UndefOr[js.Any] = js.undefined
  var schema: js.UndefOr[GraphQLSchema] = js.undefined
}

object ExecuteOptions {
  @scala.inline
  def apply(
    contextValue: js.Any = null,
    fieldResolver: js.Any = null,
    rootValue: js.Any = null,
    schema: GraphQLSchema = null
  ): ExecuteOptions = {
    val __obj = js.Dynamic.literal()
    if (contextValue != null) __obj.updateDynamic("contextValue")(contextValue)
    if (fieldResolver != null) __obj.updateDynamic("fieldResolver")(fieldResolver)
    if (rootValue != null) __obj.updateDynamic("rootValue")(rootValue)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    __obj.asInstanceOf[ExecuteOptions]
  }
}

