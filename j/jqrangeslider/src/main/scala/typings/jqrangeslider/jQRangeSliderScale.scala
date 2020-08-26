package typings.jqrangeslider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait jQRangeSliderScale extends js.Object {
  var first: js.UndefOr[js.Function2[/* min */ Double, /* max */ Double, Double]] = js.native
   // 'true' to stop scale generating ticks from a given value
  var format: js.UndefOr[
    js.Function3[
      /* tickContainer */ js.Any, 
      /* tickStartValue */ js.Any, 
      /* tickEndValue */ js.Any, 
      Unit
    ]
  ] = js.native
   // compute the next value.
  var label: js.UndefOr[js.Function2[/* value */ js.Any, /* nextValue */ js.Any, String]] = js.native
   // compute displayed text for a given internal
  var stop: js.UndefOr[js.Function1[/* value */ js.Any, Boolean]] = js.native
   // compute the ruler first value.
  def next(value: js.Any): js.Any = js.native
}

object jQRangeSliderScale {
  @scala.inline
  def apply(next: js.Any => js.Any): jQRangeSliderScale = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction1(next))
    __obj.asInstanceOf[jQRangeSliderScale]
  }
  @scala.inline
  implicit class jQRangeSliderScaleOps[Self <: jQRangeSliderScale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNext(value: js.Any => js.Any): Self = this.set("next", js.Any.fromFunction1(value))
    @scala.inline
    def setFirst(value: (/* min */ Double, /* max */ Double) => Double): Self = this.set("first", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFirst: Self = this.set("first", js.undefined)
    @scala.inline
    def setFormat(
      value: (/* tickContainer */ js.Any, /* tickStartValue */ js.Any, /* tickEndValue */ js.Any) => Unit
    ): Self = this.set("format", js.Any.fromFunction3(value))
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setLabel(value: (/* value */ js.Any, /* nextValue */ js.Any) => String): Self = this.set("label", js.Any.fromFunction2(value))
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setStop(value: /* value */ js.Any => Boolean): Self = this.set("stop", js.Any.fromFunction1(value))
    @scala.inline
    def deleteStop: Self = this.set("stop", js.undefined)
  }
  
}

