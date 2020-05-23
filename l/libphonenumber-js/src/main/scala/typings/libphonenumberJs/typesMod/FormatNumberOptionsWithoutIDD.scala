package typings.libphonenumberJs.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatNumberOptionsWithoutIDD extends js.Object {
  var formatExtension: js.UndefOr[FormatExtension] = js.undefined
  var v2: js.UndefOr[Boolean] = js.undefined
}

object FormatNumberOptionsWithoutIDD {
  @scala.inline
  def apply(
    formatExtension: (/* formattedNumber */ String, /* extension */ Extension, /* metadata */ Metadata) => String = null,
    v2: js.UndefOr[Boolean] = js.undefined
  ): FormatNumberOptionsWithoutIDD = {
    val __obj = js.Dynamic.literal()
    if (formatExtension != null) __obj.updateDynamic("formatExtension")(js.Any.fromFunction3(formatExtension))
    if (!js.isUndefined(v2)) __obj.updateDynamic("v2")(v2.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatNumberOptionsWithoutIDD]
  }
}

