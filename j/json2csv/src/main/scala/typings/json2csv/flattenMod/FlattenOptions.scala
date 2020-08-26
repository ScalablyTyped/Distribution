package typings.json2csv.flattenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlattenOptions extends js.Object {
  var arrays: js.UndefOr[Boolean] = js.native
  var objects: js.UndefOr[Boolean] = js.native
  var separator: js.UndefOr[String] = js.native
}

object FlattenOptions {
  @scala.inline
  def apply(): FlattenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlattenOptions]
  }
  @scala.inline
  implicit class FlattenOptionsOps[Self <: FlattenOptions] (val x: Self) extends AnyVal {
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
    def setArrays(value: Boolean): Self = this.set("arrays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrays: Self = this.set("arrays", js.undefined)
    @scala.inline
    def setObjects(value: Boolean): Self = this.set("objects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjects: Self = this.set("objects", js.undefined)
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
  }
  
}

