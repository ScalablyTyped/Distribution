package typings.graphqlToolsCodeFileLoader

import typings.graphql.astMod.DocumentNode
import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsCodeFileLoader.anon.Filepath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/code-file-loader/exports", JSImport.Namespace)
@js.native
object exportsMod extends js.Object {
  def pickExportFromModule(hasModuleFilepath: Filepath): js.Promise[DocumentNode | GraphQLSchema] = js.native
  def pickExportFromModuleSync(hasModuleFilepath: Filepath): DocumentNode | GraphQLSchema = js.native
}

