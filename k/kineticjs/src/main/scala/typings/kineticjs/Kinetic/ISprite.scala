package typings.kineticjs.Kinetic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISprite extends IShape {
  
  def afterFrame(index: Double, func: js.Function0[_]): js.Any = js.native
  
  def getAnimation(): String = js.native
  
  def getAnimations(): js.Any = js.native
  
  def getIndex(): Double = js.native
  
  def setAnimation(anim: String): js.Any = js.native
  
  def setAnimations(animations: js.Any): js.Any = js.native
  
  def setIndex(index: Double): js.Any = js.native
  
  def start(): js.Any = js.native
  
  def stop(): js.Any = js.native
}
