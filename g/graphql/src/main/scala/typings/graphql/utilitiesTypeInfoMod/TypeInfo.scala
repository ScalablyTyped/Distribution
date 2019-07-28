package typings.graphql.utilitiesTypeInfoMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.languageAstMod.ASTNode
import typings.graphql.tsutilsMaybeMod.Maybe
import typings.graphql.typeDefinitionMod.GraphQLArgument
import typings.graphql.typeDefinitionMod.GraphQLCompositeType
import typings.graphql.typeDefinitionMod.GraphQLEnumValue
import typings.graphql.typeDefinitionMod.GraphQLField
import typings.graphql.typeDefinitionMod.GraphQLInputType
import typings.graphql.typeDefinitionMod.GraphQLOutputType
import typings.graphql.typeDefinitionMod.GraphQLType
import typings.graphql.typeDirectivesMod.GraphQLDirective
import typings.graphql.typeSchemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/TypeInfo", "TypeInfo")
@js.native
class TypeInfo protected () extends js.Object {
  def this(schema: GraphQLSchema) = this()
  def this(
    schema: GraphQLSchema,
    // NOTE: this experimental optional second parameter is only needed in order
  // to support non-spec-compliant codebases. You should never need to use it.
  // It may disappear in the future.
  getFieldDefFn: getFieldDef
  ) = this()
  def this(
    schema: GraphQLSchema,
    // NOTE: this experimental optional second parameter is only needed in order
  // to support non-spec-compliant codebases. You should never need to use it.
  // It may disappear in the future.
  getFieldDefFn: getFieldDef,
    // Initial type may be provided in rare cases to facilitate traversals
  // beginning somewhere other than documents.
  initialType: GraphQLType
  ) = this()
  def enter(node: ASTNode): js.Any = js.native
  def getArgument(): Maybe[GraphQLArgument] = js.native
  def getDefaultValue(): Maybe[_] = js.native
  def getDirective(): Maybe[GraphQLDirective] = js.native
  def getEnumValue(): Maybe[GraphQLEnumValue] = js.native
  def getFieldDef(): GraphQLField[_, Maybe[_], StringDictionary[_]] = js.native
  def getInputType(): Maybe[GraphQLInputType] = js.native
  def getParentInputType(): Maybe[GraphQLInputType] = js.native
  def getParentType(): Maybe[GraphQLCompositeType] = js.native
  def getType(): Maybe[GraphQLOutputType] = js.native
  def leave(node: ASTNode): js.Any = js.native
}

