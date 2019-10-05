package typings.graphql.graphqlMod

import typings.graphql.languageAstMod.TypeNode
import typings.graphql.languageParserMod.ParseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "parseType")
@js.native
object parseType extends js.Object {
  def apply(source: String): TypeNode = js.native
  def apply(source: String, options: ParseOptions): TypeNode = js.native
  def apply(source: typings.graphql.languageSourceMod.Source): TypeNode = js.native
  def apply(source: typings.graphql.languageSourceMod.Source, options: ParseOptions): TypeNode = js.native
}

