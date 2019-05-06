package typings
package atIonicCoreLib.distTypesUtilsAnimationAnimationDashInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Animation
  extends org.scalablytyped.runtime.Instantiable0[js.Any] {
  var hasChildren: scala.Boolean = js.native
  var hasCompleted: scala.Boolean = js.native
  var parent: js.UndefOr[Animation] = js.native
  def add(childAnimation: Animation): Animation = js.native
  def addElement(el: js.Array[stdLib.Node]): Animation = js.native
  def addElement(el: stdLib.Node): Animation = js.native
  def addElement(el: stdLib.NodeList): Animation = js.native
  def afterAddClass(className: java.lang.String): Animation = js.native
  def afterClearStyles(propertyNames: js.Array[java.lang.String]): Animation = js.native
  def afterRemoveClass(className: java.lang.String): Animation = js.native
  def afterStyles(styles: org.scalablytyped.runtime.StringDictionary[js.Any]): Animation = js.native
  def beforeAddClass(className: java.lang.String): Animation = js.native
  def beforeAddRead(domReadFn: js.Function0[scala.Unit]): Animation = js.native
  def beforeAddWrite(domWriteFn: js.Function0[scala.Unit]): Animation = js.native
  def beforeClearStyles(propertyNames: js.Array[java.lang.String]): Animation = js.native
  def beforeRemoveClass(className: java.lang.String): Animation = js.native
  def beforeStyles(styles: org.scalablytyped.runtime.StringDictionary[js.Any]): Animation = js.native
  def destroy(): scala.Unit = js.native
  def duration(milliseconds: scala.Double): Animation = js.native
  def easing(name: java.lang.String): Animation = js.native
  def easingReverse(name: java.lang.String): Animation = js.native
  def from(prop: java.lang.String, `val`: js.Any): Animation = js.native
  def fromTo(prop: java.lang.String, fromVal: js.Any, toVal: js.Any): Animation = js.native
  def fromTo(prop: java.lang.String, fromVal: js.Any, toVal: js.Any, clearProperyAfterTransition: scala.Boolean): Animation = js.native
  def getDuration(): scala.Double = js.native
  def getDuration(opts: PlayOptions): scala.Double = js.native
  def getEasing(): java.lang.String = js.native
  def isRoot(): scala.Boolean = js.native
  def onFinish(callback: js.Function1[/* animation */ js.UndefOr[this.type], scala.Unit]): Animation = js.native
  def onFinish(
    callback: js.Function1[/* animation */ js.UndefOr[this.type], scala.Unit],
    opts: atIonicCoreLib.Anon_ClearExistingCallbacks
  ): Animation = js.native
  def play(): scala.Unit = js.native
  def play(opts: PlayOptions): scala.Unit = js.native
  def playAsync(): js.Promise[Animation] = js.native
  def playAsync(opts: PlayOptions): js.Promise[Animation] = js.native
  def playSync(): scala.Unit = js.native
  def progressEnd(shouldComplete: scala.Boolean, currentStepValue: scala.Double, dur: scala.Double): scala.Unit = js.native
  def progressStart(): scala.Unit = js.native
  def progressStep(stepValue: scala.Double): scala.Unit = js.native
  def reverse(): Animation = js.native
  def reverse(shouldReverse: scala.Boolean): Animation = js.native
  def stop(): scala.Unit = js.native
  def stop(stepValue: scala.Double): scala.Unit = js.native
  def to(prop: java.lang.String, `val`: js.Any): Animation = js.native
  def to(prop: java.lang.String, `val`: js.Any, clearProperyAfterTransition: scala.Boolean): Animation = js.native
}

