package typings.jsonpointer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    *  Builds a JSONPointer instance from a pointer value.
    */
  @JSImport("jsonpointer", "compile")
  @js.native
  def compile(pointer: String): JSONPointer = js.native
  
  /**
    * Looks up a JSON pointer in an object
    */
  @JSImport("jsonpointer", "get")
  @js.native
  def get(`object`: js.Object, pointer: String): js.Any = js.native
  
  /**
    * Set a value for a JSON pointer on object
    */
  @JSImport("jsonpointer", "set")
  @js.native
  def set(`object`: js.Object, pointer: String, value: js.Any): Unit = js.native
  
  @js.native
  trait JSONPointer extends StObject {
    
    /**
      * Looks up a JSON pointer in an object
      */
    def get(`object`: js.Object, pointer: String): js.Any = js.native
    
    /**
      * Set a value for a JSON pointer on object
      */
    def set(`object`: js.Object, pointer: String, value: js.Any): Unit = js.native
  }
  object JSONPointer {
    
    @scala.inline
    def apply(get: (js.Object, String) => js.Any, set: (js.Object, String, js.Any) => Unit): JSONPointer = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), set = js.Any.fromFunction3(set))
      __obj.asInstanceOf[JSONPointer]
    }
    
    @scala.inline
    implicit class JSONPointerMutableBuilder[Self <: JSONPointer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGet(value: (js.Object, String) => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSet(value: (js.Object, String, js.Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction3(value))
    }
  }
}
