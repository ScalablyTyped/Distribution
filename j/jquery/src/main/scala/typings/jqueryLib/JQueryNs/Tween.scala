package typings
package jqueryLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tweens }\`
  * @since 1.8
  */
// This should be a class but doesn't work correctly under the JQuery namespace. Tween should be an inner class of jQuery.
trait Tween[TElement] extends js.Object {
  /**
    * The easing used
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tweens }\`
    * @since 1.8
    */
  var easing: java.lang.String
  /**
    * The element being animated
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tweens }\`
    * @since 1.8
    */
  var elem: TElement
  /**
    * The ending value of the tween
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tweens }\`
    * @since 1.8
    */
  var end: scala.Double
  /**
    * The current value of the tween
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tweens }\`
    * @since 1.8
    */
  var now: scala.Double
  /**
    * A reference to the animation options
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tweens }\`
    * @since 1.8
    */
  var options: EffectsOptions[TElement]
  // Undocumented. Is this intended to be public?
  var pos: js.UndefOr[scala.Double] = js.undefined
  /**
    * The property being animated
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tweens }\`
    * @since 1.8
    */
  var prop: java.lang.String
  /**
    * The starting value of the tween
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tweens }\`
    * @since 1.8
    */
  var start: scala.Double
  /**
    * The CSS unit for the tween
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tweens }\`
    * @since 1.8
    */
  var unit: java.lang.String
  /**
    * Reads the current value for property from the element
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tweens }\`
    * @since 1.8
    */
  def cur(): js.Any
  /**
    * Updates the value for the property on the animated elemd.
    * @param progress A number from 0 to 1.
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tweens }\`
    * @since 1.8
    */
  def run(progress: scala.Double): this.type
}

object Tween {
  @scala.inline
  def apply[TElement](
    cur: js.Function0[js.Any],
    easing: java.lang.String,
    elem: TElement,
    end: scala.Double,
    now: scala.Double,
    options: EffectsOptions[TElement],
    prop: java.lang.String,
    run: js.Function1[scala.Double, Tween[TElement]],
    start: scala.Double,
    unit: java.lang.String,
    pos: scala.Int | scala.Double = null
  ): Tween[TElement] = {
    val __obj = js.Dynamic.literal(cur = cur, easing = easing, elem = elem.asInstanceOf[js.Any], end = end, now = now, options = options, prop = prop, run = run, start = start, unit = unit)
    if (pos != null) __obj.updateDynamic("pos")(pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tween[TElement]]
  }
}

