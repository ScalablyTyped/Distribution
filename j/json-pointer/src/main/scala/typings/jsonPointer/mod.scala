package typings.jsonPointer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("json-pointer", JSImport.Namespace)
  @js.native
  def apply(`object`: js.Object): JSONPointerWrap = js.native
  
  /**
    *  Builds a json pointer from an array of reference tokens.
    */
  @JSImport("json-pointer", "compile")
  @js.native
  def compile(str: js.Array[String]): String = js.native
  
  /**
    *  Creates a dictionary object (pointer -> value).
    */
  @JSImport("json-pointer", "dict")
  @js.native
  def dict(`object`: js.Object): js.Object = js.native
  
  /**
    *  Escapes a reference token.
    */
  @JSImport("json-pointer", "escape")
  @js.native
  def escape(str: String): String = js.native
  
  /**
    *  Wrap an object with accessors
    */
  /**
    *  Looks up a JSON pointer in an object.
    */
  @JSImport("json-pointer", "get")
  @js.native
  def get(`object`: js.Object, pointer: String): js.Any = js.native
  
  /**
    *  Tests if an object has a value for a JSON pointer.
    */
  @JSImport("json-pointer", "has")
  @js.native
  def has(`object`: js.Object, pointer: String): Boolean = js.native
  
  /**
    *  Converts a JSON pointer into an array of reference tokens.
    */
  @JSImport("json-pointer", "parse")
  @js.native
  def parse(str: String): js.Array[String] = js.native
  
  /**
    *  Removes an attribute of object referenced by pointer
    */
  @JSImport("json-pointer", "remove")
  @js.native
  def remove(`object`: js.Object, pointer: String): Unit = js.native
  
  /**
    *  Set a value for a JSON pointer on object.
    */
  @JSImport("json-pointer", "set")
  @js.native
  def set(`object`: js.Object, pointer: String, value: js.Any): Unit = js.native
  
  /**
    *  Unescape a reference token.
    */
  @JSImport("json-pointer", "unescape")
  @js.native
  def unescape(str: String): String = js.native
  
  /**
    *  Just like: each(pointer.dict(obj), iterator);
    */
  @JSImport("json-pointer", "walk")
  @js.native
  def walk(`object`: js.Object, iterator: js.Function2[/* value */ js.Any, /* key */ String, Unit]): Unit = js.native
  
  @js.native
  trait JSONPointerWrap extends StObject {
    
    /**
      *  Creates a dictionary object (pointer -> value).
      */
    def dict(): js.Object = js.native
    
    /**
      *  Looks up a JSON pointer in an object.
      */
    def get(pointer: String): js.Any = js.native
    
    /**
      *  Tests if an object has a value for a JSON pointer.
      */
    def has(pointer: String): Boolean = js.native
    
    /**
      *  Removes an attribute of object referenced by pointer
      */
    def remove(pointer: String): Unit = js.native
    
    /**
      *  Set a value for a JSON pointer on object.
      */
    def set(pointer: String, value: js.Any): Unit = js.native
    
    /**
      *  Just like: each(pointer.dict(obj), iterator);
      */
    def walk(iterator: js.Function2[/* value */ js.Any, /* key */ String, Unit]): Unit = js.native
  }
  object JSONPointerWrap {
    
    @scala.inline
    def apply(
      dict: () => js.Object,
      get: String => js.Any,
      has: String => Boolean,
      remove: String => Unit,
      set: (String, js.Any) => Unit,
      walk: js.Function2[/* value */ js.Any, /* key */ String, Unit] => Unit
    ): JSONPointerWrap = {
      val __obj = js.Dynamic.literal(dict = js.Any.fromFunction0(dict), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set), walk = js.Any.fromFunction1(walk))
      __obj.asInstanceOf[JSONPointerWrap]
    }
    
    @scala.inline
    implicit class JSONPointerWrapMutableBuilder[Self <: JSONPointerWrap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDict(value: () => js.Object): Self = StObject.set(x, "dict", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet(value: String => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemove(value: String => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet(value: (String, js.Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      @scala.inline
      def setWalk(value: js.Function2[/* value */ js.Any, /* key */ String, Unit] => Unit): Self = StObject.set(x, "walk", js.Any.fromFunction1(value))
    }
  }
}
