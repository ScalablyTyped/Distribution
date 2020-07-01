package typings.graphqlToolsUtils

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.interfacesMod.IFieldIteratorFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/utils/forEachField", JSImport.Namespace)
@js.native
object forEachFieldMod extends js.Object {
  def forEachField(schema: GraphQLSchema, fn: IFieldIteratorFn): Unit = js.native
}

