package typings.jpm.sdkIndexedDashDbMod

import typings.std.DOMException
import typings.std.IDBFactory
import typings.std.IDBKeyRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// these interfaces are already provided by TypeScript
trait IndexedImpl extends js.Object {
  var DOMException: typings.std.DOMException
  var IDBKeyRange: typings.std.IDBKeyRange
  var indexedDB: IDBFactory
}

object IndexedImpl {
  @scala.inline
  def apply(DOMException: DOMException, IDBKeyRange: IDBKeyRange, indexedDB: IDBFactory): IndexedImpl = {
    val __obj = js.Dynamic.literal(DOMException = DOMException, IDBKeyRange = IDBKeyRange, indexedDB = indexedDB)
  
    __obj.asInstanceOf[IndexedImpl]
  }
}

