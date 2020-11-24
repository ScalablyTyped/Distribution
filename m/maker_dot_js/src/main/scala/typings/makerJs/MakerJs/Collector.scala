package typings.makerJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Collects items that share a common key.
  */
@js.native
trait Collector[K, T] extends js.Object {
  
  def addItemToCollection(key: K, item: T): Unit = js.native
  
  var collections: js.Array[ICollection[K, T]] = js.native
  
  var comparer: js.Any = js.native
  
  def findCollection(key: K): js.Array[T] = js.native
  def findCollection(key: K, action: js.Function1[/* index */ Double, Unit]): js.Array[T] = js.native
  
  def getCollectionsOfMultiple(cb: js.Function2[/* key */ K, /* items */ js.Array[T], Unit]): Unit = js.native
  
  def removeCollection(key: K): Boolean = js.native
  
  def removeItemFromCollection(key: K, item: T): Boolean = js.native
}
