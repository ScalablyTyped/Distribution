package typings.libphonenumberJs.mod

import typings.libphonenumberJs.typesMod.CountryCode
import typings.libphonenumberJs.typesMod.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatNumberOptions extends js.Object {
  var formatExtension: js.UndefOr[FormatExtension] = js.undefined
  var fromCountry: js.UndefOr[CountryCode] = js.undefined
  var humanReadable: js.UndefOr[Boolean] = js.undefined
  var v2: js.UndefOr[Boolean] = js.undefined
}

object FormatNumberOptions {
  @scala.inline
  def apply(
    formatExtension: (/* number */ String, /* extension */ String, /* metadata */ Metadata) => String = null,
    fromCountry: CountryCode = null,
    humanReadable: js.UndefOr[Boolean] = js.undefined,
    v2: js.UndefOr[Boolean] = js.undefined
  ): FormatNumberOptions = {
    val __obj = js.Dynamic.literal()
    if (formatExtension != null) __obj.updateDynamic("formatExtension")(js.Any.fromFunction3(formatExtension))
    if (fromCountry != null) __obj.updateDynamic("fromCountry")(fromCountry.asInstanceOf[js.Any])
    if (!js.isUndefined(humanReadable)) __obj.updateDynamic("humanReadable")(humanReadable.asInstanceOf[js.Any])
    if (!js.isUndefined(v2)) __obj.updateDynamic("v2")(v2.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatNumberOptions]
  }
}

