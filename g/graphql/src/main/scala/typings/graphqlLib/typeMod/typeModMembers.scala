package typings
package graphqlLib.typeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/type", JSImport.Namespace)
@js.native
object typeModMembers extends js.Object {
  val DEFAULT_DEPRECATION_REASON: graphqlLib.graphqlLibStrings.`No longer supported` = js.native
  val GraphQLBoolean: graphqlLib.typeDefinitionMod.GraphQLScalarType = js.native
  val GraphQLDeprecatedDirective: graphqlLib.typeDirectivesMod.GraphQLDirective = js.native
  val GraphQLFloat: graphqlLib.typeDefinitionMod.GraphQLScalarType = js.native
  val GraphQLID: graphqlLib.typeDefinitionMod.GraphQLScalarType = js.native
  val GraphQLIncludeDirective: graphqlLib.typeDirectivesMod.GraphQLDirective = js.native
  val GraphQLInt: graphqlLib.typeDefinitionMod.GraphQLScalarType = js.native
  val GraphQLList: graphqlLib.typeDefinitionMod._GraphQLList[graphqlLib.typeDefinitionMod.GraphQLType] = js.native
  val GraphQLNonNull: graphqlLib.typeDefinitionMod._GraphQLNonNull[graphqlLib.typeDefinitionMod.GraphQLNullableType] = js.native
  val GraphQLSkipDirective: graphqlLib.typeDirectivesMod.GraphQLDirective = js.native
  val GraphQLString: graphqlLib.typeDefinitionMod.GraphQLScalarType = js.native
  val SchemaMetaFieldDef: graphqlLib.typeDefinitionMod.GraphQLField[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]] = js.native
  val TypeKind: graphqlLib.Anon_ENUM = js.native
  val TypeMetaFieldDef: graphqlLib.typeDefinitionMod.GraphQLField[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]] = js.native
  val TypeNameMetaFieldDef: graphqlLib.typeDefinitionMod.GraphQLField[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]] = js.native
  val __Directive: graphqlLib.typeDefinitionMod.GraphQLObjectType = js.native
  val __DirectiveLocation: graphqlLib.typeDefinitionMod.GraphQLEnumType = js.native
  val __EnumValue: graphqlLib.typeDefinitionMod.GraphQLObjectType = js.native
  val __Field: graphqlLib.typeDefinitionMod.GraphQLObjectType = js.native
  val __InputValue: graphqlLib.typeDefinitionMod.GraphQLObjectType = js.native
  val __Schema: graphqlLib.typeDefinitionMod.GraphQLObjectType = js.native
  val __Type: graphqlLib.typeDefinitionMod.GraphQLObjectType = js.native
  val __TypeKind: graphqlLib.typeDefinitionMod.GraphQLEnumType = js.native
  val introspectionTypes: js.Array[js.Any] = js.native
  val specifiedDirectives: js.Array[graphqlLib.typeDirectivesMod.GraphQLDirective] = js.native
  val specifiedScalarTypes: js.Array[graphqlLib.typeDefinitionMod.GraphQLScalarType] = js.native
  def assertAbstractType(`type`: js.Any): graphqlLib.typeDefinitionMod.GraphQLAbstractType = js.native
  def assertCompositeType(`type`: js.Any): graphqlLib.typeDefinitionMod.GraphQLCompositeType = js.native
  def assertEnumType(`type`: js.Any): graphqlLib.typeDefinitionMod.GraphQLEnumType = js.native
  def assertInputObjectType(`type`: js.Any): graphqlLib.typeDefinitionMod.GraphQLInputObjectType = js.native
  def assertInputType(`type`: js.Any): graphqlLib.typeDefinitionMod.GraphQLInputType = js.native
  def assertInterfaceType(`type`: js.Any): graphqlLib.typeDefinitionMod.GraphQLInterfaceType = js.native
  def assertLeafType(`type`: js.Any): graphqlLib.typeDefinitionMod.GraphQLLeafType = js.native
  def assertListType(`type`: js.Any): graphqlLib.typeDefinitionMod.GraphQLList[_] = js.native
  def assertNamedType(`type`: js.Any): graphqlLib.typeDefinitionMod.GraphQLNamedType = js.native
  def assertNonNullType(`type`: js.Any): graphqlLib.typeDefinitionMod.GraphQLNonNull[_] = js.native
  def assertNullableType(`type`: js.Any): graphqlLib.typeDefinitionMod.GraphQLNullableType = js.native
  def assertObjectType(`type`: js.Any): graphqlLib.typeDefinitionMod.GraphQLObjectType = js.native
  def assertOutputType(`type`: js.Any): graphqlLib.typeDefinitionMod.GraphQLOutputType = js.native
  def assertScalarType(`type`: js.Any): graphqlLib.typeDefinitionMod.GraphQLScalarType = js.native
  def assertType(`type`: js.Any): graphqlLib.typeDefinitionMod.GraphQLType = js.native
  def assertUnionType(`type`: js.Any): graphqlLib.typeDefinitionMod.GraphQLUnionType = js.native
  def assertValidSchema(schema: graphqlLib.typeSchemaMod.GraphQLSchema): scala.Unit = js.native
  def assertWrappingType(`type`: js.Any): graphqlLib.typeDefinitionMod.GraphQLWrappingType = js.native
  def getNamedType(`type`: graphqlLib.typeDefinitionMod.GraphQLType): graphqlLib.typeDefinitionMod.GraphQLNamedType = js.native
  def getNamedType(`type`: scala.Unit): js.UndefOr[scala.Nothing] = js.native
  def getNullableType(`type`: scala.Unit): js.UndefOr[scala.Nothing] = js.native
  def getNullableType[T /* <: graphqlLib.typeDefinitionMod.GraphQLNullableType */](`type`: T): T = js.native
  def getNullableType[T /* <: graphqlLib.typeDefinitionMod.GraphQLNullableType */](`type`: graphqlLib.typeDefinitionMod.GraphQLNonNull[T]): T = js.native
  def isAbstractType(`type`: js.Any): /* is GraphQLAbstractType */scala.Boolean = js.native
  def isCompositeType(`type`: js.Any): /* is GraphQLCompositeType */scala.Boolean = js.native
  def isDirective(directive: js.Any): /* is GraphQLDirective */scala.Boolean = js.native
  def isEnumType(`type`: js.Any): /* is GraphQLEnumType */scala.Boolean = js.native
  def isInputObjectType(`type`: js.Any): /* is GraphQLInputObjectType */scala.Boolean = js.native
  def isInputType(`type`: js.Any): /* is GraphQLInputType */scala.Boolean = js.native
  def isInterfaceType(`type`: js.Any): /* is GraphQLInterfaceType */scala.Boolean = js.native
  def isIntrospectionType(`type`: js.Any): scala.Boolean = js.native
  def isLeafType(`type`: js.Any): /* is GraphQLLeafType */scala.Boolean = js.native
  def isListType(`type`: js.Any): /* is GraphQLList */scala.Boolean = js.native
  def isNamedType(`type`: js.Any): /* is GraphQLNamedType */scala.Boolean = js.native
  def isNonNullType(`type`: js.Any): /* is GraphQLNonNull */scala.Boolean = js.native
  def isNullableType(`type`: js.Any): /* is GraphQLNullableType */scala.Boolean = js.native
  def isObjectType(`type`: js.Any): /* is GraphQLObjectType */scala.Boolean = js.native
  def isOutputType(`type`: js.Any): /* is GraphQLOutputType */scala.Boolean = js.native
  def isRequiredArgument(arg: graphqlLib.typeDefinitionMod.GraphQLArgument): scala.Boolean = js.native
  def isRequiredInputField(field: graphqlLib.typeDefinitionMod.GraphQLInputField): scala.Boolean = js.native
  def isScalarType(`type`: js.Any): /* is GraphQLScalarType */scala.Boolean = js.native
  def isSchema(schema: js.Any): /* is GraphQLSchema */scala.Boolean = js.native
  def isSpecifiedDirective(directive: graphqlLib.typeDirectivesMod.GraphQLDirective): scala.Boolean = js.native
  def isSpecifiedScalarType(`type`: graphqlLib.typeDefinitionMod.GraphQLScalarType): scala.Boolean = js.native
  def isType(`type`: js.Any): /* is GraphQLType */scala.Boolean = js.native
  def isUnionType(`type`: js.Any): /* is GraphQLUnionType */scala.Boolean = js.native
  def isWrappingType(`type`: js.Any): /* is GraphQLWrappingType */scala.Boolean = js.native
  def validateSchema(schema: graphqlLib.typeSchemaMod.GraphQLSchema): js.Array[graphqlLib.errorGraphQLErrorMod.GraphQLError] = js.native
}

