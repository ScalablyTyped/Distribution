package typings.iostContract.IOSTContract

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalStorage extends js.Object {
  def globalGet(contract: String, key: String): String | Null
  def globalHas(contract: String, key: String): Boolean
  def globalMapGet(contract: String, key: String, field: String): String | Null
  def globalMapHas(contract: String, key: String, field: String): Boolean
  def globalMapKeys(contract: String, key: String): js.Array[String]
  def globalMapLen(contract: String, key: String): Double
}

object GlobalStorage {
  @scala.inline
  def apply(
    globalGet: (String, String) => String | Null,
    globalHas: (String, String) => Boolean,
    globalMapGet: (String, String, String) => String | Null,
    globalMapHas: (String, String, String) => Boolean,
    globalMapKeys: (String, String) => js.Array[String],
    globalMapLen: (String, String) => Double
  ): GlobalStorage = {
    val __obj = js.Dynamic.literal(globalGet = js.Any.fromFunction2(globalGet), globalHas = js.Any.fromFunction2(globalHas), globalMapGet = js.Any.fromFunction3(globalMapGet), globalMapHas = js.Any.fromFunction3(globalMapHas), globalMapKeys = js.Any.fromFunction2(globalMapKeys), globalMapLen = js.Any.fromFunction2(globalMapLen))
    __obj.asInstanceOf[GlobalStorage]
  }
}

