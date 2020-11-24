package typings.lockr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("lockr")
@js.native
object lockr extends js.Object {
  
  @js.native
  trait LockrStatic extends js.Object {
    
    /**
      * Empties localStorage.
      */
    def flush(): Unit = js.native
    
    /**
      * Returns the saved value for given key, even if the saved value is hash object. 
      * If value is null or undefined it returns a default value.
      * @param key  
      * @param defaultValue 
      */
    def get[T](key: String): T = js.native
    def get[T](key: String, defaultValue: T): T = js.native
    
    /**
      * Returns all saved values & objects, in an Array.
      */
    def getAll(): js.Array[String | Double | js.Object] = js.native
    
    /**
      * Returns all keys without (if set) prefix
      */
    def keys(): js.Array[String] = js.native
    
    /**
      * The prefix used by lockr.
      */
    var prefix: String = js.native
    
    /**
      * Removes all data associated to a key.
      * @param key 
      */
    def rm(key: String): Unit = js.native
    
    /**
      * Adds a unique value to a particular set under a hash key.
      * @param key  
      * @param value 
      */
    def sadd(key: String, value: String): Unit = js.native
    def sadd(key: String, value: js.Object): Unit = js.native
    def sadd(key: String, value: Double): Unit = js.native
    /**
      * Adds a unique value to a particular set under a hash key.
      * @param key  
      * @param value 
      */
    def sadd[T](key: String, value: js.Array[T]): Unit = js.native
    
    /**
      * Set a key to a particular value or a hash object (Object or Array) under a hash key.
      * @param key 
      * @param value
      */
    def set(key: String, value: String): Unit = js.native
    def set(key: String, value: js.Object): Unit = js.native
    def set(key: String, value: Double): Unit = js.native
    /**
      * Set a key to a particular value or a hash object (Object or Array) under a hash key.
      * @param key 
      * @param value
      */
    def set[T](key: String, value: js.Array[T]): Unit = js.native
    
    /**
      * Returns whether the value exists in a particular set under a hash key.
      * @param key  
      * @param value 
      */
    def sismember(key: String, value: String): Boolean = js.native
    def sismember(key: String, value: js.Object): Boolean = js.native
    def sismember(key: String, value: Double): Boolean = js.native
    /**
      * Returns whether the value exists in a particular set under a hash key.
      * @param key  
      * @param value 
      */
    def sismember[T](key: String, value: js.Array[T]): Boolean = js.native
    
    /**
      * Returns the values of a particular set under a hash key.
      * @param key 
      */
    def smembers(key: String): js.Array[String | Double | js.Object] = js.native
    /**
      * Returns the values of a particular set under a hash key.
      * @param key 
      */
    @JSName("smembers")
    def smembers_T[T](key: String): js.Array[T] = js.native
    
    /**
      * Removes a value from a particular set under a hash key.
      * @param key  
      * @param value 
      */
    def srem(key: String, value: String): Unit = js.native
    def srem(key: String, value: js.Object): Unit = js.native
    def srem(key: String, value: Double): Unit = js.native
    /**
      * Removes a value from a particular set under a hash key.
      * @param key  
      * @param value 
      */
    def srem[T](key: String, value: js.Array[T]): Unit = js.native
  }
}
