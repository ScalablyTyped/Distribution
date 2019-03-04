package typings
package jestDashCliLib.jestDashCliMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UncheckedSnapshot extends js.Object {
  var filePath: java.lang.String
  var keys: js.Array[java.lang.String]
}

object UncheckedSnapshot {
  @scala.inline
  def apply(filePath: java.lang.String, keys: js.Array[java.lang.String]): UncheckedSnapshot = {
    val __obj = js.Dynamic.literal(filePath = filePath, keys = keys)
  
    __obj.asInstanceOf[UncheckedSnapshot]
  }
}

