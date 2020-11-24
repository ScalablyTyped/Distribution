package typings.jimpCore.jimpMod

import typings.jimpCore.etcMod.Bitmap
import typings.jimpCore.etcMod.BlendMode
import typings.jimpCore.etcMod.GenericCallback
import typings.jimpCore.etcMod.ImageCallback
import typings.jimpCore.etcMod.ListenableName
import typings.jimpCore.etcMod.ListenerData
import typings.node.Buffer
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Jimp extends js.Object {
  
  var _background: Double = js.native
  
  var _originalMime: String = js.native
  
  var _rgba: Boolean = js.native
  
  def background(hex: Double): this.type = js.native
  def background(hex: Double, cb: ImageCallback[this.type]): this.type = js.native
  
  def backgroundQuiet(hex: Double): this.type = js.native
  def backgroundQuiet(hex: Double, cb: ImageCallback[this.type]): this.type = js.native
  
  // Properties
  var bitmap: Bitmap = js.native
  
  def clone(cb: ImageCallback[this.type]): this.type = js.native
  
  def cloneQuiet(): this.type = js.native
  def cloneQuiet(cb: ImageCallback[this.type]): this.type = js.native
  
  // Effect methods
  def composite(src: Jimp, x: Double, y: Double): this.type = js.native
  def composite(src: Jimp, x: Double, y: Double, options: js.UndefOr[scala.Nothing], cb: ImageCallback[this.type]): this.type = js.native
  def composite(src: Jimp, x: Double, y: Double, options: BlendMode): this.type = js.native
  def composite(src: Jimp, x: Double, y: Double, options: BlendMode, cb: ImageCallback[this.type]): this.type = js.native
  
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
  
  // Methods
  def on[T /* <: ListenableName */](event: T, cb: js.Function1[/* data */ ListenerData[T], _]): js.Any = js.native
  
  def parseBitmap(data: Buffer): Unit = js.native
  def parseBitmap(data: Buffer, path: js.UndefOr[scala.Nothing], cb: ImageCallback[this.type]): Unit = js.native
  def parseBitmap(data: Buffer, path: String): Unit = js.native
  def parseBitmap(data: Buffer, path: String, cb: ImageCallback[this.type]): Unit = js.native
  def parseBitmap(data: Buffer, path: Null, cb: ImageCallback[this.type]): Unit = js.native
  
  def rgba(bool: Boolean): this.type = js.native
  def rgba(bool: Boolean, cb: ImageCallback[this.type]): this.type = js.native
  
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
