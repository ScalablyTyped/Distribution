package typings
package gsapLib.gsapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- gsapLib.gsapNs.Timeline because Already inherited */ @JSGlobal("gsap.TimelineMax")
@js.native
class TimelineMax () extends TimelineLite {
  def this(vars: js.Object) = this()
  def addCallback(callback: js.Function1[/* repeated */ js.Any, scala.Unit], position: js.Any): TimelineMax = js.native
  def addCallback(callback: js.Function1[/* repeated */ js.Any, scala.Unit], position: js.Any, params: js.Array[_]): TimelineMax = js.native
  def addCallback(
    callback: js.Function1[/* repeated */ js.Any, scala.Unit],
    position: js.Any,
    params: js.Array[_],
    scope: js.Any
  ): TimelineMax = js.native
  def currentLabel(): java.lang.String = js.native
  def currentLabel(value: java.lang.String): TimelineMax = js.native
  def getActive(): Tween | js.Array[Timeline] = js.native
  def getActive(nested: scala.Boolean): Tween | js.Array[Timeline] = js.native
  def getActive(nested: scala.Boolean, tweens: scala.Boolean): Tween | js.Array[Timeline] = js.native
  def getActive(nested: scala.Boolean, tweens: scala.Boolean, timelines: scala.Boolean): Tween | js.Array[Timeline] = js.native
  def getLabelAfter(time: scala.Double): java.lang.String = js.native
  def getLabelBefore(time: scala.Double): java.lang.String = js.native
  def getLabelsArray(): js.Array[gsapLib.Anon_Name] = js.native
  def removeCallback(callback: js.Function1[/* repeated */ js.Any, scala.Unit]): TimelineMax = js.native
  def removeCallback(callback: js.Function1[/* repeated */ js.Any, scala.Unit], timeOrLabel: js.Any): TimelineMax = js.native
  def removePause(position: js.Any): TimelineMax = js.native
  def repeat(): scala.Double = js.native
  def repeat(value: scala.Double): TimelineMax = js.native
  def repeatDelay(): scala.Double = js.native
  def repeatDelay(value: scala.Double): TimelineMax = js.native
  def tweenFromTo(fromPosition: js.Any, toPosition: js.Any): TweenLite = js.native
  def tweenFromTo(fromPosition: js.Any, toPosition: js.Any, vars: js.Object): TweenLite = js.native
  def tweenTo(position: js.Any): TweenLite = js.native
  def tweenTo(position: js.Any, vars: js.Object): TweenLite = js.native
  def yoyo(): scala.Boolean = js.native
  def yoyo(value: scala.Boolean): TimelineMax = js.native
}

