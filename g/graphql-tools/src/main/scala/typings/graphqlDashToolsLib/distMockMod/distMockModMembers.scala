package typings
package graphqlDashToolsLib.distMockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/mock", JSImport.Namespace)
@js.native
object distMockModMembers extends js.Object {
  def addMockFunctionsToSchema(hasSchemaMocksPreserveResolvers: graphqlDashToolsLib.distInterfacesMod.IMockOptions): scala.Unit = js.native
  def mockServer(
    schema: graphqlDashToolsLib.distInterfacesMod.ITypeDefinitions,
    mocks: graphqlDashToolsLib.distInterfacesMod.IMocks
  ): graphqlDashToolsLib.distInterfacesMod.IMockServer = js.native
  def mockServer(
    schema: graphqlDashToolsLib.distInterfacesMod.ITypeDefinitions,
    mocks: graphqlDashToolsLib.distInterfacesMod.IMocks,
    preserveResolvers: scala.Boolean
  ): graphqlDashToolsLib.distInterfacesMod.IMockServer = js.native
  def mockServer(schema: graphqlLib.graphqlMod.GraphQLSchema, mocks: graphqlDashToolsLib.distInterfacesMod.IMocks): graphqlDashToolsLib.distInterfacesMod.IMockServer = js.native
  def mockServer(
    schema: graphqlLib.graphqlMod.GraphQLSchema,
    mocks: graphqlDashToolsLib.distInterfacesMod.IMocks,
    preserveResolvers: scala.Boolean
  ): graphqlDashToolsLib.distInterfacesMod.IMockServer = js.native
}

