package typings.graphqlTools

import typings.graphql.mod.GraphQLSchema
import typings.graphqlTools.interfacesMod.IFieldIteratorFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/generate/forEachField", JSImport.Namespace)
@js.native
object forEachFieldMod extends js.Object {
  def default(schema: GraphQLSchema, fn: IFieldIteratorFn): Unit = js.native
}

