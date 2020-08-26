package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The card for presenting a carousel of options to select from.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2IntentMessageCarouselSelect extends js.Object {
  /**
    * Required. Carousel items.
    */
  var items: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2IntentMessageCarouselSelectItem]] = js.native
}

object SchemaGoogleCloudDialogflowV2IntentMessageCarouselSelect {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2IntentMessageCarouselSelect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2IntentMessageCarouselSelect]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2IntentMessageCarouselSelectOps[Self <: SchemaGoogleCloudDialogflowV2IntentMessageCarouselSelect] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: SchemaGoogleCloudDialogflowV2IntentMessageCarouselSelectItem*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[SchemaGoogleCloudDialogflowV2IntentMessageCarouselSelectItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
  
}

