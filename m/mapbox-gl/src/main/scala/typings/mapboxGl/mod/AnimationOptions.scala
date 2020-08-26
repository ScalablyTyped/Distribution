package typings.mapboxGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationOptions extends js.Object {
  /** When set to false, no animation happens */
  var animate: js.UndefOr[Boolean] = js.native
  /** Number in milliseconds */
  var duration: js.UndefOr[Double] = js.native
  /**
    * A function taking a time in the range 0..1 and returning a number where 0 is the initial
    * state and 1 is the final state.
    */
  var easing: js.UndefOr[js.Function1[/* time */ Double, Double]] = js.native
  /** If `true`, then the animation is considered essential and will not be affected by `prefers-reduced-motion`.
    * Otherwise, the transition will happen instantly if the user has enabled the `reduced motion` accesibility feature in their operating system.
    */
  var essential: js.UndefOr[Boolean] = js.native
  /** point, origin of movement relative to map center */
  var offset: js.UndefOr[PointLike] = js.native
}

object AnimationOptions {
  @scala.inline
  def apply(): AnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationOptions]
  }
  @scala.inline
  implicit class AnimationOptionsOps[Self <: AnimationOptions] (val x: Self) extends AnyVal {
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
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setEasing(value: /* time */ Double => Double): Self = this.set("easing", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    @scala.inline
    def setEssential(value: Boolean): Self = this.set("essential", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEssential: Self = this.set("essential", js.undefined)
    @scala.inline
    def setOffset(value: PointLike): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
  }
  
}

