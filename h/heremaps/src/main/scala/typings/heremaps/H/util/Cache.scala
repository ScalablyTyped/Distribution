package typings.heremaps.H.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The cache represents a in-memory LRU-cache with a fixed size. It stores any data that is added until the cache's content exceeds a maximum size. Once the size of all content elements
  * exceeds the maximum size the cache will drop the least recently retrieved elements until the size of the cache is within the bounds of its maximum size. Data elements are always
  * associated with an identifier that allow to retrieve them at a later stage and their content size.
  */
@JSGlobal("H.util.Cache")
@js.native
class Cache protected () extends ICache {
  /**
    * Constructor
    * @param maxSize {number} - the maximum size of the cache
    * @param opt_onDrop {function(string, ?, number)=} - A callback to be invoked when a data element is dropped from the cache
    * @param opt_filter {(function(string, ?, number): boolean)=} - A function to filter data elements that are not to be cached
    */
  def this(maxSize: Double) = this()
  def this(maxSize: Double, opt_onDrop: js.Function3[/* s */ String, /* i */ js.Any, /* n */ Double, Unit]) = this()
  def this(
    maxSize: Double,
    opt_onDrop: js.Function3[/* s */ String, /* i */ js.Any, /* n */ Double, Unit],
    opt_filter: js.Function3[/* s */ String, /* i */ js.Any, /* n */ Double, Boolean]
  ) = this()
  def forEach(callback: js.Function3[/* s */ String, /* i */ js.Any, /* n */ Double, Unit], opt_ctx: js.Any): Unit = js.native
  def forEach(
    callback: js.Function3[/* s */ String, /* i */ js.Any, /* n */ Double, Unit],
    opt_ctx: js.Any,
    opt_matcher: js.Function3[/* s */ String, /* i */ js.Any, /* n */ Double, Boolean]
  ): Unit = js.native
  /**
    * This method returns the current size of this cache.
    * @returns {number} - the current size of the cache
    */
  def getCurrentSize(): Double = js.native
  /**
    * This method returns the maximum size of this cache.
    * @returns {number} - the maximum size of the cache
    */
  def getMaxSize(): Double = js.native
  /**
    * This method sets this cache's maximum size to a new size. If the cache's contents exceed the new size, least recently used data elements will be dropped.
    * @param maxSize {number} - the new maximum size of this cache.
    * @returns {H.util.Cache} - this cache
    */
  def setMaxSize(maxSize: Double): Cache = js.native
}

