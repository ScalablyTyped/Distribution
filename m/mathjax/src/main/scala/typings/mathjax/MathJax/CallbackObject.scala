package typings.mathjax.MathJax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallbackObject extends StObject {
  
  /*Set this to true if you want to be able to call the callback more than once. (This is the case for signal
    * listeners, for example).*/
  var autoReset: Boolean
  
  /*Set to true after the callback has been called, and undefined otherwise. A callback will not be executed a
    * second time unless the callback’s reset() method is called first, or its autoReset property is set to true.
    */
  var called: Boolean
  
  /*An array containing the arguments to pass to the callback function when it is executed.*/
  var data: js.Array[Any]
  
  /*The function to be called when the callback is executed.*/
  var hook: Double
  
  /*The object to use as this during the call to the callback function.*/
  var `object`: Any
  
  /*Clears the callback’s called property.*/
  def reset(): Unit
}
object CallbackObject {
  
  inline def apply(
    autoReset: Boolean,
    called: Boolean,
    data: js.Array[Any],
    hook: Double,
    `object`: Any,
    reset: () => Unit
  ): CallbackObject = {
    val __obj = js.Dynamic.literal(autoReset = autoReset.asInstanceOf[js.Any], called = called.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], hook = hook.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset))
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallbackObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CallbackObject] (val x: Self) extends AnyVal {
    
    inline def setAutoReset(value: Boolean): Self = StObject.set(x, "autoReset", value.asInstanceOf[js.Any])
    
    inline def setCalled(value: Boolean): Self = StObject.set(x, "called", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.Array[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setHook(value: Double): Self = StObject.set(x, "hook", value.asInstanceOf[js.Any])
    
    inline def setObject(value: Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
  }
}
