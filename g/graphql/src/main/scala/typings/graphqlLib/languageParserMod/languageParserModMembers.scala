package typings
package graphqlLib.languageParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/language/parser", JSImport.Namespace)
@js.native
object languageParserModMembers extends js.Object {
  def parse(source: graphqlLib.languageSourceMod.Source): graphqlLib.languageAstMod.DocumentNode = js.native
  def parse(source: graphqlLib.languageSourceMod.Source, options: ParseOptions): graphqlLib.languageAstMod.DocumentNode = js.native
  def parse(source: java.lang.String): graphqlLib.languageAstMod.DocumentNode = js.native
  def parse(source: java.lang.String, options: ParseOptions): graphqlLib.languageAstMod.DocumentNode = js.native
  def parseConstValue[TOptions](lexer: graphqlLib.languageLexerMod.Lexer[TOptions]): graphqlLib.languageAstMod.ValueNode = js.native
  def parseNamedType[TOptions](lexer: graphqlLib.languageLexerMod.Lexer[TOptions]): graphqlLib.languageAstMod.NamedTypeNode = js.native
  def parseType(source: graphqlLib.languageSourceMod.Source): graphqlLib.languageAstMod.TypeNode = js.native
  def parseType(source: graphqlLib.languageSourceMod.Source, options: ParseOptions): graphqlLib.languageAstMod.TypeNode = js.native
  def parseType(source: java.lang.String): graphqlLib.languageAstMod.TypeNode = js.native
  def parseType(source: java.lang.String, options: ParseOptions): graphqlLib.languageAstMod.TypeNode = js.native
  def parseTypeReference[TOptions](lexer: graphqlLib.languageLexerMod.Lexer[TOptions]): graphqlLib.languageAstMod.TypeNode = js.native
  def parseValue(source: graphqlLib.languageSourceMod.Source): graphqlLib.languageAstMod.ValueNode = js.native
  def parseValue(source: graphqlLib.languageSourceMod.Source, options: ParseOptions): graphqlLib.languageAstMod.ValueNode = js.native
  def parseValue(source: java.lang.String): graphqlLib.languageAstMod.ValueNode = js.native
  def parseValue(source: java.lang.String, options: ParseOptions): graphqlLib.languageAstMod.ValueNode = js.native
}

