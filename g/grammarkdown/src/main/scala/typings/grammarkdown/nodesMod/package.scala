package typings.grammarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object nodesMod {
  
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
}
