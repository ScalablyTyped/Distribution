package typings.loopback.mod

import typings.loopback.anon.Match
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Data model for key-value databases.
  * @class
  */
@JSImport("loopback", "KeyValueModel")
@js.native
open class KeyValueModel () extends StObject
object KeyValueModel {
  
  @JSImport("loopback", "KeyValueModel")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Set the TTL (time to live) in ms (milliseconds) for a given key.
    * TTL is the remaining time before a key-value pair is discarded from the database.
    *
    * Callback (Optional) Optional callback.
    * When the callback function is not provided, a promise is returned instead (see below).
    *
    * Promise
    * this method supports both callback-based and promise-based invocation.
    * Call this method with no callback argument to get back a promise instead.
    * @param {string} key Key to use when searching the database.
    * @param {number} ttl TTL in ms to set for the key.
    * @param {any} options
    * @param {() => void} callback
    */
  /* static member */
  inline def expire(key: String, ttl: Double, options: Any, callback: js.Function0[Unit]): js.Thenable[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("expire")(key.asInstanceOf[js.Any], ttl.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Any]]
  
  /**
    * Return the value associated with a given key.
    *
    * Callback (Optional)
    * Optional callback. When the callback function is not provided, a promise is returned instead (see below).
    *
    * Promise
    * This method supports both callback-based and promise-based invocation.
    * Call this method with no callback argument to get back a promise instead.
    *
    * @param {string} key Key to use when searching the database.
    * @param {any} options
    * @param {() => void} callback
    */
  /* static member */
  inline def get(key: String): js.Thenable[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any]).asInstanceOf[js.Thenable[Any]]
  inline def get(key: String, option: Any): js.Thenable[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Any]]
  inline def get(key: String, option: Any, callback: js.Function2[/* err */ js.Error, /* result */ Any, Unit]): js.Thenable[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any], option.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Any]]
  inline def get(key: String, option: Unit, callback: js.Function2[/* err */ js.Error, /* result */ Any, Unit]): js.Thenable[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any], option.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Any]]
  
  /**
    * Asynchronously iterate all keys in the database. Similar to .keys()
    * but instead allows for iteration over large data sets without having
    * to load everything into memory at once.
    * Callback example:
    * ```
    * // Given a model named `Color` with two keys `red` and `blue`
    *    var iterator = Color.iterateKeys();
    *    t.next(function(err, key) {
    *    // key contains `red`
    *          it.next(function(err, key) {
    *          // key contains `blue`
    *          });
    *    });
    * ```
    *
    * Promise example:
    * ```
    * // Given a model named `Color` with two keys `red` and `blue`
    * var iterator = Color.iterateKeys();
    * Promise.resolve().then(function() {
    *   return it.next();
    * })
    * .then(function(key) {
    *  // key contains `red`
    *   return it.next();
    * });
    * .then(function(key) {
    *   // key contains `blue`
    * });
    * ```
    *
    * @param {any} filter An optional filter object with the following
    * @param {string} filter.match Glob string to use to filter returned keys (i.e. userid.*).
    *  All connectors are required to support * and ?.
    * They may also support additional special characters that are specific to the backing database.
    * @param {any} filter.options
    * @return {any} result AsyncIterator An Object implementing next(cb) -> Promise function that can be used to iterate all keys.
    */
  /* static member */
  inline def iterateKeys(filter: Match): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("iterateKeys")(filter.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /**
    * Return all keys in the database.
    * WARNING: This method is not suitable for large data sets as all key-values pairs
    * are loaded into memory at once. For large data sets, use iterateKeys() instead.
    *
    * This method supports both callback-based and promise-based invocation.
    * Call this method with no callback argument to get back a promise instead
    *
    * WARNING: this promise implementation will not resolve according to the callback function.
    *
    * @param {any} filter An optional filter object with the following
    * @param {string} filter.match Glob string used to filter returned keys (i.e. userid.*).
    * All connectors are required to support * and ?, but may also support additional special
    * characters specific to the database.
    * @param {any} filter.options
    * @param {() => void} callback
    * @return {PromiseLike<any>}
    */
  /* static member */
  inline def keys(filter: Match, callback: js.Function0[Unit]): js.Thenable[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("keys")(filter.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Any]]
  
  /**
    * Persist a value and associate it with the given key.
    *
    * Callback (Optional)
    * Optional callback. When the callback function is not provided, a promise is returned instead (see below).
    *
    * Promise
    * This method supports both callback-based and promise-based invocation.
    * Call this method with no callback argument to get back a promise instead.
    *
    * @param {string} key Key to associate with the given value.
    * @param {any} value Value to persist.
    * @param {number|any} Optional settings for the key-value pair. If a Number is provided, it is set as the TTL (time to live) in ms (milliseconds) for the key-value pair.
    * @param {() => void} callback
    */
  /* static member */
  inline def set(key: String, value: Any): js.Thenable[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Any]]
  inline def set(key: String, value: Any, options: Any): js.Thenable[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Any]]
  inline def set(key: String, value: Any, options: Any, callback: js.Function1[/* err */ js.Error, Unit]): js.Thenable[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Any]]
  inline def set(key: String, value: Any, options: Double): js.Thenable[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Any]]
  inline def set(key: String, value: Any, options: Double, callback: js.Function1[/* err */ js.Error, Unit]): js.Thenable[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Any]]
  inline def set(key: String, value: Any, options: Unit, callback: js.Function1[/* err */ js.Error, Unit]): js.Thenable[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Any]]
  
  /**
    * Return the TTL (time to live) for a given key.
    * TTL is the remaining time before a key-value pair is discarded from the database.
    *
    * Callback (Optional)
    * Optional callback. When the callback function is not provided,
    * a promise is returned instead (see below).
    *
    * @param {string} key Key to use when searching the database.
    * @param {any} options
    * @param {() => void} callback
    */
  /* static member */
  inline def ttl(key: String): js.Thenable[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("ttl")(key.asInstanceOf[js.Any]).asInstanceOf[js.Thenable[Any]]
  inline def ttl(key: String, options: Any): js.Thenable[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("ttl")(key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Any]]
  inline def ttl(key: String, options: Any, cb: js.Function1[/* error */ js.Error, Unit]): js.Thenable[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("ttl")(key.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Any]]
  inline def ttl(key: String, options: Unit, cb: js.Function1[/* error */ js.Error, Unit]): js.Thenable[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("ttl")(key.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Any]]
}
