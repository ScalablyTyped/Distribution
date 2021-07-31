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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("konva/types/Util", "Collection")
  @js.native
  class Collection[Child /* <: Node[NodeConfig] */] ()
    extends StObject
       with /* index */ NumberDictionary[Child] {
    
    def each(f: js.Function2[/* child */ Child, /* index */ Double, Unit]): Unit = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[Iterator[Child, js.Any, Unit]] = js.native
    
    var length: Double = js.native
    
    def push(item: Child): Unit = js.native
    
    def splice(start: Double, length: Double): Unit = js.native
    def splice(start: Double, length: Double, replace: js.Any): Unit = js.native
    
    def toArray(): js.Array[Child] = js.native
    
    def unshift(item: Child): Unit = js.native
  }
  /* static members */
  object Collection {
    
    @JSImport("konva/types/Util", "Collection")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def _mapMethod(methodName: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_mapMethod")(methodName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def mapMethods(constructor: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mapMethods")(constructor.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def toCollection[ChildNode /* <: Node[NodeConfig] */](arr: js.Array[ChildNode]): Collection[ChildNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("toCollection")(arr.asInstanceOf[js.Any]).asInstanceOf[Collection[ChildNode]]
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
    
    @JSImport("konva/types/Util", "Util")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def assign[T, U](target: T, source: U): T & U = (^.asInstanceOf[js.Dynamic].applyDynamic("_assign")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & U]
    
    @scala.inline
    def capitalize(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_capitalize")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def cloneArray(arr: js.Array[js.Any]): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneArray")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
    
    @scala.inline
    def cloneObject[Any](obj: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneObject")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    @scala.inline
    def colorToRGBA(str: String): RGBA = ^.asInstanceOf[js.Dynamic].applyDynamic("colorToRGBA")(str.asInstanceOf[js.Any]).asInstanceOf[RGBA]
    
    @scala.inline
    def createCanvasElement(): HTMLCanvasElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createCanvasElement")().asInstanceOf[HTMLCanvasElement]
    
    @scala.inline
    def createImageElement(): HTMLImageElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createImageElement")().asInstanceOf[HTMLImageElement]
    
    @scala.inline
    def degToRad(deg: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("_degToRad")(deg.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def each(obj: js.Any, func: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(obj.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def error(str: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(str.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def expandPoints(p: js.Any, tension: js.Any): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("_expandPoints")(p.asInstanceOf[js.Any], tension.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
    
    @scala.inline
    def extend(child: js.Any, parent: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(child.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def get(`val`: js.Any, `def`: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(`val`.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def getControlPoints(x0: js.Any, y0: js.Any, x1: js.Any, y1: js.Any, x2: js.Any, y2: js.Any, t: js.Any): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("_getControlPoints")(x0.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
    
    @scala.inline
    def getFirstPointerId(evt: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("_getFirstPointerId")(evt.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def getProjectionToLine(pt: Vector2d, line: js.Any, isClosed: js.Any): Vector2d = (^.asInstanceOf[js.Dynamic].applyDynamic("_getProjectionToLine")(pt.asInstanceOf[js.Any], line.asInstanceOf[js.Any], isClosed.asInstanceOf[js.Any])).asInstanceOf[Vector2d]
    
    @scala.inline
    def getProjectionToSegment(x1: js.Any, y1: js.Any, x2: js.Any, y2: js.Any, x3: js.Any, y3: js.Any): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("_getProjectionToSegment")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
    
    @scala.inline
    def getRGB(color: String): RGB = ^.asInstanceOf[js.Dynamic].applyDynamic("getRGB")(color.asInstanceOf[js.Any]).asInstanceOf[RGB]
    
    @scala.inline
    def getRandomColor(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRandomColor")().asInstanceOf[String]
    
    @scala.inline
    def getRotation(radians: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("_getRotation")(radians.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def haveIntersection(r1: IRect, r2: IRect): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("haveIntersection")(r1.asInstanceOf[js.Any], r2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def hex3ColorToRGBA(str: String): RGBA = ^.asInstanceOf[js.Dynamic].applyDynamic("_hex3ColorToRGBA")(str.asInstanceOf[js.Any]).asInstanceOf[RGBA]
    
    @scala.inline
    def hex6ColorToRGBA(str: String): RGBA = ^.asInstanceOf[js.Dynamic].applyDynamic("_hex6ColorToRGBA")(str.asInstanceOf[js.Any]).asInstanceOf[RGBA]
    
    @scala.inline
    def hexToRgb(hex: String): RGB = ^.asInstanceOf[js.Dynamic].applyDynamic("_hexToRgb")(hex.asInstanceOf[js.Any]).asInstanceOf[RGB]
    
    @scala.inline
    def hslColorToRGBA(str: String): RGBA = ^.asInstanceOf[js.Dynamic].applyDynamic("_hslColorToRGBA")(str.asInstanceOf[js.Any]).asInstanceOf[RGBA]
    
    @scala.inline
    def inRange(`val`: js.Any, left: js.Any, right: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_inRange")(`val`.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def isArray(obj: js.Any): /* is std.Array<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isArray")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<any> */ Boolean]
    
    @scala.inline
    def isBoolean(obj: js.Any): /* is boolean */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isBoolean")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is boolean */ Boolean]
    
    @scala.inline
    def isElement(obj: js.Any): /* is std.Element */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isElement")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is std.Element */ Boolean]
    
    @scala.inline
    def isFunction(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isFunction")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def isInDocument(el: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isInDocument")(el.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def isNumber(obj: js.Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isNumber")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
    
    @scala.inline
    def isObject(`val`: js.Any): /* is std.Object */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Object */ Boolean]
    
    @scala.inline
    def isPlainObject(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isPlainObject")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def isString(obj: js.Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isString")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
    
    @scala.inline
    def isValidSelector(selector: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidSelector")(selector.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def namedColorToRBA(str: String): A = ^.asInstanceOf[js.Dynamic].applyDynamic("_namedColorToRBA")(str.asInstanceOf[js.Any]).asInstanceOf[A]
    
    @scala.inline
    def prepareArrayForTween(startArray: js.Any, endArray: js.Any, isClosed: js.Any): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("_prepareArrayForTween")(startArray.asInstanceOf[js.Any], endArray.asInstanceOf[js.Any], isClosed.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
    
    @scala.inline
    def prepareToStringify(obj: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("_prepareToStringify")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def radToDeg(rad: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("_radToDeg")(rad.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def requestAnimFrame(callback: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("requestAnimFrame")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def rgbColorToRGBA(str: String): RGBA = ^.asInstanceOf[js.Dynamic].applyDynamic("_rgbColorToRGBA")(str.asInstanceOf[js.Any]).asInstanceOf[RGBA]
    
    @scala.inline
    def rgbToHex(r: Double, g: Double, b: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("_rgbToHex")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def rgbaColorToRGBA(str: String): RGBA = ^.asInstanceOf[js.Dynamic].applyDynamic("_rgbaColorToRGBA")(str.asInstanceOf[js.Any]).asInstanceOf[RGBA]
    
    @scala.inline
    def sign(number: Double): `1` | `0` | `-1` = ^.asInstanceOf[js.Dynamic].applyDynamic("_sign")(number.asInstanceOf[js.Any]).asInstanceOf[`1` | `0` | `-1`]
    
    @scala.inline
    def simplifyArray(arr: js.Array[js.Any]): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("_simplifyArray")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
    
    @scala.inline
    def `throw`(str: String): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("throw")(str.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
    
    @scala.inline
    def urlToImage(url: String, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_urlToImage")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def warn(str: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(str.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
