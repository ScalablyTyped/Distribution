package typings.imagekit.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object ImageKit {
  
  type Callback[T, E /* <: typings.std.Error */] = js.Function2[/* error */ js.UndefOr[E], /* response */ js.UndefOr[T], scala.Unit]
  
  /**
    * @see {@link https://help.imagekit.io/en/articles/2434102-image-format-support-in-imagekit-for-resizing-compression-and-static-file-delivery}
    */
  /* Rewritten from type alias, can be one of: 
    - typings.imagekit.imagekitStrings.jpg
    - typings.imagekit.imagekitStrings.png
    - typings.imagekit.imagekitStrings.gif
    - typings.imagekit.imagekitStrings.svg
    - typings.imagekit.imagekitStrings.webp
    - typings.imagekit.imagekitStrings.pdf
    - typings.imagekit.imagekitStrings.js_
    - typings.imagekit.imagekitStrings.css
    - typings.imagekit.imagekitStrings.txt
    - typings.imagekit.imagekitStrings.mp4
    - typings.imagekit.imagekitStrings.webm
    - typings.imagekit.imagekitStrings.mov
    - typings.imagekit.imagekitStrings.swf
    - typings.imagekit.imagekitStrings.ts
    - typings.imagekit.imagekitStrings.m3u8
    - java.lang.String
  */
  type FileFormat = typings.imagekit.mod.global.ImageKit._FileFormat | java.lang.String
}
