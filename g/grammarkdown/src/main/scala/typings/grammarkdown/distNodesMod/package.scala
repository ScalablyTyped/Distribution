package typings.grammarkdown.distNodesMod

import typings.grammarkdown.distNodesMod.^
import typings.grammarkdown.distTokensMod.ProseFragmentLiteralKind
import typings.grammarkdown.distTokensMod.SyntaxKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def forEachChild[T](node: Unit, cbNode: js.Function1[/* node */ Node[SyntaxKind], js.UndefOr[T]]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachChild")(node.asInstanceOf[js.Any], cbNode.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
inline def forEachChild[T](node: Node[SyntaxKind], cbNode: js.Function1[/* node */ Node[SyntaxKind], js.UndefOr[T]]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachChild")(node.asInstanceOf[js.Any], cbNode.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]

/* Rewritten from type alias, can be one of: 
  - typings.grammarkdown.distNodesMod.PrimarySymbol
  - typings.grammarkdown.distNodesMod.Assertion
  - typings.grammarkdown.distNodesMod.PlaceholderSymbol
  - typings.grammarkdown.distNodesMod.UnicodeCharacterRange
  - typings.grammarkdown.distNodesMod.ButNotSymbol
  - typings.grammarkdown.distNodesMod.Prose
  - typings.grammarkdown.distNodesMod.OneOfSymbol
  - typings.grammarkdown.distNodesMod.InvalidSymbol
*/
type LexicalSymbol = _LexicalSymbol | PrimarySymbol

type PrimarySymbol = OptionalSymbol

/* Rewritten from type alias, can be one of: 
  - typings.grammarkdown.distNodesMod.ProseFragmentLiteral[typings.grammarkdown.distTokensMod.ProseFragmentLiteralKind]
  - typings.grammarkdown.distNodesMod.Terminal
  - typings.grammarkdown.distNodesMod.Nonterminal
*/
type ProseFragment = _ProseFragment | ProseFragmentLiteral[ProseFragmentLiteralKind]

/* Rewritten from type alias, can be one of: 
  - typings.grammarkdown.distNodesMod.StringLiteral
  - typings.grammarkdown.distNodesMod.NumberLiteral
  - typings.grammarkdown.distNodesMod.Identifier
  - typings.grammarkdown.distNodesMod.UnicodeCharacterLiteral
  - typings.grammarkdown.distNodesMod.TerminalLiteral
  - typings.grammarkdown.distNodesMod.ProseFragmentLiteral[typings.grammarkdown.distTokensMod.ProseFragmentLiteralKind]
*/
type TextContentNode = _TextContentNode | ProseFragmentLiteral[ProseFragmentLiteralKind]
