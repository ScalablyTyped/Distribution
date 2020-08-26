package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Operating System Version List Response
  */
@js.native
trait SchemaOperatingSystemVersionsListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#operatingSystemVersionsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Operating system version collection.
    */
  var operatingSystemVersions: js.UndefOr[js.Array[SchemaOperatingSystemVersion]] = js.native
}

object SchemaOperatingSystemVersionsListResponse {
  @scala.inline
  def apply(): SchemaOperatingSystemVersionsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperatingSystemVersionsListResponse]
  }
  @scala.inline
  implicit class SchemaOperatingSystemVersionsListResponseOps[Self <: SchemaOperatingSystemVersionsListResponse] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setOperatingSystemVersionsVarargs(value: SchemaOperatingSystemVersion*): Self = this.set("operatingSystemVersions", js.Array(value :_*))
    @scala.inline
    def setOperatingSystemVersions(value: js.Array[SchemaOperatingSystemVersion]): Self = this.set("operatingSystemVersions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperatingSystemVersions: Self = this.set("operatingSystemVersions", js.undefined)
  }
  
}

