package typings.gsap.gsap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.gsap.gsap.Tween because Already inherited */ @js.native
trait TweenMax extends TweenLite {
  /**
    * Gets or sets the tween's progress which is a value between 0 and 1 indicating the position of the virtual playhead (excluding repeats) where 0 is at the beginning, 0.5 is halfway
    * complete, and 1 is complete.
    */
  def repeat(): Double = js.native
  def repeat(value: Double): TweenMax = js.native
  /** Gets or sets the amount of time in seconds (or frames for frames-based tweens) between repeats. */
  def repeatDelay(): Double = js.native
  def repeatDelay(value: Double): TweenMax = js.native
  /** Updates tweening values on the fly so that they appear to seamlessly change course even if the tween is in-progress. */
  def updateTo(vars: js.Object): TweenMax = js.native
  def updateTo(vars: js.Object, resetDuration: Boolean): TweenMax = js.native
  /** Gets or sets the tween's yoyo state, where true causes the tween to go back and forth, alternating backward and forward on each repeat. */
  def yoyo(): Boolean = js.native
  def yoyo(value: Boolean): TweenMax = js.native
  @JSName("yoyo")
  def yoyo_TweenMax(): TweenMax = js.native
}

