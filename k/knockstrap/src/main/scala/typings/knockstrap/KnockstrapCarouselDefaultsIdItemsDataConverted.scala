package typings.knockstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockstrapCarouselDefaultsIdItemsDataConverted extends KnockstrapCarouselDefaultsIdDataConverted {
  var items: js.Any = js.native
}

object KnockstrapCarouselDefaultsIdItemsDataConverted {
  @scala.inline
  def apply(
    id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<string> */ js.Any,
    items: js.Any
  ): KnockstrapCarouselDefaultsIdItemsDataConverted = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockstrapCarouselDefaultsIdItemsDataConverted]
  }
  @scala.inline
  implicit class KnockstrapCarouselDefaultsIdItemsDataConvertedOps[Self <: KnockstrapCarouselDefaultsIdItemsDataConverted] (val x: Self) extends AnyVal {
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
    def setItems(value: js.Any): Self = this.set("items", value.asInstanceOf[js.Any])
  }
  
}

