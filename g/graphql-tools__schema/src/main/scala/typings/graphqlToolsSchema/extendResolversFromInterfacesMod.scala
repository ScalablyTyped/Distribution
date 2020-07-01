package typings.graphqlToolsSchema

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.interfacesMod.IResolvers
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/schema/extendResolversFromInterfaces", JSImport.Namespace)
@js.native
object extendResolversFromInterfacesMod extends js.Object {
  def extendResolversFromInterfaces(schema: GraphQLSchema, resolvers: IResolvers[_, _, Record[String, _], _]): IResolvers[_, _, Record[String, _], _] = js.native
}

