package typings
package jimpLib.jimpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jimp", JSImport.Namespace)
@js.native
class namespaced protected ()
  extends jimpLib.JimpNs.Jimp {
  // For custom constructors when using Jimp.appendConstructorOption
  def this(args: js.Any*) = this()
  def this(data: jimpLib.JimpNs.Bitmap) = this()
  def this(data: nodeLib.Buffer) = this()
  def this(image: jimpLib.JimpNs.Jimp) = this()
  // Constructors
  def this(path: java.lang.String) = this()
  def this(urlOptions: jimpLib.JimpNs.URLOptions) = this()
  def this(data: jimpLib.JimpNs.Bitmap, cb: jimpLib.JimpNs.ImageCallback[_]) = this()
  def this(data: nodeLib.Buffer, cb: jimpLib.JimpNs.ImageCallback[_]) = this()
  def this(image: jimpLib.JimpNs.Jimp, cb: jimpLib.JimpNs.ImageCallback[_]) = this()
  // Constructors
  def this(path: java.lang.String, cb: jimpLib.JimpNs.ImageCallback[_]) = this()
  def this(urlOptions: jimpLib.JimpNs.URLOptions, cb: jimpLib.JimpNs.ImageCallback[_]) = this()
  def this(w: scala.Double, h: scala.Double) = this()
  def this(w: scala.Double, h: scala.Double, background: java.lang.String) = this()
  def this(w: scala.Double, h: scala.Double, background: scala.Double) = this()
  def this(w: scala.Double, h: scala.Double, cb: jimpLib.JimpNs.ImageCallback[_]) = this()
  def this(w: scala.Double, h: scala.Double, background: java.lang.String, cb: jimpLib.JimpNs.ImageCallback[_]) = this()
  def this(w: scala.Double, h: scala.Double, background: scala.Double, cb: jimpLib.JimpNs.ImageCallback[_]) = this()
}

