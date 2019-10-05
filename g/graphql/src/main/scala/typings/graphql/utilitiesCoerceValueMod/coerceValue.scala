package typings.graphql.utilitiesCoerceValueMod

import typings.graphql.jsutilsPathMod.Path
import typings.graphql.languageAstMod.ASTNode
import typings.graphql.typeDefinitionMod.GraphQLInputType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/coerceValue", "coerceValue")
@js.native
object coerceValue extends js.Object {
  def apply(inputValue: js.Any, `type`: GraphQLInputType): CoercedValue = js.native
  def apply(inputValue: js.Any, `type`: GraphQLInputType, blameNode: ASTNode): CoercedValue = js.native
  def apply(inputValue: js.Any, `type`: GraphQLInputType, blameNode: ASTNode, path: Path): CoercedValue = js.native
}

