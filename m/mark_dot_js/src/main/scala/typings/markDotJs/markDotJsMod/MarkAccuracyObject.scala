package typings.markDotJs.markDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkAccuracyObject extends js.Object {
  var limiters: js.UndefOr[js.Array[String]] = js.undefined
  var value: MarkAccuracy
}

object MarkAccuracyObject {
  @scala.inline
  def apply(value: MarkAccuracy, limiters: js.Array[String] = null): MarkAccuracyObject = {
    val __obj = js.Dynamic.literal(value = value)
    if (limiters != null) __obj.updateDynamic("limiters")(limiters)
    __obj.asInstanceOf[MarkAccuracyObject]
  }
}

