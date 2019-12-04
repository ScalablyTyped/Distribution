package typings.atJimpTypes

import typings.atJimpBmp.atJimpBmpMod.Bmp
import typings.atJimpGif.atJimpGifMod.Gif
import typings.atJimpJpeg.atJimpJpegMod.Jpeg
import typings.atJimpPng.atJimpPngMod.PNG
import typings.atJimpTiff.atJimpTiffMod.Tiff
import typings.atJimpTypes.atJimpTypesMod.BmpRet
import typings.atJimpTypes.atJimpTypesMod.GifRet
import typings.atJimpTypes.atJimpTypesMod.JpegRet
import typings.atJimpTypes.atJimpTypesMod.PngRet
import typings.atJimpTypes.atJimpTypesMod.TiffRet
import typings.atJimpTypes.atJimpTypesMod.Types
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jimp/types", JSImport.Namespace)
@js.native
object atJimpTypesMod extends js.Object {
  def default(): Types = js.native
  type BmpRet = ReturnType[js.Function0[Bmp]]
  type GifRet = ReturnType[js.Function0[Gif]]
  type JpegRet = ReturnType[js.Function0[Jpeg]]
  type PngRet = ReturnType[js.Function0[PNG]]
  type TiffRet = ReturnType[js.Function0[Tiff]]
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

