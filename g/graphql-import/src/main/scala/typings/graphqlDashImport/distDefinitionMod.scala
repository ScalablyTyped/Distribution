package typings.graphqlDashImport

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.languageAstMod.DirectiveDefinitionNode
import typings.graphql.languageAstMod.TypeDefinitionNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-import/dist/definition", JSImport.Namespace)
@js.native
object distDefinitionMod extends js.Object {
  def completeDefinitionPool(
    allDefinitions: js.Array[ValidDefinitionNode],
    definitionPool: js.Array[ValidDefinitionNode],
    newTypeDefinitions: js.Array[ValidDefinitionNode]
  ): js.Array[ValidDefinitionNode] = js.native
  type DefinitionMap = StringDictionary[ValidDefinitionNode]
  type ValidDefinitionNode = DirectiveDefinitionNode | TypeDefinitionNode
}

