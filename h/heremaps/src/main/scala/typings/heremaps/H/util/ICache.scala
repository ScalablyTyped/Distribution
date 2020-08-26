package typings.heremaps.H.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface definition for the generic cache. Any data elements can be stored in the cache. They are always associated with an identifier to retrieve them at a later stage and their
  * content size.
  */
@js.native
trait ICache extends js.Object {
  /**
    * This method adds an element to the cache.
    * @param id {*} - The identifier of this data element, the value is converted to a string.
    * @param data {*} - the actual data to be stored
    * @param size {number} - the size of the data element
    * @returns {boolean} - a boolean value indicating whether the data was added
    */
  def add(id: js.Any, data: js.Any, size: Double): Boolean = js.native
  /**
    * This method explicitly drops an element from the cache.
    * @param id {*} - the id of the item to drop
    */
  def drop(id: js.Any): Unit = js.native
  /**
    * This method will execute the provided callback function on each of the cache's entries. If the optional match predicate is passed to this method the callback will only be executed on
    * those entries for which the predicated returns true.
    * @param callback {function(string, ?, number)} - the callback to be invoked for each entry
    * @param opt_ctx {Object=} - an optional context object to be used as this within the callback
    * @param opt_matcher {(function(string, ?, number): boolean)=} - an optional match predicate to customize on which entries the callback will be called
    */
  def forEach(callback: js.Function3[/* s */ String, /* t */ js.Any, /* n */ Double, Unit]): Unit = js.native
  def forEach(
    callback: js.Function3[/* s */ String, /* t */ js.Any, /* n */ Double, Unit],
    opt_ctx: js.UndefOr[scala.Nothing],
    opt_matcher: js.Function3[/* s */ String, /* t */ js.Any, /* n */ Double, Boolean]
  ): Unit = js.native
  def forEach(callback: js.Function3[/* s */ String, /* t */ js.Any, /* n */ Double, Unit], opt_ctx: js.Object): Unit = js.native
  def forEach(
    callback: js.Function3[/* s */ String, /* t */ js.Any, /* n */ Double, Unit],
    opt_ctx: js.Object,
    opt_matcher: js.Function3[/* s */ String, /* t */ js.Any, /* n */ Double, Boolean]
  ): Unit = js.native
  /**
    * This method retrieves an element from the cache.
    * @param id {string} - the ID of the data element to be retrieved.
    * @param opt_noUpdate {boolean=} - and optional flag to indicate that the retrieved object should not be marked as 'most recently used'.
    * @returns {*} - returns the data associated with the ID or undefined if the data element is not currently in the cache.
    */
  def get(id: String): js.Any = js.native
  def get(id: String, opt_noUpdate: Boolean): js.Any = js.native
  /**
    * This method registers a callback that should be called each time an entry is dropped from the cache.
    * @param callback {(function(string, ?, number))} - the callback to be invoked for each entry
    */
  def registerOnDrop(callback: js.Function3[/* s */ String, /* t */ js.Any, /* n */ Double, Unit]): Unit = js.native
  /**
    * This method removes all data elements from the cache. If the optional match predicate is passed to this method only those data elements will be removed for which the predicate
    * return true.
    * @param opt_matcher {(function(string, ?, number): boolean)=} - an optional function that receives an entries id, data and size and may return true or false to either remove it or
    * leave the entry in the cache respectively
    */
  def removeAll(): Unit = js.native
  def removeAll(opt_matcher: js.Function3[/* s */ String, /* t */ js.Any, /* n */ Double, Boolean]): Unit = js.native
}

