package typings.linq

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictxNumberU[U] extends /* x */ NumberDictionary[U] {
  var length: Double
}

object AnonDictxNumberU {
  @scala.inline
  def apply[U](length: Double, NumberDictionary: /* x */ NumberDictionary[U] = null): AnonDictxNumberU[U] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[AnonDictxNumberU[U]]
  }
}

