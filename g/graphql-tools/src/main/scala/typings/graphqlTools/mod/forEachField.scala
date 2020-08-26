package typings.graphqlTools.mod

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.interfacesMod.IFieldIteratorFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools", "forEachField")
@js.native
object forEachField extends js.Object {
  def apply(schema: GraphQLSchema, fn: IFieldIteratorFn): Unit = js.native
}

