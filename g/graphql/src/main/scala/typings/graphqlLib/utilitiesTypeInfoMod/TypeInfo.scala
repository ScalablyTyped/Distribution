package typings
package graphqlLib.utilitiesTypeInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/TypeInfo", "TypeInfo")
@js.native
class TypeInfo protected () extends js.Object {
  def this(schema: graphqlLib.typeSchemaMod.GraphQLSchema) = this()
  def this(schema: graphqlLib.typeSchemaMod.GraphQLSchema, // NOTE: this experimental optional second parameter is only needed in order
  // to support non-spec-compliant codebases. You should never need to use it.
  // It may disappear in the future.
  getFieldDefFn: getFieldDef) = this()
  def this(schema: graphqlLib.typeSchemaMod.GraphQLSchema, // NOTE: this experimental optional second parameter is only needed in order
  // to support non-spec-compliant codebases. You should never need to use it.
  // It may disappear in the future.
  getFieldDefFn: getFieldDef, // Initial type may be provided in rare cases to facilitate traversals
  // beginning somewhere other than documents.
  initialType: graphqlLib.typeDefinitionMod.GraphQLType) = this()
  def enter(node: graphqlLib.languageAstMod.ASTNode): js.Any = js.native
  def getArgument(): graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.typeDefinitionMod.GraphQLArgument] = js.native
  def getDefaultValue(): graphqlLib.tsutilsMaybeMod.Maybe[_] = js.native
  def getDirective(): graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.typeDirectivesMod.GraphQLDirective] = js.native
  def getEnumValue(): graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.typeDefinitionMod.GraphQLEnumValue] = js.native
  def getFieldDef(): graphqlLib.typeDefinitionMod.GraphQLField[_, graphqlLib.tsutilsMaybeMod.Maybe[_], ScalablyTyped.runtime.StringDictionary[_]] = js.native
  def getInputType(): graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.typeDefinitionMod.GraphQLInputType] = js.native
  def getParentInputType(): graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.typeDefinitionMod.GraphQLInputType] = js.native
  def getParentType(): graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.typeDefinitionMod.GraphQLCompositeType] = js.native
  def getType(): graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.typeDefinitionMod.GraphQLOutputType] = js.native
  def leave(node: graphqlLib.languageAstMod.ASTNode): js.Any = js.native
}

