package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrintObjects extends js.Object {
  var `document-number`: js.UndefOr[Double] = js.native
  var `object-offset`: js.UndefOr[ObjectOffset] = js.native
  var `object-size`: js.UndefOr[ObjectSize] = js.native
  var `object-uuid`: js.UndefOr[String] = js.native
}

object PrintObjects {
  @scala.inline
  def apply(): PrintObjects = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintObjects]
  }
  @scala.inline
  implicit class PrintObjectsOps[Self <: PrintObjects] (val x: Self) extends AnyVal {
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
    def `setDocument-number`(value: Double): Self = this.set("document-number", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDocument-number`: Self = this.set("document-number", js.undefined)
    @scala.inline
    def `setObject-offset`(value: ObjectOffset): Self = this.set("object-offset", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteObject-offset`: Self = this.set("object-offset", js.undefined)
    @scala.inline
    def `setObject-size`(value: ObjectSize): Self = this.set("object-size", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteObject-size`: Self = this.set("object-size", js.undefined)
    @scala.inline
    def `setObject-uuid`(value: String): Self = this.set("object-uuid", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteObject-uuid`: Self = this.set("object-uuid", js.undefined)
  }
  
}

