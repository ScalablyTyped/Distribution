package typings.grammarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object grammarkdownMod {
  
  type Assertion = typings.grammarkdown.grammarkdownMod.InvalidAssertion
  
  type AssertionKind = /* keyof grammarkdown.grammarkdown/dist/grammarkdown.AssertionTypes */ java.lang.String
  
  type CommentTrivia = /* import warning: importer.ImportType#apply Failed type conversion: grammarkdown.grammarkdown/dist/grammarkdown.CommentTriviaTypes[grammarkdown.grammarkdown/dist/grammarkdown.CommentTriviaKind] */ js.Any
  
  type Declaration = typings.grammarkdown.grammarkdownMod.Parameter
  
  type DeclarationKind = /* keyof grammarkdown.grammarkdown/dist/grammarkdown.DeclarationTypes */ java.lang.String
  
  type HtmlTrivia = /* import warning: importer.ImportType#apply Failed type conversion: grammarkdown.grammarkdown/dist/grammarkdown.HtmlTriviaTypes[grammarkdown.grammarkdown/dist/grammarkdown.HtmlTriviaKind] */ js.Any
  
  type KnownOptions = org.scalablytyped.runtime.StringDictionary[typings.grammarkdown.anon.PartialKnownOption]
  
  type LegacyReadFileCallback = js.ThisFunction2[
    /* this */ scala.Nothing, 
    /* file */ java.lang.String, 
    /* cancelToken */ js.UndefOr[typings.prex.mod.CancellationToken], 
    js.Thenable[java.lang.String] | java.lang.String
  ]
  
  type LegacyReadFileSyncCallback = js.ThisFunction2[
    /* this */ scala.Nothing, 
    /* file */ java.lang.String, 
    /* cancelToken */ js.UndefOr[typings.prex.mod.CancellationToken], 
    java.lang.String
  ]
  
  type LegacyWriteFileCallback = js.ThisFunction3[
    /* this */ scala.Nothing, 
    /* file */ java.lang.String, 
    /* content */ java.lang.String, 
    /* cancelToken */ js.UndefOr[typings.prex.mod.CancellationToken], 
    js.Thenable[scala.Unit] | scala.Unit
  ]
  
  type LegacyWriteFileSyncCallback = js.ThisFunction3[
    /* this */ scala.Nothing, 
    /* file */ java.lang.String, 
    /* content */ java.lang.String, 
    /* cancelToken */ js.UndefOr[typings.prex.mod.CancellationToken], 
    scala.Unit
  ]
  
  type LexicalSymbol = typings.grammarkdown.grammarkdownMod.InvalidSymbol
  
  type LexicalSymbolKind = /* keyof grammarkdown.grammarkdown/dist/grammarkdown.LexicalSymbolTypes */ java.lang.String
  
  type MetaElement = typings.grammarkdown.grammarkdownMod.Import
  
  type MetaElementKind = /* keyof grammarkdown.grammarkdown/dist/grammarkdown.MetaElementTypes */ java.lang.String
  
  type OptionalSymbol = typings.grammarkdown.grammarkdownMod.UnicodeCharacterLiteral
  
  type OptionalSymbolKind = /* keyof grammarkdown.grammarkdown/dist/grammarkdown.OptionalSymbolTypes */ java.lang.String
  
  type PrimarySymbol = typings.grammarkdown.grammarkdownMod.UnicodeCharacterLiteral
  
  type PrimarySymbolKind = /* keyof grammarkdown.grammarkdown/dist/grammarkdown.PrimarySymbolTypes */ java.lang.String
  
  type PrimarySymbolTypes = typings.grammarkdown.grammarkdownMod.OptionalSymbolTypes
  
  type ProductionBody = typings.grammarkdown.grammarkdownMod.RightHandSide
  
  type ProductionBodyKind = /* keyof grammarkdown.grammarkdown/dist/grammarkdown.ProductionBodyTypes */ java.lang.String
  
  type ProseFragment = typings.grammarkdown.grammarkdownMod.ProseFragmentLiteral[
    typings.grammarkdown.grammarkdownNumbers.`52` | typings.grammarkdown.grammarkdownNumbers.`49` | typings.grammarkdown.grammarkdownNumbers.`50` | typings.grammarkdown.grammarkdownNumbers.`51`
  ]
  
  type ReadFileCallback = js.ThisFunction2[
    /* this */ scala.Nothing, 
    /* file */ java.lang.String, 
    /* cancelToken */ js.UndefOr[typings.esfxAsyncCanceltoken.mod.CancelToken], 
    js.Thenable[java.lang.String] | java.lang.String
  ]
  
  type ReadFileSyncCallback = js.ThisFunction2[
    /* this */ scala.Nothing, 
    /* file */ java.lang.String, 
    /* cancelToken */ js.UndefOr[typings.esfxAsyncCanceltoken.mod.CancelToken], 
    java.lang.String
  ]
  
  type SourceElement = typings.grammarkdown.grammarkdownMod.Production
  
  type SourceElementKind = /* keyof grammarkdown.grammarkdown/dist/grammarkdown.SourceElementTypes */ java.lang.String
  
  type Trivia = /* import warning: importer.ImportType#apply Failed type conversion: grammarkdown.grammarkdown/dist/grammarkdown.TriviaTypes[grammarkdown.grammarkdown/dist/grammarkdown.TriviaKind] */ js.Any
  
  type WriteFileCallback = js.ThisFunction3[
    /* this */ scala.Nothing, 
    /* file */ java.lang.String, 
    /* content */ java.lang.String, 
    /* cancelToken */ js.UndefOr[typings.esfxAsyncCanceltoken.mod.CancelToken], 
    js.Thenable[scala.Unit] | scala.Unit
  ]
  
  type WriteFileSyncCallback = js.ThisFunction3[
    /* this */ scala.Nothing, 
    /* file */ java.lang.String, 
    /* content */ java.lang.String, 
    /* cancelToken */ js.UndefOr[typings.esfxAsyncCanceltoken.mod.CancelToken], 
    scala.Unit
  ]
}
