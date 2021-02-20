package typings.ionicCore

import typings.ionicCore.animationInterfaceMod.AnimationKeyFrames
import typings.std.HTMLElement
import typings.std.TransitionEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animationUtilsMod {
  
  @JSImport("@ionic/core/dist/types/utils/animation/animation-utils", "addClassToArray")
  @js.native
  def addClassToArray(): js.Array[String] = js.native
  @JSImport("@ionic/core/dist/types/utils/animation/animation-utils", "addClassToArray")
  @js.native
  def addClassToArray(classes: js.UndefOr[scala.Nothing], className: String): js.Array[String] = js.native
  @JSImport("@ionic/core/dist/types/utils/animation/animation-utils", "addClassToArray")
  @js.native
  def addClassToArray(classes: js.UndefOr[scala.Nothing], className: js.Array[String]): js.Array[String] = js.native
  @JSImport("@ionic/core/dist/types/utils/animation/animation-utils", "addClassToArray")
  @js.native
  def addClassToArray(classes: js.Array[String]): js.Array[String] = js.native
  @JSImport("@ionic/core/dist/types/utils/animation/animation-utils", "addClassToArray")
  @js.native
  def addClassToArray(classes: js.Array[String], className: String): js.Array[String] = js.native
  @JSImport("@ionic/core/dist/types/utils/animation/animation-utils", "addClassToArray")
  @js.native
  def addClassToArray(classes: js.Array[String], className: js.Array[String]): js.Array[String] = js.native
  
  @JSImport("@ionic/core/dist/types/utils/animation/animation-utils", "animationEnd")
  @js.native
  def animationEnd(el: Null, callback: js.Function1[/* ev */ js.UndefOr[TransitionEvent], Unit]): js.Function0[Unit] = js.native
  @JSImport("@ionic/core/dist/types/utils/animation/animation-utils", "animationEnd")
  @js.native
  def animationEnd(el: HTMLElement, callback: js.Function1[/* ev */ js.UndefOr[TransitionEvent], Unit]): js.Function0[Unit] = js.native
  
  @JSImport("@ionic/core/dist/types/utils/animation/animation-utils", "createKeyframeStylesheet")
  @js.native
  def createKeyframeStylesheet(keyframeName: String, keyframeRules: String, element: HTMLElement): HTMLElement = js.native
  
  @JSImport("@ionic/core/dist/types/utils/animation/animation-utils", "generateKeyframeName")
  @js.native
  def generateKeyframeName(keyframeRules: String): String = js.native
  
  @JSImport("@ionic/core/dist/types/utils/animation/animation-utils", "generateKeyframeRules")
  @js.native
  def generateKeyframeRules(): String = js.native
  @JSImport("@ionic/core/dist/types/utils/animation/animation-utils", "generateKeyframeRules")
  @js.native
  def generateKeyframeRules(keyframes: js.Array[_]): String = js.native
  
  @JSImport("@ionic/core/dist/types/utils/animation/animation-utils", "getAnimationPrefix")
  @js.native
  def getAnimationPrefix(el: HTMLElement): String = js.native
  
  @JSImport("@ionic/core/dist/types/utils/animation/animation-utils", "getStyleContainer")
  @js.native
  def getStyleContainer(element: HTMLElement): js.Any = js.native
  
  @JSImport("@ionic/core/dist/types/utils/animation/animation-utils", "processKeyframes")
  @js.native
  def processKeyframes(keyframes: AnimationKeyFrames): AnimationKeyFrames = js.native
  
  @JSImport("@ionic/core/dist/types/utils/animation/animation-utils", "removeStyleProperty")
  @js.native
  def removeStyleProperty(element: HTMLElement, propertyName: String): Unit = js.native
  
  @JSImport("@ionic/core/dist/types/utils/animation/animation-utils", "setStyleProperty")
  @js.native
  def setStyleProperty(element: HTMLElement, propertyName: String): Unit = js.native
  @JSImport("@ionic/core/dist/types/utils/animation/animation-utils", "setStyleProperty")
  @js.native
  def setStyleProperty(element: HTMLElement, propertyName: String, value: String): Unit = js.native
}
