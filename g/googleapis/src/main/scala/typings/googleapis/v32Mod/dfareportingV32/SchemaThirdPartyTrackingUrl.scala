package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Third-party Tracking URL.
  */
@js.native
trait SchemaThirdPartyTrackingUrl extends js.Object {
  /**
    * Third-party URL type for in-stream video and in-stream audio creatives.
    */
  var thirdPartyUrlType: js.UndefOr[String] = js.native
  /**
    * URL for the specified third-party URL type.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaThirdPartyTrackingUrl {
  @scala.inline
  def apply(): SchemaThirdPartyTrackingUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaThirdPartyTrackingUrl]
  }
  @scala.inline
  implicit class SchemaThirdPartyTrackingUrlOps[Self <: SchemaThirdPartyTrackingUrl] (val x: Self) extends AnyVal {
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
    def setThirdPartyUrlType(value: String): Self = this.set("thirdPartyUrlType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThirdPartyUrlType: Self = this.set("thirdPartyUrlType", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

