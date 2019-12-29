package typings.graphql.languageTokenKindMod

import typings.graphql.graphqlStrings.$
import typings.graphql.graphqlStrings.Ampersand
import typings.graphql.graphqlStrings.BlockString
import typings.graphql.graphqlStrings.Colon
import typings.graphql.graphqlStrings.Comment
import typings.graphql.graphqlStrings.DotDotDot
import typings.graphql.graphqlStrings.Equalssign
import typings.graphql.graphqlStrings.Exclamationmark
import typings.graphql.graphqlStrings.Float
import typings.graphql.graphqlStrings.Int
import typings.graphql.graphqlStrings.Leftcurlybracket
import typings.graphql.graphqlStrings.Leftparenthesis
import typings.graphql.graphqlStrings.Leftsquarebracket
import typings.graphql.graphqlStrings.LessthansignEOFGreaterthansign
import typings.graphql.graphqlStrings.LessthansignSOFGreaterthansign
import typings.graphql.graphqlStrings.Name
import typings.graphql.graphqlStrings.Rightcurlybracket
import typings.graphql.graphqlStrings.Rightparenthesis
import typings.graphql.graphqlStrings.Rightsquarebracket
import typings.graphql.graphqlStrings.String
import typings.graphql.graphqlStrings.Verticalline
import typings.graphql.graphqlStrings.`@`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _TokenKind extends js.Object {
  var AMP: Ampersand
  var AT: `@`
  var BANG: Exclamationmark
  var BLOCK_STRING: BlockString
  var BRACE_L: Leftcurlybracket
  var BRACE_R: Rightcurlybracket
  var BRACKET_L: Leftsquarebracket
  var BRACKET_R: Rightsquarebracket
  var COLON: Colon
  var COMMENT: Comment
  var DOLLAR: $
  var EOF: LessthansignEOFGreaterthansign
  var EQUALS: Equalssign
  var FLOAT: Float
  var INT: Int
  var NAME: Name
  var PAREN_L: Leftparenthesis
  var PAREN_R: Rightparenthesis
  var PIPE: Verticalline
  var SOF: LessthansignSOFGreaterthansign
  var SPREAD: DotDotDot
  var STRING: String
}

object _TokenKind {
  @scala.inline
  def apply(
    AMP: Ampersand,
    AT: `@`,
    BANG: Exclamationmark,
    BLOCK_STRING: BlockString,
    BRACE_L: Leftcurlybracket,
    BRACE_R: Rightcurlybracket,
    BRACKET_L: Leftsquarebracket,
    BRACKET_R: Rightsquarebracket,
    COLON: Colon,
    COMMENT: Comment,
    DOLLAR: $,
    EOF: LessthansignEOFGreaterthansign,
    EQUALS: Equalssign,
    FLOAT: Float,
    INT: Int,
    NAME: Name,
    PAREN_L: Leftparenthesis,
    PAREN_R: Rightparenthesis,
    PIPE: Verticalline,
    SOF: LessthansignSOFGreaterthansign,
    SPREAD: DotDotDot,
    STRING: String
  ): _TokenKind = {
    val __obj = js.Dynamic.literal(AMP = AMP.asInstanceOf[js.Any], AT = AT.asInstanceOf[js.Any], BANG = BANG.asInstanceOf[js.Any], BLOCK_STRING = BLOCK_STRING.asInstanceOf[js.Any], BRACE_L = BRACE_L.asInstanceOf[js.Any], BRACE_R = BRACE_R.asInstanceOf[js.Any], BRACKET_L = BRACKET_L.asInstanceOf[js.Any], BRACKET_R = BRACKET_R.asInstanceOf[js.Any], COLON = COLON.asInstanceOf[js.Any], COMMENT = COMMENT.asInstanceOf[js.Any], DOLLAR = DOLLAR.asInstanceOf[js.Any], EOF = EOF.asInstanceOf[js.Any], EQUALS = EQUALS.asInstanceOf[js.Any], FLOAT = FLOAT.asInstanceOf[js.Any], INT = INT.asInstanceOf[js.Any], NAME = NAME.asInstanceOf[js.Any], PAREN_L = PAREN_L.asInstanceOf[js.Any], PAREN_R = PAREN_R.asInstanceOf[js.Any], PIPE = PIPE.asInstanceOf[js.Any], SOF = SOF.asInstanceOf[js.Any], SPREAD = SPREAD.asInstanceOf[js.Any], STRING = STRING.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_TokenKind]
  }
}

