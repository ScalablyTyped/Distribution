package typings.imageType

import typings.node.Buffer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Detect the image type of a `Buffer`/`Uint8Array`.
  	@param input - Input to examine to determine the file type. It only needs the first `.minimumBytes` bytes.
  	@example
  	```
  	import readChunk = require('read-chunk');
  	import imageType = require('image-type');
  	const buffer = readChunk.sync('unicorn.png', 0, 12);
  	imageType(buffer);
  	//=> {ext: 'png', mime: 'image/png'}
  	// Or from a remote location:
  	import * as http from 'http';
  	const url = 'https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif';
  	http.get(url, response => {
  		response.on('readable', () => {
  			const chunk = response.read(imageType.minimumBytes);
  			response.destroy();
  			console.log(imageType(chunk));
  			//=> {ext: 'gif', mime: 'image/gif'}
  		});
  	});
  	```
  	*/
  @scala.inline
  def apply(input: Buffer): ImageTypeResult | Null = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[ImageTypeResult | Null]
  @scala.inline
  def apply(input: Uint8Array): ImageTypeResult | Null = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[ImageTypeResult | Null]
  
  @JSImport("image-type", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: Remove this for the next major release
  @JSImport("image-type", "default")
  @js.native
  def default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof imageType */ js.Any = js.native
  @scala.inline
  def default_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof imageType */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  /**
  	The minimum amount of bytes needed to detect a file type. Currently, it's 4100 bytes, but it can change, so don't hard-code it.
  	*/
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
  */
  trait ImageType extends StObject
  object ImageType {
    
    @scala.inline
    def bmp: typings.imageType.imageTypeStrings.bmp = "bmp".asInstanceOf[typings.imageType.imageTypeStrings.bmp]
    
    @scala.inline
    def bpg: typings.imageType.imageTypeStrings.bpg = "bpg".asInstanceOf[typings.imageType.imageTypeStrings.bpg]
    
    @scala.inline
    def cr2: typings.imageType.imageTypeStrings.cr2 = "cr2".asInstanceOf[typings.imageType.imageTypeStrings.cr2]
    
    @scala.inline
    def cur: typings.imageType.imageTypeStrings.cur = "cur".asInstanceOf[typings.imageType.imageTypeStrings.cur]
    
    @scala.inline
    def dcm: typings.imageType.imageTypeStrings.dcm = "dcm".asInstanceOf[typings.imageType.imageTypeStrings.dcm]
    
    @scala.inline
    def flif: typings.imageType.imageTypeStrings.flif = "flif".asInstanceOf[typings.imageType.imageTypeStrings.flif]
    
    @scala.inline
    def gif: typings.imageType.imageTypeStrings.gif = "gif".asInstanceOf[typings.imageType.imageTypeStrings.gif]
    
    @scala.inline
    def heic: typings.imageType.imageTypeStrings.heic = "heic".asInstanceOf[typings.imageType.imageTypeStrings.heic]
    
    @scala.inline
    def ico: typings.imageType.imageTypeStrings.ico = "ico".asInstanceOf[typings.imageType.imageTypeStrings.ico]
    
    @scala.inline
    def jp2: typings.imageType.imageTypeStrings.jp2 = "jp2".asInstanceOf[typings.imageType.imageTypeStrings.jp2]
    
    @scala.inline
    def jpg: typings.imageType.imageTypeStrings.jpg = "jpg".asInstanceOf[typings.imageType.imageTypeStrings.jpg]
    
    @scala.inline
    def jpm: typings.imageType.imageTypeStrings.jpm = "jpm".asInstanceOf[typings.imageType.imageTypeStrings.jpm]
    
    @scala.inline
    def jpx: typings.imageType.imageTypeStrings.jpx = "jpx".asInstanceOf[typings.imageType.imageTypeStrings.jpx]
    
    @scala.inline
    def jxr: typings.imageType.imageTypeStrings.jxr = "jxr".asInstanceOf[typings.imageType.imageTypeStrings.jxr]
    
    @scala.inline
    def png: typings.imageType.imageTypeStrings.png = "png".asInstanceOf[typings.imageType.imageTypeStrings.png]
    
    @scala.inline
    def psd: typings.imageType.imageTypeStrings.psd = "psd".asInstanceOf[typings.imageType.imageTypeStrings.psd]
    
    @scala.inline
    def tif: typings.imageType.imageTypeStrings.tif = "tif".asInstanceOf[typings.imageType.imageTypeStrings.tif]
    
    @scala.inline
    def webp: typings.imageType.imageTypeStrings.webp = "webp".asInstanceOf[typings.imageType.imageTypeStrings.webp]
  }
  
  trait ImageTypeResult extends StObject {
    
    /**
    		One of the supported [file types](https://github.com/sindresorhus/image-type#supported-file-types).
    		*/
    var ext: ImageType
    
    /**
    		The detected [MIME type](https://en.wikipedia.org/wiki/Internet_media_type).
    		*/
    var mime: String
  }
  object ImageTypeResult {
    
    @scala.inline
    def apply(ext: ImageType, mime: String): ImageTypeResult = {
      val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageTypeResult]
    }
    
    @scala.inline
    implicit class ImageTypeResultMutableBuilder[Self <: ImageTypeResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExt(value: ImageType): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMime(value: String): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
    }
  }
}
