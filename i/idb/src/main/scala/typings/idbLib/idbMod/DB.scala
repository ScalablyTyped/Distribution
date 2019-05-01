package typings
package idbLib.idbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DB extends js.Object {
  /** A DOMString that contains the name of the connected database. */
  val name: java.lang.String = js.native
  /** A DOMStringList that contains a list of the names of the object stores currently in the connected database. */
  val objectStoreNames: stdLib.DOMStringList = js.native
  /** A 64-bit integer that contains the version of the connected database. When a database is first created, this attribute is an empty string. */
  val version: scala.Double = js.native
  /** Returns immediately and closes the connection to a database in a separate thread. */
  def close(): scala.Unit = js.native
  /** Immediately returns a transaction object (Transaction) containing the IDBTransaction.objectStore method, which you can use to access your object store. Runs in a separate thread.
    * @param storeNames The names of object stores and indexes that are in the scope of the new transaction, declared as an array of strings. Specify only the object stores that you need to access.
    * If you need to access only one object store, you can specify its name as a string.
    * @param mode Optional. The types of access that can be performed in the transaction. Transactions are opened in one of three modes: 'readonly' or 'readwrite'. 'versionchange' mode can't be specified here. If you don't provide the parameter, the default access mode is readonly. To avoid slowing things down, don't open a readwrite transaction unless you actually need to write into the database.
    * @returns The transaction object. */
  def transaction(storeNames: java.lang.String): Transaction = js.native
  def transaction(storeNames: js.Array[java.lang.String]): Transaction = js.native
  @JSName("transaction")
  def transaction_readonly(storeNames: java.lang.String, mode: idbLib.idbLibStrings.readonly): Transaction = js.native
  @JSName("transaction")
  def transaction_readonly(storeNames: js.Array[java.lang.String], mode: idbLib.idbLibStrings.readonly): Transaction = js.native
  @JSName("transaction")
  def transaction_readwrite(storeNames: java.lang.String, mode: idbLib.idbLibStrings.readwrite): Transaction = js.native
  @JSName("transaction")
  def transaction_readwrite(storeNames: js.Array[java.lang.String], mode: idbLib.idbLibStrings.readwrite): Transaction = js.native
}

