package typings.highlightJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HLJSStatic extends js.Object {
  var APOS_STRING_MODE: IMode = js.native
  // Common modes
  var BACKSLASH_ESCAPE: IMode = js.native
  var BINARY_NUMBER_MODE: IMode = js.native
  var BINARY_NUMBER_RE: String = js.native
  var CSS_NUMBER_MODE: IMode = js.native
  var C_BLOCK_COMMENT_MODE: IMode = js.native
  var C_LINE_COMMENT_MODE: IMode = js.native
  var C_NUMBER_MODE: IMode = js.native
  var C_NUMBER_RE: String = js.native
  var HASH_COMMENT_MODE: IMode = js.native
  // Common regexps
  var IDENT_RE: String = js.native
  var NUMBER_MODE: IMode = js.native
  var NUMBER_RE: String = js.native
  var PHRASAL_WORDS_MODE: IMode = js.native
  var QUOTE_STRING_MODE: IMode = js.native
  var REGEX_MODE: IMode = js.native
  var RE_STARTERS_RE: String = js.native
  var TITLE_MODE: IMode = js.native
  var UNDERSCORE_IDENT_RE: String = js.native
  var UNDERSCORE_TITLE_MODE: IMode = js.native
  def inherit(parent: js.Object, obj: js.Object): js.Object = js.native
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
    val __obj = js.Dynamic.literal(APOS_STRING_MODE = APOS_STRING_MODE.asInstanceOf[js.Any], BACKSLASH_ESCAPE = BACKSLASH_ESCAPE.asInstanceOf[js.Any], BINARY_NUMBER_MODE = BINARY_NUMBER_MODE.asInstanceOf[js.Any], BINARY_NUMBER_RE = BINARY_NUMBER_RE.asInstanceOf[js.Any], CSS_NUMBER_MODE = CSS_NUMBER_MODE.asInstanceOf[js.Any], C_BLOCK_COMMENT_MODE = C_BLOCK_COMMENT_MODE.asInstanceOf[js.Any], C_LINE_COMMENT_MODE = C_LINE_COMMENT_MODE.asInstanceOf[js.Any], C_NUMBER_MODE = C_NUMBER_MODE.asInstanceOf[js.Any], C_NUMBER_RE = C_NUMBER_RE.asInstanceOf[js.Any], HASH_COMMENT_MODE = HASH_COMMENT_MODE.asInstanceOf[js.Any], IDENT_RE = IDENT_RE.asInstanceOf[js.Any], NUMBER_MODE = NUMBER_MODE.asInstanceOf[js.Any], NUMBER_RE = NUMBER_RE.asInstanceOf[js.Any], PHRASAL_WORDS_MODE = PHRASAL_WORDS_MODE.asInstanceOf[js.Any], QUOTE_STRING_MODE = QUOTE_STRING_MODE.asInstanceOf[js.Any], REGEX_MODE = REGEX_MODE.asInstanceOf[js.Any], RE_STARTERS_RE = RE_STARTERS_RE.asInstanceOf[js.Any], TITLE_MODE = TITLE_MODE.asInstanceOf[js.Any], UNDERSCORE_IDENT_RE = UNDERSCORE_IDENT_RE.asInstanceOf[js.Any], UNDERSCORE_TITLE_MODE = UNDERSCORE_TITLE_MODE.asInstanceOf[js.Any], inherit = js.Any.fromFunction2(inherit))
    __obj.asInstanceOf[HLJSStatic]
  }
  @scala.inline
  implicit class HLJSStaticOps[Self <: HLJSStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAPOS_STRING_MODE(value: IMode): Self = this.set("APOS_STRING_MODE", value.asInstanceOf[js.Any])
    @scala.inline
    def setBACKSLASH_ESCAPE(value: IMode): Self = this.set("BACKSLASH_ESCAPE", value.asInstanceOf[js.Any])
    @scala.inline
    def setBINARY_NUMBER_MODE(value: IMode): Self = this.set("BINARY_NUMBER_MODE", value.asInstanceOf[js.Any])
    @scala.inline
    def setBINARY_NUMBER_RE(value: String): Self = this.set("BINARY_NUMBER_RE", value.asInstanceOf[js.Any])
    @scala.inline
    def setCSS_NUMBER_MODE(value: IMode): Self = this.set("CSS_NUMBER_MODE", value.asInstanceOf[js.Any])
    @scala.inline
    def setC_BLOCK_COMMENT_MODE(value: IMode): Self = this.set("C_BLOCK_COMMENT_MODE", value.asInstanceOf[js.Any])
    @scala.inline
    def setC_LINE_COMMENT_MODE(value: IMode): Self = this.set("C_LINE_COMMENT_MODE", value.asInstanceOf[js.Any])
    @scala.inline
    def setC_NUMBER_MODE(value: IMode): Self = this.set("C_NUMBER_MODE", value.asInstanceOf[js.Any])
    @scala.inline
    def setC_NUMBER_RE(value: String): Self = this.set("C_NUMBER_RE", value.asInstanceOf[js.Any])
    @scala.inline
    def setHASH_COMMENT_MODE(value: IMode): Self = this.set("HASH_COMMENT_MODE", value.asInstanceOf[js.Any])
    @scala.inline
    def setIDENT_RE(value: String): Self = this.set("IDENT_RE", value.asInstanceOf[js.Any])
    @scala.inline
    def setNUMBER_MODE(value: IMode): Self = this.set("NUMBER_MODE", value.asInstanceOf[js.Any])
    @scala.inline
    def setNUMBER_RE(value: String): Self = this.set("NUMBER_RE", value.asInstanceOf[js.Any])
    @scala.inline
    def setPHRASAL_WORDS_MODE(value: IMode): Self = this.set("PHRASAL_WORDS_MODE", value.asInstanceOf[js.Any])
    @scala.inline
    def setQUOTE_STRING_MODE(value: IMode): Self = this.set("QUOTE_STRING_MODE", value.asInstanceOf[js.Any])
    @scala.inline
    def setREGEX_MODE(value: IMode): Self = this.set("REGEX_MODE", value.asInstanceOf[js.Any])
    @scala.inline
    def setRE_STARTERS_RE(value: String): Self = this.set("RE_STARTERS_RE", value.asInstanceOf[js.Any])
    @scala.inline
    def setTITLE_MODE(value: IMode): Self = this.set("TITLE_MODE", value.asInstanceOf[js.Any])
    @scala.inline
    def setUNDERSCORE_IDENT_RE(value: String): Self = this.set("UNDERSCORE_IDENT_RE", value.asInstanceOf[js.Any])
    @scala.inline
    def setUNDERSCORE_TITLE_MODE(value: IMode): Self = this.set("UNDERSCORE_TITLE_MODE", value.asInstanceOf[js.Any])
    @scala.inline
    def setInherit(value: (js.Object, js.Object) => js.Object): Self = this.set("inherit", js.Any.fromFunction2(value))
  }
  
}

