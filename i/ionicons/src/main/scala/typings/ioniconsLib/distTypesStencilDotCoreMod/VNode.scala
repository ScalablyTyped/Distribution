package typings
package ioniconsLib.distTypesStencilDotCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VNode extends js.Object {
  @JSName("$attrs$")
  var $attrs$: js.UndefOr[js.Any] = js.undefined
  @JSName("$children$")
  var $children$: js.UndefOr[js.Array[VNode]] = js.undefined
  @JSName("$elm$")
  var $elm$: js.UndefOr[js.Any] = js.undefined
  @JSName("$flags$")
  var $flags$: scala.Double
  @JSName("$key$")
  var $key$: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  @JSName("$name$")
  var $name$: js.UndefOr[java.lang.String] = js.undefined
  @JSName("$tag$")
  var $tag$: js.UndefOr[java.lang.String | scala.Double | js.Function] = js.undefined
  @JSName("$text$")
  var $text$: js.UndefOr[java.lang.String] = js.undefined
}

object VNode {
  @scala.inline
  def apply(
    $flags$: scala.Double,
    $attrs$: js.Any = null,
    $children$: js.Array[VNode] = null,
    $elm$: js.Any = null,
    $key$: java.lang.String | scala.Double = null,
    $name$: java.lang.String = null,
    $tag$: java.lang.String | scala.Double | js.Function = null,
    $text$: java.lang.String = null
  ): VNode = {
    val __obj = js.Dynamic.literal($flags$ = $flags$)
    if ($attrs$ != null) __obj.updateDynamic("$attrs$")($attrs$)
    if ($children$ != null) __obj.updateDynamic("$children$")($children$)
    if ($elm$ != null) __obj.updateDynamic("$elm$")($elm$)
    if ($key$ != null) __obj.updateDynamic("$key$")($key$.asInstanceOf[js.Any])
    if ($name$ != null) __obj.updateDynamic("$name$")($name$)
    if ($tag$ != null) __obj.updateDynamic("$tag$")($tag$.asInstanceOf[js.Any])
    if ($text$ != null) __obj.updateDynamic("$text$")($text$)
    __obj.asInstanceOf[VNode]
  }
}

