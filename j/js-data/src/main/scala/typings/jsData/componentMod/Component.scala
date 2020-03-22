package typings.jsData.componentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Component
  extends typings.jsData.settableMod.default {
  /**
    * Whether to enable debug-level logs for this component. Anything that
    * extends `Component` inherits this option and the corresponding logging
    * functionality.
    *
    * @example <caption>Component#debug</caption>
    * const JSData = require('js-data');
    * const { Component } = JSData;
    * console.log('Using JSData v' + JSData.version.full);
    *
    * const component = new Component();
    * component.log('debug', 'some message'); // nothing gets logged
    * // Display debug logs:
    * component.debug = true;
    * component.log('debug', 'other message'); // this DOES get logged
    *
    * @default false
    * @name Component#debug
    * @since 3.0.0
    * @type {boolean}
    */
  var debug: Boolean = js.native
  /**
    * Log the provided values at the "debug" level. Debug-level logs are only
    * logged if {@link Component#debug} is `true`.
    *
    * `.dbg(...)` is shorthand for `.log('debug', ...)`.
    *
    * @method Component#dbg
    * @param {...*} [args] Values to log.
    * @since 3.0.0
    */
  def dbg(args: js.Any*): Unit = js.native
  /**
    * Trigger an event on this Component.
    *
    * @example <caption>Component#emit</caption>
    * // import { Collection, DataStore } from 'js-data';
    * const JSData = require('js-data');
    * const { Collection, DataStore } = JSData;
    *
    * const collection = new Collection();
    * collection.on('foo', function (msg) {
    *   console.log(msg);
    * });
    * collection.emit('foo', 'bar');
    *
    * const store = new DataStore();
    * store.on('beep', function (msg) {
    *   console.log(msg);
    * });
    * store.emit('beep', 'boop');
    *
    * @method Component#emit
    * @param {string} event Name of event to emit.
    * @param {...*} [args] Arguments to pass to any listeners.
    * @since 3.0.0
    */
  def emit(event: String, args: js.Any*): Unit = js.native
  /**
    * Log the provided values. By default sends values to `console[level]`.
    * Debug-level logs are only logged if {@link Component#debug} is `true`.
    *
    * Will attempt to use appropriate `console` methods if they are available.
    *
    * @method Component#log
    * @param {string} level Log level.
    * @param {...*} [args] Values to log.
    * @since 3.0.0
    */
  def log(args: js.Any*): Unit = js.native
  /**
    * Remove an event listener from this Component. If no listener is provided,
    * then all listeners for the specified event will be removed. If no event is
    * specified then all listeners for all events will be removed.
    *
    * @example
    * // Remove a particular listener for a particular event
    * collection.off('add', handler);
    *
    * @example
    * // Remove all listeners for a particular event
    * record.off('change');
    *
    * @example
    * // Remove all listeners to all events
    * store.off();
    *
    * @method Component#off
    * @param {string} [event] Name of event to unsubscribe to.
    * @param {Function} [listener] Listener to remove.
    * @since 3.0.0
    */
  def off(event: String): Unit = js.native
  def off(event: String, listener: js.Function): Unit = js.native
  def off(event: String, listener: js.Function, thisArg: js.Any): Unit = js.native
  /**
    * Register a new event listener on this Component.
    *
    * @example
    * // Listen for all "afterCreate" events in a DataStore
    * store.on('afterCreate', (mapperName, props, opts, result) => {
    *   console.log(mapperName); // "post"
    *   console.log(props.id); // undefined
    *   console.log(result.id); // 1234
    * });
    * store.create('post', { title: 'Modeling your data' }).then((post) => {
    *   console.log(post.id); // 1234
    * });
    *
    * @example
    * // Listen for the "add" event on a collection
    * collection.on('add', (records) => {
    *   console.log(records); // [...]
    * });
    *
    * @example
    * // Listen for "change" events on a record
    * post.on('change', (record, changes) => {
    *   console.log(changes); // { changed: { title: 'Modeling your data' } }
    * });
    * post.title = 'Modeling your data';
    *
    * @method Component#on
    * @param {string} event Name of event to subscribe to.
    * @param {Function} listener Listener function to handle the event.
    * @param {*} [ctx] Optional content in which to invoke the listener.
    * @since 3.0.0
    */
  def on(name: String, listener: js.Function): Unit = js.native
  def on(name: String, listener: js.Function, ctx: js.Any): Unit = js.native
}

