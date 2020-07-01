package typings.graphqlToolsUtils

import typings.graphql.astMod.ArgumentNode
import typings.graphql.astMod.VariableDefinitionNode
import typings.graphql.definitionMod.GraphQLInputType
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/utils/updateArgument", JSImport.Namespace)
@js.native
object updateArgumentMod extends js.Object {
  def updateArgument(
    argName: String,
    argType: GraphQLInputType,
    argumentNodes: Record[String, ArgumentNode],
    variableDefinitionsMap: Record[String, VariableDefinitionNode],
    variableValues: Record[String, _],
    newArg: js.Any
  ): Unit = js.native
}

