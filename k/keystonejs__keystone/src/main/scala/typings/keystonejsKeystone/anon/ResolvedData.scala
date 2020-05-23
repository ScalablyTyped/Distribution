package typings.keystonejsKeystone.anon

import typings.keystonejsKeystone.mod.KeyValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedData[FieldNames /* <: String */] extends js.Object {
  var resolvedData: KeyValues[FieldNames, _]
}

object ResolvedData {
  @scala.inline
  def apply[FieldNames](resolvedData: KeyValues[FieldNames, _]): ResolvedData[FieldNames] = {
    val __obj = js.Dynamic.literal(resolvedData = resolvedData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedData[FieldNames]]
  }
}

