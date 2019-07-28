package typings.graphql.typeDefinitionMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/type/definition", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val GraphQLList: _GraphQLList[GraphQLType] = js.native
  val GraphQLNonNull: _GraphQLNonNull[GraphQLNullableType] = js.native
  def assertAbstractType(`type`: js.Any): GraphQLAbstractType = js.native
  def assertCompositeType(`type`: js.Any): GraphQLCompositeType = js.native
  def assertEnumType(`type`: js.Any): GraphQLEnumType = js.native
  def assertInputObjectType(`type`: js.Any): GraphQLInputObjectType = js.native
  def assertInputType(`type`: js.Any): GraphQLInputType = js.native
  def assertInterfaceType(`type`: js.Any): GraphQLInterfaceType = js.native
  def assertLeafType(`type`: js.Any): GraphQLLeafType = js.native
  def assertListType(`type`: js.Any): typings.graphql.typeDefinitionMod.GraphQLList[_] = js.native
  def assertNamedType(`type`: js.Any): GraphQLNamedType = js.native
  def assertNonNullType(`type`: js.Any): typings.graphql.typeDefinitionMod.GraphQLNonNull[_] = js.native
  def assertNullableType(`type`: js.Any): GraphQLNullableType = js.native
  def assertObjectType(`type`: js.Any): GraphQLObjectType[_, _, StringDictionary[_]] = js.native
  def assertOutputType(`type`: js.Any): GraphQLOutputType = js.native
  def assertScalarType(`type`: js.Any): GraphQLScalarType = js.native
  def assertType(`type`: js.Any): GraphQLType = js.native
  def assertUnionType(`type`: js.Any): GraphQLUnionType = js.native
  def assertWrappingType(`type`: js.Any): GraphQLWrappingType = js.native
  def getNamedType(`type`: Unit): js.UndefOr[scala.Nothing] = js.native
  def getNamedType(`type`: GraphQLType): GraphQLNamedType = js.native
  def getNullableType(`type`: Unit): js.UndefOr[scala.Nothing] = js.native
  def getNullableType(`type`: GraphQLEnumType): GraphQLEnumType = js.native
  def getNullableType(`type`: GraphQLInputObjectType): GraphQLInputObjectType = js.native
  def getNullableType(`type`: GraphQLInterfaceType): GraphQLInterfaceType = js.native
  def getNullableType(`type`: GraphQLScalarType): GraphQLScalarType = js.native
  def getNullableType(`type`: GraphQLUnionType): GraphQLUnionType = js.native
  def getNullableType[T /* <: (GraphQLObjectType[_, _, StringDictionary[_]]) | typings.graphql.typeDefinitionMod.GraphQLList[_] */](`type`: T): T = js.native
  def getNullableType[T /* <: GraphQLNullableType */](`type`: typings.graphql.typeDefinitionMod.GraphQLNonNull[T]): T = js.native
  def isAbstractType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLAbstractType */ Boolean = js.native
  def isCompositeType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLCompositeType */ Boolean = js.native
  def isEnumType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLEnumType */ Boolean = js.native
  def isInputObjectType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLInputObjectType */ Boolean = js.native
  def isInputType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLInputType */ Boolean = js.native
  def isInterfaceType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLInterfaceType */ Boolean = js.native
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
  def isType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLType */ Boolean = js.native
  def isUnionType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLUnionType */ Boolean = js.native
  def isWrappingType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLWrappingType */ Boolean = js.native
}

