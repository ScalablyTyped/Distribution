package typings.graphqlDashTools

import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphqlDashTools.distInterfacesMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/transforms/transformSchema", JSImport.Namespace)
@js.native
object distTransformsTransformSchemaMod extends js.Object {
  def default(targetSchema: GraphQLSchema, transforms: js.Array[Transform]): GraphQLSchema with Anon_Transforms = js.native
}

