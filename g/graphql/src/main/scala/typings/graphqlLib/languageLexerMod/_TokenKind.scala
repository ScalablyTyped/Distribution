package typings
package graphqlLib.languageLexerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// @internal
trait _TokenKind extends js.Object {
  var AMP: graphqlLib.graphqlLibStrings.`&`
  var AT: graphqlLib.graphqlLibStrings.`@`
  var BANG: graphqlLib.graphqlLibStrings.`!`
  var BLOCK_STRING: graphqlLib.graphqlLibStrings.BlockString
  var BRACE_L: graphqlLib.graphqlLibStrings.`{`
  var BRACE_R: graphqlLib.graphqlLibStrings.`}`
  var BRACKET_L: graphqlLib.graphqlLibStrings.`[`
  var BRACKET_R: graphqlLib.graphqlLibStrings.`]`
  var COLON: graphqlLib.graphqlLibStrings.`:`
  var COMMENT: graphqlLib.graphqlLibStrings.Comment
  var DOLLAR: graphqlLib.graphqlLibStrings.DOLLAR
  var EOF: graphqlLib.graphqlLibStrings.`<EOF>`
  var EQUALS: graphqlLib.graphqlLibStrings.`=`
  var FLOAT: graphqlLib.graphqlLibStrings.Float
  var INT: graphqlLib.graphqlLibStrings.Int
  var NAME: graphqlLib.graphqlLibStrings.Name
  var PAREN_L: graphqlLib.graphqlLibStrings.`(`
  var PAREN_R: graphqlLib.graphqlLibStrings.`)`
  var PIPE: graphqlLib.graphqlLibStrings.`|`
  var SOF: graphqlLib.graphqlLibStrings.`<SOF>`
  var SPREAD: graphqlLib.graphqlLibStrings.DOTDOTDOT
  var STRING: graphqlLib.graphqlLibStrings.String
}

object _TokenKind {
  @scala.inline
  def apply(
    AMP: graphqlLib.graphqlLibStrings.`&`,
    AT: graphqlLib.graphqlLibStrings.`@`,
    BANG: graphqlLib.graphqlLibStrings.`!`,
    BLOCK_STRING: graphqlLib.graphqlLibStrings.BlockString,
    BRACE_L: graphqlLib.graphqlLibStrings.`{`,
    BRACE_R: graphqlLib.graphqlLibStrings.`}`,
    BRACKET_L: graphqlLib.graphqlLibStrings.`[`,
    BRACKET_R: graphqlLib.graphqlLibStrings.`]`,
    COLON: graphqlLib.graphqlLibStrings.`:`,
    COMMENT: graphqlLib.graphqlLibStrings.Comment,
    DOLLAR: graphqlLib.graphqlLibStrings.DOLLAR,
    EOF: graphqlLib.graphqlLibStrings.`<EOF>`,
    EQUALS: graphqlLib.graphqlLibStrings.`=`,
    FLOAT: graphqlLib.graphqlLibStrings.Float,
    INT: graphqlLib.graphqlLibStrings.Int,
    NAME: graphqlLib.graphqlLibStrings.Name,
    PAREN_L: graphqlLib.graphqlLibStrings.`(`,
    PAREN_R: graphqlLib.graphqlLibStrings.`)`,
    PIPE: graphqlLib.graphqlLibStrings.`|`,
    SOF: graphqlLib.graphqlLibStrings.`<SOF>`,
    SPREAD: graphqlLib.graphqlLibStrings.DOTDOTDOT,
    STRING: graphqlLib.graphqlLibStrings.String
  ): _TokenKind = {
    val __obj = js.Dynamic.literal(AMP = AMP, AT = AT, BANG = BANG, BLOCK_STRING = BLOCK_STRING, BRACE_L = BRACE_L, BRACE_R = BRACE_R, BRACKET_L = BRACKET_L, BRACKET_R = BRACKET_R, COLON = COLON, COMMENT = COMMENT, DOLLAR = DOLLAR, EOF = EOF, EQUALS = EQUALS, FLOAT = FLOAT, INT = INT, NAME = NAME, PAREN_L = PAREN_L, PAREN_R = PAREN_R, PIPE = PIPE, SOF = SOF, SPREAD = SPREAD, STRING = STRING)
  
    __obj.asInstanceOf[_TokenKind]
  }
}

