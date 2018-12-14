package typings
package jimpLib.jimpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Jimp
  extends // Constructors
org.scalablytyped.runtime.Instantiable2[
      (/* path */ java.lang.String) | (/* urlOptions */ jimpLib.URLOptions) | (/* image */ Jimp) | (/* data */ nodeLib.Buffer) | (/* data */ Bitmap) | (/* w */ scala.Double), 
      (/* cb */ jimpLib.ImageCallback[js.Any]) | (/* h */ scala.Double), 
      Jimp
    ]
     with // Constructors
// For custom constructors when using Jimp.appendConstructorOption
org.scalablytyped.runtime.Instantiable1[
      (/* path */ java.lang.String) | (/* urlOptions */ jimpLib.URLOptions) | (/* image */ Jimp) | (/* data */ nodeLib.Buffer) | (/* data */ Bitmap) | (/* args (repeated) */ js.Any), 
      Jimp
    ]
     with org.scalablytyped.runtime.Instantiable3[
      /* w */ scala.Double, 
      /* h */ scala.Double, 
      (/* cb */ jimpLib.ImageCallback[js.Any]) | (/* background */ scala.Double) | (/* background */ java.lang.String), 
      Jimp
    ]
     with org.scalablytyped.runtime.Instantiable4[
      /* w */ scala.Double, 
      /* h */ scala.Double, 
      (/* background */ scala.Double) | (/* background */ java.lang.String), 
      /* cb */ jimpLib.ImageCallback[js.Any], 
      Jimp
    ] {
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
  var _background: scala.Double = js.native
  var _deflateLevel: scala.Double = js.native
  var _deflateStrategy: scala.Double = js.native
  var _filterType: scala.Double = js.native
  var _originalMime: java.lang.String = js.native
  var _quality: scala.Double = js.native
  var _rgba: scala.Boolean = js.native
  // Properties
  var bitmap: Bitmap = js.native
  // Functions
  def appendConstructorOption[T /* <: coreDashJsLib.Array[_] */](
    name: java.lang.String,
    test: js.Function1[/* repeated */T, scala.Boolean],
    run: js.ThisFunction3[
      /* this */ this.type, 
      /* resolve */ js.Function1[/* jimp */ this.type, _], 
      /* reject */ js.Function1[/* reason */ nodeLib.Error, _], 
      /* repeated */T, 
      _
    ]
  ): scala.Unit = js.native
  def autocrop(): this.type = js.native
  def autocrop(cropOnlyFrames: scala.Boolean): this.type = js.native
  def autocrop(cropOnlyFrames: scala.Boolean, cb: jimpLib.ImageCallback[_]): this.type = js.native
  def autocrop(options: jimpLib.Anon_CropSymmetric): this.type = js.native
  def autocrop(options: jimpLib.Anon_CropSymmetric, cb: jimpLib.ImageCallback[_]): this.type = js.native
  def autocrop(tolerance: scala.Double): this.type = js.native
  def autocrop(tolerance: scala.Double, cb: jimpLib.ImageCallback[_]): this.type = js.native
  def autocrop(tolerance: scala.Double, cropOnlyFrames: scala.Boolean): this.type = js.native
  def autocrop(tolerance: scala.Double, cropOnlyFrames: scala.Boolean, cb: jimpLib.ImageCallback[_]): this.type = js.native
  def background(hex: scala.Double): this.type = js.native
  def background(hex: scala.Double, cb: jimpLib.ImageCallback[_]): this.type = js.native
  def backgroundQuiet(hex: scala.Double): this.type = js.native
  def backgroundQuiet(hex: scala.Double, cb: jimpLib.ImageCallback[_]): this.type = js.native
  def blit(src: Jimp, x: scala.Double, y: scala.Double): this.type = js.native
  def blit(src: Jimp, x: scala.Double, y: scala.Double, cb: jimpLib.ImageCallback[_]): this.type = js.native
  def blit(
    src: Jimp,
    x: scala.Double,
    y: scala.Double,
    srcx: scala.Double,
    srcy: scala.Double,
    srcw: scala.Double,
    srch: scala.Double
  ): this.type = js.native
  def blit(
    src: Jimp,
    x: scala.Double,
    y: scala.Double,
    srcx: scala.Double,
    srcy: scala.Double,
    srcw: scala.Double,
    srch: scala.Double,
    cb: jimpLib.ImageCallback[_]
  ): this.type = js.native
  // Effect methods
  def blur(r: scala.Double): this.type = js.native
  // Effect methods
  def blur(r: scala.Double, cb: jimpLib.ImageCallback[_]): this.type = js.native
  // Color methods
  def brightness(`val`: scala.Double): this.type = js.native
  // Color methods
  def brightness(`val`: scala.Double, cb: jimpLib.ImageCallback[_]): this.type = js.native
  def clone(cb: jimpLib.ImageCallback[_]): this.type = js.native
  def cloneQuiet(): this.type = js.native
  def cloneQuiet(cb: jimpLib.ImageCallback[_]): this.type = js.native
  def color(actions: coreDashJsLib.Array[jimpLib.ColorAction]): this.type = js.native
  def color(actions: coreDashJsLib.Array[jimpLib.ColorAction], cb: jimpLib.ImageCallback[_]): this.type = js.native
  def colorDiff(rgba1: RGBA, rgba2: RGBA): scala.Double = js.native
  def colorDiff(rgba1: RGB, rgba2: RGB): scala.Double = js.native
  def colorType(s: scala.Double): this.type = js.native
  def colorType(s: scala.Double, cb: jimpLib.ImageCallback[_]): this.type = js.native
  def colour(actions: coreDashJsLib.Array[jimpLib.ColorAction]): this.type = js.native
  def colour(actions: coreDashJsLib.Array[jimpLib.ColorAction], cb: jimpLib.ImageCallback[_]): this.type = js.native
  def compareHashes(hash1: java.lang.String, hash2: java.lang.String): scala.Double = js.native
  def composite(src: Jimp, x: scala.Double, y: scala.Double): this.type = js.native
  def composite(src: Jimp, x: scala.Double, y: scala.Double, options: jimpLib.BlendMode): this.type = js.native
  def composite(
    src: Jimp,
    x: scala.Double,
    y: scala.Double,
    options: jimpLib.BlendMode,
    cb: jimpLib.ImageCallback[_]
  ): this.type = js.native
  def contain(w: scala.Double, h: scala.Double): this.type = js.native
  def contain(w: scala.Double, h: scala.Double, alignBits: scala.Double): this.type = js.native
  def contain(w: scala.Double, h: scala.Double, alignBits: scala.Double, cb: jimpLib.ImageCallback[_]): this.type = js.native
  def contain(w: scala.Double, h: scala.Double, alignBits: scala.Double, mode: java.lang.String): this.type = js.native
  def contain(
    w: scala.Double,
    h: scala.Double,
    alignBits: scala.Double,
    mode: java.lang.String,
    cb: jimpLib.ImageCallback[_]
  ): this.type = js.native
  def contain(w: scala.Double, h: scala.Double, cb: jimpLib.ImageCallback[_]): this.type = js.native
  def contain(w: scala.Double, h: scala.Double, mode: java.lang.String): this.type = js.native
  def contain(w: scala.Double, h: scala.Double, mode: java.lang.String, cb: jimpLib.ImageCallback[_]): this.type = js.native
  def contrast(`val`: scala.Double): this.type = js.native
  def contrast(`val`: scala.Double, cb: jimpLib.ImageCallback[_]): this.type = js.native
  def convolute(kernel: coreDashJsLib.Array[coreDashJsLib.Array[scala.Double]]): this.type = js.native
  def convolute(kernel: coreDashJsLib.Array[coreDashJsLib.Array[scala.Double]], cb: jimpLib.ImageCallback[_]): this.type = js.native
  def convolute(
    kernel: coreDashJsLib.Array[coreDashJsLib.Array[scala.Double]],
    x: scala.Double,
    y: scala.Double,
    w: scala.Double,
    h: scala.Double
  ): this.type = js.native
  def convolute(
    kernel: coreDashJsLib.Array[coreDashJsLib.Array[scala.Double]],
    x: scala.Double,
    y: scala.Double,
    w: scala.Double,
    h: scala.Double,
    cb: jimpLib.ImageCallback[_]
  ): this.type = js.native
  def convolution(kernel: coreDashJsLib.Array[coreDashJsLib.Array[scala.Double]]): this.type = js.native
  def convolution(kernel: coreDashJsLib.Array[coreDashJsLib.Array[scala.Double]], cb: jimpLib.ImageCallback[_]): this.type = js.native
  def convolution[T](kernel: coreDashJsLib.Array[coreDashJsLib.Array[scala.Double]], edgeHandling: java.lang.String): this.type = js.native
  def convolution[T](
    kernel: coreDashJsLib.Array[coreDashJsLib.Array[scala.Double]],
    edgeHandling: java.lang.String,
    cb: jimpLib.ImageCallback[_]
  ): this.type = js.native
  def cover(w: scala.Double, h: scala.Double): this.type = js.native
  def cover(w: scala.Double, h: scala.Double, alignBits: scala.Double): this.type = js.native
  def cover(w: scala.Double, h: scala.Double, alignBits: scala.Double, cb: jimpLib.ImageCallback[_]): this.type = js.native
  def cover(w: scala.Double, h: scala.Double, alignBits: scala.Double, mode: java.lang.String): this.type = js.native
  def cover(
    w: scala.Double,
    h: scala.Double,
    alignBits: scala.Double,
    mode: java.lang.String,
    cb: jimpLib.ImageCallback[_]
  ): this.type = js.native
  def cover(w: scala.Double, h: scala.Double, cb: jimpLib.ImageCallback[_]): this.type = js.native
  def create(data: nodeLib.Buffer): js.Promise[Jimp] = js.native
  def create(image: Jimp): js.Promise[Jimp] = js.native
  def create(path: java.lang.String): js.Promise[Jimp] = js.native
  def create(w: scala.Double, h: scala.Double): js.Promise[Jimp] = js.native
  def create(w: scala.Double, h: scala.Double, background: java.lang.String): js.Promise[Jimp] = js.native
  def create(w: scala.Double, h: scala.Double, background: scala.Double): js.Promise[Jimp] = js.native
  def crop(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): this.type = js.native
  def crop(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double, cb: jimpLib.ImageCallback[_]): this.type = js.native
  def cropQuiet(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): this.type = js.native
  def cropQuiet(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double, cb: jimpLib.ImageCallback[_]): this.type = js.native
  def cssColorToHex(cssColor: java.lang.String): scala.Double = js.native
  def deflateLevel(l: scala.Double): this.type = js.native
  def deflateLevel(l: scala.Double, cb: jimpLib.ImageCallback[_]): this.type = js.native
  def deflateStrategy(s: scala.Double): this.type = js.native
  def deflateStrategy(s: scala.Double, cb: jimpLib.ImageCallback[_]): this.type = js.native
  def diff(img1: Jimp, img2: Jimp): jimpLib.Anon_Percent = js.native
  def diff(img1: Jimp, img2: Jimp, threshold: scala.Double): jimpLib.Anon_Percent = js.native
  def displace(map: Jimp, offset: scala.Double): this.type = js.native
  def displace(map: Jimp, offset: scala.Double, cb: jimpLib.ImageCallback[_]): this.type = js.native
  def distance(img1: Jimp, img2: Jimp): scala.Double = js.native
  def distanceFromHash(hash: java.lang.String): scala.Double = js.native
  def dither16(): this.type = js.native
  def dither16(cb: jimpLib.ImageCallback[_]): this.type = js.native
  def dither565(): this.type = js.native
  def dither565(cb: jimpLib.ImageCallback[_]): this.type = js.native
  def fade(f: scala.Double): this.type = js.native
  def fade(f: scala.Double, cb: jimpLib.ImageCallback[_]): this.type = js.native
  def filterType(f: scala.Double): this.type = js.native
  def filterType(f: scala.Double, cb: jimpLib.ImageCallback[_]): this.type = js.native
  def flip(horizontal: scala.Boolean, vertical: scala.Boolean): this.type = js.native
  def flip(horizontal: scala.Boolean, vertical: scala.Boolean, cb: jimpLib.ImageCallback[_]): this.type = js.native
  def gaussian(r: scala.Double): this.type = js.native
  def gaussian(r: scala.Double, cb: jimpLib.ImageCallback[_]): this.type = js.native
  def getBase64(mime: java.lang.String, cb: jimpLib.GenericCallback[java.lang.String, _, this.type]): this.type = js.native
  def getBase64Async(mime: java.lang.String): js.Promise[java.lang.String] = js.native
  def getBuffer(mime: java.lang.String, cb: jimpLib.GenericCallback[nodeLib.Buffer, _, _]): this.type = js.native
  def getBufferAsync(mime: java.lang.String): js.Promise[nodeLib.Buffer] = js.native
  def getExtension(): java.lang.String = js.native
  def getHeight(): scala.Double = js.native
  def getMIME(): java.lang.String = js.native
  def getPixelColor(x: scala.Double, y: scala.Double): scala.Double = js.native
  def getPixelColor(x: scala.Double, y: scala.Double, cb: jimpLib.GenericCallback[scala.Double, _, this.type]): scala.Double = js.native
  def getPixelColour(x: scala.Double, y: scala.Double): scala.Double = js.native
  def getPixelColour(x: scala.Double, y: scala.Double, cb: jimpLib.GenericCallback[scala.Double, _, this.type]): scala.Double = js.native
  def getPixelIndex(x: scala.Double, y: scala.Double): scala.Double = js.native
  def getPixelIndex(x: scala.Double, y: scala.Double, cb: jimpLib.GenericCallback[scala.Double, _, this.type]): scala.Double = js.native
  def getPixelIndex(x: scala.Double, y: scala.Double, edgeHandling: java.lang.String): scala.Double = js.native
  def getPixelIndex(
    x: scala.Double,
    y: scala.Double,
    edgeHandling: java.lang.String,
    cb: jimpLib.GenericCallback[scala.Double, _, this.type]
  ): scala.Double = js.native
  def getWidth(): scala.Double = js.native
  def grayscale(): this.type = js.native
  def grayscale(cb: jimpLib.ImageCallback[_]): this.type = js.native
  def greyscale(): this.type = js.native
  def greyscale(cb: jimpLib.ImageCallback[_]): this.type = js.native
  def hasAlpha(): scala.Boolean = js.native
  def hash(): this.type = js.native
  def hash(base: js.UndefOr[scala.Nothing], cb: jimpLib.GenericCallback[java.lang.String, _, this.type]): this.type = js.native
  def hash(base: scala.Double): this.type = js.native
  def hash(base: scala.Double, cb: jimpLib.GenericCallback[java.lang.String, _, this.type]): this.type = js.native
  def hash(base: scala.Null, cb: jimpLib.GenericCallback[java.lang.String, _, this.type]): this.type = js.native
  def hash(cb: jimpLib.GenericCallback[java.lang.String, _, this.type]): this.type = js.native
  def histogram(): jimpLib.Anon_B = js.native
  def inspect(): java.lang.String = js.native
  def intToRGBA(i: scala.Double): RGBA = js.native
  def intToRGBA(i: scala.Double, cb: jimpLib.GenericCallback[RGBA, _, _]): RGBA = js.native
  def invert(): this.type = js.native
  def invert(cb: jimpLib.ImageCallback[_]): this.type = js.native
  def limit255(n: scala.Double): scala.Double = js.native
  def loadFont(file: java.lang.String): js.Promise[Font] = js.native
  def loadFont(file: java.lang.String, cb: jimpLib.GenericCallback[Font, _, _]): js.Promise[scala.Nothing] = js.native
  def mask(src: Jimp, x: scala.Double, y: scala.Double): this.type = js.native
  def mask(src: Jimp, x: scala.Double, y: scala.Double, cb: jimpLib.ImageCallback[_]): this.type = js.native
  def measureText(font: Font, text: jimpLib.PrintableText): scala.Double = js.native
  def measureTextHeight(font: Font, text: jimpLib.PrintableText, maxWidth: scala.Double): scala.Double = js.native
  def mirror(horizontal: scala.Boolean, vertical: scala.Boolean): this.type = js.native
  def mirror(horizontal: scala.Boolean, vertical: scala.Boolean, cb: jimpLib.ImageCallback[_]): this.type = js.native
  def normalize(): this.type = js.native
  def normalize(cb: jimpLib.ImageCallback[_]): this.type = js.native
  // Methods
  def on[T /* <: jimpLib.ListenableName */](event: T, cb: js.Function1[/* data */ jimpLib.ListenerData[T], _]): js.Any = js.native
  def opacity(f: scala.Double): this.type = js.native
  def opacity(f: scala.Double, cb: jimpLib.ImageCallback[_]): this.type = js.native
  def opaque(): this.type = js.native
  def opaque(cb: jimpLib.ImageCallback[_]): this.type = js.native
  def parseBitmap(data: nodeLib.Buffer): scala.Unit = js.native
  def parseBitmap(data: nodeLib.Buffer, path: java.lang.String): scala.Unit = js.native
  def parseBitmap(data: nodeLib.Buffer, path: java.lang.String, cb: jimpLib.ImageCallback[_]): scala.Unit = js.native
  def parseBitmap(data: nodeLib.Buffer, path: js.UndefOr[scala.Nothing], cb: jimpLib.ImageCallback[_]): scala.Unit = js.native
  def parseBitmap(data: nodeLib.Buffer, path: scala.Null, cb: jimpLib.ImageCallback[_]): scala.Unit = js.native
  def pixelate(size: scala.Double): this.type = js.native
  def pixelate(size: scala.Double, cb: jimpLib.ImageCallback[_]): this.type = js.native
  def pixelate(size: scala.Double, x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): this.type = js.native
  def pixelate(
    size: scala.Double,
    x: scala.Double,
    y: scala.Double,
    w: scala.Double,
    h: scala.Double,
    cb: jimpLib.ImageCallback[_]
  ): this.type = js.native
  def posterize(n: scala.Double): this.type = js.native
  def posterize(n: scala.Double, cb: jimpLib.ImageCallback[_]): this.type = js.native
  // Text methods
  def print(font: Font, x: scala.Double, y: scala.Double, text: jimpLib.PrintableText): this.type = js.native
  // Text methods
  def print(
    font: Font,
    x: scala.Double,
    y: scala.Double,
    text: jimpLib.PrintableText,
    cb: jimpLib.ImageCallback[_]
  ): this.type = js.native
  def print(font: Font, x: scala.Double, y: scala.Double, text: jimpLib.PrintableText, maxWidth: scala.Double): this.type = js.native
  def print(
    font: Font,
    x: scala.Double,
    y: scala.Double,
    text: jimpLib.PrintableText,
    maxWidth: scala.Double,
    cb: jimpLib.ImageCallback[_]
  ): this.type = js.native
  def print(
    font: Font,
    x: scala.Double,
    y: scala.Double,
    text: jimpLib.PrintableText,
    maxWidth: scala.Double,
    maxHeight: scala.Double
  ): this.type = js.native
  def print(
    font: Font,
    x: scala.Double,
    y: scala.Double,
    text: jimpLib.PrintableText,
    maxWidth: scala.Double,
    maxHeight: scala.Double,
    cb: jimpLib.ImageCallback[_]
  ): this.type = js.native
  def quality(n: scala.Double): this.type = js.native
  def quality(n: scala.Double, cb: jimpLib.ImageCallback[_]): this.type = js.native
  def read(data: nodeLib.Buffer): js.Promise[Jimp] = js.native
  def read(image: Jimp): js.Promise[Jimp] = js.native
  def read(path: java.lang.String): js.Promise[Jimp] = js.native
  def read(w: scala.Double, h: scala.Double): js.Promise[Jimp] = js.native
  def read(w: scala.Double, h: scala.Double, background: java.lang.String): js.Promise[Jimp] = js.native
  def read(w: scala.Double, h: scala.Double, background: scala.Double): js.Promise[Jimp] = js.native
  def resize(w: scala.Double, h: scala.Double): this.type = js.native
  def resize(w: scala.Double, h: scala.Double, cb: jimpLib.ImageCallback[_]): this.type = js.native
  def resize(w: scala.Double, h: scala.Double, mode: java.lang.String): this.type = js.native
  def resize(w: scala.Double, h: scala.Double, mode: java.lang.String, cb: jimpLib.ImageCallback[_]): this.type = js.native
  def rgba(bool: scala.Boolean): this.type = js.native
  def rgba(bool: scala.Boolean, cb: jimpLib.ImageCallback[_]): this.type = js.native
  def rgbaToInt(
    r: scala.Double,
    g: scala.Double,
    b: scala.Double,
    a: scala.Double,
    cb: jimpLib.GenericCallback[scala.Double, _, Jimp]
  ): scala.Double = js.native
  // Shape methods
  def rotate(deg: scala.Double): this.type = js.native
  // Shape methods
  def rotate(deg: scala.Double, cb: jimpLib.ImageCallback[_]): this.type = js.native
  def rotate(deg: scala.Double, mode: java.lang.String): this.type = js.native
  def rotate(deg: scala.Double, mode: java.lang.String, cb: jimpLib.ImageCallback[_]): this.type = js.native
  def rotate(deg: scala.Double, mode: scala.Boolean): this.type = js.native
  def rotate(deg: scala.Double, mode: scala.Boolean, cb: jimpLib.ImageCallback[_]): this.type = js.native
  def scale(f: scala.Double): this.type = js.native
  def scale(f: scala.Double, cb: jimpLib.ImageCallback[_]): this.type = js.native
  def scale(f: scala.Double, mode: java.lang.String): this.type = js.native
  def scale(f: scala.Double, mode: java.lang.String, cb: jimpLib.ImageCallback[_]): this.type = js.native
  def scaleToFit(w: scala.Double, h: scala.Double): this.type = js.native
  def scaleToFit(w: scala.Double, h: scala.Double, cb: jimpLib.ImageCallback[_]): this.type = js.native
  def scaleToFit(w: scala.Double, h: scala.Double, mode: java.lang.String): this.type = js.native
  def scaleToFit(w: scala.Double, h: scala.Double, mode: java.lang.String, cb: jimpLib.ImageCallback[_]): this.type = js.native
  def scan(
    x: scala.Double,
    y: scala.Double,
    w: scala.Double,
    h: scala.Double,
    f: js.ThisFunction3[
      /* this */ this.type, 
      /* x */ scala.Double, 
      /* y */ scala.Double, 
      /* idx */ scala.Double, 
      _
    ]
  ): this.type = js.native
  def scan(
    x: scala.Double,
    y: scala.Double,
    w: scala.Double,
    h: scala.Double,
    f: js.ThisFunction3[
      /* this */ this.type, 
      /* x */ scala.Double, 
      /* y */ scala.Double, 
      /* idx */ scala.Double, 
      _
    ],
    cb: jimpLib.ImageCallback[_]
  ): this.type = js.native
  def scanQuiet(
    x: scala.Double,
    y: scala.Double,
    w: scala.Double,
    h: scala.Double,
    f: js.ThisFunction3[
      /* this */ this.type, 
      /* x */ scala.Double, 
      /* y */ scala.Double, 
      /* idx */ scala.Double, 
      _
    ]
  ): this.type = js.native
  def scanQuiet(
    x: scala.Double,
    y: scala.Double,
    w: scala.Double,
    h: scala.Double,
    f: js.ThisFunction3[
      /* this */ this.type, 
      /* x */ scala.Double, 
      /* y */ scala.Double, 
      /* idx */ scala.Double, 
      _
    ],
    cb: jimpLib.ImageCallback[_]
  ): this.type = js.native
  def sepia(): this.type = js.native
  def sepia(cb: jimpLib.ImageCallback[_]): this.type = js.native
  def setPixelColor(hex: scala.Double, x: scala.Double, y: scala.Double): this.type = js.native
  def setPixelColor(hex: scala.Double, x: scala.Double, y: scala.Double, cb: jimpLib.ImageCallback[_]): this.type = js.native
  def setPixelColour(hex: scala.Double, x: scala.Double, y: scala.Double): this.type = js.native
  def setPixelColour(hex: scala.Double, x: scala.Double, y: scala.Double, cb: jimpLib.ImageCallback[_]): this.type = js.native
  def write(path: java.lang.String): this.type = js.native
  def write(path: java.lang.String, cb: jimpLib.ImageCallback[_]): this.type = js.native
  def writeAsync(path: java.lang.String): js.Promise[Jimp] = js.native
}

