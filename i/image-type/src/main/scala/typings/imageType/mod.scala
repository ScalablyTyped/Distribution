package typings.imageType

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("image-type", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(input: js.typedarray.Uint8Array): js.Promise[js.UndefOr[ImageTypeResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[ImageTypeResult]]]
  inline def default(input: Buffer): js.Promise[js.UndefOr[ImageTypeResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[ImageTypeResult]]]
  
  @JSImport("image-type", "minimumBytes")
  @js.native
  val minimumBytes: Double = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.imageType.imageTypeStrings.jpg
    - typings.imageType.imageTypeStrings.png
    - typings.imageType.imageTypeStrings.gif
    - typings.imageType.imageTypeStrings.webp
    - typings.imageType.imageTypeStrings.flif
    - typings.imageType.imageTypeStrings.cr2
    - typings.imageType.imageTypeStrings.tif
    - typings.imageType.imageTypeStrings.bmp
    - typings.imageType.imageTypeStrings.jxr
    - typings.imageType.imageTypeStrings.psd
    - typings.imageType.imageTypeStrings.ico
    - typings.imageType.imageTypeStrings.bpg
    - typings.imageType.imageTypeStrings.jp2
    - typings.imageType.imageTypeStrings.jpm
    - typings.imageType.imageTypeStrings.jpx
    - typings.imageType.imageTypeStrings.heic
    - typings.imageType.imageTypeStrings.cur
    - typings.imageType.imageTypeStrings.dcm
    - typings.imageType.imageTypeStrings.avif
  */
  trait ImageFileExtension extends StObject
  object ImageFileExtension {
    
    inline def avif: typings.imageType.imageTypeStrings.avif = "avif".asInstanceOf[typings.imageType.imageTypeStrings.avif]
    
    inline def bmp: typings.imageType.imageTypeStrings.bmp = "bmp".asInstanceOf[typings.imageType.imageTypeStrings.bmp]
    
    inline def bpg: typings.imageType.imageTypeStrings.bpg = "bpg".asInstanceOf[typings.imageType.imageTypeStrings.bpg]
    
    inline def cr2: typings.imageType.imageTypeStrings.cr2 = "cr2".asInstanceOf[typings.imageType.imageTypeStrings.cr2]
    
    inline def cur: typings.imageType.imageTypeStrings.cur = "cur".asInstanceOf[typings.imageType.imageTypeStrings.cur]
    
    inline def dcm: typings.imageType.imageTypeStrings.dcm = "dcm".asInstanceOf[typings.imageType.imageTypeStrings.dcm]
    
    inline def flif: typings.imageType.imageTypeStrings.flif = "flif".asInstanceOf[typings.imageType.imageTypeStrings.flif]
    
    inline def gif: typings.imageType.imageTypeStrings.gif = "gif".asInstanceOf[typings.imageType.imageTypeStrings.gif]
    
    inline def heic: typings.imageType.imageTypeStrings.heic = "heic".asInstanceOf[typings.imageType.imageTypeStrings.heic]
    
    inline def ico: typings.imageType.imageTypeStrings.ico = "ico".asInstanceOf[typings.imageType.imageTypeStrings.ico]
    
    inline def jp2: typings.imageType.imageTypeStrings.jp2 = "jp2".asInstanceOf[typings.imageType.imageTypeStrings.jp2]
    
    inline def jpg: typings.imageType.imageTypeStrings.jpg = "jpg".asInstanceOf[typings.imageType.imageTypeStrings.jpg]
    
    inline def jpm: typings.imageType.imageTypeStrings.jpm = "jpm".asInstanceOf[typings.imageType.imageTypeStrings.jpm]
    
    inline def jpx: typings.imageType.imageTypeStrings.jpx = "jpx".asInstanceOf[typings.imageType.imageTypeStrings.jpx]
    
    inline def jxr: typings.imageType.imageTypeStrings.jxr = "jxr".asInstanceOf[typings.imageType.imageTypeStrings.jxr]
    
    inline def png: typings.imageType.imageTypeStrings.png = "png".asInstanceOf[typings.imageType.imageTypeStrings.png]
    
    inline def psd: typings.imageType.imageTypeStrings.psd = "psd".asInstanceOf[typings.imageType.imageTypeStrings.psd]
    
    inline def tif: typings.imageType.imageTypeStrings.tif = "tif".asInstanceOf[typings.imageType.imageTypeStrings.tif]
    
    inline def webp: typings.imageType.imageTypeStrings.webp = "webp".asInstanceOf[typings.imageType.imageTypeStrings.webp]
  }
  
  trait ImageTypeResult extends StObject {
    
    /**
    	One of the supported [file types](https://github.com/sindresorhus/image-type#supported-file-types).
    	*/
    var ext: ImageFileExtension
    
    /**
    	The detected [MIME type](https://en.wikipedia.org/wiki/Internet_media_type).
    	*/
    var mime: String
  }
  object ImageTypeResult {
    
    inline def apply(ext: ImageFileExtension, mime: String): ImageTypeResult = {
      val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageTypeResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImageTypeResult] (val x: Self) extends AnyVal {
      
      inline def setExt(value: ImageFileExtension): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      inline def setMime(value: String): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
    }
  }
}
