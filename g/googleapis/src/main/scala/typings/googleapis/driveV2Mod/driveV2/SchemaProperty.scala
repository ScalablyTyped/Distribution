package typings.googleapis.driveV2Mod.driveV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A key-value pair attached to a file that is either public or private to an
  * application. The following limits apply to file properties:   - Maximum of
  * 100 properties total per file - Maximum of 30 private properties per app -
  * Maximum of 30 public properties - Maximum of 124 bytes size limit on (key +
  * value) string in UTF-8 encoding for a single property.
  */
@js.native
trait SchemaProperty extends js.Object {
  /**
    * ETag of the property.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The key of this property.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * This is always drive#property.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The link back to this property.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * The value of this property.
    */
  var value: js.UndefOr[String] = js.native
  /**
    * The visibility of this property. Allowed values are PRIVATE and PUBLIC.
    * (Default: PRIVATE)
    */
  var visibility: js.UndefOr[String] = js.native
}

object SchemaProperty {
  @scala.inline
  def apply(): SchemaProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProperty]
  }
  @scala.inline
  implicit class SchemaPropertyOps[Self <: SchemaProperty] (val x: Self) extends AnyVal {
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
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setVisibility(value: String): Self = this.set("visibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
  }
  
}

