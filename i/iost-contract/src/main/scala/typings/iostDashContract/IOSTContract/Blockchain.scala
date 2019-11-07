package typings.iostDashContract.IOSTContract

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Blockchain extends js.Object {
  def call(contract: String, abi: String, args: String): js.Array[String] = js.native
  def call(contract: String, abi: String, args: js.Array[String]): js.Array[String] = js.native
  def callWithAuth(contract: String, abi: String, args: String): js.Array[String] = js.native
  def callWithAuth(contract: String, abi: String, args: js.Array[String]): js.Array[String] = js.native
  def contractName(): String = js.native
  def contractOwner(): String = js.native
  def deposit(from: String, amount: String, memo: String): Unit = js.native
  def event(data: String): Unit = js.native
  def publisher(): String = js.native
  def receipt(data: String): Unit = js.native
  def requireAuth(account: String, permission: String): Boolean = js.native
  def transfer(from: String, to: String, amount: String, memo: String): Unit = js.native
  def withdraw(to: String, amount: String, memo: String): Unit = js.native
}

