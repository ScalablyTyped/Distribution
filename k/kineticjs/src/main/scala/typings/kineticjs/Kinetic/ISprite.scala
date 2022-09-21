package typings.kineticjs.Kinetic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISprite
  extends StObject
     with IShape {
  
  def afterFrame(index: Double, func: js.Function0[Any]): Any = js.native
  
  def getAnimation(): String = js.native
  
  def getAnimations(): Any = js.native
  
  def getIndex(): Double = js.native
  
  def setAnimation(anim: String): Any = js.native
  
  def setAnimations(animations: Any): Any = js.native
  
  def setIndex(index: Double): Any = js.native
  
  def start(): Any = js.native
  
  def stop(): Any = js.native
}
