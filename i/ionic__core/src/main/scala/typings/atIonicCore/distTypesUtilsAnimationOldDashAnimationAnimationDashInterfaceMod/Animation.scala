package typings.atIonicCore.distTypesUtilsAnimationOldDashAnimationAnimationDashInterfaceMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.atIonicCore.Anon_ClearExistingCallbacks
import typings.std.Node
import typings.std.NodeList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Animation
  extends Instantiable0[js.Any] {
  var hasChildren: Boolean = js.native
  var hasCompleted: Boolean = js.native
  var parent: js.UndefOr[Animation] = js.native
  def add(childAnimation: Animation): Animation = js.native
  def addElement(el: js.Array[Node]): Animation = js.native
  def addElement(el: Node): Animation = js.native
  def addElement(el: NodeList): Animation = js.native
  def afterAddClass(className: String): Animation = js.native
  def afterClearStyles(propertyNames: js.Array[String]): Animation = js.native
  def afterRemoveClass(className: String): Animation = js.native
  def afterStyles(styles: StringDictionary[js.Any]): Animation = js.native
  def beforeAddClass(className: String): Animation = js.native
  def beforeAddRead(domReadFn: js.Function0[Unit]): Animation = js.native
  def beforeAddWrite(domWriteFn: js.Function0[Unit]): Animation = js.native
  def beforeClearStyles(propertyNames: js.Array[String]): Animation = js.native
  def beforeRemoveClass(className: String): Animation = js.native
  def beforeStyles(styles: StringDictionary[js.Any]): Animation = js.native
  def destroy(): Unit = js.native
  def duration(milliseconds: Double): Animation = js.native
  def easing(name: String): Animation = js.native
  def easingReverse(name: String): Animation = js.native
  def from(prop: String, `val`: js.Any): Animation = js.native
  def fromTo(prop: String, fromVal: js.Any, toVal: js.Any): Animation = js.native
  def fromTo(prop: String, fromVal: js.Any, toVal: js.Any, clearProperyAfterTransition: Boolean): Animation = js.native
  def getDuration(): Double = js.native
  def getDuration(opts: PlayOptions): Double = js.native
  def getEasing(): String = js.native
  def isRoot(): Boolean = js.native
  def onFinish(callback: js.Function1[/* animation */ js.UndefOr[this.type], Unit]): Animation = js.native
  def onFinish(
    callback: js.Function1[/* animation */ js.UndefOr[this.type], Unit],
    opts: Anon_ClearExistingCallbacks
  ): Animation = js.native
  def play(): Unit = js.native
  def play(opts: PlayOptions): Unit = js.native
  def playAsync(): js.Promise[Animation] = js.native
  def playAsync(opts: PlayOptions): js.Promise[Animation] = js.native
  def playSync(): Unit = js.native
  def progressEnd(shouldComplete: Boolean, currentStepValue: Double, dur: Double): Unit = js.native
  def progressStart(): Unit = js.native
  def progressStep(stepValue: Double): Unit = js.native
  def reverse(): Animation = js.native
  def reverse(shouldReverse: Boolean): Animation = js.native
  def stop(): Unit = js.native
  def stop(stepValue: Double): Unit = js.native
  def to(prop: String, `val`: js.Any): Animation = js.native
  def to(prop: String, `val`: js.Any, clearProperyAfterTransition: Boolean): Animation = js.native
}

