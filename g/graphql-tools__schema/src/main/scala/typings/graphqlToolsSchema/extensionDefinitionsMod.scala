package typings.graphqlToolsSchema

import typings.graphql.astMod.DocumentNode
import typings.graphqlToolsSchema.anon.Definitions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/schema/extensionDefinitions", JSImport.Namespace)
@js.native
object extensionDefinitionsMod extends js.Object {
  def extractExtensionDefinitions(ast: DocumentNode): Definitions = js.native
  def filterExtensionDefinitions(ast: DocumentNode): Definitions = js.native
}

