package typings.googleapis.youtubereportingV1Mod.youtubereportingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gdata
  */
@js.native
trait SchemaGdataDownloadParameters extends js.Object {
  /**
    * gdata
    */
  var allowGzipCompression: js.UndefOr[Boolean] = js.native
  /**
    * gdata
    */
  var ignoreRange: js.UndefOr[Boolean] = js.native
}

object SchemaGdataDownloadParameters {
  @scala.inline
  def apply(): SchemaGdataDownloadParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGdataDownloadParameters]
  }
  @scala.inline
  implicit class SchemaGdataDownloadParametersOps[Self <: SchemaGdataDownloadParameters] (val x: Self) extends AnyVal {
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
    def setAllowGzipCompression(value: Boolean): Self = this.set("allowGzipCompression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowGzipCompression: Self = this.set("allowGzipCompression", js.undefined)
    @scala.inline
    def setIgnoreRange(value: Boolean): Self = this.set("ignoreRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreRange: Self = this.set("ignoreRange", js.undefined)
  }
  
}

