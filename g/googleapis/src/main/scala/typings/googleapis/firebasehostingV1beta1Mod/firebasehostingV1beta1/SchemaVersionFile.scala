package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A static content file that is part of a version.
  */
@js.native
trait SchemaVersionFile extends js.Object {
  /**
    * The SHA256 content hash of the file.
    */
  var hash: js.UndefOr[String] = js.native
  /**
    * The URI at which the file&#39;s content should display.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * Output only. The current status of a particular file in the specified
    * version. &lt;br&gt;The value will be either `pending upload` or
    * `uploaded`.
    */
  var status: js.UndefOr[String] = js.native
}

object SchemaVersionFile {
  @scala.inline
  def apply(): SchemaVersionFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVersionFile]
  }
  @scala.inline
  implicit class SchemaVersionFileOps[Self <: SchemaVersionFile] (val x: Self) extends AnyVal {
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
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHash: Self = this.set("hash", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

