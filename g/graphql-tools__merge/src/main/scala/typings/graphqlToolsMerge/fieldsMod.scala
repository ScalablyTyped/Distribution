package typings.graphqlToolsMerge

import typings.graphql.astMod.FieldDefinitionNode
import typings.graphql.astMod.InputValueDefinitionNode
import typings.graphqlToolsMerge.anon.Name
import typings.graphqlToolsMerge.mergeTypedefsMod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/merge/typedefs-mergers/fields", JSImport.Namespace)
@js.native
object fieldsMod extends js.Object {
  def mergeFields[T /* <: FieldDefinitionNode | InputValueDefinitionNode */](`type`: Name, f1: js.Array[T], f2: js.Array[T], config: Config): js.Array[T] = js.native
}

