package typings
package graphqlLib.errorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/error", "GraphQLError")
@js.native
class GraphQLError protected ()
  extends graphqlLib.errorGraphQLErrorMod.GraphQLError {
  def this(message: java.lang.String, nodes: js.UndefOr[
      graphqlLib.languageAstMod.ASTNode | js.Array[graphqlLib.languageAstMod.ASTNode] | js.UndefOr[scala.Nothing]
    ], source: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.languageSourceMod.Source]], positions: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[js.Array[scala.Double]]], path: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[js.Array[java.lang.String | scala.Double]]], originalError: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[stdLib.Error]], extensions: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[org.scalablytyped.runtime.StringDictionary[_]]]) = this()
}

