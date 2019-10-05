package typings.graphql.languageParserMod

import typings.graphql.languageAstMod.DocumentNode
import typings.graphql.languageSourceMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/language/parser", "parse")
@js.native
object parse extends js.Object {
  def apply(source: String): DocumentNode = js.native
  def apply(source: String, options: ParseOptions): DocumentNode = js.native
  def apply(source: Source): DocumentNode = js.native
  def apply(source: Source, options: ParseOptions): DocumentNode = js.native
}

