package typings.konva.anon

import typings.konva.konvaInts.`-1`
import typings.konva.konvaInts.`1`
import typings.konva.libContextMod.Context
import typings.konva.libTypesMod.IRect
import typings.konva.libTypesMod.RGB
import typings.konva.libTypesMod.RGBA
import typings.konva.libTypesMod.Vector2d
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Assign extends StObject {
  
  def _assign[T, U](target: T, source: U): T & U = js.native
  
  def _capitalize(str: String): String = js.native
  
  def _degToRad(deg: Double): Double = js.native
  
  def _getFirstPointerId(evt: Any): Any = js.native
  
  def _getProjectionToLine(pt: Vector2d, line: Any, isClosed: Any): Vector2d = js.native
  
  def _getProjectionToSegment(x1: Any, y1: Any, x2: Any, y2: Any, x3: Any, y3: Any): js.Array[Any] = js.native
  
  def _getRotation(radians: Any): Any = js.native
  
  def _hex3ColorToRGBA(str: String): RGBA = js.native
  
  def _hex4ColorToRGBA(str: String): RGBA = js.native
  
  def _hex6ColorToRGBA(str: String): RGBA = js.native
  
  def _hex8ColorToRGBA(str: String): RGBA = js.native
  
  def _hexToRgb(hex: String): RGB = js.native
  
  def _hslColorToRGBA(str: String): RGBA = js.native
  
  def _inRange(`val`: Any, left: Any, right: Any): Boolean = js.native
  
  def _isArray(obj: Any): /* is std.Array<any> */ Boolean = js.native
  
  def _isBoolean(obj: Any): /* is boolean */ Boolean = js.native
  
  def _isElement(obj: Any): /* is std.Element */ Boolean = js.native
  
  def _isFunction(obj: Any): Boolean = js.native
  
  def _isInDocument(el: Any): Boolean = js.native
  
  def _isNumber(obj: Any): /* is number */ Boolean = js.native
  
  def _isPlainObject(obj: Any): Boolean = js.native
  
  def _isString(obj: Any): /* is string */ Boolean = js.native
  
  def _namedColorToRBA(str: String): A = js.native
  
  def _prepareArrayForTween(startArray: Any, endArray: Any, isClosed: Any): js.Array[Any] = js.native
  
  def _prepareToStringify(obj: Any): Any = js.native
  
  def _radToDeg(rad: Double): Double = js.native
  
  def _rgbColorToRGBA(str: String): RGBA = js.native
  
  def _rgbToHex(r: Double, g: Double, b: Double): String = js.native
  
  def _rgbaColorToRGBA(str: String): RGBA = js.native
  
  def _sign(number: Double): `1` | `-1` = js.native
  
  def _urlToImage(url: String, callback: js.Function): Unit = js.native
  
  def cloneArray(arr: js.Array[Any]): js.Array[Any] = js.native
  
  def cloneObject[Any](obj: Any): Any = js.native
  
  def colorToRGBA(str: String): RGBA = js.native
  
  def createCanvasElement(): HTMLCanvasElement = js.native
  
  def createImageElement(): HTMLImageElement = js.native
  
  def degToRad(deg: Double): Double = js.native
  
  def drawRoundedRectPath(context: Context, width: Double, height: Double, cornerRadius: js.Array[Double]): Unit = js.native
  def drawRoundedRectPath(context: Context, width: Double, height: Double, cornerRadius: Double): Unit = js.native
  
  def each(obj: Any, func: Any): Unit = js.native
  
  def error(str: String): Unit = js.native
  
  def getRGB(color: String): RGB = js.native
  
  def getRandomColor(): String = js.native
  
  def haveIntersection(r1: IRect, r2: IRect): Boolean = js.native
  
  def isObject(`val`: Any): /* is std.Object */ Boolean = js.native
  
  def isValidSelector(selector: Any): Boolean = js.native
  
  def radToDeg(rad: Double): Double = js.native
  
  def releaseCanvas(canvases: HTMLCanvasElement*): Unit = js.native
  
  def requestAnimFrame(callback: js.Function): Unit = js.native
  
  def `throw`(str: String): scala.Nothing = js.native
  
  def warn(str: String): Unit = js.native
}
