package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Placement Tag Data
  */
@js.native
trait SchemaTagData extends js.Object {
  /**
    * Ad associated with this placement tag. Applicable only when format is
    * PLACEMENT_TAG_TRACKING.
    */
  var adId: js.UndefOr[String] = js.native
  /**
    * Tag string to record a click.
    */
  var clickTag: js.UndefOr[String] = js.native
  /**
    * Creative associated with this placement tag. Applicable only when format
    * is PLACEMENT_TAG_TRACKING.
    */
  var creativeId: js.UndefOr[String] = js.native
  /**
    * TagData tag format of this tag.
    */
  var format: js.UndefOr[String] = js.native
  /**
    * Tag string for serving an ad.
    */
  var impressionTag: js.UndefOr[String] = js.native
}

object SchemaTagData {
  @scala.inline
  def apply(): SchemaTagData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTagData]
  }
  @scala.inline
  implicit class SchemaTagDataOps[Self <: SchemaTagData] (val x: Self) extends AnyVal {
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
    def setAdId(value: String): Self = this.set("adId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdId: Self = this.set("adId", js.undefined)
    @scala.inline
    def setClickTag(value: String): Self = this.set("clickTag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickTag: Self = this.set("clickTag", js.undefined)
    @scala.inline
    def setCreativeId(value: String): Self = this.set("creativeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreativeId: Self = this.set("creativeId", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setImpressionTag(value: String): Self = this.set("impressionTag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImpressionTag: Self = this.set("impressionTag", js.undefined)
  }
  
}

