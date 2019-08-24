package typings.graphql.languageParserMod

import typings.graphql.languageAstMod.DocumentNode
import typings.graphql.languageAstMod.TypeNode
import typings.graphql.languageAstMod.ValueNode
import typings.graphql.languageSourceMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/language/parser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def parse(source: String): DocumentNode = js.native
  def parse(source: String, options: ParseOptions): DocumentNode = js.native
  def parse(source: Source): DocumentNode = js.native
  def parse(source: Source, options: ParseOptions): DocumentNode = js.native
  def parseType(source: String): TypeNode = js.native
  def parseType(source: String, options: ParseOptions): TypeNode = js.native
  def parseType(source: Source): TypeNode = js.native
  def parseType(source: Source, options: ParseOptions): TypeNode = js.native
  def parseValue(source: String): ValueNode = js.native
  def parseValue(source: String, options: ParseOptions): ValueNode = js.native
  def parseValue(source: Source): ValueNode = js.native
  def parseValue(source: Source, options: ParseOptions): ValueNode = js.native
}

