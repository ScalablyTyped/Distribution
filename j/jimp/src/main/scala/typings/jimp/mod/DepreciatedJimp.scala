package typings.jimp.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typings.jimp.AnonAutoGreyscale
import typings.jimp.AnonB
import typings.jimp.AnonCropOnlyFrames
import typings.jimp.AnonIdx
import typings.jimp.AnonImage
import typings.jimp.AnonOpacity
import typings.jimp.AnonR
import typings.jimp.AnonRadius
import typings.jimp.jimpNumbers.`-1`
import typings.jimp.jimpNumbers.`0`
import typings.jimp.jimpNumbers.`16`
import typings.jimp.jimpNumbers.`1`
import typings.jimp.jimpNumbers.`2`
import typings.jimp.jimpNumbers.`32`
import typings.jimp.jimpNumbers.`3`
import typings.jimp.jimpNumbers.`4`
import typings.jimp.jimpNumbers.`8`
import typings.jimp.jimpStrings.`imageSlashx-ms-bmp`
import typings.jimp.jimpStrings.bezierInterpolation
import typings.jimp.jimpStrings.bicubicInterpolation
import typings.jimp.jimpStrings.bilinearInterpolation
import typings.jimp.jimpStrings.hermiteInterpolation
import typings.jimp.jimpStrings.imageSlashbmp
import typings.jimp.jimpStrings.imageSlashgif
import typings.jimp.jimpStrings.imageSlashjgd
import typings.jimp.jimpStrings.imageSlashjpeg
import typings.jimp.jimpStrings.imageSlashpng
import typings.jimp.jimpStrings.imageSlashtiff
import typings.jimp.jimpStrings.nearestNeighbor
import typings.node.Buffer
import typings.std.Error
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @deprecated Jimp typings for TS <3.1 are being depreciated. Please upgrade your TypeScript version
  */
@js.native
trait DepreciatedJimp
  extends // Constructors
