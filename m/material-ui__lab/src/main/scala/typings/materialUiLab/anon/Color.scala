package typings.materialUiLab.anon

import typings.materialUiLab.materialUiLabStrings.`end-ellipsis`
import typings.materialUiLab.materialUiLabStrings.`start-ellipsis`
import typings.materialUiLab.materialUiLabStrings.first
import typings.materialUiLab.materialUiLabStrings.large
import typings.materialUiLab.materialUiLabStrings.last
import typings.materialUiLab.materialUiLabStrings.medium
import typings.materialUiLab.materialUiLabStrings.next
import typings.materialUiLab.materialUiLabStrings.outlined
import typings.materialUiLab.materialUiLabStrings.page
import typings.materialUiLab.materialUiLabStrings.previous
import typings.materialUiLab.materialUiLabStrings.primary
import typings.materialUiLab.materialUiLabStrings.round
import typings.materialUiLab.materialUiLabStrings.rounded
import typings.materialUiLab.materialUiLabStrings.secondary
import typings.materialUiLab.materialUiLabStrings.small
import typings.materialUiLab.materialUiLabStrings.standard
import typings.materialUiLab.materialUiLabStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Color extends js.Object {
  /**
    * The active color.
    */
  var color: js.UndefOr[standard | primary | secondary] = js.native
  /**
    * If `true`, the item will be disabled.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * The current page number.
    */
  var page: js.UndefOr[Double] = js.native
  /**
    * If `true` the pagination item is selected.
    */
  var selected: js.UndefOr[Boolean] = js.native
  /**
    * The shape of the pagination item.
    */
  var shape: js.UndefOr[round | rounded] = js.native
  /**
    * The size of the pagination item.
    */
  var size: js.UndefOr[small | medium | large] = js.native
  /**
    * The type of pagination item.
    */
  var `type`: js.UndefOr[page | first | last | next | previous | `start-ellipsis` | `end-ellipsis`] = js.native
  /**
    * The pagination item variant.
    */
  var variant: js.UndefOr[text | outlined] = js.native
}

object Color {
  @scala.inline
  def apply(): Color = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Color]
  }
  @scala.inline
  implicit class ColorOps[Self <: Color] (val x: Self) extends AnyVal {
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
    def setColor(value: standard | primary | secondary): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    @scala.inline
    def setShape(value: round | rounded): Self = this.set("shape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
    @scala.inline
    def setSize(value: small | medium | large): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setType(value: page | first | last | next | previous | `start-ellipsis` | `end-ellipsis`): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVariant(value: text | outlined): Self = this.set("variant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariant: Self = this.set("variant", js.undefined)
  }
  
}

