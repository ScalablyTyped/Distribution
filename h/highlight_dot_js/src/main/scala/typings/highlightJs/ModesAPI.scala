package typings.highlightJs

import typings.highlightJs.anon.PartialModebinarystringRe
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModesAPI extends StObject {
  
  var APOS_STRING_MODE: Mode = js.native
  
  var BACKSLASH_ESCAPE: Mode = js.native
  
  var BINARY_NUMBER_MODE: Mode = js.native
  
  var BINARY_NUMBER_RE: String = js.native
  
  def COMMENT(begin: String, end: String): Mode = js.native
  def COMMENT(begin: String, end: String, modeOpts: js.Object): Mode = js.native
  def COMMENT(begin: String, end: String, modeOpts: Mode): Mode = js.native
  def COMMENT(begin: String, end: RegExp): Mode = js.native
  def COMMENT(begin: String, end: RegExp, modeOpts: js.Object): Mode = js.native
  def COMMENT(begin: String, end: RegExp, modeOpts: Mode): Mode = js.native
  def COMMENT(begin: RegExp, end: String): Mode = js.native
  def COMMENT(begin: RegExp, end: String, modeOpts: js.Object): Mode = js.native
  def COMMENT(begin: RegExp, end: String, modeOpts: Mode): Mode = js.native
  def COMMENT(begin: RegExp, end: RegExp): Mode = js.native
  def COMMENT(begin: RegExp, end: RegExp, modeOpts: js.Object): Mode = js.native
  def COMMENT(begin: RegExp, end: RegExp, modeOpts: Mode): Mode = js.native
  
  var CSS_NUMBER_MODE: Mode = js.native
  
  var C_BLOCK_COMMENT_MODE: Mode = js.native
  
  var C_LINE_COMMENT_MODE: Mode = js.native
  
  var C_NUMBER_MODE: Mode = js.native
  
  var C_NUMBER_RE: String = js.native
  
  def END_SAME_AS_BEGIN(mode: Mode): Mode = js.native
  
  var HASH_COMMENT_MODE: Mode = js.native
  
  // built in regex
  var IDENT_RE: String = js.native
  
  var METHOD_GUARD: Mode = js.native
  
  var NUMBER_MODE: Mode = js.native
  
  var NUMBER_RE: String = js.native
  
  var PHRASAL_WORDS_MODE: Mode = js.native
  
  var QUOTE_STRING_MODE: Mode = js.native
  
  var REGEXP_MODE: Mode = js.native
  
  var RE_STARTERS_RE: String = js.native
  
  def SHEBANG(): Mode = js.native
  def SHEBANG(mode: PartialModebinarystringRe): Mode = js.native
  
  var TITLE_MODE: Mode = js.native
  
  var UNDERSCORE_IDENT_RE: String = js.native
  
  var UNDERSCORE_TITLE_MODE: Mode = js.native
}
