package typings.googleapis.youtubereportingV1Mod.youtubereportingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gdata
  */
@js.native
trait SchemaGdataDiffVersionResponse extends js.Object {
  /**
    * gdata
    */
  var objectSizeBytes: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var objectVersion: js.UndefOr[String] = js.native
}

object SchemaGdataDiffVersionResponse {
  @scala.inline
  def apply(): SchemaGdataDiffVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGdataDiffVersionResponse]
  }
  @scala.inline
  implicit class SchemaGdataDiffVersionResponseOps[Self <: SchemaGdataDiffVersionResponse] (val x: Self) extends AnyVal {
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
    def setObjectSizeBytes(value: String): Self = this.set("objectSizeBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectSizeBytes: Self = this.set("objectSizeBytes", js.undefined)
    @scala.inline
    def setObjectVersion(value: String): Self = this.set("objectVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectVersion: Self = this.set("objectVersion", js.undefined)
  }
  
}

