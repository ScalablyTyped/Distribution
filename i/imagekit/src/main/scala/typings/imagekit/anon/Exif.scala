package typings.imagekit.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Exif extends js.Object {
  
  var exif: ApertureValue = js.native
  
  var gps: GPSVersionID = js.native
  
  var image: ExifOffset = js.native
  
  var interoperability: InteropIndex = js.native
  
  var makernote: StringDictionary[String] = js.native
  
  var thumbnail: Compression = js.native
}
object Exif {
  
  @scala.inline
  def apply(
    exif: ApertureValue,
    gps: GPSVersionID,
    image: ExifOffset,
    interoperability: InteropIndex,
    makernote: StringDictionary[String],
    thumbnail: Compression
  ): Exif = {
    val __obj = js.Dynamic.literal(exif = exif.asInstanceOf[js.Any], gps = gps.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], interoperability = interoperability.asInstanceOf[js.Any], makernote = makernote.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exif]
  }
  
  @scala.inline
  implicit class ExifOps[Self <: Exif] (val x: Self) extends AnyVal {
    
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
    def setExif(value: ApertureValue): Self = this.set("exif", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGps(value: GPSVersionID): Self = this.set("gps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: ExifOffset): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteroperability(value: InteropIndex): Self = this.set("interoperability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMakernote(value: StringDictionary[String]): Self = this.set("makernote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnail(value: Compression): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
  }
}
