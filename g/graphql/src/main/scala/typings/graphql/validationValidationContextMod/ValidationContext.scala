package typings.graphql.validationValidationContextMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.errorGraphQLErrorMod.GraphQLError
import typings.graphql.languageAstMod.DocumentNode
import typings.graphql.tsutilsMaybeMod.Maybe
import typings.graphql.typeDefinitionMod.GraphQLArgument
import typings.graphql.typeDefinitionMod.GraphQLCompositeType
import typings.graphql.typeDefinitionMod.GraphQLField
import typings.graphql.typeDefinitionMod.GraphQLInputType
import typings.graphql.typeDefinitionMod.GraphQLOutputType
import typings.graphql.typeDirectivesMod.GraphQLDirective
import typings.graphql.typeSchemaMod.GraphQLSchema
import typings.graphql.utilitiesTypeInfoMod.TypeInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/ValidationContext", "ValidationContext")
@js.native
class ValidationContext protected () extends ASTValidationContext {
  def this(schema: GraphQLSchema, ast: DocumentNode, typeInfo: TypeInfo) = this()
  def this(
    schema: GraphQLSchema,
    ast: DocumentNode,
    typeInfo: TypeInfo,
    onError: js.Function1[/* err */ GraphQLError, Unit]
  ) = this()
  def getArgument(): Maybe[GraphQLArgument] = js.native
  def getDirective(): Maybe[GraphQLDirective] = js.native
  def getFieldDef(): Maybe[GraphQLField[_, _, StringDictionary[_]]] = js.native
  def getInputType(): Maybe[GraphQLInputType] = js.native
  def getParentInputType(): Maybe[GraphQLInputType] = js.native
  def getParentType(): Maybe[GraphQLCompositeType] = js.native
  def getSchema(): GraphQLSchema = js.native
  def getType(): Maybe[GraphQLOutputType] = js.native
  def getVariableUsages(node: NodeWithSelectionSet): js.Array[VariableUsage] = js.native
}

