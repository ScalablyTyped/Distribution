package typings.linq

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictxNumberTInner[TInner] extends /* x */ NumberDictionary[TInner] {
  var length: Double
}

object AnonDictxNumberTInner {
  @scala.inline
  def apply[TInner](length: Double, NumberDictionary: /* x */ NumberDictionary[TInner] = null): AnonDictxNumberTInner[TInner] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[AnonDictxNumberTInner[TInner]]
  }
}

