package typings.lightpick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DisabledDate = typings.lightpick.mod.InputDate | typings.lightpick.mod.InputDateRange
  type FormatSpecification = typings.moment.mod.MomentFormatSpecification
  type InputDate = typings.moment.mod.MomentInput | scala.Null
  type InputDateRange = js.Tuple2[typings.lightpick.mod.InputDate, typings.lightpick.mod.InputDate]
  type Options = typings.lightpick.mod.Options_
  type OutputDate = typings.moment.mod.Moment | scala.Null
}
