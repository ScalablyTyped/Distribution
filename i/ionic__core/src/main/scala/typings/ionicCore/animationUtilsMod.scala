package typings.ionicCore

import typings.std.HTMLElement
import typings.std.TransitionEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/utils/animation/animation-utils", JSImport.Namespace)
@js.native
object animationUtilsMod extends js.Object {
  def addClassToArray(): js.Array[String] = js.native
  def addClassToArray(classes: js.UndefOr[scala.Nothing], className: String): js.Array[String] = js.native
  def addClassToArray(classes: js.UndefOr[scala.Nothing], className: js.Array[String]): js.Array[String] = js.native
  def addClassToArray(classes: js.Array[String]): js.Array[String] = js.native
  def addClassToArray(classes: js.Array[String], className: String): js.Array[String] = js.native
  def addClassToArray(classes: js.Array[String], className: js.Array[String]): js.Array[String] = js.native
  def animationEnd(el: Null, callback: js.Function1[/* ev */ js.UndefOr[TransitionEvent], Unit]): js.Function0[Unit] = js.native
  def animationEnd(el: HTMLElement, callback: js.Function1[/* ev */ js.UndefOr[TransitionEvent], Unit]): js.Function0[Unit] = js.native
  def createKeyframeStylesheet(keyframeName: String, keyframeRules: String, element: HTMLElement): HTMLElement = js.native
  def generateKeyframeName(keyframeRules: String): String = js.native
  def generateKeyframeRules(): String = js.native
  def generateKeyframeRules(keyframes: js.Array[_]): String = js.native
  def getStyleContainer(element: HTMLElement): js.Any = js.native
  def removeStyleProperty(element: HTMLElement, propertyName: String): Unit = js.native
  def setStyleProperty(element: HTMLElement, propertyName: String): Unit = js.native
  def setStyleProperty(element: HTMLElement, propertyName: String, value: String): Unit = js.native
}

