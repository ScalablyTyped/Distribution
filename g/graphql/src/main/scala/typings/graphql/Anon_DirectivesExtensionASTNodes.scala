package typings.graphql

import typings.graphql.languageAstMod.SchemaExtensionNode
import typings.graphql.typeDefinitionMod.GraphQLNamedType
import typings.graphql.typeDirectivesMod.GraphQLDirective
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DirectivesExtensionASTNodes extends js.Object {
  var directives: js.Array[GraphQLDirective]
  var extensionASTNodes: js.Array[SchemaExtensionNode]
  var types: js.Array[GraphQLNamedType]
}

object Anon_DirectivesExtensionASTNodes {
  @scala.inline
  def apply(
    directives: js.Array[GraphQLDirective],
    extensionASTNodes: js.Array[SchemaExtensionNode],
    types: js.Array[GraphQLNamedType]
  ): Anon_DirectivesExtensionASTNodes = {
    val __obj = js.Dynamic.literal(directives = directives, extensionASTNodes = extensionASTNodes, types = types)
  
    __obj.asInstanceOf[Anon_DirectivesExtensionASTNodes]
  }
}

