package typings
package knockstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockstrapCarouselDefaultsIdItemsDataConverted extends KnockstrapCarouselDefaultsIdDataConverted {
  var items: js.Any
}

object KnockstrapCarouselDefaultsIdItemsDataConverted {
  @scala.inline
  def apply(id: knockoutLib.KnockoutComputed[java.lang.String], items: js.Any): KnockstrapCarouselDefaultsIdItemsDataConverted = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[KnockstrapCarouselDefaultsIdItemsDataConverted]
  }
}

