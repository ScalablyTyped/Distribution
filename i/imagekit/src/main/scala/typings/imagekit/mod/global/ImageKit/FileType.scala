package typings.imagekit.mod.global.ImageKit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Type of files to include in result set. Accepts three values:
  * all - include all types of files in result set
  * image - only search in image type files
  * non-image - only search in files which are not image, e.g., JS or CSS or video files.
  *
  * @see {@link https://docs.imagekit.io/api-reference/media-api/list-and-search-files}
  */
/* Rewritten from type alias, can be one of: 
  - typings.imagekit.imagekitStrings.all
  - typings.imagekit.imagekitStrings.image
  - typings.imagekit.imagekitStrings.`non-image`
*/
trait FileType extends js.Object
object FileType {
  
  @scala.inline
  def all: typings.imagekit.imagekitStrings.all = "all".asInstanceOf[typings.imagekit.imagekitStrings.all]
  
  @scala.inline
  def image: typings.imagekit.imagekitStrings.image = "image".asInstanceOf[typings.imagekit.imagekitStrings.image]
  
  @scala.inline
  def `non-image`: typings.imagekit.imagekitStrings.`non-image` = "non-image".asInstanceOf[typings.imagekit.imagekitStrings.`non-image`]
}
