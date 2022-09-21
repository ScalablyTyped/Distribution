package typings.highlightjs

import typings.highlightjs.mod.HLJSStatic
import typings.highlightjs.mod.IAutoHighlightResult
import typings.highlightjs.mod.ICompiledMode
import typings.highlightjs.mod.IHighlightResult
import typings.highlightjs.mod.IMode
import typings.highlightjs.mod.IModeBase
import typings.highlightjs.mod.IOptions
import typings.highlightjs.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object hljs {
    
    @JSGlobal("hljs")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("hljs.APOS_STRING_MODE")
    @js.native
    val APOS_STRING_MODE: IMode = js.native
    
    @JSGlobal("hljs.BACKSLASH_ESCAPE")
    @js.native
    val BACKSLASH_ESCAPE: IMode = js.native
    
    @JSGlobal("hljs.BINARY_NUMBER_MODE")
    @js.native
    val BINARY_NUMBER_MODE: IMode = js.native
    
    @JSGlobal("hljs.BINARY_NUMBER_RE")
    @js.native
    val BINARY_NUMBER_RE: String = js.native
    
    inline def COMMENT(begin: String, end: String, inherits: IModeBase): IMode = (^.asInstanceOf[js.Dynamic].applyDynamic("COMMENT")(begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any], inherits.asInstanceOf[js.Any])).asInstanceOf[IMode]
    inline def COMMENT(begin: String, end: js.RegExp, inherits: IModeBase): IMode = (^.asInstanceOf[js.Dynamic].applyDynamic("COMMENT")(begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any], inherits.asInstanceOf[js.Any])).asInstanceOf[IMode]
    inline def COMMENT(begin: js.RegExp, end: String, inherits: IModeBase): IMode = (^.asInstanceOf[js.Dynamic].applyDynamic("COMMENT")(begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any], inherits.asInstanceOf[js.Any])).asInstanceOf[IMode]
    inline def COMMENT(begin: js.RegExp, end: js.RegExp, inherits: IModeBase): IMode = (^.asInstanceOf[js.Dynamic].applyDynamic("COMMENT")(begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any], inherits.asInstanceOf[js.Any])).asInstanceOf[IMode]
    
    @JSGlobal("hljs.CSS_NUMBER_MODE")
    @js.native
    val CSS_NUMBER_MODE: IMode = js.native
    
    @JSGlobal("hljs.C_BLOCK_COMMENT_MODE")
    @js.native
    val C_BLOCK_COMMENT_MODE: IMode = js.native
    
    @JSGlobal("hljs.C_LINE_COMMENT_MODE")
    @js.native
    val C_LINE_COMMENT_MODE: IMode = js.native
    
    @JSGlobal("hljs.C_NUMBER_MODE")
    @js.native
    val C_NUMBER_MODE: IMode = js.native
    
    @JSGlobal("hljs.C_NUMBER_RE")
    @js.native
    val C_NUMBER_RE: String = js.native
    
    @JSGlobal("hljs.HASH_COMMENT_MODE")
    @js.native
    val HASH_COMMENT_MODE: IMode = js.native
    
    @JSGlobal("hljs.IDENT_RE")
    @js.native
    val IDENT_RE: String = js.native
    
    @JSGlobal("hljs.NUMBER_MODE")
    @js.native
    val NUMBER_MODE: IMode = js.native
    
    @JSGlobal("hljs.NUMBER_RE")
    @js.native
    val NUMBER_RE: String = js.native
    
    @JSGlobal("hljs.PHRASAL_WORDS_MODE")
    @js.native
    val PHRASAL_WORDS_MODE: IMode = js.native
    
    @JSGlobal("hljs.QUOTE_STRING_MODE")
    @js.native
    val QUOTE_STRING_MODE: IMode = js.native
    
    @JSGlobal("hljs.REGEX_MODE")
    @js.native
    val REGEX_MODE: IMode = js.native
    
    @JSGlobal("hljs.RE_STARTERS_RE")
    @js.native
    val RE_STARTERS_RE: String = js.native
    
    @JSGlobal("hljs.TITLE_MODE")
    @js.native
    val TITLE_MODE: IMode = js.native
    
    @JSGlobal("hljs.UNDERSCORE_IDENT_RE")
    @js.native
    val UNDERSCORE_IDENT_RE: String = js.native
    
    @JSGlobal("hljs.UNDERSCORE_TITLE_MODE")
    @js.native
    val UNDERSCORE_TITLE_MODE: IMode = js.native
    
    inline def configure(options: IOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def fixMarkup(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fixMarkup")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getLanguage(name: String): IMode = ^.asInstanceOf[js.Dynamic].applyDynamic("getLanguage")(name.asInstanceOf[js.Any]).asInstanceOf[IMode]
    
    inline def highlight(name: String, value: String): IHighlightResult = (^.asInstanceOf[js.Dynamic].applyDynamic("highlight")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[IHighlightResult]
    inline def highlight(name: String, value: String, ignore_illegals: Boolean): IHighlightResult = (^.asInstanceOf[js.Dynamic].applyDynamic("highlight")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], ignore_illegals.asInstanceOf[js.Any])).asInstanceOf[IHighlightResult]
    inline def highlight(name: String, value: String, ignore_illegals: Boolean, continuation: ICompiledMode): IHighlightResult = (^.asInstanceOf[js.Dynamic].applyDynamic("highlight")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], ignore_illegals.asInstanceOf[js.Any], continuation.asInstanceOf[js.Any])).asInstanceOf[IHighlightResult]
    inline def highlight(name: String, value: String, ignore_illegals: Unit, continuation: ICompiledMode): IHighlightResult = (^.asInstanceOf[js.Dynamic].applyDynamic("highlight")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], ignore_illegals.asInstanceOf[js.Any], continuation.asInstanceOf[js.Any])).asInstanceOf[IHighlightResult]
    
    inline def highlightAuto(value: String): IAutoHighlightResult = ^.asInstanceOf[js.Dynamic].applyDynamic("highlightAuto")(value.asInstanceOf[js.Any]).asInstanceOf[IAutoHighlightResult]
    inline def highlightAuto(value: String, languageSubset: js.Array[String]): IAutoHighlightResult = (^.asInstanceOf[js.Dynamic].applyDynamic("highlightAuto")(value.asInstanceOf[js.Any], languageSubset.asInstanceOf[js.Any])).asInstanceOf[IAutoHighlightResult]
    
    inline def highlightBlock(block: Node): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("highlightBlock")(block.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def inherit(parent: js.Object, obj: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("inherit")(parent.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    
    inline def initHighlighting(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initHighlighting")().asInstanceOf[Unit]
    
    inline def initHighlightingOnLoad(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initHighlightingOnLoad")().asInstanceOf[Unit]
    
    inline def listLanguages(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("listLanguages")().asInstanceOf[js.Array[String]]
    
    inline def registerLanguage(name: String, language: js.Function1[/* hljs */ js.UndefOr[HLJSStatic], IModeBase]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerLanguage")(name.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
