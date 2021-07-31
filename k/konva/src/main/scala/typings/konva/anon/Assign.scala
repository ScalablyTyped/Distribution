package typings.konva.anon

import typings.konva.konvaNumbers.`-1`
import typings.konva.konvaNumbers.`0`
import typings.konva.konvaNumbers.`1`
import typings.konva.typesMod.IRect
import typings.konva.typesMod.RGB
import typings.konva.typesMod.RGBA
import typings.konva.typesMod.Vector2d
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Assign extends StObject {
  
  def _assign[T, U](target: T, source: U): T & U
  
  def _capitalize(str: String): String
  
  def _degToRad(deg: Double): Double
  
  def _expandPoints(p: js.Any, tension: js.Any): js.Array[js.Any]
  
  def _getControlPoints(x0: js.Any, y0: js.Any, x1: js.Any, y1: js.Any, x2: js.Any, y2: js.Any, t: js.Any): js.Array[js.Any]
  
  def _getFirstPointerId(evt: js.Any): js.Any
  
  def _getProjectionToLine(pt: Vector2d, line: js.Any, isClosed: js.Any): Vector2d
  
  def _getProjectionToSegment(x1: js.Any, y1: js.Any, x2: js.Any, y2: js.Any, x3: js.Any, y3: js.Any): js.Array[js.Any]
  
  def _getRotation(radians: js.Any): js.Any
  
  def _hex3ColorToRGBA(str: String): RGBA
  
  def _hex6ColorToRGBA(str: String): RGBA
  
  def _hexToRgb(hex: String): RGB
  
  def _hslColorToRGBA(str: String): RGBA
  
  def _inRange(`val`: js.Any, left: js.Any, right: js.Any): Boolean
  
  def _isArray(obj: js.Any): /* is std.Array<any> */ Boolean
  
  def _isBoolean(obj: js.Any): /* is boolean */ Boolean
  
  def _isElement(obj: js.Any): /* is std.Element */ Boolean
  
  def _isFunction(obj: js.Any): Boolean
  
  def _isInDocument(el: js.Any): Boolean
  
  def _isNumber(obj: js.Any): /* is number */ Boolean
  
  def _isPlainObject(obj: js.Any): Boolean
  
  def _isString(obj: js.Any): /* is string */ Boolean
  
  def _namedColorToRBA(str: String): A
  
  def _prepareArrayForTween(startArray: js.Any, endArray: js.Any, isClosed: js.Any): js.Array[js.Any]
  
  def _prepareToStringify(obj: js.Any): js.Any
  
  def _radToDeg(rad: Double): Double
  
  def _rgbColorToRGBA(str: String): RGBA
  
  def _rgbToHex(r: Double, g: Double, b: Double): String
  
  def _rgbaColorToRGBA(str: String): RGBA
  
  def _sign(number: Double): `1` | `0` | `-1`
  
  def _simplifyArray(arr: js.Array[js.Any]): js.Array[js.Any]
  
  def _urlToImage(url: String, callback: js.Function): Unit
  
  def cloneArray(arr: js.Array[js.Any]): js.Array[js.Any]
  
  def cloneObject[Any](obj: Any): Any
  
  def colorToRGBA(str: String): RGBA
  
  def createCanvasElement(): HTMLCanvasElement
  
  def createImageElement(): HTMLImageElement
  
  def each(obj: js.Any, func: js.Any): Unit
  
  def error(str: String): Unit
  
  def extend(child: js.Any, parent: js.Any): Unit
  
  def get(`val`: js.Any, `def`: js.Any): js.Any
  
  def getRGB(color: String): RGB
  
  def getRandomColor(): String
  
  def haveIntersection(r1: IRect, r2: IRect): Boolean
  
  def isObject(`val`: js.Any): /* is std.Object */ Boolean
  
  def isValidSelector(selector: js.Any): Boolean
  
  def requestAnimFrame(callback: js.Function): Unit
  
  def `throw`(str: String): scala.Nothing
  
  def warn(str: String): Unit
}
object Assign {
  
