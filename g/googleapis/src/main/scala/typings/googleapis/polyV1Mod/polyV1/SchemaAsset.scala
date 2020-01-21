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
  def apply(
    authorName: String = null,
    createTime: String = null,
    description: String = null,
    displayName: String = null,
    formats: js.Array[SchemaFormat] = null,
    isCurated: js.UndefOr[Boolean] = js.undefined,
    license: String = null,
    metadata: String = null,
    name: String = null,
    presentationParams: SchemaPresentationParams = null,
    remixInfo: SchemaRemixInfo = null,
    thumbnail: SchemaFile = null,
    updateTime: String = null,
    visibility: String = null
  ): SchemaAsset = {
    val __obj = js.Dynamic.literal()
    if (authorName != null) __obj.updateDynamic("authorName")(authorName.asInstanceOf[js.Any])
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (formats != null) __obj.updateDynamic("formats")(formats.asInstanceOf[js.Any])
    if (!js.isUndefined(isCurated)) __obj.updateDynamic("isCurated")(isCurated.asInstanceOf[js.Any])
    if (license != null) __obj.updateDynamic("license")(license.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (presentationParams != null) __obj.updateDynamic("presentationParams")(presentationParams.asInstanceOf[js.Any])
    if (remixInfo != null) __obj.updateDynamic("remixInfo")(remixInfo.asInstanceOf[js.Any])
    if (thumbnail != null) __obj.updateDynamic("thumbnail")(thumbnail.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAsset]
  }
}

