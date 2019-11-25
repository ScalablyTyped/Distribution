package typings.graphql.languageTokenKindMod

import typings.graphql.graphqlStrings.BlockString
import typings.graphql.graphqlStrings.Comment
import typings.graphql.graphqlStrings.DOLLAR
import typings.graphql.graphqlStrings.DOTDOTDOT
import typings.graphql.graphqlStrings.Float
import typings.graphql.graphqlStrings.Int
import typings.graphql.graphqlStrings.Name
import typings.graphql.graphqlStrings.String
import typings.graphql.graphqlStrings.`!`
import typings.graphql.graphqlStrings.`&`
import typings.graphql.graphqlStrings.`(`
import typings.graphql.graphqlStrings.`)`
import typings.graphql.graphqlStrings.`:`
import typings.graphql.graphqlStrings.`<EOF>`
import typings.graphql.graphqlStrings.`<SOF>`
import typings.graphql.graphqlStrings.`=`
import typings.graphql.graphqlStrings.`@`
import typings.graphql.graphqlStrings.`[`
import typings.graphql.graphqlStrings.`]`
import typings.graphql.graphqlStrings.`{`
import typings.graphql.graphqlStrings.`}`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _TokenKind extends js.Object {
  var AMP: `&`
  var AT: `@`
  var BANG: `!`
  var BLOCK_STRING: BlockString
  var BRACE_L: `{`
  var BRACE_R: `}`
  var BRACKET_L: `[`
  var BRACKET_R: `]`
  var COLON: `:`
  var COMMENT: Comment
  var DOLLAR: typings.graphql.graphqlStrings.DOLLAR
  var EOF: `<EOF>`
  var EQUALS: `=`
  var FLOAT: Float
  var INT: Int
  var NAME: Name
  var PAREN_L: `(`
  var PAREN_R: `)`
  var PIPE: typings.graphql.graphqlStrings.`|`
  var SOF: `<SOF>`
  var SPREAD: DOTDOTDOT
  var STRING: String
}

object _TokenKind {
  @scala.inline
  def apply(
    AMP: `&`,
    AT: `@`,
    BANG: `!`,
    BLOCK_STRING: BlockString,
    BRACE_L: `{`,
    BRACE_R: `}`,
    BRACKET_L: `[`,
    BRACKET_R: `]`,
    COLON: `:`,
    COMMENT: Comment,
    DOLLAR: DOLLAR,
    EOF: `<EOF>`,
    EQUALS: `=`,
    FLOAT: Float,
    INT: Int,
    NAME: Name,
    PAREN_L: `(`,
    PAREN_R: `)`,
    PIPE: typings.graphql.graphqlStrings.`|`,
    SOF: `<SOF>`,
    SPREAD: DOTDOTDOT,
    STRING: String
  ): _TokenKind = {
    val __obj = js.Dynamic.literal(AMP = AMP.asInstanceOf[js.Any], AT = AT.asInstanceOf[js.Any], BANG = BANG.asInstanceOf[js.Any], BLOCK_STRING = BLOCK_STRING.asInstanceOf[js.Any], BRACE_L = BRACE_L.asInstanceOf[js.Any], BRACE_R = BRACE_R.asInstanceOf[js.Any], BRACKET_L = BRACKET_L.asInstanceOf[js.Any], BRACKET_R = BRACKET_R.asInstanceOf[js.Any], COLON = COLON.asInstanceOf[js.Any], COMMENT = COMMENT.asInstanceOf[js.Any], DOLLAR = DOLLAR.asInstanceOf[js.Any], EOF = EOF.asInstanceOf[js.Any], EQUALS = EQUALS.asInstanceOf[js.Any], FLOAT = FLOAT.asInstanceOf[js.Any], INT = INT.asInstanceOf[js.Any], NAME = NAME.asInstanceOf[js.Any], PAREN_L = PAREN_L.asInstanceOf[js.Any], PAREN_R = PAREN_R.asInstanceOf[js.Any], PIPE = PIPE.asInstanceOf[js.Any], SOF = SOF.asInstanceOf[js.Any], SPREAD = SPREAD.asInstanceOf[js.Any], STRING = STRING.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_TokenKind]
  }
}

