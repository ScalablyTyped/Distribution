package typings.atIonicCore.distTypesStencilDotCoreMod

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
  var $flags$: Double
  @JSName("$key$")
  var $key$: js.UndefOr[String | Double] = js.undefined
  @JSName("$name$")
  var $name$: js.UndefOr[String] = js.undefined
  @JSName("$tag$")
  var $tag$: js.UndefOr[String | Double | js.Function] = js.undefined
  @JSName("$text$")
  var $text$: js.UndefOr[String] = js.undefined
}

object VNode {
  @scala.inline
  def apply(
    $flags$: Double,
    $attrs$: js.Any = null,
    $children$: js.Array[VNode] = null,
    $elm$: js.Any = null,
    $key$: String | Double = null,
    $name$: String = null,
    $tag$: String | Double | js.Function = null,
    $text$: String = null
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

