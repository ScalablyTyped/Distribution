package typings.hammerjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TouchAction extends StObject {
  
  def compute(): String = js.native
  
  def preventDefaults(input: HammerInput): Unit = js.native
  
  def preventSrc(srcEvent: js.Any): Unit = js.native
  
  def set(value: String): Unit = js.native
  
  def update(): Unit = js.native
}
object TouchAction {
  
  @scala.inline
  def apply(
    compute: () => String,
    preventDefaults: HammerInput => Unit,
    preventSrc: js.Any => Unit,
    set: String => Unit,
    update: () => Unit
  ): TouchAction = {
    val __obj = js.Dynamic.literal(compute = js.Any.fromFunction0(compute), preventDefaults = js.Any.fromFunction1(preventDefaults), preventSrc = js.Any.fromFunction1(preventSrc), set = js.Any.fromFunction1(set), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[TouchAction]
  }
  
  @scala.inline
  implicit class TouchActionMutableBuilder[Self <: TouchAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompute(value: () => String): Self = StObject.set(x, "compute", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPreventDefaults(value: HammerInput => Unit): Self = StObject.set(x, "preventDefaults", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPreventSrc(value: js.Any => Unit): Self = StObject.set(x, "preventSrc", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet(value: String => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
  }
}
