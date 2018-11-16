package typings
package graphqlDashToolsLib.distInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IAddResolveFunctionsToSchemaOptions extends js.Object {
  var inheritResolversFromInterfaces: js.UndefOr[scala.Boolean] = js.undefined
  var resolverValidationOptions: js.UndefOr[IResolverValidationOptions] = js.undefined
  var resolvers: IResolvers[_, _]
  var schema: graphqlLib.graphqlMod.GraphQLSchema
}

