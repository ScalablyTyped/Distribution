package typings.jestTestResult.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UncheckedSnapshot extends js.Object {
  var filePath: String
  var keys: js.Array[String]
}

object UncheckedSnapshot {
  @scala.inline
  def apply(filePath: String, keys: js.Array[String]): UncheckedSnapshot = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UncheckedSnapshot]
  }
}

