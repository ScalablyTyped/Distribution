package typings.loopback.mod

import typings.loopback.anon.Match
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Data model for key-value databases.
  * @class
  */
@JSImport("loopback", "KeyValueModel")
@js.native
class KeyValueModel () extends js.Object

/* static members */
@JSImport("loopback", "KeyValueModel")
@js.native
object KeyValueModel extends js.Object {
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
  def expire(key: String, ttl: Double, options: js.Any, callback: js.Function0[Unit]): js.Thenable[_] = js.native
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
  def get(key: String): js.Thenable[_] = js.native
  def get(
    key: String,
    option: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ Error, /* result */ js.Any, Unit]
  ): js.Thenable[_] = js.native
  def get(key: String, option: js.Any): js.Thenable[_] = js.native
  def get(key: String, option: js.Any, callback: js.Function2[/* err */ Error, /* result */ js.Any, Unit]): js.Thenable[_] = js.native
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
  def iterateKeys(filter: Match): js.Any = js.native
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
  def keys(filter: Match, callback: js.Function0[Unit]): js.Thenable[_] = js.native
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
  def set(key: String, value: js.Any): js.Thenable[_] = js.native
  def set(
    key: String,
    value: js.Any,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ Error, Unit]
  ): js.Thenable[_] = js.native
  def set(key: String, value: js.Any, options: js.Any): js.Thenable[_] = js.native
  def set(key: String, value: js.Any, options: js.Any, callback: js.Function1[/* err */ Error, Unit]): js.Thenable[_] = js.native
  def set(key: String, value: js.Any, options: Double): js.Thenable[_] = js.native
  def set(key: String, value: js.Any, options: Double, callback: js.Function1[/* err */ Error, Unit]): js.Thenable[_] = js.native
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
  def ttl(key: String): js.Thenable[_] = js.native
  def ttl(key: String, options: js.UndefOr[scala.Nothing], cb: js.Function1[/* error */ Error, Unit]): js.Thenable[_] = js.native
  def ttl(key: String, options: js.Any): js.Thenable[_] = js.native
  def ttl(key: String, options: js.Any, cb: js.Function1[/* error */ Error, Unit]): js.Thenable[_] = js.native
}

