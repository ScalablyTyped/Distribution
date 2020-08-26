package typings.graphql.mod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.astMod.ASTNode
import typings.graphql.maybeMod.Maybe
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "GraphQLError")
@js.native
class GraphQLError protected ()
  extends typings.graphql.errorMod.GraphQLError {
  def this(
    message: String,
    nodes: js.UndefOr[Maybe[js.Array[ASTNode] | ASTNode]],
    source: js.UndefOr[Maybe[typings.graphql.sourceMod.Source]],
    positions: js.UndefOr[Maybe[js.Array[Double]]],
    path: js.UndefOr[Maybe[js.Array[String | Double]]],
    originalError: js.UndefOr[Maybe[Error]],
    extensions: js.UndefOr[Maybe[StringDictionary[_]]]
  ) = this()
}

