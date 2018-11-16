package typings
package graphqlDashToolsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/transforms/transformSchema", JSImport.Namespace)
@js.native
object distTransformsTransformSchemaMod extends js.Object {
  def default(
    targetSchema: graphqlLib.graphqlMod.GraphQLSchema,
    transforms: js.Array[graphqlDashToolsLib.distInterfacesMod.Transform]
  ): graphqlLib.graphqlMod.GraphQLSchema with graphqlDashToolsLib.Anon_Transforms = js.native
}

