package typings.lottieWeb.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LottiePlayer extends StObject {
  
  def destroy(): Unit = js.native
  def destroy(name: String): Unit = js.native
  
  def loadAnimation[T /* <: RendererType */](params: AnimationConfigWithData[T]): AnimationItem = js.native
  def loadAnimation[T /* <: RendererType */](params: AnimationConfigWithPath[T]): AnimationItem = js.native
  
  def pause(): Unit = js.native
  def pause(name: String): Unit = js.native
  
  def play(): Unit = js.native
  def play(name: String): Unit = js.native
  
  def registerAnimation(element: Element): Unit = js.native
  def registerAnimation(element: Element, animationData: Any): Unit = js.native
  
  def searchAnimations(): Unit = js.native
  def searchAnimations(animationData: Any): Unit = js.native
  def searchAnimations(animationData: Any, standalone: Boolean): Unit = js.native
  def searchAnimations(animationData: Any, standalone: Boolean, renderer: String): Unit = js.native
  def searchAnimations(animationData: Any, standalone: Unit, renderer: String): Unit = js.native
  def searchAnimations(animationData: Unit, standalone: Boolean): Unit = js.native
  def searchAnimations(animationData: Unit, standalone: Boolean, renderer: String): Unit = js.native
  def searchAnimations(animationData: Unit, standalone: Unit, renderer: String): Unit = js.native
  
  def setDirection(direction: AnimationDirection): Unit = js.native
  def setDirection(direction: AnimationDirection, name: String): Unit = js.native
  
  def setIDPrefix(prefix: String): Unit = js.native
  
  def setLocationHref(href: String): Unit = js.native
  
  def setQuality(quality: String): Unit = js.native
  def setQuality(quality: Double): Unit = js.native
  
  def setSpeed(speed: Double): Unit = js.native
  def setSpeed(speed: Double, name: String): Unit = js.native
  
  def stop(): Unit = js.native
  def stop(name: String): Unit = js.native
  
  def updateDocumentData(path: js.Array[String | Double], documentData: TextDocumentData, index: Double): Unit = js.native
}
