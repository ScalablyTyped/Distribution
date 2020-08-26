package typings.graphqlTools.mod

import typings.graphql.astMod.DocumentNode
import typings.graphqlToolsUtils.interfacesMod.GraphQLParseOptions
import typings.graphqlToolsUtils.interfacesMod.ITypeDefinitions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools", "buildDocumentFromTypeDefinitions")
@js.native
object buildDocumentFromTypeDefinitions extends js.Object {
  def apply(typeDefinitions: ITypeDefinitions): DocumentNode = js.native
  def apply(typeDefinitions: ITypeDefinitions, parseOptions: GraphQLParseOptions): DocumentNode = js.native
}

