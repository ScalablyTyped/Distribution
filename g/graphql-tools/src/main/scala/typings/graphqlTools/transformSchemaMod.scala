package typings.graphqlTools

import typings.graphql.mod.GraphQLSchema
import typings.graphqlTools.interfacesMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/transforms/transformSchema", JSImport.Namespace)
@js.native
object transformSchemaMod extends js.Object {
  def default(targetSchema: GraphQLSchema, transforms: js.Array[Transform]): GraphQLSchema with AnonTransforms = js.native
}

