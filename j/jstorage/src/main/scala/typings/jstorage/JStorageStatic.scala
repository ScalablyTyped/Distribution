package typings.jstorage

import typings.std.Storage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JStorageStatic extends StObject {
  
  /**
    * Which backend is currently in use?
    *
    * @return Backend name
    */
  def currentBackend(): Storage = js.native
  
  /**
    * Deletes a key from cache.
    *
    * @param key - Key to delete.
    * @return true if key existed or false if it didn't
    */
  def deleteKey(key: String): Boolean = js.native
  
  /**
    * Deletes everything in cache.
    *
    * @return Always true
    */
  def flush(): Boolean = js.native
  
  /**
    * Looks up a key in cache
    *
    * @param key - Key to look up.
    * @param defaultIfNotFound - Default value to return, if key didn't exist.
    * @return the key value, default value or null
    */
  def get[TValue](key: String): TValue = js.native
  def get[TValue](key: String, defaultIfNotFound: TValue): TValue = js.native
  
  /**
    * Gets remaining TTL (in milliseconds) for a key or 0 when no TTL has been set
    *
    * @param key Key to check
    * @return Remaining TTL in milliseconds
    */
  def getTTL(key: String): Double = js.native
  
  /**
    * Returns an index of all used keys as an array
    * ['key1', 'key2',..'keyN']
    *
    * @return Used keys
    */
  def index(): js.Array[String] = js.native
  
  /**
    * Register change listeners
    *
    * @param key Key name
    * @param callback Function to run when the key changes
    */
  def listenKeyChange(key: String, callback: js.Function2[/* key */ String, /* value */ js.Any, Unit]): Unit = js.native
  /**
    * Register change listeners
    *
    * @param key Key name
    * @param callback Function to run when the key changes
    */
  @JSName("listenKeyChange")
  def listenKeyChange_TValue[TValue](key: String, callback: js.Function2[/* key */ String, /* value */ TValue, Unit]): Unit = js.native
  
  /**
    * Publish data to an event stream
    *
    * @param channel Channel name
    * @param payload Payload to deliver
    */
  def publish(channel: String, payload: js.Any): Unit = js.native
  
  /**
    * Reloads the data from browser storage
    */
  def reInit(): Unit = js.native
  
  /**
    * Sets a key's value.
    *
    * @param key Key to set. If this value is not set or not
    *              a string an exception is raised.
    * @param value Value to set. This can be any value that is JSON
    *              compatible (Numbers, Strings, Objects etc.).
    * @param [options] - possible options to use
    * @param [options.TTL] - optional TTL value
    * @return the used value
    */
  def set[TValue](key: String, value: TValue): TValue = js.native
  def set[TValue](key: String, value: TValue, options: JStorageOptions): TValue = js.native
  
  /**
    * Sets a TTL for a key, or remove it if ttl value is 0 or below
    *
    * @param key - key to set the TTL for
    * @param ttl - TTL timeout in milliseconds
    * @return true if key existed or false if it didn't
    */
  def setTTL(key: String, ttl: Double): Boolean = js.native
  
  /**
    * Remove change listeners
    *
    * @param key Key name to unregister listeners against
    * @param [callback] If set, unregister the callback, if not - unregister all
    */
  def stopListening(key: String): Unit = js.native
  def stopListening(key: String, callback: js.Function): Unit = js.native
  
  /**
    * Test if storage is available
    *
    * @return True if storage can be used
    */
  def storageAvailable(): Boolean = js.native
  
  /**
    * Returns a read-only copy of _storage
    *
    * @return Read-only copy of _storage
    */
  def storageObj(): JStorageReadonlyStore = js.native
  
  /**
    * How much space in bytes does the storage take?
    *
    * @return Storage size in chars (not the same as in bytes,
    *                  since some chars may take several bytes)
    */
  def storageSize(): Double = js.native
  
  /**
    * Subscribe to a Publish/Subscribe event stream
    *
    * @param channel Channel name
    * @param callback Function to run when the something is published to the channel
    */
  def subscribe(channel: String, callback: js.Function2[/* channel */ String, /* value */ js.Any, Unit]): Unit = js.native
  /**
    * Subscribe to a Publish/Subscribe event stream
    *
    * @param channel Channel name
    * @param callback Function to run when the something is published to the channel
    */
  @JSName("subscribe")
  def subscribe_TValue[TValue](channel: String, callback: js.Function2[/* channel */ String, /* value */ TValue, Unit]): Unit = js.native
}
