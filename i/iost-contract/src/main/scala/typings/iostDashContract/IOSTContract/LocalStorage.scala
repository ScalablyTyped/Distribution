package typings.iostDashContract.IOSTContract

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalStorage extends js.Object {
  def del(key: String): Unit = js.native
  def get(key: String): String | Null = js.native
  def has(key: String): Boolean = js.native
  def mapDel(key: String, field: String): Unit = js.native
  def mapGet(key: String, field: String): String | Null = js.native
  def mapHas(key: String, field: String): Boolean = js.native
  def mapKeys(key: String): js.Array[String] = js.native
  def mapLen(key: String): Double = js.native
  def mapPut(key: String, field: String, value: String): Unit = js.native
  def mapPut(key: String, field: String, value: String, payer: String): Unit = js.native
  def put(key: String, value: String): js.Any = js.native
  def put(key: String, value: String, payer: String): js.Any = js.native
}

