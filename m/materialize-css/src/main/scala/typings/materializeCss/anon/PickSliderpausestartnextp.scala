package typings.materializeCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<materialize-css.M.Slider, 'pause' | 'start' | 'next' | 'prev' | 'destroy'> */
trait PickSliderpausestartnextp extends js.Object {
  var destroy: js.UndefOr[js.Any] = js.undefined
  var next: js.UndefOr[js.Any] = js.undefined
  var pause: js.UndefOr[js.Any] = js.undefined
  var prev: js.UndefOr[js.Any] = js.undefined
  var start: js.UndefOr[js.Any] = js.undefined
}

object PickSliderpausestartnextp {
  @scala.inline
  def apply(
    destroy: js.Any = null,
    next: js.Any = null,
    pause: js.Any = null,
    prev: js.Any = null,
    start: js.Any = null
  ): PickSliderpausestartnextp = {
    val __obj = js.Dynamic.literal()
    if (destroy != null) __obj.updateDynamic("destroy")(destroy.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (pause != null) __obj.updateDynamic("pause")(pause.asInstanceOf[js.Any])
    if (prev != null) __obj.updateDynamic("prev")(prev.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickSliderpausestartnextp]
  }
}

