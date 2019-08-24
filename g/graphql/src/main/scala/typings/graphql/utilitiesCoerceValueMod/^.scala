package typings.graphql.utilitiesCoerceValueMod

import typings.graphql.jsutilsPathMod.Path
import typings.graphql.languageAstMod.ASTNode
import typings.graphql.typeDefinitionMod.GraphQLInputType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/coerceValue", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def coerceValue(inputValue: js.Any, `type`: GraphQLInputType): CoercedValue = js.native
  def coerceValue(inputValue: js.Any, `type`: GraphQLInputType, blameNode: ASTNode): CoercedValue = js.native
  def coerceValue(inputValue: js.Any, `type`: GraphQLInputType, blameNode: ASTNode, path: Path): CoercedValue = js.native
}

