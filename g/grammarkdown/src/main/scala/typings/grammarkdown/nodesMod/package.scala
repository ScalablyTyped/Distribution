package typings.grammarkdown.nodesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def forEachChild[T](
  node: scala.Unit,
  cbNode: js.Function1[
  /* node */ typings.grammarkdown.nodesMod.Node[typings.grammarkdown.tokensMod.SyntaxKind], 
  js.UndefOr[T]
]
): js.UndefOr[T] = (typings.grammarkdown.nodesMod.^.asInstanceOf[js.Dynamic].applyDynamic("forEachChild")(node.asInstanceOf[js.Any], cbNode.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
inline def forEachChild[T](
  node: typings.grammarkdown.nodesMod.Node[typings.grammarkdown.tokensMod.SyntaxKind],
  cbNode: js.Function1[
  /* node */ typings.grammarkdown.nodesMod.Node[typings.grammarkdown.tokensMod.SyntaxKind], 
  js.UndefOr[T]
]
): js.UndefOr[T] = (typings.grammarkdown.nodesMod.^.asInstanceOf[js.Dynamic].applyDynamic("forEachChild")(node.asInstanceOf[js.Any], cbNode.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]

/* Rewritten from type alias, can be one of: 
  - typings.grammarkdown.nodesMod.PrimarySymbol
  - typings.grammarkdown.nodesMod.Assertion
  - typings.grammarkdown.nodesMod.PlaceholderSymbol
  - typings.grammarkdown.nodesMod.UnicodeCharacterRange
  - typings.grammarkdown.nodesMod.ButNotSymbol
  - typings.grammarkdown.nodesMod.Prose
  - typings.grammarkdown.nodesMod.OneOfSymbol
  - typings.grammarkdown.nodesMod.InvalidSymbol
*/
type LexicalSymbol = typings.grammarkdown.nodesMod._LexicalSymbol | typings.grammarkdown.nodesMod.PrimarySymbol

type PrimarySymbol = typings.grammarkdown.nodesMod.OptionalSymbol

/* Rewritten from type alias, can be one of: 
  - typings.grammarkdown.nodesMod.ProseFragmentLiteral[typings.grammarkdown.tokensMod.ProseFragmentLiteralKind]
  - typings.grammarkdown.nodesMod.Terminal
  - typings.grammarkdown.nodesMod.Nonterminal
*/
type ProseFragment = typings.grammarkdown.nodesMod._ProseFragment | typings.grammarkdown.nodesMod.ProseFragmentLiteral[typings.grammarkdown.tokensMod.ProseFragmentLiteralKind]
