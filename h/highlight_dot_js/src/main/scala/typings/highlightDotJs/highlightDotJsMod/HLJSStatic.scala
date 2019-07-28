package typings.highlightDotJs.highlightDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HLJSStatic extends js.Object {
  var APOS_STRING_MODE: IMode
  // Common modes
  var BACKSLASH_ESCAPE: IMode
  var BINARY_NUMBER_MODE: IMode
  var BINARY_NUMBER_RE: String
  var CSS_NUMBER_MODE: IMode
  var C_BLOCK_COMMENT_MODE: IMode
  var C_LINE_COMMENT_MODE: IMode
  var C_NUMBER_MODE: IMode
  var C_NUMBER_RE: String
  var HASH_COMMENT_MODE: IMode
  // Common regexps
  var IDENT_RE: String
  var NUMBER_MODE: IMode
  var NUMBER_RE: String
  var PHRASAL_WORDS_MODE: IMode
  var QUOTE_STRING_MODE: IMode
  var REGEX_MODE: IMode
  var RE_STARTERS_RE: String
  var TITLE_MODE: IMode
  var UNDERSCORE_IDENT_RE: String
  var UNDERSCORE_TITLE_MODE: IMode
  def inherit(parent: js.Object, obj: js.Object): js.Object
}

object HLJSStatic {
  @scala.inline
  def apply(
    APOS_STRING_MODE: IMode,
    BACKSLASH_ESCAPE: IMode,
    BINARY_NUMBER_MODE: IMode,
    BINARY_NUMBER_RE: String,
    CSS_NUMBER_MODE: IMode,
    C_BLOCK_COMMENT_MODE: IMode,
    C_LINE_COMMENT_MODE: IMode,
    C_NUMBER_MODE: IMode,
    C_NUMBER_RE: String,
    HASH_COMMENT_MODE: IMode,
    IDENT_RE: String,
    NUMBER_MODE: IMode,
    NUMBER_RE: String,
    PHRASAL_WORDS_MODE: IMode,
    QUOTE_STRING_MODE: IMode,
    REGEX_MODE: IMode,
    RE_STARTERS_RE: String,
    TITLE_MODE: IMode,
    UNDERSCORE_IDENT_RE: String,
    UNDERSCORE_TITLE_MODE: IMode,
    inherit: (js.Object, js.Object) => js.Object
  ): HLJSStatic = {
    val __obj = js.Dynamic.literal(APOS_STRING_MODE = APOS_STRING_MODE, BACKSLASH_ESCAPE = BACKSLASH_ESCAPE, BINARY_NUMBER_MODE = BINARY_NUMBER_MODE, BINARY_NUMBER_RE = BINARY_NUMBER_RE, CSS_NUMBER_MODE = CSS_NUMBER_MODE, C_BLOCK_COMMENT_MODE = C_BLOCK_COMMENT_MODE, C_LINE_COMMENT_MODE = C_LINE_COMMENT_MODE, C_NUMBER_MODE = C_NUMBER_MODE, C_NUMBER_RE = C_NUMBER_RE, HASH_COMMENT_MODE = HASH_COMMENT_MODE, IDENT_RE = IDENT_RE, NUMBER_MODE = NUMBER_MODE, NUMBER_RE = NUMBER_RE, PHRASAL_WORDS_MODE = PHRASAL_WORDS_MODE, QUOTE_STRING_MODE = QUOTE_STRING_MODE, REGEX_MODE = REGEX_MODE, RE_STARTERS_RE = RE_STARTERS_RE, TITLE_MODE = TITLE_MODE, UNDERSCORE_IDENT_RE = UNDERSCORE_IDENT_RE, UNDERSCORE_TITLE_MODE = UNDERSCORE_TITLE_MODE, inherit = js.Any.fromFunction2(inherit))
  
    __obj.asInstanceOf[HLJSStatic]
  }
}

