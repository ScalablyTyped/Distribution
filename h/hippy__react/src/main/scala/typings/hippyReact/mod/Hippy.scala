package typings.hippyReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hippy extends StObject {
  
  var config: HippyReactConfig
  
  // Keep forward comaptatble.
  def regist(): Unit
  
  var rootContainer: Any
  
  def start(): Unit
}
object Hippy {
  
  inline def apply(config: HippyReactConfig, regist: () => Unit, rootContainer: Any, start: () => Unit): Hippy = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], regist = js.Any.fromFunction0(regist), rootContainer = rootContainer.asInstanceOf[js.Any], start = js.Any.fromFunction0(start))
    __obj.asInstanceOf[Hippy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Hippy] (val x: Self) extends AnyVal {
    
    inline def setConfig(value: HippyReactConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setRegist(value: () => Unit): Self = StObject.set(x, "regist", js.Any.fromFunction0(value))
    
    inline def setRootContainer(value: Any): Self = StObject.set(x, "rootContainer", value.asInstanceOf[js.Any])
    
    inline def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
  }
}
