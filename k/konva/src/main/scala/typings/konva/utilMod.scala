package typings.konva

import org.scalablytyped.runtime.NumberDictionary
import typings.konva.anon.A
import typings.konva.anon.Rotation
import typings.konva.anon.X
import typings.konva.konvaNumbers.`-1`
import typings.konva.konvaNumbers.`0`
import typings.konva.konvaNumbers.`1`
import typings.konva.nodeMod.Node
import typings.konva.nodeMod.NodeConfig
import typings.konva.typesMod.IRect
import typings.konva.typesMod.RGB
import typings.konva.typesMod.RGBA
import typings.konva.typesMod.Vector2d
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("konva/types/Util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  
  @js.native
  class Collection[Child /* <: Node[NodeConfig] */] () extends /* index */ NumberDictionary[Child] {
    
    def each(f: js.Function2[/* child */ Child, /* index */ Double, Unit]): Unit = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[Iterator[Child, _, js.UndefOr[scala.Nothing]]] = js.native
    
    var length: Double = js.native
    
    def push(item: Child): Unit = js.native
    
    def splice(start: Double, length: Double): Unit = js.native
    def splice(start: Double, length: Double, replace: js.Any): Unit = js.native
    
    def toArray(): js.Array[Child] = js.native
    
    def unshift(item: Child): Unit = js.native
  }
  /* static members */
  @js.native
  object Collection extends js.Object {
    
    def _mapMethod(methodName: js.Any): Unit = js.native
    
    def mapMethods(constructor: js.Function): Unit = js.native
    
    def toCollection[ChildNode /* <: Node[NodeConfig] */](arr: js.Array[ChildNode]): Collection[ChildNode] = js.native
  }
  
  @js.native
  class Transform () extends js.Object {
    def this(m: js.Array[Double]) = this()
    
    def copy(): Transform = js.native
    
    def copyInto(tr: Transform): Unit = js.native
    
    def decompose(): Rotation = js.native
    
    var dirty: Boolean = js.native
    
    def getMatrix(): js.Array[Double] = js.native
    
    def getTranslation(): X = js.native
    
    def invert(): this.type = js.native
    
    var m: js.Array[Double] = js.native
    
    def multiply(matrix: Transform): this.type = js.native
    
    def point(point: Vector2d): X = js.native
    
    def reset(): Unit = js.native
    
    def rotate(rad: Double): this.type = js.native
    
    def scale(sx: Double, sy: Double): this.type = js.native
    
    def setAbsolutePosition(x: Double, y: Double): this.type = js.native
    
    def skew(sx: Double, sy: Double): this.type = js.native
    
    def translate(x: Double, y: Double): this.type = js.native
  }
  
  @js.native
  object Util extends js.Object {
    
    def _assign[T, U](target: T, source: U): T with U = js.native
    
    def _capitalize(str: String): String = js.native
    
    def _degToRad(deg: Double): Double = js.native
    
    def _expandPoints(p: js.Any, tension: js.Any): js.Array[_] = js.native
    
    def _getControlPoints(x0: js.Any, y0: js.Any, x1: js.Any, y1: js.Any, x2: js.Any, y2: js.Any, t: js.Any): js.Array[_] = js.native
    
    def _getFirstPointerId(evt: js.Any): js.Any = js.native
    
    def _getProjectionToLine(pt: Vector2d, line: js.Any, isClosed: js.Any): Vector2d = js.native
    
    def _getProjectionToSegment(x1: js.Any, y1: js.Any, x2: js.Any, y2: js.Any, x3: js.Any, y3: js.Any): js.Array[_] = js.native
    
    def _getRotation(radians: js.Any): js.Any = js.native
    
    def _hex3ColorToRGBA(str: String): RGBA = js.native
    
    def _hex6ColorToRGBA(str: String): RGBA = js.native
    
    def _hexToRgb(hex: String): RGB = js.native
    
    def _hslColorToRGBA(str: String): RGBA = js.native
    
    def _inRange(`val`: js.Any, left: js.Any, right: js.Any): Boolean = js.native
    
    def _isArray(obj: js.Any): /* is std.Array<any> */ Boolean = js.native
    
    def _isBoolean(obj: js.Any): /* is boolean */ Boolean = js.native
    
    def _isElement(obj: js.Any): /* is std.Element */ Boolean = js.native
    
    def _isFunction(obj: js.Any): Boolean = js.native
    
    def _isInDocument(el: js.Any): Boolean = js.native
    
    def _isNumber(obj: js.Any): /* is number */ Boolean = js.native
    
    def _isPlainObject(obj: js.Any): Boolean = js.native
    
    def _isString(obj: js.Any): /* is string */ Boolean = js.native
    
    def _namedColorToRBA(str: String): A = js.native
    
    def _prepareArrayForTween(startArray: js.Any, endArray: js.Any, isClosed: js.Any): js.Array[_] = js.native
    
    def _prepareToStringify(obj: js.Any): js.Any = js.native
    
    def _radToDeg(rad: Double): Double = js.native
    
    def _rgbColorToRGBA(str: String): RGBA = js.native
    
    def _rgbToHex(r: Double, g: Double, b: Double): String = js.native
    
    def _rgbaColorToRGBA(str: String): RGBA = js.native
    
    def _sign(number: Double): `1` | `0` | `-1` = js.native
    
    def _simplifyArray(arr: js.Array[_]): js.Array[_] = js.native
    
    def _urlToImage(url: String, callback: js.Function): Unit = js.native
    
    def cloneArray(arr: js.Array[_]): js.Array[_] = js.native
    
    def cloneObject[Any](obj: Any): Any = js.native
    
    def colorToRGBA(str: String): RGBA = js.native
    
    def createCanvasElement(): HTMLCanvasElement = js.native
    
    def createImageElement(): HTMLImageElement = js.native
    
    def each(obj: js.Any, func: js.Any): Unit = js.native
    
    def error(str: String): Unit = js.native
    
    def extend(child: js.Any, parent: js.Any): Unit = js.native
    
    def get(`val`: js.Any, `def`: js.Any): js.Any = js.native
    
    def getRGB(color: String): RGB = js.native
    
    def getRandomColor(): String = js.native
    
    def haveIntersection(r1: IRect, r2: IRect): Boolean = js.native
    
    def isObject(`val`: js.Any): /* is std.Object */ Boolean = js.native
    
    def isValidSelector(selector: js.Any): Boolean = js.native
    
    def requestAnimFrame(callback: js.Function): Unit = js.native
    
    def `throw`(str: String): scala.Nothing = js.native
    
    def warn(str: String): Unit = js.native
  }
}
