package typings.grammarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object tokensMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.grammarkdown.tokensMod.PrimarySymbolKind
    - typings.grammarkdown.tokensMod.AssertionKind
    - typings.grammarkdown.tokensMod.SyntaxKind.PlaceholderSymbol
    - typings.grammarkdown.tokensMod.SyntaxKind.UnicodeCharacterRange
    - typings.grammarkdown.tokensMod.SyntaxKind.ButNotSymbol
    - typings.grammarkdown.tokensMod.SyntaxKind.Prose
    - typings.grammarkdown.tokensMod.SyntaxKind.OneOfSymbol
    - typings.grammarkdown.tokensMod.SyntaxKind.InvalidSymbol
  */
  type LexicalSymbolKind = typings.grammarkdown.tokensMod._LexicalSymbolKind | typings.grammarkdown.tokensMod.PrimarySymbolKind
  
  type PrimarySymbolKind = typings.grammarkdown.tokensMod.OptionalSymbolKind
}
