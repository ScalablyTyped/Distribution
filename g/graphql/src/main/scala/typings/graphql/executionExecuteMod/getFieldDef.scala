package typings.graphql.executionExecuteMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.tsutilsMaybeMod.Maybe
import typings.graphql.typeDefinitionMod.GraphQLField
import typings.graphql.typeDefinitionMod.GraphQLObjectType
import typings.graphql.typeSchemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/execution/execute", "getFieldDef")
@js.native
object getFieldDef extends js.Object {
  def apply(schema: GraphQLSchema, parentType: GraphQLObjectType[_, _, StringDictionary[_]], fieldName: String): Maybe[GraphQLField[_, _, StringDictionary[_]]] = js.native
}

