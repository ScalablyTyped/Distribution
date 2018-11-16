package typings
package lockrLib.lockrNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LockrStatic extends js.Object {
  /**
           * The prefix used by lockr.
           */
  var prefix: java.lang.String = js.native
  /**
           * Empties localStorage.
           */
  def flush(): scala.Unit = js.native
  /**
           * Returns the saved value for given key, even if the saved value is hash object. 
           * If value is null or undefined it returns a default value.
           * @param key  
           * @param defaultValue 
           */
  def get[T](key: java.lang.String): T = js.native
  /**
           * Returns the saved value for given key, even if the saved value is hash object. 
           * If value is null or undefined it returns a default value.
           * @param key  
           * @param defaultValue 
           */
  def get[T](key: java.lang.String, defaultValue: T): T = js.native
  /**
           * Returns all saved values & objects, in an Array.
           */
  def getAll(): js.Array[java.lang.String | scala.Double | js.Object] = js.native
  /**
           * Returns all keys without (if set) prefix
           */
  def keys(): js.Array[java.lang.String] = js.native
  /**
           * Removes all data associated to a key.
           * @param key 
           */
  def rm(key: java.lang.String): scala.Unit = js.native
  /**
           * Adds a unique value to a particular set under a hash key.
           * @param key  
           * @param value 
           */
  def sadd(key: java.lang.String, value: java.lang.String): scala.Unit = js.native
  /**
           * Adds a unique value to a particular set under a hash key.
           * @param key  
           * @param value 
           */
  def sadd(key: java.lang.String, value: js.Object): scala.Unit = js.native
  /**
           * Adds a unique value to a particular set under a hash key.
           * @param key  
           * @param value 
           */
  def sadd(key: java.lang.String, value: scala.Double): scala.Unit = js.native
  /**
           * Adds a unique value to a particular set under a hash key.
           * @param key  
           * @param value 
           */
  def sadd[T](key: java.lang.String, value: js.Array[T]): scala.Unit = js.native
  /**
           * Set a key to a particular value or a hash object (Object or Array) under a hash key.
           * @param key 
           * @param value
           */
  def set(key: java.lang.String, value: java.lang.String): scala.Unit = js.native
  /**
           * Set a key to a particular value or a hash object (Object or Array) under a hash key.
           * @param key 
           * @param value
           */
  def set(key: java.lang.String, value: js.Object): scala.Unit = js.native
  /**
           * Set a key to a particular value or a hash object (Object or Array) under a hash key.
           * @param key 
           * @param value
           */
  def set(key: java.lang.String, value: scala.Double): scala.Unit = js.native
  /**
           * Set a key to a particular value or a hash object (Object or Array) under a hash key.
           * @param key 
           * @param value
           */
  def set[T](key: java.lang.String, value: js.Array[T]): scala.Unit = js.native
  /**
           * Returns whether the value exists in a particular set under a hash key.
           * @param key  
           * @param value 
           */
  def sismember(key: java.lang.String, value: java.lang.String): scala.Boolean = js.native
  /**
           * Returns whether the value exists in a particular set under a hash key.
           * @param key  
           * @param value 
           */
  def sismember(key: java.lang.String, value: js.Object): scala.Boolean = js.native
  /**
           * Returns whether the value exists in a particular set under a hash key.
           * @param key  
           * @param value 
           */
  def sismember(key: java.lang.String, value: scala.Double): scala.Boolean = js.native
  /**
           * Returns whether the value exists in a particular set under a hash key.
           * @param key  
           * @param value 
           */
  def sismember[T](key: java.lang.String, value: js.Array[T]): scala.Boolean = js.native
  /**
           * Returns the values of a particular set under a hash key.
           * @param key 
           */
  def smembers(key: java.lang.String): js.Array[java.lang.String | scala.Double | js.Object] = js.native
  /**
           * Returns the values of a particular set under a hash key.
           * @param key 
           */
  @JSName("smembers")
  def smembers_T[T](key: java.lang.String): js.Array[T] = js.native
  /**
           * Removes a value from a particular set under a hash key.
           * @param key  
           * @param value 
           */
  def srem(key: java.lang.String, value: java.lang.String): scala.Unit = js.native
  /**
           * Removes a value from a particular set under a hash key.
           * @param key  
           * @param value 
           */
  def srem(key: java.lang.String, value: js.Object): scala.Unit = js.native
  /**
           * Removes a value from a particular set under a hash key.
           * @param key  
           * @param value 
           */
  def srem(key: java.lang.String, value: scala.Double): scala.Unit = js.native
  /**
           * Removes a value from a particular set under a hash key.
           * @param key  
           * @param value 
           */
  def srem[T](key: java.lang.String, value: js.Array[T]): scala.Unit = js.native
}

