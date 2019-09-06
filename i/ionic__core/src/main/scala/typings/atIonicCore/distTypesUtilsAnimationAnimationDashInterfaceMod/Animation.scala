package typings.atIonicCore.distTypesUtilsAnimationAnimationDashInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Node
import typings.std.NodeList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Animation extends js.Object {
  var childAnimations: js.Array[Animation] = js.native
  var elements: js.Array[HTMLElement] = js.native
  var parentAnimation: js.UndefOr[Animation] = js.native
  def addAnimation(): Animation = js.native
  def addAnimation(animationToADd: js.Array[Animation]): Animation = js.native
  def addAnimation(animationToADd: Animation): Animation = js.native
  def addElement(): Animation = js.native
  def addElement(el: js.Array[Element | Node]): Animation = js.native
  def addElement(el: Element): Animation = js.native
  def addElement(el: Node): Animation = js.native
  def addElement(el: NodeList): Animation = js.native
  def afterAddClass(): Animation = js.native
  def afterAddClass(className: String): Animation = js.native
  def afterAddClass(className: js.Array[String]): Animation = js.native
  def afterAddRead(readFn: js.Function0[Unit]): Animation = js.native
  def afterAddWrite(writeFn: js.Function0[Unit]): Animation = js.native
  def afterClearStyles(propertyNames: js.Array[String]): Animation = js.native
  def afterRemoveClass(): Animation = js.native
  def afterRemoveClass(className: String): Animation = js.native
  def afterRemoveClass(className: js.Array[String]): Animation = js.native
  def afterStyles(styles: StringDictionary[js.Any]): Animation = js.native
  def animationFinish(): Unit = js.native
  def beforeAddClass(): Animation = js.native
  def beforeAddClass(className: String): Animation = js.native
  def beforeAddClass(className: js.Array[String]): Animation = js.native
  def beforeAddRead(readFn: js.Function0[Unit]): Animation = js.native
  def beforeAddWrite(writeFn: js.Function0[Unit]): Animation = js.native
  def beforeClearStyles(propertyNames: js.Array[String]): Animation = js.native
  def beforeRemoveClass(): Animation = js.native
  def beforeRemoveClass(className: String): Animation = js.native
  def beforeRemoveClass(className: js.Array[String]): Animation = js.native
  def beforeStyles(styles: StringDictionary[js.Any]): Animation = js.native
  def clearOnFinish(): Animation = js.native
  def delay(delay: Double): Animation = js.native
  def destroy(): Animation = js.native
  def direction(): Animation = js.native
  def direction(direction: AnimationDirection): Animation = js.native
  def duration(duration: Double): Animation = js.native
  def easing(easing: String): Animation = js.native
  def fill(): Animation = js.native
  def fill(fill: AnimationFill): Animation = js.native
  def from(property: String, value: js.Any): Animation = js.native
  def fromTo(property: String, fromValue: js.Any, toValue: js.Any): Animation = js.native
  def getDelay(): js.UndefOr[Double] = js.native
  def getDirection(): js.UndefOr[AnimationDirection] = js.native
  def getDuration(): js.UndefOr[Double] = js.native
  def getEasing(): js.UndefOr[String] = js.native
  def getFill(): js.UndefOr[AnimationFill] = js.native
  def getIterations(): js.UndefOr[Double] = js.native
  def getKeyframes(): js.Array[_] = js.native
  def getWebAnimations(): js.Array[_] = js.native
  def iterations(iterations: Double): Animation = js.native
  def keyframes(keyframes: js.Array[_]): Animation = js.native
  def onFinish(callback: js.Function2[/* didComplete */ Boolean, /* animation */ this.type, Unit]): Animation = js.native
  def onFinish(
    callback: js.Function2[/* didComplete */ Boolean, /* animation */ this.type, Unit],
    opts: AnimationOnFinishOptions
  ): Animation = js.native
  def parent(animation: Animation): Animation = js.native
  def pause(): Animation = js.native
  def play(): Animation = js.native
  def playAsync(): js.Promise[Animation] = js.native
  def playSync(): Animation = js.native
  def progressEnd(shouldComplete: Boolean, step: Double): Animation = js.native
  def progressEnd(shouldComplete: Boolean, step: Double, dur: Double): Animation = js.native
  def progressStart(forceLinearEasing: Boolean): Animation = js.native
  def progressStep(step: Double): Animation = js.native
  def stop(): Animation = js.native
  def to(property: String, value: js.Any): Animation = js.native
  def update(deep: Boolean): Animation = js.native
}

