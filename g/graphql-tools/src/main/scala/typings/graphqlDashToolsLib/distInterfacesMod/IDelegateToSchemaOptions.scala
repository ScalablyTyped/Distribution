package typings
package graphqlDashToolsLib.distInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IDelegateToSchemaOptions[TContext] extends js.Object {
  var args: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var context: TContext
  var fieldName: java.lang.String
  var info: IGraphQLToolsResolveInfo
  var operation: Operation
  var schema: graphqlLib.graphqlMod.GraphQLSchema
  var skipValidation: js.UndefOr[scala.Boolean] = js.undefined
  var transforms: js.UndefOr[js.Array[Transform]] = js.undefined
}

