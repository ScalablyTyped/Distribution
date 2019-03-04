package typings
package grommetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgsColorLocation extends js.Object {
  var color: js.UndefOr[java.lang.String | Anon_Dark] = js.undefined
  var location: js.Array[scala.Double]
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onHover: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
}

object Anon_ArgsColorLocation {
  @scala.inline
  def apply(
    location: js.Array[scala.Double],
    color: java.lang.String | Anon_Dark = null,
    name: java.lang.String = null,
    onClick: js.Function1[/* repeated */ js.Any, _] = null,
    onHover: js.Function1[/* repeated */ js.Any, _] = null
  ): Anon_ArgsColorLocation = {
    val __obj = js.Dynamic.literal(location = location)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onHover != null) __obj.updateDynamic("onHover")(onHover)
    __obj.asInstanceOf[Anon_ArgsColorLocation]
  }
}

