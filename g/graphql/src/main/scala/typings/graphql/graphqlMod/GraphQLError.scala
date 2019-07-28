package typings.graphql.graphqlMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.languageAstMod.ASTNode
import typings.graphql.tsutilsMaybeMod.Maybe
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
    nodes: js.UndefOr[ASTNode | js.Array[ASTNode]],
    source: js.UndefOr[Maybe[typings.graphql.languageSourceMod.Source]],
    positions: js.UndefOr[Maybe[js.Array[Double]]],
    path: js.UndefOr[Maybe[js.Array[Double | String]]],
    originalError: js.UndefOr[Maybe[Error]],
    extensions: js.UndefOr[Maybe[StringDictionary[_]]]
  ) = this()
}

