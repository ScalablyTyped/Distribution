package typings.interfaceDatastore.mod

import typings.std.AsyncIterable
import typings.std.AsyncIterableIterator
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("interface-datastore", "Adapter")
@js.native
abstract class Adapter[Value] () extends js.Object {
  
  /**
    * Create a new batch object.
    */
  def batch(): Batch[Value] = js.native
  
  def close(): js.Promise[Unit] = js.native
  
  /**
    * Remove the record for the passed key
    *
    * @param key
    * @param options
    */
  def delete(key: Key): js.Promise[Unit] = js.native
  def delete(key: Key, options: Options): js.Promise[Unit] = js.native
  
  /**
    * Remove values for the passed keys
    *
    * @param source
    * @param options
    */
  def deleteMany(source: AsyncIterable[Key]): AsyncIterableIterator[Key] = js.native
  def deleteMany(source: AsyncIterable[Key], options: Options): AsyncIterableIterator[Key] = js.native
  def deleteMany(source: Iterable[Key]): AsyncIterableIterator[Key] = js.native
  def deleteMany(source: Iterable[Key], options: Options): AsyncIterableIterator[Key] = js.native
  
  /**
    * Retrieve the value for the passed key
    *
    * @param key
    * @param options
    */
  def get(key: Key): js.Promise[Value] = js.native
  def get(key: Key, options: Options): js.Promise[Value] = js.native
  
  /**
    * Retrieve values for the passed keys
    *
    * @param source
    * @param options
    */
  def getMany(source: AsyncIterable[Key]): AsyncIterableIterator[Value] = js.native
  def getMany(source: AsyncIterable[Key], options: Options): AsyncIterableIterator[Value] = js.native
  def getMany(source: Iterable[Key]): AsyncIterableIterator[Value] = js.native
  def getMany(source: Iterable[Key], options: Options): AsyncIterableIterator[Value] = js.native
  
  /**
    * Check for the existence of a value for the passed key
    *
    * @param key
    */
  def has(key: Key): js.Promise[Boolean] = js.native
  
  def open(): js.Promise[Unit] = js.native
  
  /**
    * Store the passed value under the passed key
    *
    * @param key
    * @param val
    * @param options
    */
  def put(key: Key, `val`: Value): js.Promise[Unit] = js.native
  def put(key: Key, `val`: Value, options: Options): js.Promise[Unit] = js.native
  
  /**
    * Store the given key/value pairs
    *
    * @param source
    * @param options
    */
  def putMany(source: AsyncIterable[Pair[Value]]): AsyncIterableIterator[Pair[Value]] = js.native
  def putMany(source: AsyncIterable[Pair[Value]], options: Options): AsyncIterableIterator[Pair[Value]] = js.native
  def putMany(source: Iterable[Pair[Value]]): AsyncIterableIterator[Pair[Value]] = js.native
  def putMany(source: Iterable[Pair[Value]], options: Options): AsyncIterableIterator[Pair[Value]] = js.native
  
  /**
    * Query the store.
    *
    * @param q
    * @param options
    */
  def query(q: Query[Value]): AsyncIterable[Pair[Value]] = js.native
  def query(q: Query[Value], options: Options): AsyncIterable[Pair[Value]] = js.native
}
