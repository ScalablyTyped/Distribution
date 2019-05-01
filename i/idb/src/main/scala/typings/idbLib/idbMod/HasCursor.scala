package typings
package idbLib.idbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HasCursor[TValue, TKey] extends js.Object {
  /** Due to the microtask issues in some browsers, iterating over a cursor using promises doesn't always work.
    * So in the mean time, iterateCursor maps to openCursor, takes identical arguments, plus an additional callback that receives an IDBCursor */
  def iterateCursor(callback: js.Function1[/* c */ Cursor[TValue, TKey], scala.Unit]): scala.Unit = js.native
  def iterateCursor(range: scala.Null, callback: js.Function1[/* c */ Cursor[TValue, TKey], scala.Unit]): scala.Unit = js.native
  def iterateCursor(range: stdLib.IDBKeyRange, callback: js.Function1[/* c */ Cursor[TValue, TKey], scala.Unit]): scala.Unit = js.native
  def iterateCursor(range: stdLib.IDBValidKey, callback: js.Function1[/* c */ Cursor[TValue, TKey], scala.Unit]): scala.Unit = js.native
  @JSName("iterateCursor")
  def iterateCursor_next(
    range: scala.Null,
    direction: idbLib.idbLibStrings.next,
    callback: js.Function1[/* c */ Cursor[TValue, TKey], scala.Unit]
  ): scala.Unit = js.native
  @JSName("iterateCursor")
  def iterateCursor_next(
    range: stdLib.IDBKeyRange,
    direction: idbLib.idbLibStrings.next,
    callback: js.Function1[/* c */ Cursor[TValue, TKey], scala.Unit]
  ): scala.Unit = js.native
  @JSName("iterateCursor")
  def iterateCursor_next(
    range: stdLib.IDBValidKey,
    direction: idbLib.idbLibStrings.next,
    callback: js.Function1[/* c */ Cursor[TValue, TKey], scala.Unit]
  ): scala.Unit = js.native
  @JSName("iterateCursor")
  def iterateCursor_nextunique(
    range: scala.Null,
    direction: idbLib.idbLibStrings.nextunique,
    callback: js.Function1[/* c */ Cursor[TValue, TKey], scala.Unit]
  ): scala.Unit = js.native
  @JSName("iterateCursor")
  def iterateCursor_nextunique(
    range: stdLib.IDBKeyRange,
    direction: idbLib.idbLibStrings.nextunique,
    callback: js.Function1[/* c */ Cursor[TValue, TKey], scala.Unit]
  ): scala.Unit = js.native
  @JSName("iterateCursor")
  def iterateCursor_nextunique(
    range: stdLib.IDBValidKey,
    direction: idbLib.idbLibStrings.nextunique,
    callback: js.Function1[/* c */ Cursor[TValue, TKey], scala.Unit]
  ): scala.Unit = js.native
  @JSName("iterateCursor")
  def iterateCursor_prev(
    range: scala.Null,
    direction: idbLib.idbLibStrings.prev,
    callback: js.Function1[/* c */ Cursor[TValue, TKey], scala.Unit]
  ): scala.Unit = js.native
  @JSName("iterateCursor")
  def iterateCursor_prev(
    range: stdLib.IDBKeyRange,
    direction: idbLib.idbLibStrings.prev,
    callback: js.Function1[/* c */ Cursor[TValue, TKey], scala.Unit]
  ): scala.Unit = js.native
  @JSName("iterateCursor")
  def iterateCursor_prev(
    range: stdLib.IDBValidKey,
    direction: idbLib.idbLibStrings.prev,
    callback: js.Function1[/* c */ Cursor[TValue, TKey], scala.Unit]
  ): scala.Unit = js.native
  @JSName("iterateCursor")
  def iterateCursor_prevunique(
    range: scala.Null,
    direction: idbLib.idbLibStrings.prevunique,
    callback: js.Function1[/* c */ Cursor[TValue, TKey], scala.Unit]
  ): scala.Unit = js.native
  @JSName("iterateCursor")
  def iterateCursor_prevunique(
    range: stdLib.IDBKeyRange,
    direction: idbLib.idbLibStrings.prevunique,
    callback: js.Function1[/* c */ Cursor[TValue, TKey], scala.Unit]
  ): scala.Unit = js.native
  @JSName("iterateCursor")
  def iterateCursor_prevunique(
    range: stdLib.IDBValidKey,
    direction: idbLib.idbLibStrings.prevunique,
    callback: js.Function1[/* c */ Cursor[TValue, TKey], scala.Unit]
  ): scala.Unit = js.native
  /** Due to the microtask issues in some browsers, iterating over a cursor using promises doesn't always work.
    * So in the mean time, iterateKeyCursor maps to openKeyCursor, takes identical arguments, plus an additional callback that receives an IDBCursor */
  def iterateKeyCursor(callback: js.Function1[/* c */ Cursor[TValue, TKey], scala.Unit]): scala.Unit = js.native
  def iterateKeyCursor(range: scala.Null, callback: js.Function1[/* c */ Cursor[TValue, TKey], scala.Unit]): scala.Unit = js.native
  def iterateKeyCursor(range: stdLib.IDBKeyRange, callback: js.Function1[/* c */ Cursor[TValue, TKey], scala.Unit]): scala.Unit = js.native
  def iterateKeyCursor(range: stdLib.IDBValidKey, callback: js.Function1[/* c */ Cursor[TValue, TKey], scala.Unit]): scala.Unit = js.native
  @JSName("iterateKeyCursor")
  def iterateKeyCursor_next(
    range: scala.Null,
    direction: idbLib.idbLibStrings.next,
    callback: js.Function1[/* c */ Cursor[TValue, TKey], scala.Unit]
  ): scala.Unit = js.native
  @JSName("iterateKeyCursor")
  def iterateKeyCursor_next(
    range: stdLib.IDBKeyRange,
    direction: idbLib.idbLibStrings.next,
    callback: js.Function1[/* c */ Cursor[TValue, TKey], scala.Unit]
  ): scala.Unit = js.native
  @JSName("iterateKeyCursor")
  def iterateKeyCursor_next(
    range: stdLib.IDBValidKey,
    direction: idbLib.idbLibStrings.next,
    callback: js.Function1[/* c */ Cursor[TValue, TKey], scala.Unit]
  ): scala.Unit = js.native
  @JSName("iterateKeyCursor")
  def iterateKeyCursor_nextunique(
    range: scala.Null,
    direction: idbLib.idbLibStrings.nextunique,
    callback: js.Function1[/* c */ Cursor[TValue, TKey], scala.Unit]
  ): scala.Unit = js.native
  @JSName("iterateKeyCursor")
  def iterateKeyCursor_nextunique(
    range: stdLib.IDBKeyRange,
    direction: idbLib.idbLibStrings.nextunique,
    callback: js.Function1[/* c */ Cursor[TValue, TKey], scala.Unit]
  ): scala.Unit = js.native
  @JSName("iterateKeyCursor")
  def iterateKeyCursor_nextunique(
    range: stdLib.IDBValidKey,
    direction: idbLib.idbLibStrings.nextunique,
    callback: js.Function1[/* c */ Cursor[TValue, TKey], scala.Unit]
  ): scala.Unit = js.native
  @JSName("iterateKeyCursor")
  def iterateKeyCursor_prev(
    range: scala.Null,
    direction: idbLib.idbLibStrings.prev,
    callback: js.Function1[/* c */ Cursor[TValue, TKey], scala.Unit]
  ): scala.Unit = js.native
  @JSName("iterateKeyCursor")
  def iterateKeyCursor_prev(
    range: stdLib.IDBKeyRange,
    direction: idbLib.idbLibStrings.prev,
    callback: js.Function1[/* c */ Cursor[TValue, TKey], scala.Unit]
  ): scala.Unit = js.native
  @JSName("iterateKeyCursor")
  def iterateKeyCursor_prev(
    range: stdLib.IDBValidKey,
    direction: idbLib.idbLibStrings.prev,
    callback: js.Function1[/* c */ Cursor[TValue, TKey], scala.Unit]
  ): scala.Unit = js.native
  @JSName("iterateKeyCursor")
  def iterateKeyCursor_prevunique(
    range: scala.Null,
    direction: idbLib.idbLibStrings.prevunique,
    callback: js.Function1[/* c */ Cursor[TValue, TKey], scala.Unit]
  ): scala.Unit = js.native
  @JSName("iterateKeyCursor")
  def iterateKeyCursor_prevunique(
    range: stdLib.IDBKeyRange,
    direction: idbLib.idbLibStrings.prevunique,
    callback: js.Function1[/* c */ Cursor[TValue, TKey], scala.Unit]
  ): scala.Unit = js.native
  @JSName("iterateKeyCursor")
  def iterateKeyCursor_prevunique(
    range: stdLib.IDBValidKey,
    direction: idbLib.idbLibStrings.prevunique,
    callback: js.Function1[/* c */ Cursor[TValue, TKey], scala.Unit]
  ): scala.Unit = js.native
  /** Returns a Promise of an IDBRequest object that (in a separate thread) resolves a new cursor object.
    * Used for iterating through an object store by primary key with a cursor.
    * @param range Optional. A key or IDBKeyRange to be queried. If a single valid key is passed, this will default to a range containing only that key. If nothing is passed, this will default to a key range that selects all the records in this object store.
    * @param direction Optional. An IDBCursorDirection telling the cursor what direction to travel. Defaults to "next".
    * @returns A promise that resolves with the cursor once it has been opened. */
  def openCursor(): js.Promise[Cursor[TValue, TKey]] = js.native
  def openCursor(range: stdLib.IDBKeyRange): js.Promise[Cursor[TValue, TKey]] = js.native
  def openCursor(range: stdLib.IDBValidKey): js.Promise[Cursor[TValue, TKey]] = js.native
  @JSName("openCursor")
  def openCursor_next(range: scala.Null, direction: idbLib.idbLibStrings.next): js.Promise[Cursor[TValue, TKey]] = js.native
  @JSName("openCursor")
  def openCursor_next(range: stdLib.IDBKeyRange, direction: idbLib.idbLibStrings.next): js.Promise[Cursor[TValue, TKey]] = js.native
  @JSName("openCursor")
  def openCursor_next(range: stdLib.IDBValidKey, direction: idbLib.idbLibStrings.next): js.Promise[Cursor[TValue, TKey]] = js.native
  @JSName("openCursor")
  def openCursor_nextunique(range: scala.Null, direction: idbLib.idbLibStrings.nextunique): js.Promise[Cursor[TValue, TKey]] = js.native
  @JSName("openCursor")
  def openCursor_nextunique(range: stdLib.IDBKeyRange, direction: idbLib.idbLibStrings.nextunique): js.Promise[Cursor[TValue, TKey]] = js.native
  @JSName("openCursor")
  def openCursor_nextunique(range: stdLib.IDBValidKey, direction: idbLib.idbLibStrings.nextunique): js.Promise[Cursor[TValue, TKey]] = js.native
  @JSName("openCursor")
  def openCursor_prev(range: scala.Null, direction: idbLib.idbLibStrings.prev): js.Promise[Cursor[TValue, TKey]] = js.native
  @JSName("openCursor")
  def openCursor_prev(range: stdLib.IDBKeyRange, direction: idbLib.idbLibStrings.prev): js.Promise[Cursor[TValue, TKey]] = js.native
  @JSName("openCursor")
  def openCursor_prev(range: stdLib.IDBValidKey, direction: idbLib.idbLibStrings.prev): js.Promise[Cursor[TValue, TKey]] = js.native
  @JSName("openCursor")
  def openCursor_prevunique(range: scala.Null, direction: idbLib.idbLibStrings.prevunique): js.Promise[Cursor[TValue, TKey]] = js.native
  @JSName("openCursor")
  def openCursor_prevunique(range: stdLib.IDBKeyRange, direction: idbLib.idbLibStrings.prevunique): js.Promise[Cursor[TValue, TKey]] = js.native
  @JSName("openCursor")
  def openCursor_prevunique(range: stdLib.IDBValidKey, direction: idbLib.idbLibStrings.prevunique): js.Promise[Cursor[TValue, TKey]] = js.native
  /** Returns a Promise of an IDBRequest object that (in a separate thread) resolves a new cursor object.
    * Used for iterating through an object store with a key.
    * @param range Optional. A key or IDBKeyRange to be queried. If a single valid key is passed, this will default to a range containing only that key. If nothing is passed, this will default to a key range that selects all the records in this object store.
    * @param direction Optional. An IDBCursorDirection telling the cursor what direction to travel. Defaults to "next".
    * @returns A promise that resolves with the cursor once it has been opened. */
  def openKeyCursor(): js.Promise[Cursor[TValue, TKey]] = js.native
  def openKeyCursor(range: stdLib.IDBKeyRange): js.Promise[Cursor[TValue, TKey]] = js.native
  def openKeyCursor(range: stdLib.IDBValidKey): js.Promise[Cursor[TValue, TKey]] = js.native
  @JSName("openKeyCursor")
  def openKeyCursor_next(range: scala.Null, direction: idbLib.idbLibStrings.next): js.Promise[Cursor[TValue, TKey]] = js.native
  @JSName("openKeyCursor")
  def openKeyCursor_next(range: stdLib.IDBKeyRange, direction: idbLib.idbLibStrings.next): js.Promise[Cursor[TValue, TKey]] = js.native
  @JSName("openKeyCursor")
  def openKeyCursor_next(range: stdLib.IDBValidKey, direction: idbLib.idbLibStrings.next): js.Promise[Cursor[TValue, TKey]] = js.native
  @JSName("openKeyCursor")
  def openKeyCursor_nextunique(range: scala.Null, direction: idbLib.idbLibStrings.nextunique): js.Promise[Cursor[TValue, TKey]] = js.native
  @JSName("openKeyCursor")
  def openKeyCursor_nextunique(range: stdLib.IDBKeyRange, direction: idbLib.idbLibStrings.nextunique): js.Promise[Cursor[TValue, TKey]] = js.native
  @JSName("openKeyCursor")
  def openKeyCursor_nextunique(range: stdLib.IDBValidKey, direction: idbLib.idbLibStrings.nextunique): js.Promise[Cursor[TValue, TKey]] = js.native
  @JSName("openKeyCursor")
  def openKeyCursor_prev(range: scala.Null, direction: idbLib.idbLibStrings.prev): js.Promise[Cursor[TValue, TKey]] = js.native
  @JSName("openKeyCursor")
  def openKeyCursor_prev(range: stdLib.IDBKeyRange, direction: idbLib.idbLibStrings.prev): js.Promise[Cursor[TValue, TKey]] = js.native
  @JSName("openKeyCursor")
  def openKeyCursor_prev(range: stdLib.IDBValidKey, direction: idbLib.idbLibStrings.prev): js.Promise[Cursor[TValue, TKey]] = js.native
  @JSName("openKeyCursor")
  def openKeyCursor_prevunique(range: scala.Null, direction: idbLib.idbLibStrings.prevunique): js.Promise[Cursor[TValue, TKey]] = js.native
  @JSName("openKeyCursor")
  def openKeyCursor_prevunique(range: stdLib.IDBKeyRange, direction: idbLib.idbLibStrings.prevunique): js.Promise[Cursor[TValue, TKey]] = js.native
  @JSName("openKeyCursor")
  def openKeyCursor_prevunique(range: stdLib.IDBValidKey, direction: idbLib.idbLibStrings.prevunique): js.Promise[Cursor[TValue, TKey]] = js.native
}

