package typings
package graphqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DirectivesExtensionASTNodes extends js.Object {
  var directives: js.Array[graphqlLib.typeDirectivesMod.GraphQLDirective]
  var extensionASTNodes: js.Array[graphqlLib.languageAstMod.SchemaExtensionNode]
  var types: js.Array[graphqlLib.typeDefinitionMod.GraphQLNamedType]
}

object Anon_DirectivesExtensionASTNodes {
  @scala.inline
  def apply(
    directives: js.Array[graphqlLib.typeDirectivesMod.GraphQLDirective],
    extensionASTNodes: js.Array[graphqlLib.languageAstMod.SchemaExtensionNode],
    types: js.Array[graphqlLib.typeDefinitionMod.GraphQLNamedType]
  ): Anon_DirectivesExtensionASTNodes = {
    val __obj = js.Dynamic.literal(directives = directives, extensionASTNodes = extensionASTNodes, types = types)
  
    __obj.asInstanceOf[Anon_DirectivesExtensionASTNodes]
  }
}