@JSImport("jimp", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  // Constants
  var AUTO: jimpLib.jimpLibNumbers.`-1` = js.native
  var BLEND_DARKEN: java.lang.String = js.native
  var BLEND_DESTINATION_OVER: java.lang.String = js.native
  var BLEND_DIFFERENCE: java.lang.String = js.native
  var BLEND_EXCLUSION: java.lang.String = js.native
  var BLEND_HARDLIGHT: java.lang.String = js.native
  var BLEND_LIGHTEN: java.lang.String = js.native
  var BLEND_MULTIPLY: java.lang.String = js.native
  var BLEND_OVERLAY: java.lang.String = js.native
  var BLEND_SCREEN: java.lang.String = js.native
  // blend modes
  var BLEND_SOURCE_OVER: java.lang.String = js.native
  var EDGE_CROP: jimpLib.jimpLibNumbers.`3` = js.native
  // Edge Handling
  var EDGE_EXTEND: jimpLib.jimpLibNumbers.`1` = js.native
  var EDGE_WRAP: jimpLib.jimpLibNumbers.`2` = js.native
  var FONT_SANS_10_BLACK: java.lang.String = js.native
  var FONT_SANS_128_BLACK: java.lang.String = js.native
  var FONT_SANS_128_WHITE: java.lang.String = js.native
  var FONT_SANS_12_BLACK: java.lang.String = js.native
  var FONT_SANS_14_BLACK: java.lang.String = js.native
  var FONT_SANS_16_BLACK: java.lang.String = js.native
  var FONT_SANS_16_WHITE: java.lang.String = js.native
  var FONT_SANS_32_BLACK: java.lang.String = js.native
  var FONT_SANS_32_WHITE: java.lang.String = js.native
  var FONT_SANS_64_BLACK: java.lang.String = js.native
  var FONT_SANS_64_WHITE: java.lang.String = js.native
  // Font locations
  var FONT_SANS_8_BLACK: java.lang.String = js.native
  var FONT_SANS_8_WHITE: java.lang.String = js.native
  var HORIZONTAL_ALIGN_CENTER: jimpLib.jimpLibNumbers.`2` = js.native
  // Align modes for cover, contain, bit masks
  var HORIZONTAL_ALIGN_LEFT: jimpLib.jimpLibNumbers.`1` = js.native
  var HORIZONTAL_ALIGN_RIGHT: jimpLib.jimpLibNumbers.`4` = js.native
  var MIME_BMP: jimpLib.jimpLibStrings.`image/bmp` = js.native
  var MIME_GIF: jimpLib.jimpLibStrings.`image/gif` = js.native
  var MIME_JGD: jimpLib.jimpLibStrings.`image/jgd` = js.native
  var MIME_JPEG: jimpLib.jimpLibStrings.`image/jpeg` = js.native
  // supported mime types
  var MIME_PNG: jimpLib.jimpLibStrings.`image/png` = js.native
  var MIME_TIFF: jimpLib.jimpLibStrings.`image/tiff` = js.native
  var MIME_X_MS_BMP: jimpLib.jimpLibStrings.`image/x-ms-bmp` = js.native
  // PNG filter types
  var PNG_FILTER_AUTO: jimpLib.jimpLibNumbers.`-1` = js.native
  var PNG_FILTER_AVERAGE: jimpLib.jimpLibNumbers.`3` = js.native
  var PNG_FILTER_NONE: jimpLib.jimpLibNumbers.`0` = js.native
  var PNG_FILTER_PATH: jimpLib.jimpLibNumbers.`4` = js.native
  var PNG_FILTER_SUB: jimpLib.jimpLibNumbers.`1` = js.native
  var PNG_FILTER_UP: jimpLib.jimpLibNumbers.`2` = js.native
  var RESIZE_BEZIER: jimpLib.jimpLibStrings.bezierInterpolation = js.native
  var RESIZE_BICUBIC: jimpLib.jimpLibStrings.bicubicInterpolation = js.native
  var RESIZE_BILINEAR: jimpLib.jimpLibStrings.bilinearInterpolation = js.native
  var RESIZE_HERMITE: jimpLib.jimpLibStrings.hermiteInterpolation = js.native
  // resize methods
  var RESIZE_NEAREST_NEIGHBOR: jimpLib.jimpLibStrings.nearestNeighbor = js.native
  var VERTICAL_ALIGN_BOTTOM: jimpLib.jimpLibNumbers.`32` = js.native
  var VERTICAL_ALIGN_MIDDLE: jimpLib.jimpLibNumbers.`16` = js.native
  var VERTICAL_ALIGN_TOP: jimpLib.jimpLibNumbers.`8` = js.native
  // Functions
  def appendConstructorOption[T /* <: js.Array[_] */](
    name: java.lang.String,
    test: js.Function1[/* repeated */T, scala.Boolean],
    run: js.ThisFunction3[
      /* this */ jimpLib.JimpNs.Jimp, 
      /* resolve */ js.Function1[/* jimp */ jimpLib.JimpNs.Jimp, _], 
      /* reject */ js.Function1[/* reason */ nodeLib.Error, _], 
      /* repeated */T, 
      _
    ]
  ): scala.Unit = js.native
  def colorDiff(rgba1: jimpLib.JimpNs.RGBA, rgba2: jimpLib.JimpNs.RGBA): scala.Double = js.native
  def colorDiff(rgba1: jimpLib.JimpNs.RGB, rgba2: jimpLib.JimpNs.RGB): scala.Double = js.native
  def compareHashes(hash1: java.lang.String, hash2: java.lang.String): scala.Double = js.native
  def create(data: nodeLib.Buffer): stdLib.Promise[jimpLib.JimpNs.Jimp] = js.native
  def create(image: jimpLib.JimpNs.Jimp): stdLib.Promise[jimpLib.JimpNs.Jimp] = js.native
  def create(path: java.lang.String): stdLib.Promise[jimpLib.JimpNs.Jimp] = js.native
  def create(w: scala.Double, h: scala.Double): stdLib.Promise[jimpLib.JimpNs.Jimp] = js.native
  def create(w: scala.Double, h: scala.Double, background: java.lang.String): stdLib.Promise[jimpLib.JimpNs.Jimp] = js.native
  def create(w: scala.Double, h: scala.Double, background: scala.Double): stdLib.Promise[jimpLib.JimpNs.Jimp] = js.native
  def cssColorToHex(cssColor: java.lang.String): scala.Double = js.native
  def diff(img1: jimpLib.JimpNs.Jimp, img2: jimpLib.JimpNs.Jimp): jimpLib.Anon_Percent = js.native
  def diff(img1: jimpLib.JimpNs.Jimp, img2: jimpLib.JimpNs.Jimp, threshold: scala.Double): jimpLib.Anon_Percent = js.native
  def distance(img1: jimpLib.JimpNs.Jimp, img2: jimpLib.JimpNs.Jimp): scala.Double = js.native
  def intToRGBA(i: scala.Double): jimpLib.JimpNs.RGBA = js.native
  def intToRGBA(i: scala.Double, cb: jimpLib.JimpNs.GenericCallback[jimpLib.JimpNs.RGBA, _, _]): jimpLib.JimpNs.RGBA = js.native
  def limit255(n: scala.Double): scala.Double = js.native
  def loadFont(file: java.lang.String): stdLib.Promise[jimpLib.JimpNs.Font] = js.native
  def loadFont(file: java.lang.String, cb: jimpLib.JimpNs.GenericCallback[jimpLib.JimpNs.Font, _, _]): stdLib.Promise[scala.Nothing] = js.native
  def measureText(font: jimpLib.JimpNs.Font, text: jimpLib.JimpNs.PrintableText): scala.Double = js.native
  def measureTextHeight(font: jimpLib.JimpNs.Font, text: jimpLib.JimpNs.PrintableText, maxWidth: scala.Double): scala.Double = js.native
  def read(data: nodeLib.Buffer): stdLib.Promise[jimpLib.JimpNs.Jimp] = js.native
  def read(image: jimpLib.JimpNs.Jimp): stdLib.Promise[jimpLib.JimpNs.Jimp] = js.native
  def read(path: java.lang.String): stdLib.Promise[jimpLib.JimpNs.Jimp] = js.native
  def read(w: scala.Double, h: scala.Double): stdLib.Promise[jimpLib.JimpNs.Jimp] = js.native
  def read(w: scala.Double, h: scala.Double, background: java.lang.String): stdLib.Promise[jimpLib.JimpNs.Jimp] = js.native
  def read(w: scala.Double, h: scala.Double, background: scala.Double): stdLib.Promise[jimpLib.JimpNs.Jimp] = js.native
  def rgbaToInt(
    r: scala.Double,
    g: scala.Double,
    b: scala.Double,
    a: scala.Double,
    cb: jimpLib.JimpNs.GenericCallback[scala.Double, _, jimpLib.JimpNs.Jimp]
  ): scala.Double = js.native
}

