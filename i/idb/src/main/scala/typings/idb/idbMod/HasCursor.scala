package typings.idb.idbMod

import typings.idb.idbStrings.next
import typings.idb.idbStrings.nextunique
import typings.idb.idbStrings.prev
import typings.idb.idbStrings.prevunique
import typings.std.IDBKeyRange
import typings.std.IDBValidKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HasCursor[TValue, TKey] extends js.Object {
  /** Due to the microtask issues in some browsers, iterating over a cursor using promises doesn't always work.
    * So in the mean time, iterateCursor maps to openCursor, takes identical arguments, plus an additional callback that receives an IDBCursor */
  def iterateCursor(callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]): Unit = js.native
  def iterateCursor(range: Null, callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]): Unit = js.native
  def iterateCursor(range: IDBKeyRange, callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]): Unit = js.native
  def iterateCursor(range: IDBValidKey, callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]): Unit = js.native
  @JSName("iterateCursor")
  def iterateCursor_next(range: Null, direction: next, callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]): Unit = js.native
  @JSName("iterateCursor")
  def iterateCursor_next(range: IDBKeyRange, direction: next, callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]): Unit = js.native
  @JSName("iterateCursor")
  def iterateCursor_next(range: IDBValidKey, direction: next, callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]): Unit = js.native
  @JSName("iterateCursor")
  def iterateCursor_nextunique(range: Null, direction: nextunique, callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]): Unit = js.native
  @JSName("iterateCursor")
  def iterateCursor_nextunique(
    range: IDBKeyRange,
    direction: nextunique,
    callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]
  ): Unit = js.native
  @JSName("iterateCursor")
  def iterateCursor_nextunique(
    range: IDBValidKey,
    direction: nextunique,
    callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]
  ): Unit = js.native
  @JSName("iterateCursor")
  def iterateCursor_prev(range: Null, direction: prev, callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]): Unit = js.native
  @JSName("iterateCursor")
  def iterateCursor_prev(range: IDBKeyRange, direction: prev, callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]): Unit = js.native
  @JSName("iterateCursor")
  def iterateCursor_prev(range: IDBValidKey, direction: prev, callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]): Unit = js.native
  @JSName("iterateCursor")
  def iterateCursor_prevunique(range: Null, direction: prevunique, callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]): Unit = js.native
  @JSName("iterateCursor")
  def iterateCursor_prevunique(
    range: IDBKeyRange,
    direction: prevunique,
    callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]
  ): Unit = js.native
  @JSName("iterateCursor")
  def iterateCursor_prevunique(
    range: IDBValidKey,
    direction: prevunique,
    callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]
  ): Unit = js.native
  /** Due to the microtask issues in some browsers, iterating over a cursor using promises doesn't always work.
    * So in the mean time, iterateKeyCursor maps to openKeyCursor, takes identical arguments, plus an additional callback that receives an IDBCursor */
  def iterateKeyCursor(callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]): Unit = js.native
  def iterateKeyCursor(range: Null, callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]): Unit = js.native
  def iterateKeyCursor(range: IDBKeyRange, callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]): Unit = js.native
  def iterateKeyCursor(range: IDBValidKey, callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]): Unit = js.native
  @JSName("iterateKeyCursor")
  def iterateKeyCursor_next(range: Null, direction: next, callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]): Unit = js.native
  @JSName("iterateKeyCursor")
  def iterateKeyCursor_next(range: IDBKeyRange, direction: next, callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]): Unit = js.native
  @JSName("iterateKeyCursor")
  def iterateKeyCursor_next(range: IDBValidKey, direction: next, callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]): Unit = js.native
  @JSName("iterateKeyCursor")
  def iterateKeyCursor_nextunique(range: Null, direction: nextunique, callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]): Unit = js.native
  @JSName("iterateKeyCursor")
  def iterateKeyCursor_nextunique(
    range: IDBKeyRange,
    direction: nextunique,
    callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]
  ): Unit = js.native
  @JSName("iterateKeyCursor")
  def iterateKeyCursor_nextunique(
    range: IDBValidKey,
    direction: nextunique,
    callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]
  ): Unit = js.native
  @JSName("iterateKeyCursor")
  def iterateKeyCursor_prev(range: Null, direction: prev, callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]): Unit = js.native
  @JSName("iterateKeyCursor")
  def iterateKeyCursor_prev(range: IDBKeyRange, direction: prev, callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]): Unit = js.native
  @JSName("iterateKeyCursor")
  def iterateKeyCursor_prev(range: IDBValidKey, direction: prev, callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]): Unit = js.native
  @JSName("iterateKeyCursor")
  def iterateKeyCursor_prevunique(range: Null, direction: prevunique, callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]): Unit = js.native
  @JSName("iterateKeyCursor")
  def iterateKeyCursor_prevunique(
    range: IDBKeyRange,
    direction: prevunique,
    callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]
  ): Unit = js.native
  @JSName("iterateKeyCursor")
  def iterateKeyCursor_prevunique(
    range: IDBValidKey,
    direction: prevunique,
    callback: js.Function1[/* c */ Cursor[TValue, TKey], Unit]
  ): Unit = js.native
  /** Returns a Promise of an IDBRequest object that (in a separate thread) resolves a new cursor object.
    * Used for iterating through an object store by primary key with a cursor.
    * @param range Optional. A key or IDBKeyRange to be queried. If a single valid key is passed, this will default to a range containing only that key. If nothing is passed, this will default to a key range that selects all the records in this object store.
    * @param direction Optional. An IDBCursorDirection telling the cursor what direction to travel. Defaults to "next".
    * @returns A promise that resolves with the cursor once it has been opened. */
  def openCursor(): js.Promise[Cursor[TValue, TKey]] = js.native
  def openCursor(range: IDBKeyRange): js.Promise[Cursor[TValue, TKey]] = js.native
  def openCursor(range: IDBValidKey): js.Promise[Cursor[TValue, TKey]] = js.native
  @JSName("openCursor")
  def openCursor_next(range: Null, direction: next): js.Promise[Cursor[TValue, TKey]] = js.native
  @JSName("openCursor")
  def openCursor_next(range: IDBKeyRange, direction: next): js.Promise[Cursor[TValue, TKey]] = js.native
  @JSName("openCursor")
  def openCursor_next(range: IDBValidKey, direction: next): js.Promise[Cursor[TValue, TKey]] = js.native
  @JSName("openCursor")
  def openCursor_nextunique(range: Null, direction: nextunique): js.Promise[Cursor[TValue, TKey]] = js.native
  @JSName("openCursor")
  def openCursor_nextunique(range: IDBKeyRange, direction: nextunique): js.Promise[Cursor[TValue, TKey]] = js.native
  @JSName("openCursor")
  def openCursor_nextunique(range: IDBValidKey, direction: nextunique): js.Promise[Cursor[TValue, TKey]] = js.native
  @JSName("openCursor")
  def openCursor_prev(range: Null, direction: prev): js.Promise[Cursor[TValue, TKey]] = js.native
  @JSName("openCursor")
  def openCursor_prev(range: IDBKeyRange, direction: prev): js.Promise[Cursor[TValue, TKey]] = js.native
  @JSName("openCursor")
  def openCursor_prev(range: IDBValidKey, direction: prev): js.Promise[Cursor[TValue, TKey]] = js.native
  @JSName("openCursor")
  def openCursor_prevunique(range: Null, direction: prevunique): js.Promise[Cursor[TValue, TKey]] = js.native
  @JSName("openCursor")
  def openCursor_prevunique(range: IDBKeyRange, direction: prevunique): js.Promise[Cursor[TValue, TKey]] = js.native
  @JSName("openCursor")
  def openCursor_prevunique(range: IDBValidKey, direction: prevunique): js.Promise[Cursor[TValue, TKey]] = js.native
  /** Returns a Promise of an IDBRequest object that (in a separate thread) resolves a new cursor object.
    * Used for iterating through an object store with a key.
    * @param range Optional. A key or IDBKeyRange to be queried. If a single valid key is passed, this will default to a range containing only that key. If nothing is passed, this will default to a key range that selects all the records in this object store.
    * @param direction Optional. An IDBCursorDirection telling the cursor what direction to travel. Defaults to "next".
    * @returns A promise that resolves with the cursor once it has been opened. */
  def openKeyCursor(): js.Promise[Cursor[TValue, TKey]] = js.native
  def openKeyCursor(range: IDBKeyRange): js.Promise[Cursor[TValue, TKey]] = js.native
  def openKeyCursor(range: IDBValidKey): js.Promise[Cursor[TValue, TKey]] = js.native
  @JSName("openKeyCursor")
  def openKeyCursor_next(range: Null, direction: next): js.Promise[Cursor[TValue, TKey]] = js.native
  @JSName("openKeyCursor")
  def openKeyCursor_next(range: IDBKeyRange, direction: next): js.Promise[Cursor[TValue, TKey]] = js.native
  @JSName("openKeyCursor")
  def openKeyCursor_next(range: IDBValidKey, direction: next): js.Promise[Cursor[TValue, TKey]] = js.native
  @JSName("openKeyCursor")
  def openKeyCursor_nextunique(range: Null, direction: nextunique): js.Promise[Cursor[TValue, TKey]] = js.native
  @JSName("openKeyCursor")
  def openKeyCursor_nextunique(range: IDBKeyRange, direction: nextunique): js.Promise[Cursor[TValue, TKey]] = js.native
  @JSName("openKeyCursor")
  def openKeyCursor_nextunique(range: IDBValidKey, direction: nextunique): js.Promise[Cursor[TValue, TKey]] = js.native
  @JSName("openKeyCursor")
  def openKeyCursor_prev(range: Null, direction: prev): js.Promise[Cursor[TValue, TKey]] = js.native
  @JSName("openKeyCursor")
  def openKeyCursor_prev(range: IDBKeyRange, direction: prev): js.Promise[Cursor[TValue, TKey]] = js.native
  @JSName("openKeyCursor")
  def openKeyCursor_prev(range: IDBValidKey, direction: prev): js.Promise[Cursor[TValue, TKey]] = js.native
  @JSName("openKeyCursor")
  def openKeyCursor_prevunique(range: Null, direction: prevunique): js.Promise[Cursor[TValue, TKey]] = js.native
  @JSName("openKeyCursor")
  def openKeyCursor_prevunique(range: IDBKeyRange, direction: prevunique): js.Promise[Cursor[TValue, TKey]] = js.native
  @JSName("openKeyCursor")
  def openKeyCursor_prevunique(range: IDBValidKey, direction: prevunique): js.Promise[Cursor[TValue, TKey]] = js.native
}

