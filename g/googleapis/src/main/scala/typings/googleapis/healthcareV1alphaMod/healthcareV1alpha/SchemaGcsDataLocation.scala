package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google Cloud Storage location.
  */
@js.native
trait SchemaGcsDataLocation extends js.Object {
  /**
    * The gcs_uri must be in the format &quot;gs://bucket/path/to/object&quot;.
    * The gcs_uri may include wildcards in the &quot;path/to/object&quot; part
    * to to indicate potential matching of multiple objects. Supported
    * wildcards:   &#39;*&#39; to match 0 or more non-separator characters
    * &#39;**&#39; to match 0 or more characters (including separators). Only
    * supported at the end of a path and with no other wildcards.   &#39;?&#39;
    * to match 1 character.
    */
  var gcsUri: js.UndefOr[String] = js.native
}

object SchemaGcsDataLocation {
  @scala.inline
  def apply(): SchemaGcsDataLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGcsDataLocation]
  }
  @scala.inline
  implicit class SchemaGcsDataLocationOps[Self <: SchemaGcsDataLocation] (val x: Self) extends AnyVal {
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
    def setGcsUri(value: String): Self = this.set("gcsUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGcsUri: Self = this.set("gcsUri", js.undefined)
  }
  
}

