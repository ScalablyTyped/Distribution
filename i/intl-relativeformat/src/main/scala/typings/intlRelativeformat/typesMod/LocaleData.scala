package typings.intlRelativeformat.typesMod

import typings.intlRelativeformat.anon.finDATAFIELDdisplayNamest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocaleData extends js.Object {
  var fields: js.UndefOr[finDATAFIELDdisplayNamest] = js.undefined
  var locale: String
  var parentLocale: js.UndefOr[String] = js.undefined
}

object LocaleData {
  @scala.inline
  def apply(locale: String, fields: finDATAFIELDdisplayNamest = null, parentLocale: String = null): LocaleData = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (parentLocale != null) __obj.updateDynamic("parentLocale")(parentLocale.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocaleData]
  }
}

