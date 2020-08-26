package typings.materialTextfield.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ARIACONTROLS extends js.Object {
  var ARIA_CONTROLS: String = js.native
  var INPUT_SELECTOR: String = js.native
  var LABEL_SELECTOR: String = js.native
  var LEADING_ICON_SELECTOR: String = js.native
  var LINE_RIPPLE_SELECTOR: String = js.native
  var OUTLINE_SELECTOR: String = js.native
  var PREFIX_SELECTOR: String = js.native
  var SUFFIX_SELECTOR: String = js.native
  var TRAILING_ICON_SELECTOR: String = js.native
}

object ARIACONTROLS {
  @scala.inline
  def apply(
    ARIA_CONTROLS: String,
    INPUT_SELECTOR: String,
    LABEL_SELECTOR: String,
    LEADING_ICON_SELECTOR: String,
    LINE_RIPPLE_SELECTOR: String,
    OUTLINE_SELECTOR: String,
    PREFIX_SELECTOR: String,
    SUFFIX_SELECTOR: String,
    TRAILING_ICON_SELECTOR: String
  ): ARIACONTROLS = {
    val __obj = js.Dynamic.literal(ARIA_CONTROLS = ARIA_CONTROLS.asInstanceOf[js.Any], INPUT_SELECTOR = INPUT_SELECTOR.asInstanceOf[js.Any], LABEL_SELECTOR = LABEL_SELECTOR.asInstanceOf[js.Any], LEADING_ICON_SELECTOR = LEADING_ICON_SELECTOR.asInstanceOf[js.Any], LINE_RIPPLE_SELECTOR = LINE_RIPPLE_SELECTOR.asInstanceOf[js.Any], OUTLINE_SELECTOR = OUTLINE_SELECTOR.asInstanceOf[js.Any], PREFIX_SELECTOR = PREFIX_SELECTOR.asInstanceOf[js.Any], SUFFIX_SELECTOR = SUFFIX_SELECTOR.asInstanceOf[js.Any], TRAILING_ICON_SELECTOR = TRAILING_ICON_SELECTOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARIACONTROLS]
  }
  @scala.inline
  implicit class ARIACONTROLSOps[Self <: ARIACONTROLS] (val x: Self) extends AnyVal {
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
    def setARIA_CONTROLS(value: String): Self = this.set("ARIA_CONTROLS", value.asInstanceOf[js.Any])
    @scala.inline
    def setINPUT_SELECTOR(value: String): Self = this.set("INPUT_SELECTOR", value.asInstanceOf[js.Any])
    @scala.inline
    def setLABEL_SELECTOR(value: String): Self = this.set("LABEL_SELECTOR", value.asInstanceOf[js.Any])
    @scala.inline
    def setLEADING_ICON_SELECTOR(value: String): Self = this.set("LEADING_ICON_SELECTOR", value.asInstanceOf[js.Any])
    @scala.inline
    def setLINE_RIPPLE_SELECTOR(value: String): Self = this.set("LINE_RIPPLE_SELECTOR", value.asInstanceOf[js.Any])
    @scala.inline
    def setOUTLINE_SELECTOR(value: String): Self = this.set("OUTLINE_SELECTOR", value.asInstanceOf[js.Any])
    @scala.inline
    def setPREFIX_SELECTOR(value: String): Self = this.set("PREFIX_SELECTOR", value.asInstanceOf[js.Any])
    @scala.inline
    def setSUFFIX_SELECTOR(value: String): Self = this.set("SUFFIX_SELECTOR", value.asInstanceOf[js.Any])
    @scala.inline
    def setTRAILING_ICON_SELECTOR(value: String): Self = this.set("TRAILING_ICON_SELECTOR", value.asInstanceOf[js.Any])
  }
  
}

