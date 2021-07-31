package typings.jimpTypes

import typings.jimpBmp.mod.Bmp
import typings.jimpGif.mod.Gif
import typings.jimpJpeg.mod.Jpeg
import typings.jimpPng.mod.PNG
import typings.jimpTiff.mod.Tiff
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jimp/types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): Types = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Types]
  
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
