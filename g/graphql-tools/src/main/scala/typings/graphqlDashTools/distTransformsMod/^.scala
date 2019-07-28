package typings.graphqlDashTools.distTransformsMod

import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphqlDashTools.Anon_Transforms
import typings.graphqlDashTools.distInterfacesMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/transforms", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def transformSchema(targetSchema: GraphQLSchema, transforms: js.Array[Transform]): GraphQLSchema with Anon_Transforms = js.native
}