  @scala.inline
  def apply(
    _assign: (js.Any, js.Any) => js.Any & js.Any,
    _capitalize: String => String,
    _degToRad: Double => Double,
    _expandPoints: (js.Any, js.Any) => js.Array[js.Any],
    _getControlPoints: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Array[js.Any],
    _getFirstPointerId: js.Any => js.Any,
    _getProjectionToLine: (Vector2d, js.Any, js.Any) => Vector2d,
    _getProjectionToSegment: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Array[js.Any],
    _getRotation: js.Any => js.Any,
    _hex3ColorToRGBA: String => RGBA,
    _hex6ColorToRGBA: String => RGBA,
    _hexToRgb: String => RGB,
    _hslColorToRGBA: String => RGBA,
    _inRange: (js.Any, js.Any, js.Any) => Boolean,
    _isArray: js.Any => /* is std.Array<any> */ Boolean,
    _isBoolean: js.Any => /* is boolean */ Boolean,
    _isElement: js.Any => /* is std.Element */ Boolean,
    _isFunction: js.Any => Boolean,
    _isInDocument: js.Any => Boolean,
    _isNumber: js.Any => /* is number */ Boolean,
    _isPlainObject: js.Any => Boolean,
    _isString: js.Any => /* is string */ Boolean,
    _namedColorToRBA: String => A,
    _prepareArrayForTween: (js.Any, js.Any, js.Any) => js.Array[js.Any],
    _prepareToStringify: js.Any => js.Any,
    _radToDeg: Double => Double,
    _rgbColorToRGBA: String => RGBA,
    _rgbToHex: (Double, Double, Double) => String,
    _rgbaColorToRGBA: String => RGBA,
    _sign: Double => `1` | `0` | `-1`,
    _simplifyArray: js.Array[js.Any] => js.Array[js.Any],
    _urlToImage: (String, js.Function) => Unit,
    cloneArray: js.Array[js.Any] => js.Array[js.Any],
    cloneObject: js.Any => js.Any,
    colorToRGBA: String => RGBA,
    createCanvasElement: () => HTMLCanvasElement,
    createImageElement: () => HTMLImageElement,
    each: (js.Any, js.Any) => Unit,
    error: String => Unit,
    extend: (js.Any, js.Any) => Unit,
    get: (js.Any, js.Any) => js.Any,
    getRGB: String => RGB,
    getRandomColor: () => String,
    haveIntersection: (IRect, IRect) => Boolean,
    isObject: js.Any => /* is std.Object */ Boolean,
    isValidSelector: js.Any => Boolean,
    requestAnimFrame: js.Function => Unit,
    `throw`: String => scala.Nothing,
    warn: String => Unit
  ): Assign = {
    val __obj = js.Dynamic.literal(_assign = js.Any.fromFunction2(_assign), _capitalize = js.Any.fromFunction1(_capitalize), _degToRad = js.Any.fromFunction1(_degToRad), _expandPoints = js.Any.fromFunction2(_expandPoints), _getControlPoints = js.Any.fromFunction7(_getControlPoints), _getFirstPointerId = js.Any.fromFunction1(_getFirstPointerId), _getProjectionToLine = js.Any.fromFunction3(_getProjectionToLine), _getProjectionToSegment = js.Any.fromFunction6(_getProjectionToSegment), _getRotation = js.Any.fromFunction1(_getRotation), _hex3ColorToRGBA = js.Any.fromFunction1(_hex3ColorToRGBA), _hex6ColorToRGBA = js.Any.fromFunction1(_hex6ColorToRGBA), _hexToRgb = js.Any.fromFunction1(_hexToRgb), _hslColorToRGBA = js.Any.fromFunction1(_hslColorToRGBA), _inRange = js.Any.fromFunction3(_inRange), _isArray = js.Any.fromFunction1(_isArray), _isBoolean = js.Any.fromFunction1(_isBoolean), _isElement = js.Any.fromFunction1(_isElement), _isFunction = js.Any.fromFunction1(_isFunction), _isInDocument = js.Any.fromFunction1(_isInDocument), _isNumber = js.Any.fromFunction1(_isNumber), _isPlainObject = js.Any.fromFunction1(_isPlainObject), _isString = js.Any.fromFunction1(_isString), _namedColorToRBA = js.Any.fromFunction1(_namedColorToRBA), _prepareArrayForTween = js.Any.fromFunction3(_prepareArrayForTween), _prepareToStringify = js.Any.fromFunction1(_prepareToStringify), _radToDeg = js.Any.fromFunction1(_radToDeg), _rgbColorToRGBA = js.Any.fromFunction1(_rgbColorToRGBA), _rgbToHex = js.Any.fromFunction3(_rgbToHex), _rgbaColorToRGBA = js.Any.fromFunction1(_rgbaColorToRGBA), _sign = js.Any.fromFunction1(_sign), _simplifyArray = js.Any.fromFunction1(_simplifyArray), _urlToImage = js.Any.fromFunction2(_urlToImage), cloneArray = js.Any.fromFunction1(cloneArray), cloneObject = js.Any.fromFunction1(cloneObject), colorToRGBA = js.Any.fromFunction1(colorToRGBA), createCanvasElement = js.Any.fromFunction0(createCanvasElement), createImageElement = js.Any.fromFunction0(createImageElement), each = js.Any.fromFunction2(each), error = js.Any.fromFunction1(error), extend = js.Any.fromFunction2(extend), get = js.Any.fromFunction2(get), getRGB = js.Any.fromFunction1(getRGB), getRandomColor = js.Any.fromFunction0(getRandomColor), haveIntersection = js.Any.fromFunction2(haveIntersection), isObject = js.Any.fromFunction1(isObject), isValidSelector = js.Any.fromFunction1(isValidSelector), requestAnimFrame = js.Any.fromFunction1(requestAnimFrame), warn = js.Any.fromFunction1(warn))
    __obj.updateDynamic("throw")(js.Any.fromFunction1(`throw`))
    __obj.asInstanceOf[Assign]
  }
  
