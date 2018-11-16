package typings
package grammarkdownLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTokensMod {
  type ArgumentOperatorKind = SyntaxKind
  type BooleanKind = SyntaxKind
  type CommentTriviaKind = SyntaxKind
  type HtmlTriviaKind = SyntaxKind
  type KeywordKind = SyntaxKind
  type LookaheadOperatorKind = SyntaxKind
  type ParameterOperatorKind = SyntaxKind
  type ProductionSeperatorKind = SyntaxKind
  type ProseFragmentLiteralKind = SyntaxKind
  type PunctuationKind = SyntaxKind
  type TextContentKind = SyntaxKind | ProseFragmentLiteralKind
  type TokenKind = SyntaxKind | PunctuationKind | KeywordKind
  type TriviaKind = CommentTriviaKind | HtmlTriviaKind
}
