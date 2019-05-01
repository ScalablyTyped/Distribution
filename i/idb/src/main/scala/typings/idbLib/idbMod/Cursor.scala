package typings
package idbLib.idbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cursor[TValue, TKey] extends js.Object {
  /** The direction of traversal of the cursor. */
  val direction: idbLib.idbLibStrings.next | idbLib.idbLibStrings.nextunique | idbLib.idbLibStrings.prev | idbLib.idbLibStrings.prevunique = js.native
  /** The key for the record at the cursor's position. If the cursor is outside its range, this is set to undefined. The cursor's key can be any data type. */
  val key: stdLib.IDBKeyRange | stdLib.IDBValidKey = js.native
  /** The cursor's current effective primary key. If the cursor is currently being iterated or has iterated outside its range, this is set to undefined. The cursor's primary key can be any data type. */
  val primaryKey: js.UndefOr[TKey] = js.native
  /** The current value under the cursor. */
  val value: TValue = js.native
  /** Sets the number times a cursor should move its position forward.
    * @param count The number of times to move the cursor forward.
    * @returns The cursor after having been moved forward the specified number of times. */
  def advance(count: scala.Double): js.Promise[Cursor[TValue, TKey]] = js.native
  /** Advances the cursor to the next position along its direction, to the item whose key matches the optional key parameter.
    * @param key Optional. The key to position the cursor at. If no key is specified, the cursor advances to the immediate next position, based on the its direction.
    * @returns The cursor after having been continued to the next or specified record. */
  def continue(): js.Promise[Cursor[TValue, TKey]] = js.native
  def continue(key: stdLib.IDBKeyRange): js.Promise[Cursor[TValue, TKey]] = js.native
  def continue(key: stdLib.IDBValidKey): js.Promise[Cursor[TValue, TKey]] = js.native
  /** Sets the cursor to the given index key and primary key given as arguments.
    * @param key The key to position the cursor at.
    * @param primaryKey The primary key to position the cursor at.
    * @returns The cursor after having been continued to the next or specified record. */
  def continuePrimaryKey(): js.Promise[Cursor[TValue, TKey]] = js.native
  def continuePrimaryKey(key: stdLib.IDBKeyRange): js.Promise[Cursor[TValue, TKey]] = js.native
  def continuePrimaryKey(key: stdLib.IDBKeyRange, primaryKey: TKey): js.Promise[Cursor[TValue, TKey]] = js.native
  def continuePrimaryKey(key: stdLib.IDBValidKey): js.Promise[Cursor[TValue, TKey]] = js.native
  def continuePrimaryKey(key: stdLib.IDBValidKey, primaryKey: TKey): js.Promise[Cursor[TValue, TKey]] = js.native
  /** Returns a Promise of an IDBRequest object that (in a separate thread) deletes the record at the cursor's position, without changing the cursor's position.
    * This can be used to delete specific records.
    * @returns A promise that resolves when the underlying delete IDBRequest is successful. */
  def delete(): js.Promise[scala.Unit] = js.native
  /** Returns a Promise of an IDBRequest object that (in a separate thread) updates the value at the current position of the cursor in the object store.
    * This can be used to update specific records.
    * @param value The value to write over the current cursor location.
    * @returns A promise that resolves when the underlying update IDBRequest is successful. */
  def update(value: TValue): js.Promise[scala.Unit] = js.native
}

