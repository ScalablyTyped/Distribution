package typings.lightpick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object lightpickMod {
  import typings.moment.momentMod.Moment
  import typings.moment.momentMod.MomentFormatSpecification
  import typings.moment.momentMod.MomentInput

  type DisabledDate = InputDate | InputDateRange
  type FormatSpecification = MomentFormatSpecification
  type InputDate = MomentInput | Null
  type InputDateRange = js.Tuple2[InputDate, InputDate]
  type Options = Options_
  type OutputDate = Moment | Null
}
