package typings.jsBeautify

import typings.jsBeautify.jsBeautifyStrings.`after-newline`
import typings.jsBeautify.jsBeautifyStrings.`before-newline`
import typings.jsBeautify.jsBeautifyStrings.`end-expand`
import typings.jsBeautify.jsBeautifyStrings.`preserve-inline`
import typings.jsBeautify.jsBeautifyStrings.`preserve-newline`
import typings.jsBeautify.jsBeautifyStrings.collapse
import typings.jsBeautify.jsBeautifyStrings.expand
import typings.jsBeautify.jsBeautifyStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSBeautifyOptions extends CoreBeautifyOptions {
  var brace_style: js.UndefOr[collapse | expand | `end-expand` | none | `preserve-inline`] = js.native
  var break_chained_methods: js.UndefOr[Boolean] = js.native
  var comma_first: js.UndefOr[Boolean] = js.native
  var e4x: js.UndefOr[Boolean] = js.native
  var jslint_happy: js.UndefOr[Boolean] = js.native
  var keep_array_indentation: js.UndefOr[Boolean] = js.native
  var operator_position: js.UndefOr[`before-newline` | `after-newline` | `preserve-newline`] = js.native
  var space_after_anon_function: js.UndefOr[Boolean] = js.native
  var space_after_named_function: js.UndefOr[Boolean] = js.native
  var space_before_conditional: js.UndefOr[Boolean] = js.native
  var space_in_empty_paren: js.UndefOr[Boolean] = js.native
  var space_in_paren: js.UndefOr[Boolean] = js.native
  var test_output_raw: js.UndefOr[Boolean] = js.native
  var unescape_strings: js.UndefOr[Boolean] = js.native
  var unindent_chained_methods: js.UndefOr[Boolean] = js.native
}

object JSBeautifyOptions {
  @scala.inline
  def apply(): JSBeautifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSBeautifyOptions]
  }
  @scala.inline
  implicit class JSBeautifyOptionsOps[Self <: JSBeautifyOptions] (val x: Self) extends AnyVal {
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
    def setBrace_style(value: collapse | expand | `end-expand` | none | `preserve-inline`): Self = this.set("brace_style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrace_style: Self = this.set("brace_style", js.undefined)
    @scala.inline
    def setBreak_chained_methods(value: Boolean): Self = this.set("break_chained_methods", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBreak_chained_methods: Self = this.set("break_chained_methods", js.undefined)
    @scala.inline
    def setComma_first(value: Boolean): Self = this.set("comma_first", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComma_first: Self = this.set("comma_first", js.undefined)
    @scala.inline
    def setE4x(value: Boolean): Self = this.set("e4x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteE4x: Self = this.set("e4x", js.undefined)
    @scala.inline
    def setJslint_happy(value: Boolean): Self = this.set("jslint_happy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJslint_happy: Self = this.set("jslint_happy", js.undefined)
    @scala.inline
    def setKeep_array_indentation(value: Boolean): Self = this.set("keep_array_indentation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeep_array_indentation: Self = this.set("keep_array_indentation", js.undefined)
    @scala.inline
    def setOperator_position(value: `before-newline` | `after-newline` | `preserve-newline`): Self = this.set("operator_position", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperator_position: Self = this.set("operator_position", js.undefined)
    @scala.inline
    def setSpace_after_anon_function(value: Boolean): Self = this.set("space_after_anon_function", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpace_after_anon_function: Self = this.set("space_after_anon_function", js.undefined)
    @scala.inline
    def setSpace_after_named_function(value: Boolean): Self = this.set("space_after_named_function", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpace_after_named_function: Self = this.set("space_after_named_function", js.undefined)
    @scala.inline
    def setSpace_before_conditional(value: Boolean): Self = this.set("space_before_conditional", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpace_before_conditional: Self = this.set("space_before_conditional", js.undefined)
    @scala.inline
    def setSpace_in_empty_paren(value: Boolean): Self = this.set("space_in_empty_paren", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpace_in_empty_paren: Self = this.set("space_in_empty_paren", js.undefined)
    @scala.inline
    def setSpace_in_paren(value: Boolean): Self = this.set("space_in_paren", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpace_in_paren: Self = this.set("space_in_paren", js.undefined)
    @scala.inline
    def setTest_output_raw(value: Boolean): Self = this.set("test_output_raw", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTest_output_raw: Self = this.set("test_output_raw", js.undefined)
    @scala.inline
    def setUnescape_strings(value: Boolean): Self = this.set("unescape_strings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnescape_strings: Self = this.set("unescape_strings", js.undefined)
    @scala.inline
    def setUnindent_chained_methods(value: Boolean): Self = this.set("unindent_chained_methods", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnindent_chained_methods: Self = this.set("unindent_chained_methods", js.undefined)
  }
  
}

