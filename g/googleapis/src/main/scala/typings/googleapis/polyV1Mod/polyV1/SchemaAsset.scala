package typings.googleapis.polyV1Mod.polyV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents and describes an asset in the Poly library. An asset is a 3D
  * model or scene created using [Tilt Brush](//www.tiltbrush.com),
  * [Blocks](//vr.google.com/blocks/), or any 3D program that produces a file
  * that can be upload to Poly.
  */
@js.native
trait SchemaAsset extends js.Object {
  /**
    * The author&#39;s publicly visible name. Use this name when giving credit
    * to the author. For more information, see
    * [Licensing](/poly/discover/licensing).
    */
  var authorName: js.UndefOr[String] = js.native
  /**
    * For published assets, the time when the asset was published. For
    * unpublished assets, the time when the asset was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * The human-readable description, set by the asset&#39;s author.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The human-readable name, set by the asset&#39;s author.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * A list of Formats where each format describes one representation of the
    * asset.
    */
  var formats: js.UndefOr[js.Array[SchemaFormat]] = js.native
  /**
    * Whether this asset has been curated by the Poly team.
    */
  var isCurated: js.UndefOr[Boolean] = js.native
  /**
    * The license under which the author has made the asset available for use,
    * if any.
    */
  var license: js.UndefOr[String] = js.native
  /**
    * Application-defined opaque metadata for this asset. This field is only
    * returned when querying for the signed-in user&#39;s own assets, not for
    * public assets. This string is limited to 1K chars. It is up to the
    * creator of the asset to define the format for this string (for example,
    * JSON).
    */
  var metadata: js.UndefOr[String] = js.native
  /**
    * The unique identifier for the asset in the form: `assets/{ASSET_ID}`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Hints for displaying the asset. Note that these parameters are not
    * immutable; the author of an asset may change them post-publication.
    */
  var presentationParams: js.UndefOr[SchemaPresentationParams] = js.native
  /**
    * The remix info for the asset.
    */
  var remixInfo: js.UndefOr[SchemaRemixInfo] = js.native
  /**
    * The thumbnail image for the asset.
    */
  var thumbnail: js.UndefOr[SchemaFile] = js.native
  /**
    * The time when the asset was last modified. For published assets, whose
    * contents are immutable, the update time changes only when metadata
    * properties, such as visibility, are updated.
    */
  var updateTime: js.UndefOr[String] = js.native
  /**
    * The visibility of the asset and who can access it.
    */
  var visibility: js.UndefOr[String] = js.native
}

object SchemaAsset {
  @scala.inline
  def apply(): SchemaAsset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAsset]
  }
  @scala.inline
  implicit class SchemaAssetOps[Self <: SchemaAsset] (val x: Self) extends AnyVal {
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
    def setAuthorName(value: String): Self = this.set("authorName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorName: Self = this.set("authorName", js.undefined)
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setFormatsVarargs(value: SchemaFormat*): Self = this.set("formats", js.Array(value :_*))
    @scala.inline
    def setFormats(value: js.Array[SchemaFormat]): Self = this.set("formats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormats: Self = this.set("formats", js.undefined)
    @scala.inline
    def setIsCurated(value: Boolean): Self = this.set("isCurated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsCurated: Self = this.set("isCurated", js.undefined)
    @scala.inline
    def setLicense(value: String): Self = this.set("license", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLicense: Self = this.set("license", js.undefined)
    @scala.inline
    def setMetadata(value: String): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPresentationParams(value: SchemaPresentationParams): Self = this.set("presentationParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePresentationParams: Self = this.set("presentationParams", js.undefined)
    @scala.inline
    def setRemixInfo(value: SchemaRemixInfo): Self = this.set("remixInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemixInfo: Self = this.set("remixInfo", js.undefined)
    @scala.inline
    def setThumbnail(value: SchemaFile): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbnail: Self = this.set("thumbnail", js.undefined)
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
    @scala.inline
    def setVisibility(value: String): Self = this.set("visibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
  }
  
}

