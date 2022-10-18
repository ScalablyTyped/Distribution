package typings.images

import org.scalablytyped.runtime.StringDictionary
import typings.images.anon.Height
import typings.images.imagesInts.`0`
import typings.images.imagesInts.`1`
import typings.images.imagesInts.`2`
import typings.images.imagesInts.`3`
import typings.images.imagesInts.`4`
import typings.node.NodeJS.ErrnoException
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Image = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Image]
  inline def apply(buffer: Buffer): Image = ^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any]).asInstanceOf[Image]
  inline def apply(buffer: Buffer, start: Double): Image = (^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Image]
  inline def apply(buffer: Buffer, start: Double, end: Double): Image = (^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Image]
  inline def apply(buffer: Buffer, start: Unit, end: Double): Image = (^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Image]
  inline def apply(file: String): Image = ^.asInstanceOf[js.Dynamic].apply(file.asInstanceOf[js.Any]).asInstanceOf[Image]
  inline def apply(image: Image): Image = ^.asInstanceOf[js.Dynamic].apply(image.asInstanceOf[js.Any]).asInstanceOf[Image]
  inline def apply(image: Image, x: Double, y: Double): Image = (^.asInstanceOf[js.Dynamic].apply(image.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Image]
  inline def apply(image: Image, x: Double, y: Double, width: Double, height: Double): Image = (^.asInstanceOf[js.Dynamic].apply(image.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Image]
  inline def apply(width: Double): Image = ^.asInstanceOf[js.Dynamic].apply(width.asInstanceOf[js.Any]).asInstanceOf[Image]
  inline def apply(width: Double, height: Double): Image = (^.asInstanceOf[js.Dynamic].apply(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Image]
  inline def apply(width: Unit, height: Double): Image = (^.asInstanceOf[js.Dynamic].apply(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Image]
  
  @JSImport("images", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("images", "Image")
  @js.native
  open class Image () extends StObject {
    
    def copyFromImage(img: Image): this.type = js.native
    def copyFromImage(img: Image, x: Double, y: Double): this.type = js.native
    def copyFromImage(img: Image, x: Double, y: Double, width: Double, height: Double): this.type = js.native
    
    def draw(img: Image, x: Double, y: Double): this.type = js.native
    
    var drawImage: String | Double = js.native
    
    def encode(`type`: FILE_TYPE): Buffer = js.native
    def encode(`type`: FILE_TYPE, config: EncoderConfig): Buffer = js.native
    def encode(`type`: TYPE): Buffer = js.native
    def encode(`type`: TYPE, config: EncoderConfig): Buffer = js.native
    
    def fill(red: Double, green: Double, blue: Double): this.type = js.native
    def fill(red: Double, green: Double, blue: Double, alpha: Double): this.type = js.native
    
    var fillColor: String | Double = js.native
    
    def height(): Double = js.native
    def height(height: Double): this.type = js.native
    
    def loadFromBuffer(buffer: Buffer): this.type = js.native
    def loadFromBuffer(buffer: Buffer, start: Double): this.type = js.native
    def loadFromBuffer(buffer: Buffer, start: Double, end: Double): this.type = js.native
    def loadFromBuffer(buffer: Buffer, start: Unit, end: Double): this.type = js.native
    
    def resize(width: Double): this.type = js.native
    def resize(width: Double, height: Double): this.type = js.native
    def resize(width: Double, height: Double, filter: String): this.type = js.native
    def resize(width: Double, height: Unit, filter: String): this.type = js.native
    
    def rotate(deg: Double): this.type = js.native
    
    def save(file: String): this.type = js.native
    def save(file: String, config: EncoderConfig): this.type = js.native
    def save(file: String, `type`: FILE_TYPE): this.type = js.native
    def save(file: String, `type`: FILE_TYPE, config: EncoderConfig): this.type = js.native
    def save(file: String, `type`: TYPE): this.type = js.native
    def save(file: String, `type`: TYPE, config: EncoderConfig): this.type = js.native
    
    def saveAsync(file: String, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): this.type = js.native
    def saveAsync(file: String, config: EncoderConfig, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): this.type = js.native
    def saveAsync(file: String, `type`: FILE_TYPE, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): this.type = js.native
    def saveAsync(
      file: String,
      `type`: FILE_TYPE,
      config: EncoderConfig,
      callback: js.Function1[/* err */ ErrnoException | Null, Unit]
    ): this.type = js.native
    def saveAsync(file: String, `type`: TYPE, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): this.type = js.native
    def saveAsync(
      file: String,
      `type`: TYPE,
      config: EncoderConfig,
      callback: js.Function1[/* err */ ErrnoException | Null, Unit]
    ): this.type = js.native
    
    def size(): Height = js.native
    def size(width: Double): this.type = js.native
    def size(width: Double, height: Double): this.type = js.native
    
    var toBuffer: String | Double = js.native
    
    def width(): Double = js.native
    def width(width: Double): this.type = js.native
  }
  
  inline def copyFromImage(image: Image): Image = ^.asInstanceOf[js.Dynamic].applyDynamic("copyFromImage")(image.asInstanceOf[js.Any]).asInstanceOf[Image]
  inline def copyFromImage(image: Image, x: Double): Image = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFromImage")(image.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Image]
  inline def copyFromImage(image: Image, x: Double, y: Double): Image = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFromImage")(image.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Image]
  inline def copyFromImage(image: Image, x: Double, y: Double, width: Double): Image = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFromImage")(image.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[Image]
  inline def copyFromImage(image: Image, x: Double, y: Double, width: Double, height: Double): Image = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFromImage")(image.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Image]
  inline def copyFromImage(image: Image, x: Double, y: Double, width: Unit, height: Double): Image = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFromImage")(image.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Image]
  inline def copyFromImage(image: Image, x: Double, y: Unit, width: Double): Image = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFromImage")(image.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[Image]
  inline def copyFromImage(image: Image, x: Double, y: Unit, width: Double, height: Double): Image = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFromImage")(image.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Image]
  inline def copyFromImage(image: Image, x: Double, y: Unit, width: Unit, height: Double): Image = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFromImage")(image.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Image]
  inline def copyFromImage(image: Image, x: Unit, y: Double): Image = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFromImage")(image.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Image]
  inline def copyFromImage(image: Image, x: Unit, y: Double, width: Double): Image = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFromImage")(image.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[Image]
  inline def copyFromImage(image: Image, x: Unit, y: Double, width: Double, height: Double): Image = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFromImage")(image.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Image]
  inline def copyFromImage(image: Image, x: Unit, y: Double, width: Unit, height: Double): Image = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFromImage")(image.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Image]
  inline def copyFromImage(image: Image, x: Unit, y: Unit, width: Double): Image = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFromImage")(image.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[Image]
  inline def copyFromImage(image: Image, x: Unit, y: Unit, width: Double, height: Double): Image = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFromImage")(image.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Image]
  inline def copyFromImage(image: Image, x: Unit, y: Unit, width: Unit, height: Double): Image = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFromImage")(image.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Image]
  
  inline def createImage(): Image = ^.asInstanceOf[js.Dynamic].applyDynamic("createImage")().asInstanceOf[Image]
  inline def createImage(width: Double): Image = ^.asInstanceOf[js.Dynamic].applyDynamic("createImage")(width.asInstanceOf[js.Any]).asInstanceOf[Image]
  inline def createImage(width: Double, height: Double): Image = (^.asInstanceOf[js.Dynamic].applyDynamic("createImage")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Image]
  inline def createImage(width: Unit, height: Double): Image = (^.asInstanceOf[js.Dynamic].applyDynamic("createImage")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Image]
  
  inline def gc(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("gc")().asInstanceOf[Unit]
  
  inline def getUsedMemory(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getUsedMemory")().asInstanceOf[Double]
  
  inline def loadFromBuffer(buffer: Buffer): Image = ^.asInstanceOf[js.Dynamic].applyDynamic("loadFromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[Image]
  inline def loadFromBuffer(buffer: Buffer, start: Double): Image = (^.asInstanceOf[js.Dynamic].applyDynamic("loadFromBuffer")(buffer.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Image]
  inline def loadFromBuffer(buffer: Buffer, start: Double, end: Double): Image = (^.asInstanceOf[js.Dynamic].applyDynamic("loadFromBuffer")(buffer.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Image]
  inline def loadFromBuffer(buffer: Buffer, start: Unit, end: Double): Image = (^.asInstanceOf[js.Dynamic].applyDynamic("loadFromBuffer")(buffer.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Image]
  
  inline def loadFromFile(file: String): Image = ^.asInstanceOf[js.Dynamic].applyDynamic("loadFromFile")(file.asInstanceOf[js.Any]).asInstanceOf[Image]
  
  inline def setGCThreshold(value: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGCThreshold")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setLimit(maxWidth: Double, maxHeight: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setLimit")(maxWidth.asInstanceOf[js.Any], maxHeight.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait EncoderConfig
    extends StObject
       with /* key */ StringDictionary[Double | String] {
    
    var quality: js.UndefOr[Double] = js.undefined
  }
  object EncoderConfig {
    
    inline def apply(): EncoderConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncoderConfig]
    }
    
    extension [Self <: EncoderConfig](x: Self) {
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.images.imagesStrings.png
    - typings.images.imagesStrings.jpg
    - typings.images.imagesStrings.jpeg
    - typings.images.imagesStrings.gif
    - typings.images.imagesStrings.bmp
    - typings.images.imagesStrings.raw
  */
  trait FILE_TYPE extends StObject
  object FILE_TYPE {
    
    inline def bmp: typings.images.imagesStrings.bmp = "bmp".asInstanceOf[typings.images.imagesStrings.bmp]
    
    inline def gif: typings.images.imagesStrings.gif = "gif".asInstanceOf[typings.images.imagesStrings.gif]
    
    inline def jpeg: typings.images.imagesStrings.jpeg = "jpeg".asInstanceOf[typings.images.imagesStrings.jpeg]
    
    inline def jpg: typings.images.imagesStrings.jpg = "jpg".asInstanceOf[typings.images.imagesStrings.jpg]
    
    inline def png: typings.images.imagesStrings.png = "png".asInstanceOf[typings.images.imagesStrings.png]
    
    inline def raw: typings.images.imagesStrings.raw = "raw".asInstanceOf[typings.images.imagesStrings.raw]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.images.imagesInts.`1`
    - typings.images.imagesInts.`0`
    - typings.images.imagesInts.`2`
    - typings.images.imagesInts.`3`
    - typings.images.imagesInts.`4`
  */
  trait TYPE extends StObject
  object TYPE {
    
    inline def TYPE_BMP: `2` = 2.asInstanceOf[`2`]
    
    inline def TYPE_GIF: `1` = 1.asInstanceOf[`1`]
    
    inline def TYPE_JPEG: `0` = 0.asInstanceOf[`0`]
    
    inline def TYPE_PNG: `1` = 1.asInstanceOf[`1`]
    
    inline def TYPE_RAW: `3` = 3.asInstanceOf[`3`]
    
    inline def TYPE_WEBP: `4` = 4.asInstanceOf[`4`]
  }
}
