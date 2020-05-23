package typings.graphqlTools.interfacesMod

import typings.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMockOptions extends js.Object {
  var mocks: js.UndefOr[IMocks] = js.undefined
  var preserveResolvers: js.UndefOr[Boolean] = js.undefined
  var schema: GraphQLSchema
}

object IMockOptions {
  @scala.inline
  def apply(schema: GraphQLSchema, mocks: IMocks = null, preserveResolvers: js.UndefOr[Boolean] = js.undefined): IMockOptions = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    if (mocks != null) __obj.updateDynamic("mocks")(mocks.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveResolvers)) __obj.updateDynamic("preserveResolvers")(preserveResolvers.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMockOptions]
  }
}

