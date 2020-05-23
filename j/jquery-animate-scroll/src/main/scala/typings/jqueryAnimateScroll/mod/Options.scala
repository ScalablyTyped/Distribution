package typings.jqueryAnimateScroll.mod

import typings.jqueryAnimateScroll.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  $container  :jquery-animate-scroll.jquery-animate-scroll.<global>.JQuery,   speed  :number,   offset  :number}> */
trait Options extends js.Object {
  @JSName("$container")
  var $container: js.UndefOr[JQuery] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var speed: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    $container: JQuery = null,
    offset: js.UndefOr[Double] = js.undefined,
    speed: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if ($container != null) __obj.updateDynamic("$container")($container.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(speed)) __obj.updateDynamic("speed")(speed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

