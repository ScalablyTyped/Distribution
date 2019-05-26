package typings
package loglevelDashPluginDashPrefixLib.loglevelDashPluginDashPrefixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoglevelPluginPrefixOptions extends js.Object {
  var format: js.UndefOr[
    js.Function3[
      /* level */ java.lang.String, 
      /* name */ js.UndefOr[java.lang.String], 
      /* timestamp */ stdLib.Date, 
      js.UndefOr[java.lang.String]
    ]
  ] = js.undefined
  var levelFormatter: js.UndefOr[js.Function1[/* level */ java.lang.String, java.lang.String]] = js.undefined
  var nameFormatter: js.UndefOr[js.Function1[/* name */ js.UndefOr[java.lang.String], java.lang.String]] = js.undefined
  var template: js.UndefOr[java.lang.String] = js.undefined
  var timestampFormatter: js.UndefOr[js.Function1[/* date */ stdLib.Date, java.lang.String]] = js.undefined
}

object LoglevelPluginPrefixOptions {
  @scala.inline
  def apply(
    format: (/* level */ java.lang.String, /* name */ js.UndefOr[java.lang.String], /* timestamp */ stdLib.Date) => js.UndefOr[java.lang.String] = null,
    levelFormatter: /* level */ java.lang.String => java.lang.String = null,
    nameFormatter: /* name */ js.UndefOr[java.lang.String] => java.lang.String = null,
    template: java.lang.String = null,
    timestampFormatter: /* date */ stdLib.Date => java.lang.String = null
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

