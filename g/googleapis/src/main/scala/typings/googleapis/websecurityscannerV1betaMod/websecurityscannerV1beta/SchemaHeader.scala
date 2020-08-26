package typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a HTTP Header.
  */
@js.native
trait SchemaHeader extends js.Object {
  /**
    * Header name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Header value.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaHeader {
  @scala.inline
  def apply(): SchemaHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHeader]
  }
  @scala.inline
  implicit class SchemaHeaderOps[Self <: SchemaHeader] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

