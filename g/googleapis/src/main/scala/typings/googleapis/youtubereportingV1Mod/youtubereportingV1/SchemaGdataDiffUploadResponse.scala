package typings.googleapis.youtubereportingV1Mod.youtubereportingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gdata
  */
@js.native
trait SchemaGdataDiffUploadResponse extends js.Object {
  /**
    * gdata
    */
  var objectVersion: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var originalObject: js.UndefOr[SchemaGdataCompositeMedia] = js.native
}

object SchemaGdataDiffUploadResponse {
  @scala.inline
  def apply(): SchemaGdataDiffUploadResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGdataDiffUploadResponse]
  }
  @scala.inline
  implicit class SchemaGdataDiffUploadResponseOps[Self <: SchemaGdataDiffUploadResponse] (val x: Self) extends AnyVal {
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
    def setObjectVersion(value: String): Self = this.set("objectVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectVersion: Self = this.set("objectVersion", js.undefined)
    @scala.inline
    def setOriginalObject(value: SchemaGdataCompositeMedia): Self = this.set("originalObject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalObject: Self = this.set("originalObject", js.undefined)
  }
  
}

