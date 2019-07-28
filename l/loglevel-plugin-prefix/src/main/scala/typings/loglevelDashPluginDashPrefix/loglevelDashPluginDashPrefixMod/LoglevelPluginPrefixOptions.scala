package typings.loglevelDashPluginDashPrefix.loglevelDashPluginDashPrefixMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoglevelPluginPrefixOptions extends js.Object {
  var format: js.UndefOr[
    js.Function3[
      /* level */ String, 
      /* name */ js.UndefOr[String], 
      /* timestamp */ Date, 
      js.UndefOr[String]
    ]
  ] = js.undefined
  var levelFormatter: js.UndefOr[js.Function1[/* level */ String, String]] = js.undefined
  var nameFormatter: js.UndefOr[js.Function1[/* name */ js.UndefOr[String], String]] = js.undefined
  var template: js.UndefOr[String] = js.undefined
  var timestampFormatter: js.UndefOr[js.Function1[/* date */ Date, String]] = js.undefined
}

object LoglevelPluginPrefixOptions {
  @scala.inline
  def apply(
    format: (/* level */ String, /* name */ js.UndefOr[String], /* timestamp */ Date) => js.UndefOr[String] = null,
    levelFormatter: /* level */ String => String = null,
    nameFormatter: /* name */ js.UndefOr[String] => String = null,
    template: String = null,
    timestampFormatter: /* date */ Date => String = null
  ): LoglevelPluginPrefixOptions = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction3(format))
    if (levelFormatter != null) __obj.updateDynamic("levelFormatter")(js.Any.fromFunction1(levelFormatter))
    if (nameFormatter != null) __obj.updateDynamic("nameFormatter")(js.Any.fromFunction1(nameFormatter))
    if (template != null) __obj.updateDynamic("template")(template)
    if (timestampFormatter != null) __obj.updateDynamic("timestampFormatter")(js.Any.fromFunction1(timestampFormatter))
    __obj.asInstanceOf[LoglevelPluginPrefixOptions]
  }
}

