package typings.graphqlTools

import typings.graphql.definitionMod.GraphQLType
import typings.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/implementsAbstractType", JSImport.Namespace)
@js.native
object implementsAbstractTypeMod extends js.Object {
  def default(schema: GraphQLSchema, typeA: GraphQLType, typeB: GraphQLType): Boolean = js.native
}

