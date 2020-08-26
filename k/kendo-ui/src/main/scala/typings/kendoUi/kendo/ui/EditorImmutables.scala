package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorImmutables extends js.Object {
  var deserialization: js.UndefOr[js.Function] = js.native
  var serialization: js.UndefOr[String | js.Function] = js.native
}

object EditorImmutables {
  @scala.inline
  def apply(): EditorImmutables = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorImmutables]
  }
  @scala.inline
  implicit class EditorImmutablesOps[Self <: EditorImmutables] (val x: Self) extends AnyVal {
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
    def setDeserialization(value: js.Function): Self = this.set("deserialization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeserialization: Self = this.set("deserialization", js.undefined)
    @scala.inline
    def setSerialization(value: String | js.Function): Self = this.set("serialization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSerialization: Self = this.set("serialization", js.undefined)
  }
  
}

