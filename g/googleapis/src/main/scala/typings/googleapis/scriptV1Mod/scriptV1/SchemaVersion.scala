package typings.googleapis.scriptV1Mod.scriptV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A resource representing a script project version. A version is a
  * &quot;snapshot&quot; of a script project and is similar to a read-only
  * branched release. When creating deployments, the version to use must be
  * specified.
  */
@js.native
trait SchemaVersion extends js.Object {
  /**
    * When the version was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * The description for this version.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The script project&#39;s Drive ID.
    */
  var scriptId: js.UndefOr[String] = js.native
  /**
    * The incremental ID that is created by Apps Script when a version is
    * created. This is system assigned number and is immutable once created.
    */
  var versionNumber: js.UndefOr[Double] = js.native
}

object SchemaVersion {
  @scala.inline
  def apply(): SchemaVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVersion]
  }
  @scala.inline
  implicit class SchemaVersionOps[Self <: SchemaVersion] (val x: Self) extends AnyVal {
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setScriptId(value: String): Self = this.set("scriptId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScriptId: Self = this.set("scriptId", js.undefined)
    @scala.inline
    def setVersionNumber(value: Double): Self = this.set("versionNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionNumber: Self = this.set("versionNumber", js.undefined)
  }
  
}

