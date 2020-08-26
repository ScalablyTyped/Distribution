package typings.ionicReact.createAnimationMod

import org.scalablytyped.runtime.StringDictionary
import typings.ionicCore.animationInterfaceMod.AnimationDirection
import typings.ionicCore.animationInterfaceMod.AnimationFill
import typings.ionicCore.animationInterfaceMod.AnimationKeyFrame
import typings.ionicCore.animationInterfaceMod.AnimationKeyFrames
import typings.ionicReact.anon.Callback
import typings.ionicReact.anon.Dur
import typings.ionicReact.anon.ForceLinearEasing
import typings.ionicReact.anon.Step
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAnimationProps extends js.Object {
  var afterAddClass: js.UndefOr[String | js.Array[String]] = js.native
  var afterAddRead: js.UndefOr[js.Function0[Unit]] = js.native
  var afterAddWrite: js.UndefOr[js.Function0[Unit]] = js.native
  var afterClearStyles: js.UndefOr[js.Array[String]] = js.native
  var afterRemoveClass: js.UndefOr[String | js.Array[String]] = js.native
  var afterStyles: js.UndefOr[StringDictionary[js.Any]] = js.native
  var beforeAddClass: js.UndefOr[String | js.Array[String]] = js.native
  var beforeAddRead: js.UndefOr[js.Function0[Unit]] = js.native
  var beforeAddWrite: js.UndefOr[js.Function0[Unit]] = js.native
  var beforeClearStyles: js.UndefOr[js.Array[String]] = js.native
  var beforeRemoveClass: js.UndefOr[String | js.Array[String]] = js.native
  var beforeStyles: js.UndefOr[StringDictionary[js.Any]] = js.native
  var delay: js.UndefOr[Double] = js.native
  var destroy: js.UndefOr[Boolean] = js.native
  var direction: js.UndefOr[AnimationDirection] = js.native
  var duration: js.UndefOr[Double] = js.native
  var easing: js.UndefOr[String] = js.native
  var fill: js.UndefOr[AnimationFill] = js.native
  var from: js.UndefOr[js.Array[PartialPropertyValue] | PartialPropertyValue] = js.native
  var fromTo: js.UndefOr[js.Array[PropertyValue] | PropertyValue] = js.native
  var id: js.UndefOr[String] = js.native
  var iterations: js.UndefOr[Double] = js.native
  var keyframes: js.UndefOr[AnimationKeyFrames] = js.native
  var onFinish: js.UndefOr[Callback] = js.native
  var pause: js.UndefOr[Boolean] = js.native
  var play: js.UndefOr[Boolean] = js.native
  var progressEnd: js.UndefOr[Dur] = js.native
  var progressStart: js.UndefOr[ForceLinearEasing] = js.native
  var progressStep: js.UndefOr[Step] = js.native
  var stop: js.UndefOr[Boolean] = js.native
  var to: js.UndefOr[js.Array[PartialPropertyValue] | PartialPropertyValue] = js.native
}

