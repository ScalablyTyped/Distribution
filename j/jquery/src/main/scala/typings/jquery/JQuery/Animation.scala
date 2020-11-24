package typings.jquery.JQuery

import typings.jquery.jqueryBooleans.`false`
import typings.jquery.jqueryBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The promise will be resolved when the animation reaches its end, and rejected when terminated early. The context of callbacks attached to the promise will be the element, and the arguments will be the `Animation` object and a boolean `jumpedToEnd` which when true means the animation was stopped with `gotoEnd`, when `undefined` the animation completed naturally.
  * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#animation-factory }\`
  * @since 1.8
  */
@js.native
trait Animation[TElement]
  extends PromiseBase[
      Animation[TElement], 
      Animation[TElement], 
      Animation[TElement], 
      js.UndefOr[`true`], 
      `false`, 
      Double, 
      scala.Nothing, 
      scala.Nothing, 
      Double, 
      scala.Nothing, 
      scala.Nothing, 
      scala.Nothing
    ] {
  
  /**
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#animation-factory }\`
    * @since 1.8
    */
  def createTween(propName: String, finalValue: Double): Tween[TElement] = js.native
  
  /**
    * The duration specified in ms
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#animation-factory }\`
    * @since 1.8
    */
  var duration: Double = js.native
  
  /**
    * The element being animatied
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#animation-factory }\`
    * @since 1.8
    */
  var elem: TElement = js.native
  
  /**
    * The animation options
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#animation-factory }\`
    * @since 1.8
    */
  var opts: EffectsOptions[TElement] = js.native
  
  /**
    * The original options before being filtered
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#animation-factory }\`
    * @since 1.8
    */
  var originalOpts: EffectsOptions[TElement] = js.native
  
  /**
    * The original properties before being filtered
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#animation-factory }\`
    * @since 1.8
    */
  var originalProps: PlainObject[_] = js.native
  
  /**
    * The final value of each property animating
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#animation-factory }\`
    * @since 1.8
    */
  var props: PlainObject[_] = js.native
  
  /**
    * The numeric value of `new Date()` when the animation began
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#animation-factory }\`
    * @since 1.8
    */
  var startTime: Double = js.native
  
  /**
    * Stops the animation early, optionally going to the end.
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#animation-factory }\`
    * @since 1.8
    */
  def stop(gotoEnd: Boolean): this.type = js.native
  
  /**
    * The animations tweens.
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#animation-factory }\`
    * @since 1.8
    */
  var tweens: js.Array[Tween[TElement]] = js.native
}
