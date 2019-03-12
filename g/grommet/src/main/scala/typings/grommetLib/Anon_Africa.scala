package typings
package grommetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Africa extends js.Object {
  var color: js.UndefOr[java.lang.String | Anon_Dark] = js.undefined
  var name: grommetLib.grommetLibStrings.Africa | grommetLib.grommetLibStrings.Asia | grommetLib.grommetLibStrings.Australia | grommetLib.grommetLibStrings.Europe | (grommetLib.grommetLibStrings.`North America`) | (grommetLib.grommetLibStrings.`South America`)
  var onClick: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onHover: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
}

object Anon_Africa {
  @scala.inline
  def apply(
    name: grommetLib.grommetLibStrings.Africa | grommetLib.grommetLibStrings.Asia | grommetLib.grommetLibStrings.Australia | grommetLib.grommetLibStrings.Europe | (grommetLib.grommetLibStrings.`North America`) | (grommetLib.grommetLibStrings.`South America`),
    color: java.lang.String | Anon_Dark = null,
    onClick: /* repeated */ js.Any => _ = null,
    onHover: /* repeated */ js.Any => _ = null
  ): Anon_Africa = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onHover != null) __obj.updateDynamic("onHover")(js.Any.fromFunction1(onHover))
    __obj.asInstanceOf[Anon_Africa]
  }
}

