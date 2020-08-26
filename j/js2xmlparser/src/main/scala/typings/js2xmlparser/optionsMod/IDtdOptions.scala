package typings.js2xmlparser.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDtdOptions extends js.Object {
  /**
    * Whether to include a DTD in the generated XML. By default, no DTD is
    * included.
    */
  var include: js.UndefOr[Boolean] = js.native
  /**
    * The name of the DTD. This value cannot be left undefined if `include`
    * is true.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The public identifier of the DTD, excluding quotation marks. If a public
    * identifier is provided, a system identifier must be provided as well.
    * By default, no public identifier is included.
    */
  var pubId: js.UndefOr[String] = js.native
  /**
    * The system identifier of the DTD, excluding quotation marks. By default,
    * no system identifier is included.
    */
  var sysId: js.UndefOr[String] = js.native
}

object IDtdOptions {
  @scala.inline
  def apply(): IDtdOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDtdOptions]
  }
  @scala.inline
  implicit class IDtdOptionsOps[Self <: IDtdOptions] (val x: Self) extends AnyVal {
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
    def setInclude(value: Boolean): Self = this.set("include", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPubId(value: String): Self = this.set("pubId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePubId: Self = this.set("pubId", js.undefined)
    @scala.inline
    def setSysId(value: String): Self = this.set("sysId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSysId: Self = this.set("sysId", js.undefined)
  }
  
}