object CreateAnimationProps {
  @scala.inline
  def apply(): CreateAnimationProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAnimationProps]
  }
  @scala.inline
  implicit class CreateAnimationPropsOps[Self <: CreateAnimationProps] (val x: Self) extends AnyVal {
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
    def setAfterAddClassVarargs(value: String*): Self = this.set("afterAddClass", js.Array(value :_*))
    @scala.inline
    def setAfterAddClass(value: String | js.Array[String]): Self = this.set("afterAddClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterAddClass: Self = this.set("afterAddClass", js.undefined)
    @scala.inline
    def setAfterAddRead(value: () => Unit): Self = this.set("afterAddRead", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAfterAddRead: Self = this.set("afterAddRead", js.undefined)
    @scala.inline
    def setAfterAddWrite(value: () => Unit): Self = this.set("afterAddWrite", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAfterAddWrite: Self = this.set("afterAddWrite", js.undefined)
    @scala.inline
    def setAfterClearStylesVarargs(value: String*): Self = this.set("afterClearStyles", js.Array(value :_*))
    @scala.inline
    def setAfterClearStyles(value: js.Array[String]): Self = this.set("afterClearStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterClearStyles: Self = this.set("afterClearStyles", js.undefined)
    @scala.inline
    def setAfterRemoveClassVarargs(value: String*): Self = this.set("afterRemoveClass", js.Array(value :_*))
    @scala.inline
    def setAfterRemoveClass(value: String | js.Array[String]): Self = this.set("afterRemoveClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterRemoveClass: Self = this.set("afterRemoveClass", js.undefined)
    @scala.inline
    def setAfterStyles(value: StringDictionary[js.Any]): Self = this.set("afterStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterStyles: Self = this.set("afterStyles", js.undefined)
    @scala.inline
    def setBeforeAddClassVarargs(value: String*): Self = this.set("beforeAddClass", js.Array(value :_*))
    @scala.inline
    def setBeforeAddClass(value: String | js.Array[String]): Self = this.set("beforeAddClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeAddClass: Self = this.set("beforeAddClass", js.undefined)
    @scala.inline
    def setBeforeAddRead(value: () => Unit): Self = this.set("beforeAddRead", js.Any.fromFunction0(value))
    @scala.inline
    def deleteBeforeAddRead: Self = this.set("beforeAddRead", js.undefined)
    @scala.inline
    def setBeforeAddWrite(value: () => Unit): Self = this.set("beforeAddWrite", js.Any.fromFunction0(value))
    @scala.inline
    def deleteBeforeAddWrite: Self = this.set("beforeAddWrite", js.undefined)
    @scala.inline
    def setBeforeClearStylesVarargs(value: String*): Self = this.set("beforeClearStyles", js.Array(value :_*))
    @scala.inline
    def setBeforeClearStyles(value: js.Array[String]): Self = this.set("beforeClearStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeClearStyles: Self = this.set("beforeClearStyles", js.undefined)
    @scala.inline
    def setBeforeRemoveClassVarargs(value: String*): Self = this.set("beforeRemoveClass", js.Array(value :_*))
    @scala.inline
    def setBeforeRemoveClass(value: String | js.Array[String]): Self = this.set("beforeRemoveClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeRemoveClass: Self = this.set("beforeRemoveClass", js.undefined)
    @scala.inline
    def setBeforeStyles(value: StringDictionary[js.Any]): Self = this.set("beforeStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeStyles: Self = this.set("beforeStyles", js.undefined)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setDestroy(value: Boolean): Self = this.set("destroy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    @scala.inline
    def setDirection(value: AnimationDirection): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setEasing(value: String): Self = this.set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    @scala.inline
    def setFill(value: AnimationFill): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setFromVarargs(value: PartialPropertyValue*): Self = this.set("from", js.Array(value :_*))
    @scala.inline
    def setFrom(value: js.Array[PartialPropertyValue] | PartialPropertyValue): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setFromToVarargs(value: PropertyValue*): Self = this.set("fromTo", js.Array(value :_*))
    @scala.inline
    def setFromTo(value: js.Array[PropertyValue] | PropertyValue): Self = this.set("fromTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromTo: Self = this.set("fromTo", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIterations(value: Double): Self = this.set("iterations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIterations: Self = this.set("iterations", js.undefined)
    @scala.inline
    def setKeyframesVarargs(value: AnimationKeyFrame*): Self = this.set("keyframes", js.Array(value :_*))
    @scala.inline
    def setKeyframes(value: AnimationKeyFrames): Self = this.set("keyframes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyframes: Self = this.set("keyframes", js.undefined)
    @scala.inline
    def setOnFinish(value: Callback): Self = this.set("onFinish", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnFinish: Self = this.set("onFinish", js.undefined)
    @scala.inline
    def setPause(value: Boolean): Self = this.set("pause", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePause: Self = this.set("pause", js.undefined)
    @scala.inline
    def setPlay(value: Boolean): Self = this.set("play", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlay: Self = this.set("play", js.undefined)
    @scala.inline
    def setProgressEnd(value: Dur): Self = this.set("progressEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressEnd: Self = this.set("progressEnd", js.undefined)
    @scala.inline
    def setProgressStart(value: ForceLinearEasing): Self = this.set("progressStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressStart: Self = this.set("progressStart", js.undefined)
    @scala.inline
    def setProgressStep(value: Step): Self = this.set("progressStep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressStep: Self = this.set("progressStep", js.undefined)
    @scala.inline
    def setStop(value: Boolean): Self = this.set("stop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStop: Self = this.set("stop", js.undefined)
    @scala.inline
    def setToVarargs(value: PartialPropertyValue*): Self = this.set("to", js.Array(value :_*))
    @scala.inline
    def setTo(value: js.Array[PartialPropertyValue] | PartialPropertyValue): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
  
}

