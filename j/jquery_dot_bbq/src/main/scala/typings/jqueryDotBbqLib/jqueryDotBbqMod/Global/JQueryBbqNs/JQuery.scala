package typings
package jqueryDotBbqLib.jqueryDotBbqMod.Global.JQueryBbqNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /**
               * Retrieves the current 'state' from the browser history, parsing
               * location.hash for a specific key or returning an object containing the
               * entire state, optionally coercing numbers, booleans, null and undefined
               * values.
               *
               * @name key An optional state key for which to return a value.
               * @name coerce If true, coerces any numbers or true, false, null, and undefined to their actual value. Defaults to false
               */
  def getState(): js.Any = js.native
  def getState(coerce: scala.Boolean): js.Any = js.native
  /**
               * Retrieves the current 'state' from the browser history, parsing
               * location.hash for a specific key or returning an object containing the
               * entire state, optionally coercing numbers, booleans, null and undefined
               * values.
               *
               * @name key An optional state key for which to return a value.
               * @name coerce If true, coerces any numbers or true, false, null, and undefined to their actual value. Defaults to false
               */
  def getState(key: java.lang.String): js.Any = js.native
  /**
               * Retrieves the current 'state' from the browser history, parsing
               * location.hash for a specific key or returning an object containing the
               * entire state, optionally coercing numbers, booleans, null and undefined
               * values.
               *
               * @name key An optional state key for which to return a value.
               * @name coerce If true, coerces any numbers or true, false, null, and undefined to their actual value. Defaults to false
               */
  def getState(key: java.lang.String, coerce: scala.Boolean): js.Any = js.native
  /**
               * Adds a 'state' into the browser history at the current position, setting
               * location.hash and triggering any bound <hashchange event> callbacks
               * (provided the new state is different than the previous state).
               *
               * @name params A serialized params string or a hash string beginning with # to merge into location.hash.
               * @name merge_mode Merge behavior defaults to 0 if merge_mode is not specified (unless a hash string beginning with # is specified, in which case merge behavior defaults to 2)
               */
  def pushState(): scala.Unit = js.native
  /**
               * Adds a 'state' into the browser history at the current position, setting
               * location.hash and triggering any bound <hashchange event> callbacks
               * (provided the new state is different than the previous state).
               *
               * @name params A serialized params string or a hash string beginning with # to merge into location.hash.
               * @name merge_mode Merge behavior defaults to 0 if merge_mode is not specified (unless a hash string beginning with # is specified, in which case merge behavior defaults to 2)
               */
  def pushState(params: java.lang.String): scala.Unit = js.native
  /**
               * Adds a 'state' into the browser history at the current position, setting
               * location.hash and triggering any bound <hashchange event> callbacks
               * (provided the new state is different than the previous state).
               *
               * @name params A serialized params string or a hash string beginning with # to merge into location.hash.
               * @name merge_mode Merge behavior defaults to 0 if merge_mode is not specified (unless a hash string beginning with # is specified, in which case merge behavior defaults to 2)
               */
  def pushState(params: java.lang.String, merge_mode: scala.Double): scala.Unit = js.native
  def pushState(params: js.Any): scala.Unit = js.native
  def pushState(params: js.Any, merge_mode: scala.Double): scala.Unit = js.native
  /**
               * Remove one or more keys from the current browser history 'state', creating
               * a new state, setting location.hash and triggering any bound
               * <hashchange event> callbacks (provided the new state is different than
               * the previous state).
               *
               * @name key One or more key values to remove from the current state.
               */
  def removeState(key: js.Any*): scala.Unit = js.native
}

