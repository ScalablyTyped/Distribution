package typings.graphql.validationContextMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.astMod.DocumentNode
import typings.graphql.definitionMod.GraphQLArgument
import typings.graphql.definitionMod.GraphQLCompositeType
import typings.graphql.definitionMod.GraphQLEnumValue
import typings.graphql.definitionMod.GraphQLField
import typings.graphql.definitionMod.GraphQLInputType
import typings.graphql.definitionMod.GraphQLOutputType
import typings.graphql.directivesMod.GraphQLDirective
import typings.graphql.graphQLErrorMod.GraphQLError
import typings.graphql.maybeMod.Maybe
import typings.graphql.schemaMod.GraphQLSchema
import typings.graphql.typeInfoMod.TypeInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/ValidationContext", "ValidationContext")
@js.native
class ValidationContext protected () extends ASTValidationContext {
  def this(
    schema: GraphQLSchema,
    ast: DocumentNode,
    typeInfo: TypeInfo,
    onError: js.Function1[/* err */ GraphQLError, Unit]
  ) = this()
  def getArgument(): Maybe[GraphQLArgument] = js.native
  def getDirective(): Maybe[GraphQLDirective] = js.native
  def getEnumValue(): Maybe[GraphQLEnumValue] = js.native
  def getFieldDef(): Maybe[GraphQLField[_, _, StringDictionary[_]]] = js.native
  def getInputType(): Maybe[GraphQLInputType] = js.native
  def getParentInputType(): Maybe[GraphQLInputType] = js.native
  def getParentType(): Maybe[GraphQLCompositeType] = js.native
  def getSchema(): GraphQLSchema = js.native
  def getType(): Maybe[GraphQLOutputType] = js.native
  def getVariableUsages(node: NodeWithSelectionSet): js.Array[VariableUsage] = js.native
}

