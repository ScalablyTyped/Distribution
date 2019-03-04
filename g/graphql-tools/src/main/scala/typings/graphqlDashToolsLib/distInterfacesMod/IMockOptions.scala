package typings
package graphqlDashToolsLib.distInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMockOptions extends js.Object {
  var mocks: js.UndefOr[IMocks] = js.undefined
  var preserveResolvers: js.UndefOr[scala.Boolean] = js.undefined
  var schema: graphqlLib.graphqlMod.GraphQLSchema
}

object IMockOptions {
  @scala.inline
  def apply(
    schema: graphqlLib.graphqlMod.GraphQLSchema,
    mocks: IMocks = null,
    preserveResolvers: js.UndefOr[scala.Boolean] = js.undefined
  ): IMockOptions = {
    val __obj = js.Dynamic.literal(schema = schema)
    if (mocks != null) __obj.updateDynamic("mocks")(mocks)
    if (!js.isUndefined(preserveResolvers)) __obj.updateDynamic("preserveResolvers")(preserveResolvers)
    __obj.asInstanceOf[IMockOptions]
  }
}

