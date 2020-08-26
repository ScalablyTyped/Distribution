package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of adding a named range.
  */
@js.native
trait SchemaAddNamedRangeResponse extends js.Object {
  /**
    * The named range to add.
    */
  var namedRange: js.UndefOr[SchemaNamedRange] = js.native
}

object SchemaAddNamedRangeResponse {
  @scala.inline
  def apply(): SchemaAddNamedRangeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddNamedRangeResponse]
  }
  @scala.inline
  implicit class SchemaAddNamedRangeResponseOps[Self <: SchemaAddNamedRangeResponse] (val x: Self) extends AnyVal {
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
    def setNamedRange(value: SchemaNamedRange): Self = this.set("namedRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamedRange: Self = this.set("namedRange", js.undefined)
  }
  
}

