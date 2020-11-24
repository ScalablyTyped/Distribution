package typings.imagekit.mod.global.ImageKit

import typings.imagekit.anon.Exif
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response when getting image exif, pHash and other metadata for uploaded files in ImageKit.io media library using this API.
  *
  * @see {@link https://docs.imagekit.io/api-reference/metadata-api/get-image-metadata-for-uploaded-media-files}
  */
@js.native
trait FileMetadataResponse extends js.Object {
  
  var density: Double = js.native
  
  /**
    * @see {@link https://docs.imagekit.io/api-reference/metadata-api#exif}
    */
  var exif: Exif = js.native
  
  var format: FileFormat = js.native
  
  var hasColorProfile: Boolean = js.native
  
  var hasTransparency: Boolean = js.native
  
  var height: Double = js.native
  
  /**
    * @see {@link https://docs.imagekit.io/api-reference/metadata-api#perceptual-hash-phash}
    */
  var pHash: String = js.native
  
  var quality: Double = js.native
  
  var size: Double = js.native
  
  var width: Double = js.native
}
object FileMetadataResponse {
  
  @scala.inline
  def apply(
    density: Double,
    exif: Exif,
    format: FileFormat,
    hasColorProfile: Boolean,
    hasTransparency: Boolean,
    height: Double,
    pHash: String,
    quality: Double,
    size: Double,
    width: Double
  ): FileMetadataResponse = {
    val __obj = js.Dynamic.literal(density = density.asInstanceOf[js.Any], exif = exif.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], hasColorProfile = hasColorProfile.asInstanceOf[js.Any], hasTransparency = hasTransparency.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], pHash = pHash.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileMetadataResponse]
  }
  
  @scala.inline
  implicit class FileMetadataResponseOps[Self <: FileMetadataResponse] (val x: Self) extends AnyVal {
    
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
    def setDensity(value: Double): Self = this.set("density", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExif(value: Exif): Self = this.set("exif", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: FileFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasColorProfile(value: Boolean): Self = this.set("hasColorProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasTransparency(value: Boolean): Self = this.set("hasTransparency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPHash(value: String): Self = this.set("pHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
