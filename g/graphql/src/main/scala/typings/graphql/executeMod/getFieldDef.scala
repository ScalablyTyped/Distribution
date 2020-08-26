package typings.graphql.executeMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.definitionMod.GraphQLField
import typings.graphql.definitionMod.GraphQLObjectType
import typings.graphql.maybeMod.Maybe
import typings.graphql.schemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/execution/execute", "getFieldDef")
@js.native
object getFieldDef extends js.Object {
  def apply(schema: GraphQLSchema, parentType: GraphQLObjectType[_, _], fieldName: String): Maybe[GraphQLField[_, _, StringDictionary[_]]] = js.native
}

