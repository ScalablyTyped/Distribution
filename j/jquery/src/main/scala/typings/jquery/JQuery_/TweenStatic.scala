package typings.jquery.JQuery_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tweens }\`
  * @since 1.8
  */
@js.native
trait TweenStatic extends js.Object {
  /**
    * `jQuery.Tween.propHooks[ prop ]` is a hook point that replaces `jQuery.fx.step[ prop ]` (which is being deprecated.) These hooks are used by the tween to get and set values on elements.
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tween-hooks }\`
    * @since 1.8
    * @example
  ```javascript
  jQuery.Tween.propHooks[ property ] = {
    get: function( tween ) {
    // get tween.prop from tween.elem and return it
    },
    set: function( tween ) {
    // set tween.prop on tween.elem to tween.now + tween.unit
    }
  }
  ```
    */
  var propHooks: PropHooks = js.native
  /**
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tweens }\`
    * @since 1.8
    */
  def apply[TElement](elem: TElement, options: EffectsOptions[TElement], prop: String, end: Double): Tween[TElement] = js.native
  def apply[TElement](elem: TElement, options: EffectsOptions[TElement], prop: String, end: Double, easing: String): Tween[TElement] = js.native
  def apply[TElement](
    elem: TElement,
    options: EffectsOptions[TElement],
    prop: String,
    end: Double,
    easing: String,
    unit: String
  ): Tween[TElement] = js.native
}

