package typings.graphqlToolsUtils

import typings.graphql.mod.GraphQLObjectType
import typings.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/utils/get-user-types-from-schema", JSImport.Namespace)
@js.native
object getUserTypesFromSchemaMod extends js.Object {
  def getUserTypesFromSchema(schema: GraphQLSchema): js.Array[GraphQLObjectType[_, _]] = js.native
}

