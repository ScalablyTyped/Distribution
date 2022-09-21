package typings.googleapis.polyV1Mod.polyV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAsset extends StObject {
  
  /**
    * The author's publicly visible name. Use this name when giving credit to the author. For more information, see [Licensing](/poly/discover/licensing).
    */
  var authorName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * For published assets, the time when the asset was published. For unpublished assets, the time when the asset was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The human-readable description, set by the asset's author.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The human-readable name, set by the asset's author.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of Formats where each format describes one representation of the asset.
    */
  var formats: js.UndefOr[js.Array[SchemaFormat]] = js.undefined
  
  /**
    * Whether this asset has been curated by the Poly team.
    */
  var isCurated: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The license under which the author has made the asset available for use, if any.
    */
  var license: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Application-defined opaque metadata for this asset. This field is only returned when querying for the signed-in user's own assets, not for public assets. This string is limited to 1K chars. It is up to the creator of the asset to define the format for this string (for example, JSON).
    */
  var metadata: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique identifier for the asset in the form: `assets/{ASSET_ID\}`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Hints for displaying the asset. Note that these parameters are not immutable; the author of an asset may change them post-publication.
    */
  var presentationParams: js.UndefOr[SchemaPresentationParams] = js.undefined
  
  /**
    * The remix info for the asset.
    */
  var remixInfo: js.UndefOr[SchemaRemixInfo] = js.undefined
  
  /**
    * The thumbnail image for the asset.
    */
  var thumbnail: js.UndefOr[SchemaFile] = js.undefined
  
  /**
    * The time when the asset was last modified. For published assets, whose contents are immutable, the update time changes only when metadata properties, such as visibility, are updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The visibility of the asset and who can access it.
    */
  var visibility: js.UndefOr[String | Null] = js.undefined
}
object SchemaAsset {
  
  inline def apply(): SchemaAsset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAsset]
  }
  
  extension [Self <: SchemaAsset](x: Self) {
    
    inline def setAuthorName(value: String): Self = StObject.set(x, "authorName", value.asInstanceOf[js.Any])
    
    inline def setAuthorNameNull: Self = StObject.set(x, "authorName", null)
    
    inline def setAuthorNameUndefined: Self = StObject.set(x, "authorName", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setFormats(value: js.Array[SchemaFormat]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
    
    inline def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
    
    inline def setFormatsVarargs(value: SchemaFormat*): Self = StObject.set(x, "formats", js.Array(value*))
    
    inline def setIsCurated(value: Boolean): Self = StObject.set(x, "isCurated", value.asInstanceOf[js.Any])
    
    inline def setIsCuratedNull: Self = StObject.set(x, "isCurated", null)
    
    inline def setIsCuratedUndefined: Self = StObject.set(x, "isCurated", js.undefined)
    
    inline def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
    
    inline def setLicenseNull: Self = StObject.set(x, "license", null)
    
    inline def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
    
    inline def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPresentationParams(value: SchemaPresentationParams): Self = StObject.set(x, "presentationParams", value.asInstanceOf[js.Any])
    
    inline def setPresentationParamsUndefined: Self = StObject.set(x, "presentationParams", js.undefined)
    
    inline def setRemixInfo(value: SchemaRemixInfo): Self = StObject.set(x, "remixInfo", value.asInstanceOf[js.Any])
    
    inline def setRemixInfoUndefined: Self = StObject.set(x, "remixInfo", js.undefined)
    
    inline def setThumbnail(value: SchemaFile): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    inline def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityNull: Self = StObject.set(x, "visibility", null)
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
