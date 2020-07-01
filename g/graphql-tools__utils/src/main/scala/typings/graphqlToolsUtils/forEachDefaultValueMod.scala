package typings.graphqlToolsUtils

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.interfacesMod.IDefaultValueIteratorFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/utils/forEachDefaultValue", JSImport.Namespace)
@js.native
object forEachDefaultValueMod extends js.Object {
  def forEachDefaultValue(schema: GraphQLSchema, fn: IDefaultValueIteratorFn): Unit = js.native
}

