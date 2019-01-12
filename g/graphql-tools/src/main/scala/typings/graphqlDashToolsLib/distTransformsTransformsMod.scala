package typings
package graphqlDashToolsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/transforms/transforms", JSImport.Namespace)
@js.native
object distTransformsTransformsMod extends js.Object {
  def applyRequestTransforms(
    originalRequest: graphqlDashToolsLib.distInterfacesMod.Request,
    transforms: js.Array[graphqlDashToolsLib.distInterfacesMod.Transform]
  ): graphqlDashToolsLib.distInterfacesMod.Request = js.native
  def applyResultTransforms(originalResult: js.Any, transforms: js.Array[graphqlDashToolsLib.distInterfacesMod.Transform]): js.Any = js.native
  def applySchemaTransforms(
    originalSchema: graphqlLib.graphqlMod.GraphQLSchema,
    transforms: js.Array[graphqlDashToolsLib.distInterfacesMod.Transform]
  ): graphqlLib.graphqlMod.GraphQLSchema = js.native
  def composeTransforms(transforms: graphqlDashToolsLib.distInterfacesMod.Transform*): graphqlDashToolsLib.distInterfacesMod.Transform = js.native
}

