package typings.lottieWeb.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LottiePlayer extends js.Object {
  
  def destroy(): Unit = js.native
  def destroy(name: String): Unit = js.native
  
  def loadAnimation(params: AnimationConfigWithData): AnimationItem = js.native
  def loadAnimation(params: AnimationConfigWithPath): AnimationItem = js.native
  
  def pause(): Unit = js.native
  def pause(name: String): Unit = js.native
  
  def play(): Unit = js.native
  def play(name: String): Unit = js.native
  
  def registerAnimation(element: Element): Unit = js.native
  def registerAnimation(element: Element, animationData: js.Any): Unit = js.native
  
  def searchAnimations(): Unit = js.native
  def searchAnimations(animationData: js.UndefOr[scala.Nothing], standalone: js.UndefOr[scala.Nothing], renderer: String): Unit = js.native
  def searchAnimations(animationData: js.UndefOr[scala.Nothing], standalone: Boolean): Unit = js.native
  def searchAnimations(animationData: js.UndefOr[scala.Nothing], standalone: Boolean, renderer: String): Unit = js.native
  def searchAnimations(animationData: js.Any): Unit = js.native
  def searchAnimations(animationData: js.Any, standalone: js.UndefOr[scala.Nothing], renderer: String): Unit = js.native
  def searchAnimations(animationData: js.Any, standalone: Boolean): Unit = js.native
  def searchAnimations(animationData: js.Any, standalone: Boolean, renderer: String): Unit = js.native
  
  def setDirection(direction: AnimationDirection): Unit = js.native
  def setDirection(direction: AnimationDirection, name: String): Unit = js.native
  
  def setLocationHref(href: String): Unit = js.native
  
  def setQuality(quality: String): Unit = js.native
  def setQuality(quality: Double): Unit = js.native
  
  def setSpeed(speed: Double): Unit = js.native
  def setSpeed(speed: Double, name: String): Unit = js.native
  
  def stop(): Unit = js.native
  def stop(name: String): Unit = js.native
}
