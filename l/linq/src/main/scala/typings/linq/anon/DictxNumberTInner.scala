package typings.linq.anon

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DictxNumberTInner[TInner] extends /* x */ NumberDictionary[TInner] {
  var length: Double
}

object DictxNumberTInner {
  @scala.inline
  def apply[TInner](length: Double, NumberDictionary: /* x */ NumberDictionary[TInner] = null): DictxNumberTInner[TInner] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[DictxNumberTInner[TInner]]
  }
}

