package typings.materialList.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LISTITEMACTIVATEDCLASS extends js.Object {
  var LIST_ITEM_ACTIVATED_CLASS: String = js.native
  var LIST_ITEM_CLASS: String = js.native
  var LIST_ITEM_DISABLED_CLASS: String = js.native
  var LIST_ITEM_PRIMARY_TEXT_CLASS: String = js.native
  var LIST_ITEM_SELECTED_CLASS: String = js.native
  var LIST_ITEM_TEXT_CLASS: String = js.native
  var ROOT: String = js.native
}

object LISTITEMACTIVATEDCLASS {
  @scala.inline
  def apply(
    LIST_ITEM_ACTIVATED_CLASS: String,
    LIST_ITEM_CLASS: String,
    LIST_ITEM_DISABLED_CLASS: String,
    LIST_ITEM_PRIMARY_TEXT_CLASS: String,
    LIST_ITEM_SELECTED_CLASS: String,
    LIST_ITEM_TEXT_CLASS: String,
    ROOT: String
  ): LISTITEMACTIVATEDCLASS = {
    val __obj = js.Dynamic.literal(LIST_ITEM_ACTIVATED_CLASS = LIST_ITEM_ACTIVATED_CLASS.asInstanceOf[js.Any], LIST_ITEM_CLASS = LIST_ITEM_CLASS.asInstanceOf[js.Any], LIST_ITEM_DISABLED_CLASS = LIST_ITEM_DISABLED_CLASS.asInstanceOf[js.Any], LIST_ITEM_PRIMARY_TEXT_CLASS = LIST_ITEM_PRIMARY_TEXT_CLASS.asInstanceOf[js.Any], LIST_ITEM_SELECTED_CLASS = LIST_ITEM_SELECTED_CLASS.asInstanceOf[js.Any], LIST_ITEM_TEXT_CLASS = LIST_ITEM_TEXT_CLASS.asInstanceOf[js.Any], ROOT = ROOT.asInstanceOf[js.Any])
    __obj.asInstanceOf[LISTITEMACTIVATEDCLASS]
  }
  @scala.inline
  implicit class LISTITEMACTIVATEDCLASSOps[Self <: LISTITEMACTIVATEDCLASS] (val x: Self) extends AnyVal {
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
    def setLIST_ITEM_ACTIVATED_CLASS(value: String): Self = this.set("LIST_ITEM_ACTIVATED_CLASS", value.asInstanceOf[js.Any])
    @scala.inline
    def setLIST_ITEM_CLASS(value: String): Self = this.set("LIST_ITEM_CLASS", value.asInstanceOf[js.Any])
    @scala.inline
    def setLIST_ITEM_DISABLED_CLASS(value: String): Self = this.set("LIST_ITEM_DISABLED_CLASS", value.asInstanceOf[js.Any])
    @scala.inline
    def setLIST_ITEM_PRIMARY_TEXT_CLASS(value: String): Self = this.set("LIST_ITEM_PRIMARY_TEXT_CLASS", value.asInstanceOf[js.Any])
    @scala.inline
    def setLIST_ITEM_SELECTED_CLASS(value: String): Self = this.set("LIST_ITEM_SELECTED_CLASS", value.asInstanceOf[js.Any])
    @scala.inline
    def setLIST_ITEM_TEXT_CLASS(value: String): Self = this.set("LIST_ITEM_TEXT_CLASS", value.asInstanceOf[js.Any])
    @scala.inline
    def setROOT(value: String): Self = this.set("ROOT", value.asInstanceOf[js.Any])
  }
  
}

