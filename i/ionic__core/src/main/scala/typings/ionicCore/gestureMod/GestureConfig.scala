package typings.ionicCore.gestureMod

import typings.ionicCore.ionicCoreStrings.x
import typings.ionicCore.ionicCoreStrings.y
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GestureConfig extends js.Object {
  var blurOnStart: js.UndefOr[Boolean] = js.native
  var canStart: js.UndefOr[GestureCallback] = js.native
  var direction: js.UndefOr[x | y] = js.native
  var disableScroll: js.UndefOr[Boolean] = js.native
  var el: Node = js.native
  var gestureName: String = js.native
  var gesturePriority: js.UndefOr[Double] = js.native
  var maxAngle: js.UndefOr[Double] = js.native
  var notCaptured: js.UndefOr[GestureCallback] = js.native
  var onEnd: js.UndefOr[GestureCallback] = js.native
  var onMove: js.UndefOr[GestureCallback] = js.native
  var onStart: js.UndefOr[GestureCallback] = js.native
  var onWillStart: js.UndefOr[js.Function1[/* _ */ GestureDetail, js.Promise[Unit]]] = js.native
  var passive: js.UndefOr[Boolean] = js.native
  var threshold: js.UndefOr[Double] = js.native
}

object GestureConfig {
  @scala.inline
  def apply(el: Node, gestureName: String): GestureConfig = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], gestureName = gestureName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GestureConfig]
  }
  @scala.inline
  implicit class GestureConfigOps[Self <: GestureConfig] (val x: Self) extends AnyVal {
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
    def setEl(value: Node): Self = this.set("el", value.asInstanceOf[js.Any])
    @scala.inline
    def setGestureName(value: String): Self = this.set("gestureName", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlurOnStart(value: Boolean): Self = this.set("blurOnStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlurOnStart: Self = this.set("blurOnStart", js.undefined)
    @scala.inline
    def setCanStart(value: /* detail */ GestureDetail => Boolean | Unit): Self = this.set("canStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCanStart: Self = this.set("canStart", js.undefined)
    @scala.inline
    def setDirection(value: typings.ionicCore.ionicCoreStrings.x | y): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setDisableScroll(value: Boolean): Self = this.set("disableScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableScroll: Self = this.set("disableScroll", js.undefined)
    @scala.inline
    def setGesturePriority(value: Double): Self = this.set("gesturePriority", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGesturePriority: Self = this.set("gesturePriority", js.undefined)
    @scala.inline
    def setMaxAngle(value: Double): Self = this.set("maxAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAngle: Self = this.set("maxAngle", js.undefined)
    @scala.inline
    def setNotCaptured(value: /* detail */ GestureDetail => Boolean | Unit): Self = this.set("notCaptured", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNotCaptured: Self = this.set("notCaptured", js.undefined)
    @scala.inline
    def setOnEnd(value: /* detail */ GestureDetail => Boolean | Unit): Self = this.set("onEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEnd: Self = this.set("onEnd", js.undefined)
    @scala.inline
    def setOnMove(value: /* detail */ GestureDetail => Boolean | Unit): Self = this.set("onMove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMove: Self = this.set("onMove", js.undefined)
    @scala.inline
    def setOnStart(value: /* detail */ GestureDetail => Boolean | Unit): Self = this.set("onStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnStart: Self = this.set("onStart", js.undefined)
    @scala.inline
    def setOnWillStart(value: /* _ */ GestureDetail => js.Promise[Unit]): Self = this.set("onWillStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnWillStart: Self = this.set("onWillStart", js.undefined)
    @scala.inline
    def setPassive(value: Boolean): Self = this.set("passive", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassive: Self = this.set("passive", js.undefined)
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
  }
  
}

