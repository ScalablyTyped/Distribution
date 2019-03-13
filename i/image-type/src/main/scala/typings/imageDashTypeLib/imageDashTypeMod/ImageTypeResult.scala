package typings
package imageDashTypeLib.imageDashTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageTypeResult extends js.Object {
  /**
  	 * One of the supported [file types](https://github.com/sindresorhus/image-type#supported-file-types).
  	 */
  var ext: ImageType
  /**
  	 * The detected [MIME type](https://en.wikipedia.org/wiki/Internet_media_type).
  	 */
  var mime: java.lang.String
}

object ImageTypeResult {
  @scala.inline
  def apply(ext: ImageType, mime: java.lang.String): ImageTypeResult = {
    val __obj = js.Dynamic.literal(ext = ext, mime = mime)
  
    __obj.asInstanceOf[ImageTypeResult]
  }
}

