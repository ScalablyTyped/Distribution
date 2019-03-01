package typings
package highlightDotJsLib.highlightDotJsMod.hljsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HLJSStatic extends js.Object {
  var APOS_STRING_MODE: IMode
  // Common modes
  var BACKSLASH_ESCAPE: IMode
  var BINARY_NUMBER_MODE: IMode
  var BINARY_NUMBER_RE: java.lang.String
  var CSS_NUMBER_MODE: IMode
  var C_BLOCK_COMMENT_MODE: IMode
  var C_LINE_COMMENT_MODE: IMode
  var C_NUMBER_MODE: IMode
  var C_NUMBER_RE: java.lang.String
  var HASH_COMMENT_MODE: IMode
  // Common regexps
  var IDENT_RE: java.lang.String
  var NUMBER_MODE: IMode
  var NUMBER_RE: java.lang.String
  var PHRASAL_WORDS_MODE: IMode
  var QUOTE_STRING_MODE: IMode
  var REGEX_MODE: IMode
  var RE_STARTERS_RE: java.lang.String
  var TITLE_MODE: IMode
  var UNDERSCORE_IDENT_RE: java.lang.String
  var UNDERSCORE_TITLE_MODE: IMode
  def inherit(parent: js.Object, obj: js.Object): js.Object
}

object HLJSStatic {
  @scala.inline
  def apply(
    APOS_STRING_MODE: IMode,
    BACKSLASH_ESCAPE: IMode,
    BINARY_NUMBER_MODE: IMode,
    BINARY_NUMBER_RE: java.lang.String,
    CSS_NUMBER_MODE: IMode,
    C_BLOCK_COMMENT_MODE: IMode,
    C_LINE_COMMENT_MODE: IMode,
    C_NUMBER_MODE: IMode,
    C_NUMBER_RE: java.lang.String,
    HASH_COMMENT_MODE: IMode,
    IDENT_RE: java.lang.String,
    NUMBER_MODE: IMode,
    NUMBER_RE: java.lang.String,
    PHRASAL_WORDS_MODE: IMode,
    QUOTE_STRING_MODE: IMode,
    REGEX_MODE: IMode,
    RE_STARTERS_RE: java.lang.String,
    TITLE_MODE: IMode,
    UNDERSCORE_IDENT_RE: java.lang.String,
    UNDERSCORE_TITLE_MODE: IMode,
    inherit: js.Function2[js.Object, js.Object, js.Object]
  ): HLJSStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("APOS_STRING_MODE")(APOS_STRING_MODE)
    __obj.updateDynamic("BACKSLASH_ESCAPE")(BACKSLASH_ESCAPE)
    __obj.updateDynamic("BINARY_NUMBER_MODE")(BINARY_NUMBER_MODE)
    __obj.updateDynamic("BINARY_NUMBER_RE")(BINARY_NUMBER_RE)
    __obj.updateDynamic("CSS_NUMBER_MODE")(CSS_NUMBER_MODE)
    __obj.updateDynamic("C_BLOCK_COMMENT_MODE")(C_BLOCK_COMMENT_MODE)
    __obj.updateDynamic("C_LINE_COMMENT_MODE")(C_LINE_COMMENT_MODE)
    __obj.updateDynamic("C_NUMBER_MODE")(C_NUMBER_MODE)
    __obj.updateDynamic("C_NUMBER_RE")(C_NUMBER_RE)
    __obj.updateDynamic("HASH_COMMENT_MODE")(HASH_COMMENT_MODE)
    __obj.updateDynamic("IDENT_RE")(IDENT_RE)
    __obj.updateDynamic("NUMBER_MODE")(NUMBER_MODE)
    __obj.updateDynamic("NUMBER_RE")(NUMBER_RE)
    __obj.updateDynamic("PHRASAL_WORDS_MODE")(PHRASAL_WORDS_MODE)
    __obj.updateDynamic("QUOTE_STRING_MODE")(QUOTE_STRING_MODE)
    __obj.updateDynamic("REGEX_MODE")(REGEX_MODE)
    __obj.updateDynamic("RE_STARTERS_RE")(RE_STARTERS_RE)
    __obj.updateDynamic("TITLE_MODE")(TITLE_MODE)
    __obj.updateDynamic("UNDERSCORE_IDENT_RE")(UNDERSCORE_IDENT_RE)
    __obj.updateDynamic("UNDERSCORE_TITLE_MODE")(UNDERSCORE_TITLE_MODE)
    __obj.updateDynamic("inherit")(inherit)
    __obj.asInstanceOf[HLJSStatic]
  }
}

