package typings.atJimpTypes

import typings.atJimpTypes.atJimpTypesMod.Types
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jimp/types", JSImport.Namespace)
@js.native
object atJimpTypesMod extends js.Object {
  def default(): Types = js.native
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

