package typings.keystonejsKeystone.anon

import typings.keystonejsKeystone.mod.KeyValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolvedData[FieldNames /* <: String */] extends js.Object {
  var resolvedData: KeyValues[FieldNames, _] = js.native
}

object ResolvedData {
  @scala.inline
  def apply[/* <: java.lang.String */ FieldNames](resolvedData: KeyValues[FieldNames, _]): ResolvedData[FieldNames] = {
    val __obj = js.Dynamic.literal(resolvedData = resolvedData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedData[FieldNames]]
  }
  @scala.inline
  implicit class ResolvedDataOps[Self <: ResolvedData[_], /* <: java.lang.String */ FieldNames] (val x: Self with ResolvedData[FieldNames]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setResolvedData(value: KeyValues[FieldNames, _]): Self = this.set("resolvedData", value.asInstanceOf[js.Any])
  }
  
}

