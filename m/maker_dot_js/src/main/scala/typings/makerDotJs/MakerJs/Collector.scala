package typings.makerDotJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Collects items that share a common key.
  */
@JSGlobal("MakerJs.Collector")
@js.native
class Collector[K, T] () extends js.Object {
  def this(comparer: ICollectionKeyComparer[K]) = this()
  var collections: js.Array[ICollection[K, T]] = js.native
  var comparer: js.Any = js.native
  def addItemToCollection(key: K, item: T): Unit = js.native
  def findCollection(key: K): js.Array[T] = js.native
  def findCollection(key: K, action: js.Function1[/* index */ Double, Unit]): js.Array[T] = js.native
  def getCollectionsOfMultiple(cb: js.Function2[/* key */ K, /* items */ js.Array[T], Unit]): Unit = js.native
  def removeCollection(key: K): Boolean = js.native
  def removeItemFromCollection(key: K, item: T): Boolean = js.native
}

