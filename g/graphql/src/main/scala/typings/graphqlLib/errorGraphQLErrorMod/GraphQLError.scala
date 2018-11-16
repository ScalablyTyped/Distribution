package typings
package graphqlLib.errorGraphQLErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/error/GraphQLError", "GraphQLError")
@js.native
class GraphQLError protected ()
  extends stdLib.Error {
  def this(message: java.lang.String, nodes: js.UndefOr[
      graphqlLib.languageAstMod.ASTNode | js.Array[graphqlLib.languageAstMod.ASTNode] | js.UndefOr[scala.Nothing]
    ], source: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.languageSourceMod.Source]], positions: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[js.Array[scala.Double]]], path: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[js.Array[java.lang.String | scala.Double]]], originalError: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[stdLib.Error]], extensions: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[ScalablyTyped.runtime.StringDictionary[_]]]) = this()
  /**
       * Extension fields to add to the formatted error.
       */
  val extensions: js.UndefOr[ScalablyTyped.runtime.StringDictionary[_]] = js.native
  /**
       * An array of { line, column } locations within the source GraphQL document
       * which correspond to this error.
       *
       * Errors during validation often contain multiple locations, for example to
       * point out two things with the same name. Errors during execution include a
       * single location, the field which produced the error.
       *
       * Enumerable, and appears in the result of JSON.stringify().
       */
  val locations: js.UndefOr[js.Array[graphqlLib.languageLocationMod.SourceLocation]] = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /**
       * An array of GraphQL AST Nodes corresponding to this error.
       */
  val nodes: js.UndefOr[js.Array[graphqlLib.languageAstMod.ASTNode]] = js.native
  /**
       * The original error thrown from a field resolver during execution.
       */
  val originalError: graphqlLib.tsutilsMaybeMod.Maybe[stdLib.Error] = js.native
  /**
       * An array describing the JSON-path into the execution response which
       * corresponds to this error. Only included for errors during execution.
       *
       * Enumerable, and appears in the result of JSON.stringify().
       */
  val path: js.UndefOr[js.Array[java.lang.String | scala.Double]] = js.native
  /**
       * An array of character offsets within the source GraphQL document
       * which correspond to this error.
       */
  val positions: js.UndefOr[js.Array[scala.Double]] = js.native
  /**
       * The source GraphQL document corresponding to this error.
       */
  val source: js.UndefOr[graphqlLib.languageSourceMod.Source] = js.native
}

