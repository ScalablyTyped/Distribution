package typings.graphqlToolsUtils

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.astMod.TypeNode
import typings.graphql.definitionMod.GraphQLInputType
import typings.graphql.definitionMod.GraphQLNamedType
import typings.graphql.definitionMod.GraphQLOutputType
import typings.graphql.definitionMod.GraphQLType
import typings.graphql.mod.GraphQLInputObjectType
import typings.graphql.mod.GraphQLInterfaceType
import typings.graphql.mod.GraphQLObjectType
import typings.graphqlToolsUtils.graphqlToolsUtilsStrings.`object`
import typings.graphqlToolsUtils.graphqlToolsUtilsStrings.input
import typings.graphqlToolsUtils.graphqlToolsUtilsStrings.interface
import typings.graphqlToolsUtils.graphqlToolsUtilsStrings.output
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/utils/stub", JSImport.Namespace)
@js.native
object stubMod extends js.Object {
  @JSName("createNamedStub")
  def createNamedStub_input(name: String, `type`: input): GraphQLInputObjectType = js.native
  @JSName("createNamedStub")
  def createNamedStub_interface(name: String, `type`: interface): GraphQLInterfaceType = js.native
  @JSName("createNamedStub")
  def createNamedStub_object(name: String, `type`: `object`): GraphQLObjectType[_, _, StringDictionary[_]] = js.native
  @JSName("createStub")
  def createStub_input(node: TypeNode, `type`: input): GraphQLInputType = js.native
  @JSName("createStub")
  def createStub_input_GraphQLType(node: TypeNode, `type`: input): GraphQLType = js.native
  @JSName("createStub")
  def createStub_output(node: TypeNode, `type`: output): GraphQLOutputType = js.native
  @JSName("createStub")
  def createStub_output_GraphQLType(node: TypeNode, `type`: output): GraphQLType = js.native
  def getBuiltInForStub(`type`: GraphQLNamedType): GraphQLNamedType = js.native
  def isNamedStub(`type`: GraphQLNamedType): Boolean = js.native
}

