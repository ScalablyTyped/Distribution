package typings.atGrpcGrpcDashJs.buildSrcPickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Picker extends js.Object {
  def pick(pickArgs: PickArgs): PickResult
}

object Picker {
  @scala.inline
  def apply(pick: PickArgs => PickResult): Picker = {
    val __obj = js.Dynamic.literal(pick = js.Any.fromFunction1(pick))
  
    __obj.asInstanceOf[Picker]
  }
}