  @scala.inline
  implicit class AssignMutableBuilder[Self <: Assign] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloneArray(value: js.Array[js.Any] => js.Array[js.Any]): Self = StObject.set(x, "cloneArray", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCloneObject(value: js.Any => js.Any): Self = StObject.set(x, "cloneObject", js.Any.fromFunction1(value))
    
    @scala.inline
    def setColorToRGBA(value: String => RGBA): Self = StObject.set(x, "colorToRGBA", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateCanvasElement(value: () => HTMLCanvasElement): Self = StObject.set(x, "createCanvasElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateImageElement(value: () => HTMLImageElement): Self = StObject.set(x, "createImageElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEach(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "each", js.Any.fromFunction2(value))
    
    @scala.inline
    def setError(value: String => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExtend(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "extend", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGet(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetRGB(value: String => RGB): Self = StObject.set(x, "getRGB", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetRandomColor(value: () => String): Self = StObject.set(x, "getRandomColor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHaveIntersection(value: (IRect, IRect) => Boolean): Self = StObject.set(x, "haveIntersection", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIsObject(value: js.Any => /* is std.Object */ Boolean): Self = StObject.set(x, "isObject", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsValidSelector(value: js.Any => Boolean): Self = StObject.set(x, "isValidSelector", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequestAnimFrame(value: js.Function => Unit): Self = StObject.set(x, "requestAnimFrame", js.Any.fromFunction1(value))
    
    @scala.inline
    def setThrow(value: String => scala.Nothing): Self = StObject.set(x, "throw", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWarn(value: String => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_assign(value: (js.Any, js.Any) => js.Any & js.Any): Self = StObject.set(x, "_assign", js.Any.fromFunction2(value))
    
    @scala.inline
    def set_capitalize(value: String => String): Self = StObject.set(x, "_capitalize", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_degToRad(value: Double => Double): Self = StObject.set(x, "_degToRad", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_expandPoints(value: (js.Any, js.Any) => js.Array[js.Any]): Self = StObject.set(x, "_expandPoints", js.Any.fromFunction2(value))
    
    @scala.inline
    def set_getControlPoints(value: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Array[js.Any]): Self = StObject.set(x, "_getControlPoints", js.Any.fromFunction7(value))
    
    @scala.inline
    def set_getFirstPointerId(value: js.Any => js.Any): Self = StObject.set(x, "_getFirstPointerId", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_getProjectionToLine(value: (Vector2d, js.Any, js.Any) => Vector2d): Self = StObject.set(x, "_getProjectionToLine", js.Any.fromFunction3(value))
    
    @scala.inline
    def set_getProjectionToSegment(value: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Array[js.Any]): Self = StObject.set(x, "_getProjectionToSegment", js.Any.fromFunction6(value))
    
    @scala.inline
    def set_getRotation(value: js.Any => js.Any): Self = StObject.set(x, "_getRotation", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_hex3ColorToRGBA(value: String => RGBA): Self = StObject.set(x, "_hex3ColorToRGBA", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_hex6ColorToRGBA(value: String => RGBA): Self = StObject.set(x, "_hex6ColorToRGBA", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_hexToRgb(value: String => RGB): Self = StObject.set(x, "_hexToRgb", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_hslColorToRGBA(value: String => RGBA): Self = StObject.set(x, "_hslColorToRGBA", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_inRange(value: (js.Any, js.Any, js.Any) => Boolean): Self = StObject.set(x, "_inRange", js.Any.fromFunction3(value))
    
    @scala.inline
    def set_isArray(value: js.Any => /* is std.Array<any> */ Boolean): Self = StObject.set(x, "_isArray", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_isBoolean(value: js.Any => /* is boolean */ Boolean): Self = StObject.set(x, "_isBoolean", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_isElement(value: js.Any => /* is std.Element */ Boolean): Self = StObject.set(x, "_isElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_isFunction(value: js.Any => Boolean): Self = StObject.set(x, "_isFunction", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_isInDocument(value: js.Any => Boolean): Self = StObject.set(x, "_isInDocument", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_isNumber(value: js.Any => /* is number */ Boolean): Self = StObject.set(x, "_isNumber", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_isPlainObject(value: js.Any => Boolean): Self = StObject.set(x, "_isPlainObject", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_isString(value: js.Any => /* is string */ Boolean): Self = StObject.set(x, "_isString", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_namedColorToRBA(value: String => A): Self = StObject.set(x, "_namedColorToRBA", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_prepareArrayForTween(value: (js.Any, js.Any, js.Any) => js.Array[js.Any]): Self = StObject.set(x, "_prepareArrayForTween", js.Any.fromFunction3(value))
    
    @scala.inline
    def set_prepareToStringify(value: js.Any => js.Any): Self = StObject.set(x, "_prepareToStringify", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_radToDeg(value: Double => Double): Self = StObject.set(x, "_radToDeg", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_rgbColorToRGBA(value: String => RGBA): Self = StObject.set(x, "_rgbColorToRGBA", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_rgbToHex(value: (Double, Double, Double) => String): Self = StObject.set(x, "_rgbToHex", js.Any.fromFunction3(value))
    
    @scala.inline
    def set_rgbaColorToRGBA(value: String => RGBA): Self = StObject.set(x, "_rgbaColorToRGBA", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_sign(value: Double => `1` | `0` | `-1`): Self = StObject.set(x, "_sign", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_simplifyArray(value: js.Array[js.Any] => js.Array[js.Any]): Self = StObject.set(x, "_simplifyArray", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_urlToImage(value: (String, js.Function) => Unit): Self = StObject.set(x, "_urlToImage", js.Any.fromFunction2(value))
  }
}
