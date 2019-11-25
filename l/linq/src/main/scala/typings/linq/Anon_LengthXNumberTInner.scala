package typings.linq

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LengthXNumberTInner[TInner] extends /* x */ NumberDictionary[TInner] {
  var length: Double
}

object Anon_LengthXNumberTInner {
  @scala.inline
  def apply[TInner](length: Double, NumberDictionary: /* x */ NumberDictionary[TInner] = null): Anon_LengthXNumberTInner[TInner] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[Anon_LengthXNumberTInner[TInner]]
  }
}

