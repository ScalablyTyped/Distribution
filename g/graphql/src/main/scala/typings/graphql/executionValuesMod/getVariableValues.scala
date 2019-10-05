package typings.graphql.executionValuesMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.Anon_MaxErrors
import typings.graphql.languageAstMod.VariableDefinitionNode
import typings.graphql.typeSchemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/execution/values", "getVariableValues")
@js.native
object getVariableValues extends js.Object {
  def apply(
    schema: GraphQLSchema,
    varDefNodes: js.Array[VariableDefinitionNode],
    inputs: StringDictionary[js.Any]
  ): CoercedVariableValues = js.native
  def apply(
    schema: GraphQLSchema,
    varDefNodes: js.Array[VariableDefinitionNode],
    inputs: StringDictionary[js.Any],
    options: Anon_MaxErrors
  ): CoercedVariableValues = js.native
}

