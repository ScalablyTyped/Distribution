package typings.jquery.JQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tweens }\`
  * @since 1.8
  */
// This should be a class but doesn't work correctly under the JQuery namespace. Tween should be an inner class of jQuery.
@js.native
trait Tween[TElement] extends js.Object {
  /**
    * The easing used
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tweens }\`
    * @since 1.8
    */
  var easing: String = js.native
  /**
    * The element being animated
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tweens }\`
    * @since 1.8
    */
  var elem: TElement = js.native
  /**
    * The ending value of the tween
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tweens }\`
    * @since 1.8
    */
  var end: Double = js.native
  /**
    * The current value of the tween
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tweens }\`
    * @since 1.8
    */
  var now: Double = js.native
  /**
    * A reference to the animation options
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tweens }\`
    * @since 1.8
    */
  var options: EffectsOptions[TElement] = js.native
  // Undocumented. Is this intended to be public?
  var pos: js.UndefOr[Double] = js.native
  /**
    * The property being animated
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tweens }\`
    * @since 1.8
    */
  var prop: String = js.native
  /**
    * The starting value of the tween
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tweens }\`
    * @since 1.8
    */
  var start: Double = js.native
  /**
    * The CSS unit for the tween
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tweens }\`
    * @since 1.8
    */
  var unit: String = js.native
  /**
    * Reads the current value for property from the element
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tweens }\`
    * @since 1.8
    */
  def cur(): js.Any = js.native
  /**
    * Updates the value for the property on the animated elemd.
    * @param progress A number from 0 to 1.
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tweens }\`
    * @since 1.8
    */
  def run(progress: Double): this.type = js.native
}

object Tween {
  @scala.inline
  def apply[TElement](
    cur: () => js.Any,
    easing: String,
    elem: TElement,
    end: Double,
    now: Double,
    options: EffectsOptions[TElement],
    prop: String,
    run: Double => Tween[TElement],
    start: Double,
    unit: String
  ): Tween[TElement] = {
    val __obj = js.Dynamic.literal(cur = js.Any.fromFunction0(cur), easing = easing.asInstanceOf[js.Any], elem = elem.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], now = now.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], prop = prop.asInstanceOf[js.Any], run = js.Any.fromFunction1(run), start = start.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tween[TElement]]
  }
  @scala.inline
  implicit class TweenOps[Self <: Tween[_], TElement] (val x: Self with Tween[TElement]) extends AnyVal {
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
    def setCur(value: () => js.Any): Self = this.set("cur", js.Any.fromFunction0(value))
    @scala.inline
    def setEasing(value: String): Self = this.set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def setElem(value: TElement): Self = this.set("elem", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setNow(value: Double): Self = this.set("now", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: EffectsOptions[TElement]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setProp(value: String): Self = this.set("prop", value.asInstanceOf[js.Any])
    @scala.inline
    def setRun(value: Double => Tween[TElement]): Self = this.set("run", js.Any.fromFunction1(value))
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnit(value: String): Self = this.set("unit", value.asInstanceOf[js.Any])
    @scala.inline
    def setPos(value: Double): Self = this.set("pos", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePos: Self = this.set("pos", js.undefined)
  }
  
}

