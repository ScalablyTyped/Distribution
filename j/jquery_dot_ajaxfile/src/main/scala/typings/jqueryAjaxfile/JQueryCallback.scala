package typings.jqueryAjaxfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for the JQuery callback
  */
@js.native
trait JQueryCallback extends js.Object {
  /**
    * Add a callback or a collection of callbacks to a callback list.
    * 
    * @param callbacks A function, or array of functions, that are to be added to the callback list.
    */
  def add(callbacks: js.Array[js.Function]): JQueryCallback = js.native
  /**
    * Add a callback or a collection of callbacks to a callback list.
    * 
    * @param callbacks A function, or array of functions, that are to be added to the callback list.
    */
  def add(callbacks: js.Function): JQueryCallback = js.native
  /**
    * Disable a callback list from doing anything more.
    */
  def disable(): JQueryCallback = js.native
  /**
    * Determine if the callbacks list has been disabled.
    */
  def disabled(): Boolean = js.native
  /**
    * Remove all of the callbacks from a list.
    */
  def empty(): JQueryCallback = js.native
  /**
    * Call all of the callbacks with the given arguments
    * 
    * @param arguments The argument or list of arguments to pass back to the callback list.
    */
  def fire(arguments: js.Any*): JQueryCallback = js.native
  def fireWith(context: js.UndefOr[scala.Nothing], args: js.Any*): JQueryCallback = js.native
  /**
    * Call all callbacks in a list with the given context and arguments.
    * 
    * @param context A reference to the context in which the callbacks in the list should be fired.
    * @param arguments An argument, or array of arguments, to pass to the callbacks in the list.
    */
  def fireWith(context: js.Any, args: js.Any*): JQueryCallback = js.native
  /**
    * Determine if the callbacks have already been called at least once.
    */
  def fired(): Boolean = js.native
  /**
    * Determine whether a supplied callback is in a list
    * 
    * @param callback The callback to search for.
    */
  def has(callback: js.Function): Boolean = js.native
  /**
    * Lock a callback list in its current state.
    */
  def lock(): JQueryCallback = js.native
  /**
    * Determine if the callbacks list has been locked.
    */
  def locked(): Boolean = js.native
  /**
    * Remove a callback or a collection of callbacks from a callback list.
    * 
    * @param callbacks A function, or array of functions, that are to be removed from the callback list.
    */
  def remove(callbacks: js.Array[js.Function]): JQueryCallback = js.native
  /**
    * Remove a callback or a collection of callbacks from a callback list.
    * 
    * @param callbacks A function, or array of functions, that are to be removed from the callback list.
    */
  def remove(callbacks: js.Function): JQueryCallback = js.native
}

