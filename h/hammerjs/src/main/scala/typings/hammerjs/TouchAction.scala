package typings.hammerjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TouchAction extends StObject {
  
  def compute(): String
  
  def preventDefaults(input: HammerInput): Unit
  
  def preventSrc(srcEvent: Any): Unit
  
  def set(value: String): Unit
  
  def update(): Unit
}
object TouchAction {
  
  inline def apply(
    compute: () => String,
    preventDefaults: HammerInput => Unit,
    preventSrc: Any => Unit,
    set: String => Unit,
    update: () => Unit
  ): TouchAction = {
    val __obj = js.Dynamic.literal(compute = js.Any.fromFunction0(compute), preventDefaults = js.Any.fromFunction1(preventDefaults), preventSrc = js.Any.fromFunction1(preventSrc), set = js.Any.fromFunction1(set), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[TouchAction]
  }
  
  extension [Self <: TouchAction](x: Self) {
    
    inline def setCompute(value: () => String): Self = StObject.set(x, "compute", js.Any.fromFunction0(value))
    
    inline def setPreventDefaults(value: HammerInput => Unit): Self = StObject.set(x, "preventDefaults", js.Any.fromFunction1(value))
    
    inline def setPreventSrc(value: Any => Unit): Self = StObject.set(x, "preventSrc", js.Any.fromFunction1(value))
    
    inline def setSet(value: String => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    
    inline def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
  }
}
