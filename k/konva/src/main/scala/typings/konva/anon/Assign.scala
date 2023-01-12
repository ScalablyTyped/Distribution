package typings.konva.anon

import typings.konva.konvaInts.`-1`
import typings.konva.konvaInts.`1`
import typings.konva.libTypesMod.IRect
import typings.konva.libTypesMod.RGB
import typings.konva.libTypesMod.RGBA
import typings.konva.libTypesMod.Vector2d
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Assign extends StObject {
  
  def _assign[T, U](target: T, source: U): T & U
  
  def _capitalize(str: String): String
  
  def _degToRad(deg: Double): Double
  
  def _getFirstPointerId(evt: Any): Any
  
  def _getProjectionToLine(pt: Vector2d, line: Any, isClosed: Any): Vector2d
  
  def _getProjectionToSegment(x1: Any, y1: Any, x2: Any, y2: Any, x3: Any, y3: Any): js.Array[Any]
  
  def _getRotation(radians: Any): Any
  
  def _hex3ColorToRGBA(str: String): RGBA
  
  def _hex6ColorToRGBA(str: String): RGBA
  
  def _hexToRgb(hex: String): RGB
  
  def _hslColorToRGBA(str: String): RGBA
  
  def _inRange(`val`: Any, left: Any, right: Any): Boolean
  
  def _isArray(obj: Any): /* is std.Array<any> */ Boolean
  
  def _isBoolean(obj: Any): /* is boolean */ Boolean
  
  def _isElement(obj: Any): /* is std.Element */ Boolean
  
  def _isFunction(obj: Any): Boolean
  
  def _isInDocument(el: Any): Boolean
  
  def _isNumber(obj: Any): /* is number */ Boolean
  
  def _isPlainObject(obj: Any): Boolean
  
  def _isString(obj: Any): /* is string */ Boolean
  
  def _namedColorToRBA(str: String): A
  
  def _prepareArrayForTween(startArray: Any, endArray: Any, isClosed: Any): js.Array[Any]
  
  def _prepareToStringify(obj: Any): Any
  
  def _radToDeg(rad: Double): Double
  
  def _rgbColorToRGBA(str: String): RGBA
  
  def _rgbToHex(r: Double, g: Double, b: Double): String
  
  def _rgbaColorToRGBA(str: String): RGBA
  
  def _sign(number: Double): `1` | `-1`
  
  def _urlToImage(url: String, callback: js.Function): Unit
  
  def cloneArray(arr: js.Array[Any]): js.Array[Any]
  
  def cloneObject[Any](obj: Any): Any
  
  def colorToRGBA(str: String): RGBA
  
  def createCanvasElement(): HTMLCanvasElement
  
  def createImageElement(): HTMLImageElement
  
  def degToRad(deg: Double): Double
  
  def each(obj: Any, func: Any): Unit
  
  def error(str: String): Unit
  
  def getRGB(color: String): RGB
  
  def getRandomColor(): String
  
  def haveIntersection(r1: IRect, r2: IRect): Boolean
  
  def isObject(`val`: Any): /* is std.Object */ Boolean
  
  def isValidSelector(selector: Any): Boolean
  
  def radToDeg(rad: Double): Double
  
  def releaseCanvas(canvases: HTMLCanvasElement*): Unit
  
  def requestAnimFrame(callback: js.Function): Unit
  
  def `throw`(str: String): scala.Nothing
  
  def warn(str: String): Unit
}
object Assign {
  
