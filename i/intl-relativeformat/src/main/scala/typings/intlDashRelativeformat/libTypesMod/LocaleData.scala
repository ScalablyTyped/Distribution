package typings.intlDashRelativeformat.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocaleData extends js.Object {
  var fields: js.UndefOr[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ f in intl-relativeformat.intl-relativeformat/lib/types.DATA_FIELD ]: {  displayName  :string,   relative  :std.Record<string, string>,   relativePeriod? :string,   relativeTime  :{  future  :std.Record<string, string>,   past  :std.Record<string, string>}}}
    */ typings.intlDashRelativeformat.intlDashRelativeformatStrings.LocaleData with js.Any
  ] = js.undefined
  var locale: String
  var parentLocale: js.UndefOr[String] = js.undefined
}

object LocaleData {
  @scala.inline
  def apply(
    locale: String,
    fields: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ f in intl-relativeformat.intl-relativeformat/lib/types.DATA_FIELD ]: {  displayName  :string,   relative  :std.Record<string, string>,   relativePeriod? :string,   relativeTime  :{  future  :std.Record<string, string>,   past  :std.Record<string, string>}}}
    */ typings.intlDashRelativeformat.intlDashRelativeformatStrings.LocaleData with js.Any = null,
    parentLocale: String = null
  ): LocaleData = {
    val __obj = js.Dynamic.literal(locale = locale)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (parentLocale != null) __obj.updateDynamic("parentLocale")(parentLocale)
    __obj.asInstanceOf[LocaleData]
  }
}

