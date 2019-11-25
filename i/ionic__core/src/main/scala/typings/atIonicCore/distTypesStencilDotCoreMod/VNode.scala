package typings.atIonicCore.distTypesStencilDotCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VNode extends js.Object {
  @JSName("$attrs$")
  var $attrs$: js.UndefOr[js.Any] = js.undefined
  @JSName("$children$")
  var $children$: js.Array[VNode]
  @JSName("$elm$")
  var $elm$: js.Any
  @JSName("$flags$")
  var $flags$: Double
  @JSName("$key$")
  var $key$: js.UndefOr[String | Double] = js.undefined
  @JSName("$name$")
  var $name$: js.UndefOr[String] = js.undefined
  @JSName("$tag$")
  var $tag$: String | Double | js.Function
  @JSName("$text$")
  var $text$: String
}

object VNode {
  @scala.inline
  def apply(
    $children$: js.Array[VNode],
    $elm$: js.Any,
    $flags$: Double,
    $tag$: String | Double | js.Function,
    $text$: String,
    $attrs$: js.Any = null,
    $key$: String | Double = null,
    $name$: String = null
  ): VNode = {
    val __obj = js.Dynamic.literal($children$ = $children$.asInstanceOf[js.Any], $elm$ = $elm$.asInstanceOf[js.Any], $flags$ = $flags$.asInstanceOf[js.Any], $tag$ = $tag$.asInstanceOf[js.Any], $text$ = $text$.asInstanceOf[js.Any])
    if ($attrs$ != null) __obj.updateDynamic("$attrs$")($attrs$.asInstanceOf[js.Any])
    if ($key$ != null) __obj.updateDynamic("$key$")($key$.asInstanceOf[js.Any])
    if ($name$ != null) __obj.updateDynamic("$name$")($name$.asInstanceOf[js.Any])
    __obj.asInstanceOf[VNode]
  }
}