  inline def apply(
    _assign: (Any, Any) => Any & Any,
    _capitalize: String => String,
    _degToRad: Double => Double,
    _getFirstPointerId: Any => Any,
    _getProjectionToLine: (Vector2d, Any, Any) => Vector2d,
    _getProjectionToSegment: (Any, Any, Any, Any, Any, Any) => js.Array[Any],
    _getRotation: Any => Any,
    _hex3ColorToRGBA: String => RGBA,
    _hex6ColorToRGBA: String => RGBA,
    _hexToRgb: String => RGB,
    _hslColorToRGBA: String => RGBA,
    _inRange: (Any, Any, Any) => Boolean,
    _isArray: Any => /* is std.Array<any> */ Boolean,
    _isBoolean: Any => /* is boolean */ Boolean,
    _isElement: Any => /* is std.Element */ Boolean,
    _isFunction: Any => Boolean,
    _isInDocument: Any => Boolean,
    _isNumber: Any => /* is number */ Boolean,
    _isPlainObject: Any => Boolean,
    _isString: Any => /* is string */ Boolean,
    _namedColorToRBA: String => A,
    _prepareArrayForTween: (Any, Any, Any) => js.Array[Any],
    _prepareToStringify: Any => Any,
    _radToDeg: Double => Double,
    _rgbColorToRGBA: String => RGBA,
    _rgbToHex: (Double, Double, Double) => String,
    _rgbaColorToRGBA: String => RGBA,
    _sign: Double => `1` | `-1`,
    _urlToImage: (String, js.Function) => Unit,
    cloneArray: js.Array[Any] => js.Array[Any],
    cloneObject: Any => Any,
    colorToRGBA: String => RGBA,
    createCanvasElement: () => HTMLCanvasElement,
    createImageElement: () => HTMLImageElement,
    degToRad: Double => Double,
    each: (Any, Any) => Unit,
    error: String => Unit,
    getRGB: String => RGB,
    getRandomColor: () => String,
    haveIntersection: (IRect, IRect) => Boolean,
    isObject: Any => /* is std.Object */ Boolean,
    isValidSelector: Any => Boolean,
    radToDeg: Double => Double,
    releaseCanvas: /* repeated */ HTMLCanvasElement => Unit,
    requestAnimFrame: js.Function => Unit,
    `throw`: String => scala.Nothing,
    warn: String => Unit
  ): Assign = {
    val __obj = js.Dynamic.literal(_assign = js.Any.fromFunction2(_assign), _capitalize = js.Any.fromFunction1(_capitalize), _degToRad = js.Any.fromFunction1(_degToRad), _getFirstPointerId = js.Any.fromFunction1(_getFirstPointerId), _getProjectionToLine = js.Any.fromFunction3(_getProjectionToLine), _getProjectionToSegment = js.Any.fromFunction6(_getProjectionToSegment), _getRotation = js.Any.fromFunction1(_getRotation), _hex3ColorToRGBA = js.Any.fromFunction1(_hex3ColorToRGBA), _hex6ColorToRGBA = js.Any.fromFunction1(_hex6ColorToRGBA), _hexToRgb = js.Any.fromFunction1(_hexToRgb), _hslColorToRGBA = js.Any.fromFunction1(_hslColorToRGBA), _inRange = js.Any.fromFunction3(_inRange), _isArray = js.Any.fromFunction1(_isArray), _isBoolean = js.Any.fromFunction1(_isBoolean), _isElement = js.Any.fromFunction1(_isElement), _isFunction = js.Any.fromFunction1(_isFunction), _isInDocument = js.Any.fromFunction1(_isInDocument), _isNumber = js.Any.fromFunction1(_isNumber), _isPlainObject = js.Any.fromFunction1(_isPlainObject), _isString = js.Any.fromFunction1(_isString), _namedColorToRBA = js.Any.fromFunction1(_namedColorToRBA), _prepareArrayForTween = js.Any.fromFunction3(_prepareArrayForTween), _prepareToStringify = js.Any.fromFunction1(_prepareToStringify), _radToDeg = js.Any.fromFunction1(_radToDeg), _rgbColorToRGBA = js.Any.fromFunction1(_rgbColorToRGBA), _rgbToHex = js.Any.fromFunction3(_rgbToHex), _rgbaColorToRGBA = js.Any.fromFunction1(_rgbaColorToRGBA), _sign = js.Any.fromFunction1(_sign), _urlToImage = js.Any.fromFunction2(_urlToImage), cloneArray = js.Any.fromFunction1(cloneArray), cloneObject = js.Any.fromFunction1(cloneObject), colorToRGBA = js.Any.fromFunction1(colorToRGBA), createCanvasElement = js.Any.fromFunction0(createCanvasElement), createImageElement = js.Any.fromFunction0(createImageElement), degToRad = js.Any.fromFunction1(degToRad), each = js.Any.fromFunction2(each), error = js.Any.fromFunction1(error), getRGB = js.Any.fromFunction1(getRGB), getRandomColor = js.Any.fromFunction0(getRandomColor), haveIntersection = js.Any.fromFunction2(haveIntersection), isObject = js.Any.fromFunction1(isObject), isValidSelector = js.Any.fromFunction1(isValidSelector), radToDeg = js.Any.fromFunction1(radToDeg), releaseCanvas = js.Any.fromFunction1(releaseCanvas), requestAnimFrame = js.Any.fromFunction1(requestAnimFrame), warn = js.Any.fromFunction1(warn))
    __obj.updateDynamic("throw")(js.Any.fromFunction1(`throw`))
    __obj.asInstanceOf[Assign]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Assign] (val x: Self) extends AnyVal {
    
    inline def setCloneArray(value: js.Array[Any] => js.Array[Any]): Self = StObject.set(x, "cloneArray", js.Any.fromFunction1(value))
    
    inline def setCloneObject(value: Any => Any): Self = StObject.set(x, "cloneObject", js.Any.fromFunction1(value))
    
    inline def setColorToRGBA(value: String => RGBA): Self = StObject.set(x, "colorToRGBA", js.Any.fromFunction1(value))
    
    inline def setCreateCanvasElement(value: () => HTMLCanvasElement): Self = StObject.set(x, "createCanvasElement", js.Any.fromFunction0(value))
    
    inline def setCreateImageElement(value: () => HTMLImageElement): Self = StObject.set(x, "createImageElement", js.Any.fromFunction0(value))
    
    inline def setDegToRad(value: Double => Double): Self = StObject.set(x, "degToRad", js.Any.fromFunction1(value))
    
    inline def setEach(value: (Any, Any) => Unit): Self = StObject.set(x, "each", js.Any.fromFunction2(value))
    
    inline def setError(value: String => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setGetRGB(value: String => RGB): Self = StObject.set(x, "getRGB", js.Any.fromFunction1(value))
    
    inline def setGetRandomColor(value: () => String): Self = StObject.set(x, "getRandomColor", js.Any.fromFunction0(value))
    
    inline def setHaveIntersection(value: (IRect, IRect) => Boolean): Self = StObject.set(x, "haveIntersection", js.Any.fromFunction2(value))
    
    inline def setIsObject(value: Any => /* is std.Object */ Boolean): Self = StObject.set(x, "isObject", js.Any.fromFunction1(value))
    
    inline def setIsValidSelector(value: Any => Boolean): Self = StObject.set(x, "isValidSelector", js.Any.fromFunction1(value))
    
    inline def setRadToDeg(value: Double => Double): Self = StObject.set(x, "radToDeg", js.Any.fromFunction1(value))
    
    inline def setReleaseCanvas(value: /* repeated */ HTMLCanvasElement => Unit): Self = StObject.set(x, "releaseCanvas", js.Any.fromFunction1(value))
    
    inline def setRequestAnimFrame(value: js.Function => Unit): Self = StObject.set(x, "requestAnimFrame", js.Any.fromFunction1(value))
    
    inline def setThrow(value: String => scala.Nothing): Self = StObject.set(x, "throw", js.Any.fromFunction1(value))
    
    inline def setWarn(value: String => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
    
    inline def set_assign(value: (Any, Any) => Any & Any): Self = StObject.set(x, "_assign", js.Any.fromFunction2(value))
    
    inline def set_capitalize(value: String => String): Self = StObject.set(x, "_capitalize", js.Any.fromFunction1(value))
    
    inline def set_degToRad(value: Double => Double): Self = StObject.set(x, "_degToRad", js.Any.fromFunction1(value))
    
    inline def set_getFirstPointerId(value: Any => Any): Self = StObject.set(x, "_getFirstPointerId", js.Any.fromFunction1(value))
    
    inline def set_getProjectionToLine(value: (Vector2d, Any, Any) => Vector2d): Self = StObject.set(x, "_getProjectionToLine", js.Any.fromFunction3(value))
    
    inline def set_getProjectionToSegment(value: (Any, Any, Any, Any, Any, Any) => js.Array[Any]): Self = StObject.set(x, "_getProjectionToSegment", js.Any.fromFunction6(value))
    
    inline def set_getRotation(value: Any => Any): Self = StObject.set(x, "_getRotation", js.Any.fromFunction1(value))
    
    inline def set_hex3ColorToRGBA(value: String => RGBA): Self = StObject.set(x, "_hex3ColorToRGBA", js.Any.fromFunction1(value))
    
    inline def set_hex6ColorToRGBA(value: String => RGBA): Self = StObject.set(x, "_hex6ColorToRGBA", js.Any.fromFunction1(value))
    
    inline def set_hexToRgb(value: String => RGB): Self = StObject.set(x, "_hexToRgb", js.Any.fromFunction1(value))
    
    inline def set_hslColorToRGBA(value: String => RGBA): Self = StObject.set(x, "_hslColorToRGBA", js.Any.fromFunction1(value))
    
    inline def set_inRange(value: (Any, Any, Any) => Boolean): Self = StObject.set(x, "_inRange", js.Any.fromFunction3(value))
    
    inline def set_isArray(value: Any => /* is std.Array<any> */ Boolean): Self = StObject.set(x, "_isArray", js.Any.fromFunction1(value))
    
    inline def set_isBoolean(value: Any => /* is boolean */ Boolean): Self = StObject.set(x, "_isBoolean", js.Any.fromFunction1(value))
    
    inline def set_isElement(value: Any => /* is std.Element */ Boolean): Self = StObject.set(x, "_isElement", js.Any.fromFunction1(value))
    
    inline def set_isFunction(value: Any => Boolean): Self = StObject.set(x, "_isFunction", js.Any.fromFunction1(value))
    
    inline def set_isInDocument(value: Any => Boolean): Self = StObject.set(x, "_isInDocument", js.Any.fromFunction1(value))
    
    inline def set_isNumber(value: Any => /* is number */ Boolean): Self = StObject.set(x, "_isNumber", js.Any.fromFunction1(value))
    
    inline def set_isPlainObject(value: Any => Boolean): Self = StObject.set(x, "_isPlainObject", js.Any.fromFunction1(value))
    
    inline def set_isString(value: Any => /* is string */ Boolean): Self = StObject.set(x, "_isString", js.Any.fromFunction1(value))
    
    inline def set_namedColorToRBA(value: String => A): Self = StObject.set(x, "_namedColorToRBA", js.Any.fromFunction1(value))
    
    inline def set_prepareArrayForTween(value: (Any, Any, Any) => js.Array[Any]): Self = StObject.set(x, "_prepareArrayForTween", js.Any.fromFunction3(value))
    
    inline def set_prepareToStringify(value: Any => Any): Self = StObject.set(x, "_prepareToStringify", js.Any.fromFunction1(value))
    
    inline def set_radToDeg(value: Double => Double): Self = StObject.set(x, "_radToDeg", js.Any.fromFunction1(value))
    
    inline def set_rgbColorToRGBA(value: String => RGBA): Self = StObject.set(x, "_rgbColorToRGBA", js.Any.fromFunction1(value))
    
    inline def set_rgbToHex(value: (Double, Double, Double) => String): Self = StObject.set(x, "_rgbToHex", js.Any.fromFunction3(value))
    
    inline def set_rgbaColorToRGBA(value: String => RGBA): Self = StObject.set(x, "_rgbaColorToRGBA", js.Any.fromFunction1(value))
    
    inline def set_sign(value: Double => `1` | `-1`): Self = StObject.set(x, "_sign", js.Any.fromFunction1(value))
    
    inline def set_urlToImage(value: (String, js.Function) => Unit): Self = StObject.set(x, "_urlToImage", js.Any.fromFunction2(value))
  }
}
