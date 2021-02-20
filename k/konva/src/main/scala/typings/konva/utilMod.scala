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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("konva/types/Util", "Collection")
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
  object Collection {
    
    @JSImport("konva/types/Util", "Collection._mapMethod")
    @js.native
    def _mapMethod(methodName: js.Any): Unit = js.native
    
    @JSImport("konva/types/Util", "Collection.mapMethods")
    @js.native
    def mapMethods(constructor: js.Function): Unit = js.native
    
    @JSImport("konva/types/Util", "Collection.toCollection")
    @js.native
    def toCollection[ChildNode /* <: Node[NodeConfig] */](arr: js.Array[ChildNode]): Collection[ChildNode] = js.native
  }
  
  @JSImport("konva/types/Util", "Transform")
  @js.native
  class Transform () extends StObject {
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
  
  object Util {
    
    @JSImport("konva/types/Util", "Util._assign")
    @js.native
    def assign[T, U](target: T, source: U): T with U = js.native
    
    @JSImport("konva/types/Util", "Util._capitalize")
    @js.native
    def capitalize(str: String): String = js.native
    
    @JSImport("konva/types/Util", "Util.cloneArray")
    @js.native
    def cloneArray(arr: js.Array[_]): js.Array[_] = js.native
    
    @JSImport("konva/types/Util", "Util.cloneObject")
    @js.native
    def cloneObject[Any](obj: Any): Any = js.native
    
    @JSImport("konva/types/Util", "Util.colorToRGBA")
    @js.native
    def colorToRGBA(str: String): RGBA = js.native
    
    @JSImport("konva/types/Util", "Util.createCanvasElement")
    @js.native
    def createCanvasElement(): HTMLCanvasElement = js.native
    
    @JSImport("konva/types/Util", "Util.createImageElement")
    @js.native
    def createImageElement(): HTMLImageElement = js.native
    
    @JSImport("konva/types/Util", "Util._degToRad")
    @js.native
    def degToRad(deg: Double): Double = js.native
    
    @JSImport("konva/types/Util", "Util.each")
    @js.native
    def each(obj: js.Any, func: js.Any): Unit = js.native
    
    @JSImport("konva/types/Util", "Util.error")
    @js.native
    def error(str: String): Unit = js.native
    
    @JSImport("konva/types/Util", "Util._expandPoints")
    @js.native
    def expandPoints(p: js.Any, tension: js.Any): js.Array[_] = js.native
    
    @JSImport("konva/types/Util", "Util.extend")
    @js.native
    def extend(child: js.Any, parent: js.Any): Unit = js.native
    
    @JSImport("konva/types/Util", "Util.get")
    @js.native
    def get(`val`: js.Any, `def`: js.Any): js.Any = js.native
    
    @JSImport("konva/types/Util", "Util._getControlPoints")
    @js.native
    def getControlPoints(x0: js.Any, y0: js.Any, x1: js.Any, y1: js.Any, x2: js.Any, y2: js.Any, t: js.Any): js.Array[_] = js.native
    
    @JSImport("konva/types/Util", "Util._getFirstPointerId")
    @js.native
    def getFirstPointerId(evt: js.Any): js.Any = js.native
    
    @JSImport("konva/types/Util", "Util._getProjectionToLine")
    @js.native
    def getProjectionToLine(pt: Vector2d, line: js.Any, isClosed: js.Any): Vector2d = js.native
    
    @JSImport("konva/types/Util", "Util._getProjectionToSegment")
    @js.native
    def getProjectionToSegment(x1: js.Any, y1: js.Any, x2: js.Any, y2: js.Any, x3: js.Any, y3: js.Any): js.Array[_] = js.native
    
    @JSImport("konva/types/Util", "Util.getRGB")
    @js.native
    def getRGB(color: String): RGB = js.native
    
    @JSImport("konva/types/Util", "Util.getRandomColor")
    @js.native
    def getRandomColor(): String = js.native
    
    @JSImport("konva/types/Util", "Util._getRotation")
    @js.native
    def getRotation(radians: js.Any): js.Any = js.native
    
    @JSImport("konva/types/Util", "Util.haveIntersection")
    @js.native
    def haveIntersection(r1: IRect, r2: IRect): Boolean = js.native
    
    @JSImport("konva/types/Util", "Util._hex3ColorToRGBA")
    @js.native
    def hex3ColorToRGBA(str: String): RGBA = js.native
    
    @JSImport("konva/types/Util", "Util._hex6ColorToRGBA")
    @js.native
    def hex6ColorToRGBA(str: String): RGBA = js.native
    
    @JSImport("konva/types/Util", "Util._hexToRgb")
    @js.native
    def hexToRgb(hex: String): RGB = js.native
    
    @JSImport("konva/types/Util", "Util._hslColorToRGBA")
    @js.native
    def hslColorToRGBA(str: String): RGBA = js.native
    
    @JSImport("konva/types/Util", "Util._inRange")
    @js.native
    def inRange(`val`: js.Any, left: js.Any, right: js.Any): Boolean = js.native
    
    @JSImport("konva/types/Util", "Util._isArray")
    @js.native
    def isArray(obj: js.Any): /* is std.Array<any> */ Boolean = js.native
    
    @JSImport("konva/types/Util", "Util._isBoolean")
    @js.native
    def isBoolean(obj: js.Any): /* is boolean */ Boolean = js.native
    
    @JSImport("konva/types/Util", "Util._isElement")
    @js.native
    def isElement(obj: js.Any): /* is std.Element */ Boolean = js.native
    
    @JSImport("konva/types/Util", "Util._isFunction")
    @js.native
    def isFunction(obj: js.Any): Boolean = js.native
    
    @JSImport("konva/types/Util", "Util._isInDocument")
    @js.native
    def isInDocument(el: js.Any): Boolean = js.native
    
    @JSImport("konva/types/Util", "Util._isNumber")
    @js.native
    def isNumber(obj: js.Any): /* is number */ Boolean = js.native
    
    @JSImport("konva/types/Util", "Util.isObject")
    @js.native
    def isObject(`val`: js.Any): /* is std.Object */ Boolean = js.native
    
    @JSImport("konva/types/Util", "Util._isPlainObject")
    @js.native
    def isPlainObject(obj: js.Any): Boolean = js.native
    
    @JSImport("konva/types/Util", "Util._isString")
    @js.native
    def isString(obj: js.Any): /* is string */ Boolean = js.native
    
    @JSImport("konva/types/Util", "Util.isValidSelector")
    @js.native
    def isValidSelector(selector: js.Any): Boolean = js.native
    
    @JSImport("konva/types/Util", "Util._namedColorToRBA")
    @js.native
    def namedColorToRBA(str: String): A = js.native
    
    @JSImport("konva/types/Util", "Util._prepareArrayForTween")
    @js.native
    def prepareArrayForTween(startArray: js.Any, endArray: js.Any, isClosed: js.Any): js.Array[_] = js.native
    
    @JSImport("konva/types/Util", "Util._prepareToStringify")
    @js.native
    def prepareToStringify(obj: js.Any): js.Any = js.native
    
    @JSImport("konva/types/Util", "Util._radToDeg")
    @js.native
    def radToDeg(rad: Double): Double = js.native
    
    @JSImport("konva/types/Util", "Util.requestAnimFrame")
    @js.native
    def requestAnimFrame(callback: js.Function): Unit = js.native
    
    @JSImport("konva/types/Util", "Util._rgbColorToRGBA")
    @js.native
    def rgbColorToRGBA(str: String): RGBA = js.native
    
    @JSImport("konva/types/Util", "Util._rgbToHex")
    @js.native
    def rgbToHex(r: Double, g: Double, b: Double): String = js.native
    
    @JSImport("konva/types/Util", "Util._rgbaColorToRGBA")
    @js.native
    def rgbaColorToRGBA(str: String): RGBA = js.native
    
    @JSImport("konva/types/Util", "Util._sign")
    @js.native
    def sign(number: Double): `1` | `0` | `-1` = js.native
    
    @JSImport("konva/types/Util", "Util._simplifyArray")
    @js.native
    def simplifyArray(arr: js.Array[_]): js.Array[_] = js.native
    
    @JSImport("konva/types/Util", "Util._urlToImage")
    @js.native
    def urlToImage(url: String, callback: js.Function): Unit = js.native
    
    @JSImport("konva/types/Util", "Util.warn")
    @js.native
    def warn(str: String): Unit = js.native
    
    @JSImport("konva/types/Util", "Util.throw")
    @js.native
    def `throw`(str: String): scala.Nothing = js.native
  }
}
