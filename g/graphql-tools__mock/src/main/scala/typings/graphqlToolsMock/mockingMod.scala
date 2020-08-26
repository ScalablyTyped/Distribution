package typings.graphqlToolsMock

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.definitionMod.GraphQLFieldResolver
import typings.graphql.definitionMod.GraphQLList
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsMock.typesMod.IMockOptions
import typings.graphqlToolsMock.typesMod.IMockServer
import typings.graphqlToolsMock.typesMod.IMockTypeFn
import typings.graphqlToolsMock.typesMod.IMocks
import typings.graphqlToolsUtils.interfacesMod.ITypeDefinitions
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/mock/mocking", JSImport.Namespace)
@js.native
object mockingMod extends js.Object {
  @js.native
  class MockList protected () extends js.Object {
    def this(length: js.Array[Double]) = this()
    /**
      * @param length Either the exact length of items to return or an inclusive
      * range of possible lengths.
      * @param mockFunction The function to call for each item in the list to
      * resolve it. It can return another MockList or a value.
      */
    def this(length: Double) = this()
    def this(length: js.Array[Double], mockFunction: GraphQLFieldResolver[_, _, StringDictionary[_]]) = this()
    def this(length: Double, mockFunction: GraphQLFieldResolver[_, _, StringDictionary[_]]) = this()
    val len: js.Any = js.native
    var randint: js.Any = js.native
    val wrappedFunction: js.Any = js.native
    /**
      * @internal
      */
    def mock(
      root: js.Any,
      args: Record[String, _],
      context: js.Any,
      info: GraphQLResolveInfo,
      fieldType: GraphQLList[_],
      mockTypeFunc: IMockTypeFn
    ): js.Array[_] = js.native
  }
  
  def addMocksToSchema(hasSchemaMocksPreserveResolvers: IMockOptions): GraphQLSchema = js.native
  def isMockList(obj: js.Any): /* is @graphql-tools/mock.@graphql-tools/mock/mocking.MockList */ Boolean = js.native
  def mockServer(schema: GraphQLSchema, mocks: IMocks): IMockServer = js.native
  def mockServer(schema: GraphQLSchema, mocks: IMocks, preserveResolvers: Boolean): IMockServer = js.native
  def mockServer(schema: ITypeDefinitions, mocks: IMocks): IMockServer = js.native
  def mockServer(schema: ITypeDefinitions, mocks: IMocks, preserveResolvers: Boolean): IMockServer = js.native
}

