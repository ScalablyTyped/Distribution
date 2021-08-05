package typings.jsonPointer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(`object`: js.Object): JSONPointerWrap = ^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any]).asInstanceOf[JSONPointerWrap]
  
  @JSImport("json-pointer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *  Builds a json pointer from an array of reference tokens.
    */
  inline def compile(str: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    *  Creates a dictionary object (pointer -> value).
    */
  inline def dict(`object`: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("dict")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  /**
    *  Escapes a reference token.
    */
  inline def escape(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escape")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    *  Wrap an object with accessors
    */
  /**
    *  Looks up a JSON pointer in an object.
    */
  inline def get(`object`: js.Object, pointer: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(`object`.asInstanceOf[js.Any], pointer.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /**
    *  Tests if an object has a value for a JSON pointer.
    */
  inline def has(`object`: js.Object, pointer: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(`object`.asInstanceOf[js.Any], pointer.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    *  Converts a JSON pointer into an array of reference tokens.
    */
  inline def parse(str: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  /**
    *  Removes an attribute of object referenced by pointer
    */
  inline def remove(`object`: js.Object, pointer: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(`object`.asInstanceOf[js.Any], pointer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    *  Set a value for a JSON pointer on object.
    */
  inline def set(`object`: js.Object, pointer: String, value: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(`object`.asInstanceOf[js.Any], pointer.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    *  Unescape a reference token.
    */
  inline def unescape(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescape")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    *  Just like: each(pointer.dict(obj), iterator);
    */
  inline def walk(`object`: js.Object, iterator: js.Function2[/* value */ js.Any, /* key */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(`object`.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait JSONPointerWrap extends StObject {
    
    /**
      *  Creates a dictionary object (pointer -> value).
      */
    def dict(): js.Object
    
    /**
      *  Looks up a JSON pointer in an object.
      */
    def get(pointer: String): js.Any
    
    /**
      *  Tests if an object has a value for a JSON pointer.
      */
    def has(pointer: String): Boolean
    
    /**
      *  Removes an attribute of object referenced by pointer
      */
    def remove(pointer: String): Unit
    
    /**
      *  Set a value for a JSON pointer on object.
      */
    def set(pointer: String, value: js.Any): Unit
    
    /**
      *  Just like: each(pointer.dict(obj), iterator);
      */
    def walk(iterator: js.Function2[/* value */ js.Any, /* key */ String, Unit]): Unit
  }
  object JSONPointerWrap {
    
    inline def apply(
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
    
    extension [Self <: JSONPointerWrap](x: Self) {
      
      inline def setDict(value: () => js.Object): Self = StObject.set(x, "dict", js.Any.fromFunction0(value))
      
      inline def setGet(value: String => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setRemove(value: String => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      inline def setSet(value: (String, js.Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      inline def setWalk(value: js.Function2[/* value */ js.Any, /* key */ String, Unit] => Unit): Self = StObject.set(x, "walk", js.Any.fromFunction1(value))
    }
  }
}
