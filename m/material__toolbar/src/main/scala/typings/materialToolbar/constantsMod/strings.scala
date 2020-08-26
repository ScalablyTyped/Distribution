package typings.materialToolbar.constantsMod

import typings.materialToolbar.materialToolbarStrings.MDCToolbarColonchange
import typings.materialToolbar.materialToolbarStrings.`Dotmdc-toolbar__icon`
import typings.materialToolbar.materialToolbarStrings.`Dotmdc-toolbar__rowColonfirst-child`
import typings.materialToolbar.materialToolbarStrings.`Dotmdc-toolbar__title`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MDCStrings * / any */ @js.native
trait strings extends js.Object {
  var CHANGE_EVENT: MDCToolbarColonchange = js.native
  var FIRST_ROW_SELECTOR: `Dotmdc-toolbar__rowColonfirst-child` = js.native
  var ICON_SELECTOR: `Dotmdc-toolbar__icon` = js.native
  var TITLE_SELECTOR: `Dotmdc-toolbar__title` = js.native
}

object strings {
  @scala.inline
  def apply(
    CHANGE_EVENT: MDCToolbarColonchange,
    FIRST_ROW_SELECTOR: `Dotmdc-toolbar__rowColonfirst-child`,
    ICON_SELECTOR: `Dotmdc-toolbar__icon`,
    TITLE_SELECTOR: `Dotmdc-toolbar__title`
  ): strings = {
    val __obj = js.Dynamic.literal(CHANGE_EVENT = CHANGE_EVENT.asInstanceOf[js.Any], FIRST_ROW_SELECTOR = FIRST_ROW_SELECTOR.asInstanceOf[js.Any], ICON_SELECTOR = ICON_SELECTOR.asInstanceOf[js.Any], TITLE_SELECTOR = TITLE_SELECTOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[strings]
  }
  @scala.inline
  implicit class stringsOps[Self <: strings] (val x: Self) extends AnyVal {
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
    def setCHANGE_EVENT(value: MDCToolbarColonchange): Self = this.set("CHANGE_EVENT", value.asInstanceOf[js.Any])
    @scala.inline
    def setFIRST_ROW_SELECTOR(value: `Dotmdc-toolbar__rowColonfirst-child`): Self = this.set("FIRST_ROW_SELECTOR", value.asInstanceOf[js.Any])
    @scala.inline
    def setICON_SELECTOR(value: `Dotmdc-toolbar__icon`): Self = this.set("ICON_SELECTOR", value.asInstanceOf[js.Any])
    @scala.inline
    def setTITLE_SELECTOR(value: `Dotmdc-toolbar__title`): Self = this.set("TITLE_SELECTOR", value.asInstanceOf[js.Any])
  }
  
}

