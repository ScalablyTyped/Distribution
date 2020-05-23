package typings.linq.anon

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DictxNumberU[U] extends /* x */ NumberDictionary[U] {
  var length: Double
}

object DictxNumberU {
  @scala.inline
  def apply[U](length: Double, NumberDictionary: /* x */ NumberDictionary[U] = null): DictxNumberU[U] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[DictxNumberU[U]]
  }
}

