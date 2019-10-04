package typings.atJimpTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atJimpTypesMod {
  import typings.atJimpTypes.BmpRet
  import typings.atJimpTypes.GifRet
  import typings.atJimpTypes.JpegRet
  import typings.atJimpTypes.PngRet
  import typings.atJimpTypes.TiffRet

  /**
    * This is made union and not intersection to avoid issues with
    * `IllformedPlugin` and `WellFormedPlugin` when using typings with Jimp
    * generic
    *
    * In reality, this should be an intersection but our type data isn't
    * clever enough to figure out what's a class and what's not/etc
    */
  type Types = JpegRet | PngRet | BmpRet | TiffRet | GifRet
}
