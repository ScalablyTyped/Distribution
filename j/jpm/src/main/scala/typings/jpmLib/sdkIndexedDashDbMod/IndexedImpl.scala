package typings
package jpmLib.sdkIndexedDashDbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// these interfaces are already provided by TypeScript
trait IndexedImpl extends js.Object {
  var DOMException: stdLib.DOMException
  var IDBKeyRange: stdLib.IDBKeyRange
  var indexedDB: stdLib.IDBFactory
}

object IndexedImpl {
  @scala.inline
  def apply(DOMException: stdLib.DOMException, IDBKeyRange: stdLib.IDBKeyRange, indexedDB: stdLib.IDBFactory): IndexedImpl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DOMException")(DOMException)
    __obj.updateDynamic("IDBKeyRange")(IDBKeyRange)
    __obj.updateDynamic("indexedDB")(indexedDB)
    __obj.asInstanceOf[IndexedImpl]
  }
}

