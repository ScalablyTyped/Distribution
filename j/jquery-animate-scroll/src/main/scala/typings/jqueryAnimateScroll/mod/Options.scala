package typings.jqueryAnimateScroll.mod

import typings.jqueryAnimateScroll.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  $container  :jquery-animate-scroll.jquery-animate-scroll._Global_.JQuery,   speed  :number,   offset  :number}> */
trait Options extends js.Object {
  @JSName("$container")
  var $container: js.UndefOr[JQuery] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var speed: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply($container: JQuery = null, offset: Int | Double = null, speed: Int | Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if ($container != null) __obj.updateDynamic("$container")($container.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