// For custom constructors when using Jimp.appendConstructorOption
Instantiable1[
      (/* args (repeated) */ js.Any) | (/* data */ Bitmap) | (/* data */ Buffer) | (/* image */ DepreciatedJimp) | (/* path */ String) | (/* urlOptions */ URLOptions), 
      DepreciatedJimp
    ]
     with Instantiable2[
      (/* data */ Bitmap) | (/* data */ Buffer) | (/* image */ DepreciatedJimp) | (/* w */ Double) | (/* path */ String) | (/* urlOptions */ URLOptions), 
      (/* h */ Double) | (/* cb */ ImageCallback[js.Any]), 
      DepreciatedJimp
    ]
     with Instantiable3[
      /* w */ Double, 
      /* h */ Double, 
      (/* background */ Double) | (/* cb */ ImageCallback[js.Any]) | (/* background */ String), 
      DepreciatedJimp
    ]
     with Instantiable4[
      /* w */ Double, 
      /* h */ Double, 
      (/* background */ Double) | (/* background */ String), 
      /* cb */ ImageCallback[js.Any], 
      DepreciatedJimp
    ] {
  // Constants
  var AUTO: `-1` = js.native
  var BLEND_DARKEN: String = js.native
  var BLEND_DESTINATION_OVER: String = js.native
  var BLEND_DIFFERENCE: String = js.native
  var BLEND_EXCLUSION: String = js.native
  var BLEND_HARDLIGHT: String = js.native
  var BLEND_LIGHTEN: String = js.native
  var BLEND_MULTIPLY: String = js.native
  var BLEND_OVERLAY: String = js.native
  var BLEND_SCREEN: String = js.native
  // blend modes
  var BLEND_SOURCE_OVER: String = js.native
  var EDGE_CROP: `3` = js.native
  // Edge Handling
  var EDGE_EXTEND: `1` = js.native
  var EDGE_WRAP: `2` = js.native
  var FONT_SANS_10_BLACK: String = js.native
  var FONT_SANS_128_BLACK: String = js.native
  var FONT_SANS_128_WHITE: String = js.native
  var FONT_SANS_12_BLACK: String = js.native
  var FONT_SANS_14_BLACK: String = js.native
  var FONT_SANS_16_BLACK: String = js.native
  var FONT_SANS_16_WHITE: String = js.native
  var FONT_SANS_32_BLACK: String = js.native
  var FONT_SANS_32_WHITE: String = js.native
  var FONT_SANS_64_BLACK: String = js.native
  var FONT_SANS_64_WHITE: String = js.native
  // Font locations
  var FONT_SANS_8_BLACK: String = js.native
  var FONT_SANS_8_WHITE: String = js.native
  var HORIZONTAL_ALIGN_CENTER: `2` = js.native
  // Align modes for cover, contain, bit masks
  var HORIZONTAL_ALIGN_LEFT: `1` = js.native
  var HORIZONTAL_ALIGN_RIGHT: `4` = js.native
  var MIME_BMP: imageSlashbmp = js.native
  var MIME_GIF: imageSlashgif = js.native
  var MIME_JGD: imageSlashjgd = js.native
  var MIME_JPEG: imageSlashjpeg = js.native
  // supported mime types
  var MIME_PNG: imageSlashpng = js.native
  var MIME_TIFF: imageSlashtiff = js.native
  var MIME_X_MS_BMP: `imageSlashx-ms-bmp` = js.native
  // PNG filter types
  var PNG_FILTER_AUTO: `-1` = js.native
  var PNG_FILTER_AVERAGE: `3` = js.native
  var PNG_FILTER_NONE: `0` = js.native
  var PNG_FILTER_PATH: `4` = js.native
  var PNG_FILTER_SUB: `1` = js.native
  var PNG_FILTER_UP: `2` = js.native
  var RESIZE_BEZIER: bezierInterpolation = js.native
  var RESIZE_BICUBIC: bicubicInterpolation = js.native
  var RESIZE_BILINEAR: bilinearInterpolation = js.native
  var RESIZE_HERMITE: hermiteInterpolation = js.native
  // resize methods
  var RESIZE_NEAREST_NEIGHBOR: nearestNeighbor = js.native
  var VERTICAL_ALIGN_BOTTOM: `32` = js.native
  var VERTICAL_ALIGN_MIDDLE: `16` = js.native
  var VERTICAL_ALIGN_TOP: `8` = js.native
  var _background: Double = js.native
  var _deflateLevel: Double = js.native
  var _deflateStrategy: Double = js.native
  var _filterType: Double = js.native
  var _originalMime: String = js.native
  var _quality: Double = js.native
  var _rgba: Boolean = js.native
  // Properties
  var bitmap: Bitmap = js.native
  // Functions
  def appendConstructorOption[T /* <: js.Array[_] */](
    name: String,
    test: js.Function1[/* repeated */ T, Boolean],
    run: js.ThisFunction3[
      /* this */ this.type, 
      /* resolve */ js.Function1[/* jimp */ this.type, _], 
      /* reject */ js.Function1[/* reason */ Error, _], 
      /* repeated */ T, 
      _
    ]
  ): Unit = js.native
  def autocrop(): this.type = js.native
  def autocrop(cropOnlyFrames: Boolean): this.type = js.native
  def autocrop(cropOnlyFrames: Boolean, cb: ImageCallback[_]): this.type = js.native
  def autocrop(options: AnonCropOnlyFrames): this.type = js.native
  def autocrop(options: AnonCropOnlyFrames, cb: ImageCallback[_]): this.type = js.native
  def autocrop(tolerance: Double): this.type = js.native
  def autocrop(tolerance: Double, cb: ImageCallback[_]): this.type = js.native
  def autocrop(tolerance: Double, cropOnlyFrames: Boolean): this.type = js.native
  def autocrop(tolerance: Double, cropOnlyFrames: Boolean, cb: ImageCallback[_]): this.type = js.native
  def background(hex: Double): this.type = js.native
  def background(hex: Double, cb: ImageCallback[_]): this.type = js.native
  def backgroundQuiet(hex: Double): this.type = js.native
  def backgroundQuiet(hex: Double, cb: ImageCallback[_]): this.type = js.native
  def blit(src: DepreciatedJimp, x: Double, y: Double): this.type = js.native
  def blit(src: DepreciatedJimp, x: Double, y: Double, cb: ImageCallback[_]): this.type = js.native
  def blit(src: DepreciatedJimp, x: Double, y: Double, srcx: Double, srcy: Double, srcw: Double, srch: Double): this.type = js.native
  def blit(
    src: DepreciatedJimp,
    x: Double,
    y: Double,
    srcx: Double,
    srcy: Double,
    srcw: Double,
    srch: Double,
    cb: ImageCallback[_]
  ): this.type = js.native
  // Effect methods
  def blur(r: Double): this.type = js.native
  def blur(r: Double, cb: ImageCallback[_]): this.type = js.native
  // Color methods
  def brightness(`val`: Double): this.type = js.native
  def brightness(`val`: Double, cb: ImageCallback[_]): this.type = js.native
  def circle(): this.type = js.native
  def circle(cb: ImageCallback[_]): this.type = js.native
  def circle(options: AnonRadius): this.type = js.native
  def circle(options: AnonRadius, cb: ImageCallback[_]): this.type = js.native
  def clone(cb: ImageCallback[_]): this.type = js.native
  def cloneQuiet(): this.type = js.native
  def cloneQuiet(cb: ImageCallback[_]): this.type = js.native
  def color(actions: js.Array[ColorAction]): this.type = js.native
  def color(actions: js.Array[ColorAction], cb: ImageCallback[_]): this.type = js.native
  def colorDiff(rgba1: RGBA, rgba2: RGBA): Double = js.native
  def colorDiff(rgba1: RGB, rgba2: RGB): Double = js.native
  def colorType(s: Double): this.type = js.native
  def colorType(s: Double, cb: ImageCallback[_]): this.type = js.native
  def colour(actions: js.Array[ColorAction]): this.type = js.native
  def colour(actions: js.Array[ColorAction], cb: ImageCallback[_]): this.type = js.native
  def compareHashes(hash1: String, hash2: String): Double = js.native
  def composite(src: DepreciatedJimp, x: Double, y: Double): this.type = js.native
  def composite(src: DepreciatedJimp, x: Double, y: Double, options: BlendMode): this.type = js.native
  def composite(src: DepreciatedJimp, x: Double, y: Double, options: BlendMode, cb: ImageCallback[_]): this.type = js.native
  def contain(w: Double, h: Double): this.type = js.native
  def contain(w: Double, h: Double, alignBits: Double): this.type = js.native
  def contain(w: Double, h: Double, alignBits: Double, cb: ImageCallback[_]): this.type = js.native
  def contain(w: Double, h: Double, alignBits: Double, mode: String): this.type = js.native
  def contain(w: Double, h: Double, alignBits: Double, mode: String, cb: ImageCallback[_]): this.type = js.native
  def contain(w: Double, h: Double, cb: ImageCallback[_]): this.type = js.native
  def contain(w: Double, h: Double, mode: String): this.type = js.native
  def contain(w: Double, h: Double, mode: String, cb: ImageCallback[_]): this.type = js.native
  def contrast(`val`: Double): this.type = js.native
  def contrast(`val`: Double, cb: ImageCallback[_]): this.type = js.native
  def convolute(kernel: js.Array[js.Array[Double]]): this.type = js.native
  def convolute(kernel: js.Array[js.Array[Double]], cb: ImageCallback[_]): this.type = js.native
  def convolute(kernel: js.Array[js.Array[Double]], x: Double, y: Double, w: Double, h: Double): this.type = js.native
  def convolute(
    kernel: js.Array[js.Array[Double]],
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    cb: ImageCallback[_]
  ): this.type = js.native
  def convolution(kernel: js.Array[js.Array[Double]]): this.type = js.native
  def convolution(kernel: js.Array[js.Array[Double]], cb: ImageCallback[_]): this.type = js.native
  def convolution[T](kernel: js.Array[js.Array[Double]], edgeHandling: String): this.type = js.native
  def convolution[T](kernel: js.Array[js.Array[Double]], edgeHandling: String, cb: ImageCallback[_]): this.type = js.native
  def cover(w: Double, h: Double): this.type = js.native
  def cover(w: Double, h: Double, alignBits: Double): this.type = js.native
  def cover(w: Double, h: Double, alignBits: Double, cb: ImageCallback[_]): this.type = js.native
  def cover(w: Double, h: Double, alignBits: Double, mode: String): this.type = js.native
  def cover(w: Double, h: Double, alignBits: Double, mode: String, cb: ImageCallback[_]): this.type = js.native
  def cover(w: Double, h: Double, cb: ImageCallback[_]): this.type = js.native
  def create(data: Buffer): js.Promise[this.type] = js.native
  def create(image: this.type): js.Promise[this.type] = js.native
  def create(path: String): js.Promise[this.type] = js.native
  def create(w: Double, h: Double): js.Promise[this.type] = js.native
  def create(w: Double, h: Double, background: String): js.Promise[this.type] = js.native
  def create(w: Double, h: Double, background: Double): js.Promise[this.type] = js.native
  def crop(x: Double, y: Double, w: Double, h: Double): this.type = js.native
  def crop(x: Double, y: Double, w: Double, h: Double, cb: ImageCallback[_]): this.type = js.native
  def cropQuiet(x: Double, y: Double, w: Double, h: Double): this.type = js.native
  def cropQuiet(x: Double, y: Double, w: Double, h: Double, cb: ImageCallback[_]): this.type = js.native
  def cssColorToHex(cssColor: String): Double = js.native
  def deflateLevel(l: Double): this.type = js.native
  def deflateLevel(l: Double, cb: ImageCallback[_]): this.type = js.native
  def deflateStrategy(s: Double): this.type = js.native
  def deflateStrategy(s: Double, cb: ImageCallback[_]): this.type = js.native
  def diff(img1: this.type, img2: this.type): AnonImage = js.native
  def diff(img1: this.type, img2: this.type, threshold: Double): AnonImage = js.native
  def displace(map: DepreciatedJimp, offset: Double): this.type = js.native
  def displace(map: DepreciatedJimp, offset: Double, cb: ImageCallback[_]): this.type = js.native
  def distance(img1: this.type, img2: this.type): Double = js.native
  def distanceFromHash(hash: String): Double = js.native
  def dither16(): this.type = js.native
  def dither16(cb: ImageCallback[_]): this.type = js.native
  def dither565(): this.type = js.native
  def dither565(cb: ImageCallback[_]): this.type = js.native
  def fade(f: Double): this.type = js.native
  def fade(f: Double, cb: ImageCallback[_]): this.type = js.native
  def filterType(f: Double): this.type = js.native
  def filterType(f: Double, cb: ImageCallback[_]): this.type = js.native
  def fishEye(): this.type = js.native
  def fishEye(cb: ImageCallback[_]): this.type = js.native
  def fishEye(opts: AnonR): this.type = js.native
  def fishEye(opts: AnonR, cb: ImageCallback[_]): this.type = js.native
  def flip(horizontal: Boolean, vertical: Boolean): this.type = js.native
  def flip(horizontal: Boolean, vertical: Boolean, cb: ImageCallback[_]): this.type = js.native
  def gaussian(r: Double): this.type = js.native
  def gaussian(r: Double, cb: ImageCallback[_]): this.type = js.native
  def getBase64(mime: String, cb: GenericCallback[String, _, this.type]): this.type = js.native
  def getBase64Async(mime: String): js.Promise[String] = js.native
  def getBuffer(mime: String, cb: GenericCallback[Buffer, _, _]): this.type = js.native
  def getBufferAsync(mime: String): js.Promise[Buffer] = js.native
  def getExtension(): String = js.native
  def getHeight(): Double = js.native
  def getMIME(): String = js.native
  def getPixelColor(x: Double, y: Double): Double = js.native
  def getPixelColor(x: Double, y: Double, cb: GenericCallback[Double, _, this.type]): Double = js.native
  def getPixelColour(x: Double, y: Double): Double = js.native
  def getPixelColour(x: Double, y: Double, cb: GenericCallback[Double, _, this.type]): Double = js.native
  def getPixelIndex(x: Double, y: Double): Double = js.native
  def getPixelIndex(x: Double, y: Double, cb: GenericCallback[Double, _, this.type]): Double = js.native
  def getPixelIndex(x: Double, y: Double, edgeHandling: String): Double = js.native
  def getPixelIndex(x: Double, y: Double, edgeHandling: String, cb: GenericCallback[Double, _, this.type]): Double = js.native
  def getWidth(): Double = js.native
  def grayscale(): this.type = js.native
  def grayscale(cb: ImageCallback[_]): this.type = js.native
  def greyscale(): this.type = js.native
  def greyscale(cb: ImageCallback[_]): this.type = js.native
  def hasAlpha(): Boolean = js.native
  def hash(): String = js.native
  def hash(base: js.UndefOr[scala.Nothing], cb: GenericCallback[String, _, this.type]): String = js.native
  def hash(base: Double): String = js.native
  def hash(base: Double, cb: GenericCallback[String, _, this.type]): String = js.native
  def hash(base: Null, cb: GenericCallback[String, _, this.type]): String = js.native
  def hash(cb: GenericCallback[String, _, this.type]): String = js.native
  def histogram(): AnonB = js.native
  def inspect(): String = js.native
  def intToRGBA(i: Double): RGBA = js.native
  def intToRGBA(i: Double, cb: GenericCallback[RGBA, _, _]): RGBA = js.native
  def invert(): this.type = js.native
  def invert(cb: ImageCallback[_]): this.type = js.native
  def limit255(n: Double): Double = js.native
  def loadFont(file: String): js.Promise[Font] = js.native
  def loadFont(file: String, cb: GenericCallback[Font, _, _]): js.Promise[scala.Nothing] = js.native
  def mask(src: this.type, x: Double, y: Double): this.type = js.native
  def mask(src: this.type, x: Double, y: Double, cb: ImageCallback[_]): this.type = js.native
  def measureText(font: Font, text: PrintableText): Double = js.native
  def measureTextHeight(font: Font, text: PrintableText, maxWidth: Double): Double = js.native
  def mirror(horizontal: Boolean, vertical: Boolean): this.type = js.native
  def mirror(horizontal: Boolean, vertical: Boolean, cb: ImageCallback[_]): this.type = js.native
  def normalize(): this.type = js.native
  def normalize(cb: ImageCallback[_]): this.type = js.native
  // Methods
  def on[T /* <: ListenableName */](event: T, cb: js.Function1[/* data */ ListenerData[T], _]): js.Any = js.native
  def opacity(f: Double): this.type = js.native
  def opacity(f: Double, cb: ImageCallback[_]): this.type = js.native
  def opaque(): this.type = js.native
  def opaque(cb: ImageCallback[_]): this.type = js.native
  def parseBitmap(data: Buffer): Unit = js.native
  def parseBitmap(data: Buffer, path: js.UndefOr[scala.Nothing], cb: ImageCallback[_]): Unit = js.native
  def parseBitmap(data: Buffer, path: String): Unit = js.native
  def parseBitmap(data: Buffer, path: String, cb: ImageCallback[_]): Unit = js.native
  def parseBitmap(data: Buffer, path: Null, cb: ImageCallback[_]): Unit = js.native
  def pixelate(size: Double): this.type = js.native
  def pixelate(size: Double, cb: ImageCallback[_]): this.type = js.native
  def pixelate(size: Double, x: Double, y: Double, w: Double, h: Double): this.type = js.native
  def pixelate(size: Double, x: Double, y: Double, w: Double, h: Double, cb: ImageCallback[_]): this.type = js.native
  def posterize(n: Double): this.type = js.native
  def posterize(n: Double, cb: ImageCallback[_]): this.type = js.native
  // Text methods
  def print(font: Font, x: Double, y: Double, text: PrintableText): this.type = js.native
  def print(font: Font, x: Double, y: Double, text: PrintableText, cb: ImageCallback[_]): this.type = js.native
  def print(font: Font, x: Double, y: Double, text: PrintableText, maxWidth: Double): this.type = js.native
  def print(font: Font, x: Double, y: Double, text: PrintableText, maxWidth: Double, cb: ImageCallback[_]): this.type = js.native
  def print(font: Font, x: Double, y: Double, text: PrintableText, maxWidth: Double, maxHeight: Double): this.type = js.native
  def print(
    font: Font,
    x: Double,
    y: Double,
    text: PrintableText,
    maxWidth: Double,
    maxHeight: Double,
    cb: ImageCallback[_]
  ): this.type = js.native
  def quality(n: Double): this.type = js.native
  def quality(n: Double, cb: ImageCallback[_]): this.type = js.native
  def read(data: Buffer): js.Promise[this.type] = js.native
  def read(image: this.type): js.Promise[this.type] = js.native
  def read(path: String): js.Promise[this.type] = js.native
  def read(w: Double, h: Double): js.Promise[this.type] = js.native
  def read(w: Double, h: Double, background: String): js.Promise[this.type] = js.native
  def read(w: Double, h: Double, background: Double): js.Promise[this.type] = js.native
  def resize(w: Double, h: Double): this.type = js.native
  def resize(w: Double, h: Double, cb: ImageCallback[_]): this.type = js.native
  def resize(w: Double, h: Double, mode: String): this.type = js.native
  def resize(w: Double, h: Double, mode: String, cb: ImageCallback[_]): this.type = js.native
  def rgba(bool: Boolean): this.type = js.native
  def rgba(bool: Boolean, cb: ImageCallback[_]): this.type = js.native
  def rgbaToInt(r: Double, g: Double, b: Double, a: Double, cb: GenericCallback[Double, _, this.type]): Double = js.native
  // Shape methods
  def rotate(deg: Double): this.type = js.native
  def rotate(deg: Double, cb: ImageCallback[_]): this.type = js.native
  def rotate(deg: Double, mode: String): this.type = js.native
  def rotate(deg: Double, mode: String, cb: ImageCallback[_]): this.type = js.native
  def rotate(deg: Double, mode: Boolean): this.type = js.native
  def rotate(deg: Double, mode: Boolean, cb: ImageCallback[_]): this.type = js.native
  def scale(f: Double): this.type = js.native
  def scale(f: Double, cb: ImageCallback[_]): this.type = js.native
  def scale(f: Double, mode: String): this.type = js.native
  def scale(f: Double, mode: String, cb: ImageCallback[_]): this.type = js.native
  def scaleToFit(w: Double, h: Double): this.type = js.native
  def scaleToFit(w: Double, h: Double, cb: ImageCallback[_]): this.type = js.native
  def scaleToFit(w: Double, h: Double, mode: String): this.type = js.native
  def scaleToFit(w: Double, h: Double, mode: String, cb: ImageCallback[_]): this.type = js.native
  def scan(
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    f: js.ThisFunction3[/* this */ this.type, /* x */ Double, /* y */ Double, /* idx */ Double, _]
  ): this.type = js.native
  def scan(
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    f: js.ThisFunction3[/* this */ this.type, /* x */ Double, /* y */ Double, /* idx */ Double, _],
    cb: ImageCallback[_]
  ): this.type = js.native
  def scanIterator(x: Double, y: Double, w: Double, h: Double): IterableIterator[AnonIdx] = js.native
  def scanQuiet(
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    f: js.ThisFunction3[/* this */ this.type, /* x */ Double, /* y */ Double, /* idx */ Double, _]
  ): this.type = js.native
  def scanQuiet(
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    f: js.ThisFunction3[/* this */ this.type, /* x */ Double, /* y */ Double, /* idx */ Double, _],
    cb: ImageCallback[_]
  ): this.type = js.native
  def sepia(): this.type = js.native
  def sepia(cb: ImageCallback[_]): this.type = js.native
  def setPixelColor(hex: Double, x: Double, y: Double): this.type = js.native
  def setPixelColor(hex: Double, x: Double, y: Double, cb: ImageCallback[_]): this.type = js.native
  def setPixelColour(hex: Double, x: Double, y: Double): this.type = js.native
  def setPixelColour(hex: Double, x: Double, y: Double, cb: ImageCallback[_]): this.type = js.native
  def shadow(): this.type = js.native
  def shadow(cb: ImageCallback[_]): this.type = js.native
  def shadow(options: AnonOpacity): this.type = js.native
  def shadow(options: AnonOpacity, cb: ImageCallback[_]): this.type = js.native
  def threshold(opts: AnonAutoGreyscale): this.type = js.native
  def threshold(opts: AnonAutoGreyscale, cb: ImageCallback[_]): this.type = js.native
  def write(path: String): this.type = js.native
  def write(path: String, cb: ImageCallback[_]): this.type = js.native
  def writeAsync(path: String): js.Promise[this.type] = js.native
}

