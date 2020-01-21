package typings.keystonejsKeystone

import typings.keystonejsKeystone.mod.KeyValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonResolvedData[FieldNames /* <: String */] extends js.Object {
  var resolvedData: KeyValues[FieldNames, _]
}

object AnonResolvedData {
  @scala.inline
  def apply[FieldNames /* <: String */](resolvedData: KeyValues[FieldNames, _]): AnonResolvedData[FieldNames] = {
    val __obj = js.Dynamic.literal(resolvedData = resolvedData.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonResolvedData[FieldNames]]
  }
}

