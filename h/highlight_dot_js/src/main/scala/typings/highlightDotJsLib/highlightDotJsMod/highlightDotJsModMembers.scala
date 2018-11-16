package typings
package highlightDotJsLib.highlightDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("highlight.js", JSImport.Namespace)
@js.native
object highlightDotJsModMembers extends js.Object {
  var APOS_STRING_MODE: highlightDotJsLib.highlightDotJsMod.hljsNs.IMode = js.native
  var BACKSLASH_ESCAPE: highlightDotJsLib.highlightDotJsMod.hljsNs.IMode = js.native
  var BINARY_NUMBER_MODE: highlightDotJsLib.highlightDotJsMod.hljsNs.IMode = js.native
  var BINARY_NUMBER_RE: java.lang.String = js.native
  var CSS_NUMBER_MODE: highlightDotJsLib.highlightDotJsMod.hljsNs.IMode = js.native
  var C_BLOCK_COMMENT_MODE: highlightDotJsLib.highlightDotJsMod.hljsNs.IMode = js.native
  var C_LINE_COMMENT_MODE: highlightDotJsLib.highlightDotJsMod.hljsNs.IMode = js.native
  var C_NUMBER_MODE: highlightDotJsLib.highlightDotJsMod.hljsNs.IMode = js.native
  var C_NUMBER_RE: java.lang.String = js.native
  var HASH_COMMENT_MODE: highlightDotJsLib.highlightDotJsMod.hljsNs.IMode = js.native
  var IDENT_RE: java.lang.String = js.native
  var NUMBER_MODE: highlightDotJsLib.highlightDotJsMod.hljsNs.IMode = js.native
  var NUMBER_RE: java.lang.String = js.native
  var PHRASAL_WORDS_MODE: highlightDotJsLib.highlightDotJsMod.hljsNs.IMode = js.native
  var QUOTE_STRING_MODE: highlightDotJsLib.highlightDotJsMod.hljsNs.IMode = js.native
  var REGEX_MODE: highlightDotJsLib.highlightDotJsMod.hljsNs.IMode = js.native
  var RE_STARTERS_RE: java.lang.String = js.native
  var TITLE_MODE: highlightDotJsLib.highlightDotJsMod.hljsNs.IMode = js.native
  var UNDERSCORE_IDENT_RE: java.lang.String = js.native
  var UNDERSCORE_TITLE_MODE: highlightDotJsLib.highlightDotJsMod.hljsNs.IMode = js.native
  def COMMENT(
    begin: java.lang.String,
    end: java.lang.String,
    inherits: highlightDotJsLib.highlightDotJsMod.hljsNs.IModeBase
  ): highlightDotJsLib.highlightDotJsMod.hljsNs.IMode = js.native
  def COMMENT(
    begin: java.lang.String,
    end: stdLib.RegExp,
    inherits: highlightDotJsLib.highlightDotJsMod.hljsNs.IModeBase
  ): highlightDotJsLib.highlightDotJsMod.hljsNs.IMode = js.native
  def COMMENT(
    begin: stdLib.RegExp,
    end: java.lang.String,
    inherits: highlightDotJsLib.highlightDotJsMod.hljsNs.IModeBase
  ): highlightDotJsLib.highlightDotJsMod.hljsNs.IMode = js.native
  def COMMENT(
    begin: stdLib.RegExp,
    end: stdLib.RegExp,
    inherits: highlightDotJsLib.highlightDotJsMod.hljsNs.IModeBase
  ): highlightDotJsLib.highlightDotJsMod.hljsNs.IMode = js.native
  def configure(options: highlightDotJsLib.highlightDotJsMod.hljsNs.IOptions): scala.Unit = js.native
  def fixMarkup(value: java.lang.String): java.lang.String = js.native
  def getLanguage(name: java.lang.String): highlightDotJsLib.highlightDotJsMod.hljsNs.IMode = js.native
  def highlight(name: java.lang.String, value: java.lang.String): highlightDotJsLib.highlightDotJsMod.hljsNs.IHighlightResult = js.native
  def highlight(name: java.lang.String, value: java.lang.String, ignore_illegals: scala.Boolean): highlightDotJsLib.highlightDotJsMod.hljsNs.IHighlightResult = js.native
  def highlight(
    name: java.lang.String,
    value: java.lang.String,
    ignore_illegals: scala.Boolean,
    continuation: highlightDotJsLib.highlightDotJsMod.hljsNs.ICompiledMode
  ): highlightDotJsLib.highlightDotJsMod.hljsNs.IHighlightResult = js.native
  def highlightAuto(value: java.lang.String): highlightDotJsLib.highlightDotJsMod.hljsNs.IAutoHighlightResult = js.native
  def highlightAuto(value: java.lang.String, languageSubset: js.Array[java.lang.String]): highlightDotJsLib.highlightDotJsMod.hljsNs.IAutoHighlightResult = js.native
  def highlightBlock(block: highlightDotJsLib.highlightDotJsMod.hljsNs.Node): scala.Unit = js.native
  def inherit(parent: js.Object, obj: js.Object): js.Object = js.native
  def initHighlighting(): scala.Unit = js.native
  def initHighlightingOnLoad(): scala.Unit = js.native
  def listLanguages(): js.Array[java.lang.String] = js.native
  def registerLanguage(
    name: java.lang.String,
    language: js.Function1[
      /* hljs */ js.UndefOr[highlightDotJsLib.highlightDotJsMod.hljsNs.HLJSStatic], 
      highlightDotJsLib.highlightDotJsMod.hljsNs.IModeBase
    ]
  ): scala.Unit = js.native
}

