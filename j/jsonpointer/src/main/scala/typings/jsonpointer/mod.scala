package typings.jsonpointer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsonpointer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *  Builds a JSONPointer instance from a pointer value.
    */
  inline def compile(pointer: String): JSONPointer = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(pointer.asInstanceOf[js.Any]).asInstanceOf[JSONPointer]
  
  /**
    * Looks up a JSON pointer in an object
    */
  inline def get(`object`: js.Object, pointer: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(`object`.asInstanceOf[js.Any], pointer.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /**
    * Set a value for a JSON pointer on object
    */
  inline def set(`object`: js.Object, pointer: String, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(`object`.asInstanceOf[js.Any], pointer.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait JSONPointer extends StObject {
    
    /**
      * Looks up a JSON pointer in an object
      */
    def get(`object`: js.Object): Any
    
    /**
      * Set a value for a JSON pointer on object
      */
    def set(`object`: js.Object, value: Any): Unit
  }
  object JSONPointer {
    
    inline def apply(get: js.Object => Any, set: (js.Object, Any) => Unit): JSONPointer = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[JSONPointer]
    }
    
    extension [Self <: JSONPointer](x: Self) {
      
      inline def setGet(value: js.Object => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setSet(value: (js.Object, Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
}
