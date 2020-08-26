package typings.materialToolbar.constantsMod

import typings.materialToolbar.materialToolbarNumbers.`1.25`
import typings.materialToolbar.materialToolbarNumbers.`2.125`
import typings.materialToolbar.materialToolbarNumbers.`56`
import typings.materialToolbar.materialToolbarNumbers.`600`
import typings.materialToolbar.materialToolbarNumbers.`64`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MDCNumbers * / any */ @js.native
trait numbers extends js.Object {
  var MAX_TITLE_SIZE: `2.125` = js.native
  var MIN_TITLE_SIZE: `1.25` = js.native
  var TOOLBAR_MOBILE_BREAKPOINT: `600` = js.native
  var TOOLBAR_ROW_HEIGHT: `64` = js.native
  var TOOLBAR_ROW_MOBILE_HEIGHT: `56` = js.native
}

object numbers {
  @scala.inline
  def apply(
    MAX_TITLE_SIZE: `2.125`,
    MIN_TITLE_SIZE: `1.25`,
    TOOLBAR_MOBILE_BREAKPOINT: `600`,
    TOOLBAR_ROW_HEIGHT: `64`,
    TOOLBAR_ROW_MOBILE_HEIGHT: `56`
  ): numbers = {
    val __obj = js.Dynamic.literal(MAX_TITLE_SIZE = MAX_TITLE_SIZE.asInstanceOf[js.Any], MIN_TITLE_SIZE = MIN_TITLE_SIZE.asInstanceOf[js.Any], TOOLBAR_MOBILE_BREAKPOINT = TOOLBAR_MOBILE_BREAKPOINT.asInstanceOf[js.Any], TOOLBAR_ROW_HEIGHT = TOOLBAR_ROW_HEIGHT.asInstanceOf[js.Any], TOOLBAR_ROW_MOBILE_HEIGHT = TOOLBAR_ROW_MOBILE_HEIGHT.asInstanceOf[js.Any])
    __obj.asInstanceOf[numbers]
  }
  @scala.inline
  implicit class numbersOps[Self <: numbers] (val x: Self) extends AnyVal {
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
    def setMAX_TITLE_SIZE(value: `2.125`): Self = this.set("MAX_TITLE_SIZE", value.asInstanceOf[js.Any])
    @scala.inline
    def setMIN_TITLE_SIZE(value: `1.25`): Self = this.set("MIN_TITLE_SIZE", value.asInstanceOf[js.Any])
    @scala.inline
    def setTOOLBAR_MOBILE_BREAKPOINT(value: `600`): Self = this.set("TOOLBAR_MOBILE_BREAKPOINT", value.asInstanceOf[js.Any])
    @scala.inline
    def setTOOLBAR_ROW_HEIGHT(value: `64`): Self = this.set("TOOLBAR_ROW_HEIGHT", value.asInstanceOf[js.Any])
    @scala.inline
    def setTOOLBAR_ROW_MOBILE_HEIGHT(value: `56`): Self = this.set("TOOLBAR_ROW_MOBILE_HEIGHT", value.asInstanceOf[js.Any])
  }
  
}

