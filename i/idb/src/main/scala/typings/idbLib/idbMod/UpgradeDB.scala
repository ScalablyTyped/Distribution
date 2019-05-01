package typings
package idbLib.idbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpgradeDB extends js.Object {
  /** A DOMString that contains the name of the connected database. */
  val name: java.lang.String = js.native
  /** A DOMStringList that contains a list of the names of the object stores currently in the connected database. */
  val objectStoreNames: stdLib.DOMStringList = js.native
  /** The previous version of the DB seen by the browser, or 0 if it's new */
  val oldVersion: scala.Double = js.native
  /** This is a property rather than a method. It's a Transaction representing the upgrade transaction */
  val transaction: Transaction = js.native
  /** A 64-bit integer that contains the version of the connected database. When a database is first created, this attribute is an empty string. */
  val version: scala.Double = js.native
  /** Creates and returns a new object store or index.
    * @param name The name of the new object store to be created. Note that it is possible to create an object store with an empty name.
    * @param optionalParameters Optional. An options object whose attributes are optional parameters to the method.
    * @returns The new object store. */
  def createObjectStore[TValue, TKey](name: java.lang.String): ObjectStore[TValue, TKey] = js.native
  def createObjectStore[TValue, TKey](name: java.lang.String, optionalParameters: stdLib.IDBObjectStoreParameters): ObjectStore[TValue, TKey] = js.native
  /** Destroys the object store with the given name in the connected database, along with any indexes that reference it.
    * @param name The name of the object store to be removed. */
  def deleteObjectStore(name: java.lang.String): scala.Unit = js.native
}

