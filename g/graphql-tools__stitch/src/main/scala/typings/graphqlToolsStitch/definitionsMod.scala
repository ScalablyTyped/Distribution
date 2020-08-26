package typings.graphqlToolsStitch

import typings.graphql.astMod.DocumentNode
import typings.graphql.astMod.SchemaDefinitionNode
import typings.graphql.astMod.SchemaExtensionNode
import typings.graphqlToolsStitch.anon.Definitions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/stitch/definitions", JSImport.Namespace)
@js.native
object definitionsMod extends js.Object {
  def extractDirectiveDefinitions(ast: DocumentNode): Definitions = js.native
  def extractSchemaDefinition(ast: DocumentNode): SchemaDefinitionNode = js.native
  def extractSchemaExtensions(ast: DocumentNode): js.Array[SchemaExtensionNode] = js.native
  def extractTypeDefinitions(ast: DocumentNode): Definitions = js.native
  def extractTypeExtensionDefinitions(ast: DocumentNode): Definitions = js.native
}

