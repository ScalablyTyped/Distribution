package typings.jimpCore.jimpMod

import typings.jimpCore.etcMod.Bitmap
import typings.jimpCore.etcMod.BlendMode
import typings.jimpCore.etcMod.GenericCallback
import typings.jimpCore.etcMod.ImageCallback
import typings.jimpCore.etcMod.ListenableName
import typings.jimpCore.etcMod.ListenerData
import typings.jimpCore.etcMod.RGB
import typings.jimpCore.etcMod.RGBA
import typings.jimpCore.jimpCoreNumbers.`-1`
import typings.jimpCore.jimpCoreNumbers.`16`
import typings.jimpCore.jimpCoreNumbers.`1`
import typings.jimpCore.jimpCoreNumbers.`2`
import typings.jimpCore.jimpCoreNumbers.`32`
import typings.jimpCore.jimpCoreNumbers.`3`
import typings.jimpCore.jimpCoreNumbers.`4`
import typings.jimpCore.jimpCoreNumbers.`8`
import typings.node.Buffer
import typings.std.Error
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Jimp extends JimpConstructors {
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
  var HORIZONTAL_ALIGN_CENTER: `2` = js.native
  // Align modes for cover, contain, bit masks
  var HORIZONTAL_ALIGN_LEFT: `1` = js.native
  var HORIZONTAL_ALIGN_RIGHT: `4` = js.native
  var VERTICAL_ALIGN_BOTTOM: `32` = js.native
  var VERTICAL_ALIGN_MIDDLE: `16` = js.native
  var VERTICAL_ALIGN_TOP: `8` = js.native
  var _background: Double = js.native
  var _originalMime: String = js.native
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
  def background(hex: Double): this.type = js.native
  def background(hex: Double, cb: ImageCallback[this.type]): this.type = js.native
  def backgroundQuiet(hex: Double): this.type = js.native
  def backgroundQuiet(hex: Double, cb: ImageCallback[this.type]): this.type = js.native
  def clone(cb: ImageCallback[this.type]): this.type = js.native
  def cloneQuiet(): this.type = js.native
  def cloneQuiet(cb: ImageCallback[this.type]): this.type = js.native
  def colorDiff(rgba1: RGBA, rgba2: RGBA): Double = js.native
  def colorDiff(rgba1: RGB, rgba2: RGB): Double = js.native
  def compareHashes(hash1: String, hash2: String): Double = js.native
  // Effect methods
  def composite(src: Jimp, x: Double, y: Double): this.type = js.native
  def composite(src: Jimp, x: Double, y: Double, options: BlendMode): this.type = js.native
  def composite(src: Jimp, x: Double, y: Double, options: BlendMode, cb: ImageCallback[this.type]): this.type = js.native
  def create(data: Buffer): js.Promise[this.type] = js.native
  def create(image: Jimp): js.Promise[this.type] = js.native
  def create(path: String): js.Promise[this.type] = js.native
  def create(w: Double, h: Double): js.Promise[this.type] = js.native
  def create(w: Double, h: Double, background: String): js.Promise[this.type] = js.native
  def create(w: Double, h: Double, background: Double): js.Promise[this.type] = js.native
  def cssColorToHex(cssColor: String): Double = js.native
  def diff(img1: Jimp, img2: Jimp): DiffReturn[this.type] = js.native
  def diff(img1: Jimp, img2: Jimp, threshold: Double): DiffReturn[this.type] = js.native
  def distance(img1: Jimp, img2: Jimp): Double = js.native
  def distanceFromHash(hash: String): Double = js.native
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
  def hasAlpha(): Boolean = js.native
  def hash(): String = js.native
  def hash(base: js.UndefOr[scala.Nothing], cb: GenericCallback[String, _, this.type]): String = js.native
  def hash(base: Double): String = js.native
  def hash(base: Double, cb: GenericCallback[String, _, this.type]): String = js.native
  def hash(base: Null, cb: GenericCallback[String, _, this.type]): String = js.native
  def hash(cb: GenericCallback[String, _, this.type]): String = js.native
  def inspect(): String = js.native
  def intToRGBA(i: Double): RGBA = js.native
  def intToRGBA(i: Double, cb: GenericCallback[RGBA, _, _]): RGBA = js.native
  def limit255(n: Double): Double = js.native
  // Methods
  def on[T /* <: ListenableName */](event: T, cb: js.Function1[/* data */ ListenerData[T], _]): js.Any = js.native
  def parseBitmap(data: Buffer): Unit = js.native
  def parseBitmap(data: Buffer, path: js.UndefOr[scala.Nothing], cb: ImageCallback[this.type]): Unit = js.native
  def parseBitmap(data: Buffer, path: String): Unit = js.native
  def parseBitmap(data: Buffer, path: String, cb: ImageCallback[this.type]): Unit = js.native
  def parseBitmap(data: Buffer, path: Null, cb: ImageCallback[this.type]): Unit = js.native
  def read(data: Buffer): js.Promise[this.type] = js.native
  def read(data: Buffer, cb: ImageCallback[this.type]): js.Promise[this.type] = js.native
  def read(image: Jimp): js.Promise[this.type] = js.native
  def read(image: Jimp, cb: ImageCallback[this.type]): js.Promise[this.type] = js.native
  def read(path: String): js.Promise[this.type] = js.native
  def read(path: String, cb: ImageCallback[this.type]): js.Promise[this.type] = js.native
  def read(w: Double, h: Double): js.Promise[this.type] = js.native
  def read(w: Double, h: Double, background: String): js.Promise[this.type] = js.native
  def read(w: Double, h: Double, background: String, cb: ImageCallback[this.type]): js.Promise[this.type] = js.native
  def read(w: Double, h: Double, background: Double): js.Promise[this.type] = js.native
  def read(w: Double, h: Double, background: Double, cb: ImageCallback[this.type]): js.Promise[this.type] = js.native
  def rgba(bool: Boolean): this.type = js.native
  def rgba(bool: Boolean, cb: ImageCallback[this.type]): this.type = js.native
  def rgbaToInt(r: Double, g: Double, b: Double, a: Double, cb: GenericCallback[Double, _, this.type]): Double = js.native
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
    cb: ImageCallback[this.type]
  ): this.type = js.native
  def scanIterator(x: Double, y: Double, w: Double, h: Double): IterableIterator[ScanIteratorReturn[this.type]] = js.native
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
    cb: ImageCallback[this.type]
  ): this.type = js.native
  def setPixelColor(hex: Double, x: Double, y: Double): this.type = js.native
  def setPixelColor(hex: Double, x: Double, y: Double, cb: ImageCallback[this.type]): this.type = js.native
  def setPixelColour(hex: Double, x: Double, y: Double): this.type = js.native
  def setPixelColour(hex: Double, x: Double, y: Double, cb: ImageCallback[this.type]): this.type = js.native
  def write(path: String): this.type = js.native
  def write(path: String, cb: ImageCallback[this.type]): this.type = js.native
  def writeAsync(path: String): js.Promise[this.type] = js.native
}

