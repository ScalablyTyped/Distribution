package typings.gsap.gsap

import typings.gsap.AnonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.gsap.gsap.Timeline because Already inherited */ @JSGlobal("gsap.TimelineMax")
@js.native
class TimelineMax () extends TimelineLite {
  def this(vars: js.Object) = this()
  def addCallback(callback: js.Function1[/* repeated */ js.Any, Unit], position: js.Any): TimelineMax = js.native
  def addCallback(callback: js.Function1[/* repeated */ js.Any, Unit], position: js.Any, params: js.Array[_]): TimelineMax = js.native
  def addCallback(
    callback: js.Function1[/* repeated */ js.Any, Unit],
    position: js.Any,
    params: js.Array[_],
    scope: js.Any
  ): TimelineMax = js.native
  def currentLabel(): String = js.native
  def currentLabel(value: String): TimelineMax = js.native
  def getActive(): Tween | js.Array[Timeline] = js.native
  def getActive(nested: Boolean): Tween | js.Array[Timeline] = js.native
  def getActive(nested: Boolean, tweens: Boolean): Tween | js.Array[Timeline] = js.native
  def getActive(nested: Boolean, tweens: Boolean, timelines: Boolean): Tween | js.Array[Timeline] = js.native
  def getLabelAfter(time: Double): String = js.native
  def getLabelBefore(time: Double): String = js.native
  def getLabelsArray(): js.Array[AnonName] = js.native
  def removeCallback(callback: js.Function1[/* repeated */ js.Any, Unit]): TimelineMax = js.native
  def removeCallback(callback: js.Function1[/* repeated */ js.Any, Unit], timeOrLabel: js.Any): TimelineMax = js.native
  def removePause(position: js.Any): TimelineMax = js.native
  def repeat(): Double = js.native
  def repeat(value: Double): TimelineMax = js.native
  def repeatDelay(): Double = js.native
  def repeatDelay(value: Double): TimelineMax = js.native
  def tweenFromTo(fromPosition: js.Any, toPosition: js.Any): TweenLite = js.native
  def tweenFromTo(fromPosition: js.Any, toPosition: js.Any, vars: js.Object): TweenLite = js.native
  def tweenTo(position: js.Any): TweenLite = js.native
  def tweenTo(position: js.Any, vars: js.Object): TweenLite = js.native
  def yoyo(): Boolean = js.native
  def yoyo(value: Boolean): TimelineMax = js.native
}

