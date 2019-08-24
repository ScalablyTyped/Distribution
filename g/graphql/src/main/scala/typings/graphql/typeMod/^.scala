package typings.graphql.typeMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.errorGraphQLErrorMod.GraphQLError
import typings.graphql.graphqlStrings.`No longer supported`
import typings.graphql.typeDefinitionMod.GraphQLAbstractType
import typings.graphql.typeDefinitionMod.GraphQLArgument
import typings.graphql.typeDefinitionMod.GraphQLCompositeType
import typings.graphql.typeDefinitionMod.GraphQLField
import typings.graphql.typeDefinitionMod.GraphQLInputField
import typings.graphql.typeDefinitionMod.GraphQLInputType
import typings.graphql.typeDefinitionMod.GraphQLLeafType
import typings.graphql.typeDefinitionMod.GraphQLNamedType
import typings.graphql.typeDefinitionMod.GraphQLNullableType
import typings.graphql.typeDefinitionMod.GraphQLOutputType
import typings.graphql.typeDefinitionMod.GraphQLType
import typings.graphql.typeDefinitionMod.GraphQLWrappingType
import typings.graphql.typeDefinitionMod._GraphQLList
import typings.graphql.typeDefinitionMod._GraphQLNonNull
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/type", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DEFAULT_DEPRECATION_REASON: `No longer supported` = js.native
  val GraphQLBoolean: typings.graphql.typeDefinitionMod.GraphQLScalarType = js.native
  val GraphQLDeprecatedDirective: typings.graphql.typeDirectivesMod.GraphQLDirective = js.native
  val GraphQLFloat: typings.graphql.typeDefinitionMod.GraphQLScalarType = js.native
  val GraphQLID: typings.graphql.typeDefinitionMod.GraphQLScalarType = js.native
  val GraphQLIncludeDirective: typings.graphql.typeDirectivesMod.GraphQLDirective = js.native
  val GraphQLInt: typings.graphql.typeDefinitionMod.GraphQLScalarType = js.native
  val GraphQLList: _GraphQLList[GraphQLType] = js.native
  val GraphQLNonNull: _GraphQLNonNull[GraphQLNullableType] = js.native
  val GraphQLSkipDirective: typings.graphql.typeDirectivesMod.GraphQLDirective = js.native
  val GraphQLString: typings.graphql.typeDefinitionMod.GraphQLScalarType = js.native
  val SchemaMetaFieldDef: GraphQLField[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val TypeMetaFieldDef: GraphQLField[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val TypeNameMetaFieldDef: GraphQLField[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val __Directive: typings.graphql.typeDefinitionMod.GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val __DirectiveLocation: typings.graphql.typeDefinitionMod.GraphQLEnumType = js.native
  val __EnumValue: typings.graphql.typeDefinitionMod.GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val __Field: typings.graphql.typeDefinitionMod.GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val __InputValue: typings.graphql.typeDefinitionMod.GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val __Schema: typings.graphql.typeDefinitionMod.GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val __Type: typings.graphql.typeDefinitionMod.GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val __TypeKind: typings.graphql.typeDefinitionMod.GraphQLEnumType = js.native
  val introspectionTypes: js.Array[GraphQLType] = js.native
  val specifiedDirectives: js.Array[typings.graphql.typeDirectivesMod.GraphQLDirective] = js.native
  val specifiedScalarTypes: js.Array[typings.graphql.typeDefinitionMod.GraphQLScalarType] = js.native
  def assertAbstractType(`type`: js.Any): GraphQLAbstractType = js.native
  def assertCompositeType(`type`: js.Any): GraphQLCompositeType = js.native
  def assertDirective(directive: js.Any): typings.graphql.typeDirectivesMod.GraphQLDirective = js.native
  def assertEnumType(`type`: js.Any): typings.graphql.typeDefinitionMod.GraphQLEnumType = js.native
  def assertInputObjectType(`type`: js.Any): typings.graphql.typeDefinitionMod.GraphQLInputObjectType = js.native
  def assertInputType(`type`: js.Any): GraphQLInputType = js.native
  def assertInterfaceType(`type`: js.Any): typings.graphql.typeDefinitionMod.GraphQLInterfaceType = js.native
  def assertLeafType(`type`: js.Any): GraphQLLeafType = js.native
  def assertListType(`type`: js.Any): typings.graphql.typeDefinitionMod.GraphQLList[_] = js.native
  def assertNamedType(`type`: js.Any): GraphQLNamedType = js.native
  def assertNonNullType(`type`: js.Any): typings.graphql.typeDefinitionMod.GraphQLNonNull[_] = js.native
  def assertNullableType(`type`: js.Any): GraphQLNullableType = js.native
  def assertObjectType(`type`: js.Any): typings.graphql.typeDefinitionMod.GraphQLObjectType[_, _, StringDictionary[_]] = js.native
  def assertOutputType(`type`: js.Any): GraphQLOutputType = js.native
  def assertScalarType(`type`: js.Any): typings.graphql.typeDefinitionMod.GraphQLScalarType = js.native
  def assertSchema(schema: js.Any): typings.graphql.typeSchemaMod.GraphQLSchema = js.native
  def assertType(`type`: js.Any): GraphQLType = js.native
  def assertUnionType(`type`: js.Any): typings.graphql.typeDefinitionMod.GraphQLUnionType = js.native
  def assertValidSchema(schema: typings.graphql.typeSchemaMod.GraphQLSchema): Unit = js.native
  def assertWrappingType(`type`: js.Any): GraphQLWrappingType = js.native
  def getNamedType(`type`: Unit): js.UndefOr[scala.Nothing] = js.native
  def getNamedType(`type`: GraphQLType): GraphQLNamedType = js.native
  def getNullableType(`type`: Unit): js.UndefOr[scala.Nothing] = js.native
  def getNullableType(`type`: typings.graphql.typeDefinitionMod.GraphQLEnumType): typings.graphql.typeDefinitionMod.GraphQLEnumType = js.native
  def getNullableType(`type`: typings.graphql.typeDefinitionMod.GraphQLInputObjectType): typings.graphql.typeDefinitionMod.GraphQLInputObjectType = js.native
  def getNullableType(`type`: typings.graphql.typeDefinitionMod.GraphQLInterfaceType): typings.graphql.typeDefinitionMod.GraphQLInterfaceType = js.native
  def getNullableType(`type`: typings.graphql.typeDefinitionMod.GraphQLScalarType): typings.graphql.typeDefinitionMod.GraphQLScalarType = js.native
  def getNullableType(`type`: typings.graphql.typeDefinitionMod.GraphQLUnionType): typings.graphql.typeDefinitionMod.GraphQLUnionType = js.native
  def getNullableType[T /* <: (typings.graphql.typeDefinitionMod.GraphQLObjectType[_, _, StringDictionary[_]]) | typings.graphql.typeDefinitionMod.GraphQLList[_] */](`type`: T): T = js.native
  def getNullableType[T /* <: GraphQLNullableType */](`type`: typings.graphql.typeDefinitionMod.GraphQLNonNull[T]): T = js.native
  def isAbstractType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLAbstractType */ Boolean = js.native
  def isCompositeType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLCompositeType */ Boolean = js.native
  def isDirective(directive: js.Any): /* is graphql.graphql/type/directives.GraphQLDirective */ Boolean = js.native
  def isEnumType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLEnumType */ Boolean = js.native
  def isInputObjectType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLInputObjectType */ Boolean = js.native
  def isInputType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLInputType */ Boolean = js.native
  def isInterfaceType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLInterfaceType */ Boolean = js.native
  def isIntrospectionType(`type`: js.Any): Boolean = js.native
  def isLeafType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLLeafType */ Boolean = js.native
  def isListType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLList<any> */ Boolean = js.native
  def isNamedType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLNamedType */ Boolean = js.native
  def isNonNullType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLNonNull<any> */ Boolean = js.native
  def isNullableType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLNullableType */ Boolean = js.native
  def isObjectType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLObjectType<any, any, {[key: string] : any}> */ Boolean = js.native
  def isOutputType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLOutputType */ Boolean = js.native
  def isRequiredArgument(arg: GraphQLArgument): Boolean = js.native
  def isRequiredInputField(field: GraphQLInputField): Boolean = js.native
  def isScalarType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLScalarType */ Boolean = js.native
  def isSchema(schema: js.Any): /* is graphql.graphql/type/schema.GraphQLSchema */ Boolean = js.native
  def isSpecifiedDirective(directive: js.Any): /* is graphql.graphql/type/directives.GraphQLDirective */ Boolean = js.native
  def isSpecifiedScalarType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLScalarType */ Boolean = js.native
  def isType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLType */ Boolean = js.native
  def isUnionType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLUnionType */ Boolean = js.native
  def isWrappingType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLWrappingType */ Boolean = js.native
  def validateSchema(schema: typings.graphql.typeSchemaMod.GraphQLSchema): js.Array[GraphQLError] = js.native
}

