package typings.graphqlToolsMerge

import typings.graphql.astMod.EnumValueDefinitionNode
import typings.graphqlToolsMerge.mergeTypedefsMod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/merge/typedefs-mergers/enum-values", JSImport.Namespace)
@js.native
object enumValuesMod extends js.Object {
  def mergeEnumValues(
    first: js.Array[EnumValueDefinitionNode],
    second: js.Array[EnumValueDefinitionNode],
    config: Config
  ): js.Array[EnumValueDefinitionNode] = js.native
}

