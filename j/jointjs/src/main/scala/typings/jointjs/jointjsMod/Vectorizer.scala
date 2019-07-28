package typings.jointjs.jointjsMod

import org.scalablytyped.runtime.StringDictionary
import typings.jointjs.jointjsMod.VectorizerNs.AnnotateStringOptions
import typings.jointjs.jointjsMod.VectorizerNs.DecomposedTransformation
import typings.jointjs.jointjsMod.VectorizerNs.GetBBoxOptions
import typings.jointjs.jointjsMod.VectorizerNs.Matrix
import typings.jointjs.jointjsMod.VectorizerNs.ParseXMLOptions
import typings.jointjs.jointjsMod.VectorizerNs.QualifiedAttribute
import typings.jointjs.jointjsMod.VectorizerNs.RotateOptions
import typings.jointjs.jointjsMod.VectorizerNs.Rotation
import typings.jointjs.jointjsMod.VectorizerNs.RoundedRect
import typings.jointjs.jointjsMod.VectorizerNs.Sample
import typings.jointjs.jointjsMod.VectorizerNs.Scale
import typings.jointjs.jointjsMod.VectorizerNs.TextAnnotation
import typings.jointjs.jointjsMod.VectorizerNs.TextOptions
import typings.jointjs.jointjsMod.VectorizerNs.Transform
import typings.jointjs.jointjsMod.VectorizerNs.TransformOptions
import typings.jointjs.jointjsMod.VectorizerNs.Translation
import typings.jointjs.jointjsMod.gNs.Line
import typings.jointjs.jointjsMod.gNs.PlainPoint
import typings.jointjs.jointjsMod.gNs.PlainRect
import typings.jointjs.jointjsMod.gNs.Point
import typings.jointjs.jointjsMod.gNs.Polyline
import typings.jointjs.jointjsMod.gNs.Rect
import typings.std.Document
import typings.std.SVGElement
import typings.std.SVGGElement
import typings.std.SVGMatrix
import typings.std.SVGPoint
import typings.std.SVGTransform
import typings.std.XMLDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jointjs", "Vectorizer")
@js.native
class Vectorizer protected () extends js.Object {
  def this(el: String) = this()
  def this(el: SVGElement) = this()
  def this(el: String, attrs: StringDictionary[js.Any]) = this()
  def this(el: SVGElement, attrs: StringDictionary[js.Any]) = this()
  def this(el: String, attrs: StringDictionary[js.Any], children: js.Array[SVGElement | Vectorizer]) = this()
  def this(el: String, attrs: StringDictionary[js.Any], children: Vectorizer) = this()
  def this(el: String, attrs: StringDictionary[js.Any], children: SVGElement) = this()
  def this(el: SVGElement, attrs: StringDictionary[js.Any], children: js.Array[SVGElement | Vectorizer]) = this()
  def this(el: SVGElement, attrs: StringDictionary[js.Any], children: Vectorizer) = this()
  def this(el: SVGElement, attrs: StringDictionary[js.Any], children: SVGElement) = this()
  var id: String = js.native
  var node: SVGElement = js.native
  def addClass(className: String): Vectorizer = js.native
  def animateAlongPath(attrs: StringDictionary[js.Any], path: Vectorizer): Unit = js.native
  def animateAlongPath(attrs: StringDictionary[js.Any], path: SVGElement): Unit = js.native
  def append(els: js.Array[SVGElement | Vectorizer]): this.type = js.native
  def append(els: Vectorizer): this.type = js.native
  def append(els: SVGElement): this.type = js.native
  def appendTo(el: Vectorizer): this.type = js.native
  def appendTo(el: SVGElement): this.type = js.native
  def attr(): StringDictionary[String] = js.native
  def attr(attrs: StringDictionary[js.Any]): this.type = js.native
  def attr(name: String): String | Null = js.native
  def attr(name: String, value: js.Any): this.type = js.native
  def bbox(): Rect = js.native
  def bbox(withoutTransformations: Boolean): Rect = js.native
  def bbox(withoutTransformations: Boolean, target: Vectorizer): Rect = js.native
  def bbox(withoutTransformations: Boolean, target: SVGElement): Rect = js.native
  def before(els: js.Array[SVGElement | Vectorizer]): this.type = js.native
  def before(els: Vectorizer): this.type = js.native
  def before(els: SVGElement): this.type = js.native
  def children(): js.Array[Vectorizer] = js.native
  def contains(el: Vectorizer): Boolean = js.native
  def contains(el: SVGElement): Boolean = js.native
  def convertToPath(): Vectorizer = js.native
  def convertToPathData(): String = js.native
  def defs(): js.UndefOr[Vectorizer] = js.native
  def empty(): this.type = js.native
  def find(selector: String): js.Array[Vectorizer] = js.native
  def findIntersection(ref: PlainPoint, target: Vectorizer): js.UndefOr[PlainPoint] = js.native
  def findIntersection(ref: PlainPoint, target: SVGElement): js.UndefOr[PlainPoint] = js.native
  def findOne(selector: String): js.UndefOr[Vectorizer] = js.native
  def findParentByClass(className: String): Vectorizer | Null = js.native
  def findParentByClass(className: String, terminator: SVGElement): Vectorizer | Null = js.native
  def getBBox(): Rect = js.native
  def getBBox(opt: GetBBoxOptions): Rect = js.native
  def getTransformToElement(toElem: Vectorizer): SVGMatrix = js.native
  def getTransformToElement(toElem: SVGGElement): SVGMatrix = js.native
  def hasClass(className: String): Boolean = js.native
  def index(): Double = js.native
  def normalizePath(): this.type = js.native
  def prepend(els: js.Array[SVGElement | Vectorizer]): this.type = js.native
  def prepend(els: Vectorizer): this.type = js.native
  def prepend(els: SVGElement): this.type = js.native
  def remove(): this.type = js.native
  def removeAttr(name: String): this.type = js.native
  def removeClass(className: String): this.type = js.native
  def rotate(): Rotation = js.native
  def rotate(angle: Double): this.type = js.native
  def rotate(angle: Double, cx: Double): this.type = js.native
  def rotate(angle: Double, cx: Double, cy: Double): this.type = js.native
  def rotate(angle: Double, cx: Double, cy: Double, opt: RotateOptions): this.type = js.native
  def sample(): js.Array[Sample] = js.native
  def sample(interval: Double): js.Array[Sample] = js.native
  def scale(): Scale = js.native
  def scale(sx: Double): this.type = js.native
  def scale(sx: Double, sy: Double): this.type = js.native
  /* private */ def setAttribute(name: String, value: String): this.type = js.native
  /* private */ def setAttributes(attrs: StringDictionary[js.Any]): this.type = js.native
  // returns either this or Vectorizer, no point in specifying this.
  def svg(): Vectorizer = js.native
  def tagName(): String = js.native
  def text(content: String): this.type = js.native
  def text(content: String, opt: TextOptions): this.type = js.native
  def toLocalPoint(x: Double, y: Double): SVGPoint = js.native
  def toggleClass(className: String): this.type = js.native
  def toggleClass(className: String, switchArg: Boolean): this.type = js.native
  def transform(): SVGMatrix = js.native
  def transform(matrix: Matrix): this.type = js.native
  def transform(matrix: Matrix, opt: TransformOptions): this.type = js.native
  def transform(matrix: SVGMatrix): this.type = js.native
  def transform(matrix: SVGMatrix, opt: TransformOptions): this.type = js.native
  def translate(): Translation = js.native
  def translate(tx: Double): this.type = js.native
  def translate(tx: Double, ty: Double): this.type = js.native
  def translate(tx: Double, ty: Double, opt: TransformOptions): this.type = js.native
  def translateAndAutoOrient(position: PlainPoint, reference: PlainPoint): this.type = js.native
  def translateAndAutoOrient(position: PlainPoint, reference: PlainPoint, target: Vectorizer): this.type = js.native
  def translateAndAutoOrient(position: PlainPoint, reference: PlainPoint, target: SVGElement): this.type = js.native
  def translateCenterToPoint(p: PlainPoint): this.type = js.native
}

/* static members */
@JSImport("jointjs", "Vectorizer")
@js.native
object Vectorizer extends js.Object {
  def annotateString(t: String, annotations: js.Array[TextAnnotation]): js.Array[String | StringDictionary[_]] = js.native
  def annotateString(t: String, annotations: js.Array[TextAnnotation], opt: AnnotateStringOptions): js.Array[String | StringDictionary[_]] = js.native
  def convertCircleToPathData(circle: String): String = js.native
  def convertCircleToPathData(circle: Vectorizer): String = js.native
  def convertCircleToPathData(circle: SVGElement): String = js.native
  def convertEllipseToPathData(ellipse: String): String = js.native
  def convertEllipseToPathData(ellipse: Vectorizer): String = js.native
  def convertEllipseToPathData(ellipse: SVGElement): String = js.native
  def convertLineToPathData(line: String): String = js.native
  def convertLineToPathData(line: Vectorizer): String = js.native
  def convertLineToPathData(line: SVGElement): String = js.native
  def convertPolygonToPathData(line: String): String = js.native
  def convertPolygonToPathData(line: Vectorizer): String = js.native
  def convertPolygonToPathData(line: SVGElement): String = js.native
  def convertPolylineToPathData(line: String): String = js.native
  def convertPolylineToPathData(line: Vectorizer): String = js.native
  def convertPolylineToPathData(line: SVGElement): String = js.native
  def convertRectToPathData(rect: String): String = js.native
  def convertRectToPathData(rect: Vectorizer): String = js.native
  def convertRectToPathData(rect: SVGElement): String = js.native
  def createSVGDocument(content: String): Document = js.native
  def createSVGMatrix(matrix: Matrix): SVGMatrix = js.native
  def createSVGMatrix(matrix: SVGMatrix): SVGMatrix = js.native
  def createSVGPoint(x: Double, y: Double): SVGPoint = js.native
  def createSVGTransform(): SVGTransform = js.native
  def createSVGTransform(matrix: Matrix): SVGTransform = js.native
  def createSVGTransform(matrix: SVGMatrix): SVGTransform = js.native
  def createSlicePathData(innerRadius: Double, outRadius: Double, startAngle: Double, endAngle: Double): String = js.native
  def decomposeMatrix(matrix: Matrix): DecomposedTransformation = js.native
  def decomposeMatrix(matrix: SVGMatrix): DecomposedTransformation = js.native
  def deltaTransformPoint(matrix: Matrix, point: PlainPoint): PlainPoint = js.native
  def deltaTransformPoint(matrix: Matrix, point: SVGPoint): PlainPoint = js.native
  def deltaTransformPoint(matrix: SVGMatrix, point: PlainPoint): PlainPoint = js.native
  def deltaTransformPoint(matrix: SVGMatrix, point: SVGPoint): PlainPoint = js.native
  def ensureId(node: Vectorizer): String = js.native
  def ensureId(node: SVGElement): String = js.native
  def findAnnotationsAtIndex(annotations: js.Array[TextAnnotation], index: Double): js.Array[TextAnnotation] = js.native
  def findAnnotationsBetweenIndexes(annotations: js.Array[TextAnnotation], start: Double, end: Double): js.Array[TextAnnotation] = js.native
  def getPointsFromSvgNode(node: Vectorizer): js.Array[SVGPoint] = js.native
  def getPointsFromSvgNode(node: SVGElement): js.Array[SVGPoint] = js.native
  def isArray(value: js.Any): Boolean = js.native
  def isObject(value: js.Any): Boolean = js.native
  def isSVGGraphicsElement(value: js.Any): Boolean = js.native
  def isString(value: js.Any): Boolean = js.native
  def isUndefined(value: js.Any): Boolean = js.native
  def isV(value: js.Any): Boolean = js.native
  def isVElement(value: js.Any): Boolean = js.native
  def matrixToRotate(matrix: Matrix): Rotation = js.native
  def matrixToRotate(matrix: SVGMatrix): Rotation = js.native
  def matrixToScale(matrix: Matrix): Scale = js.native
  def matrixToScale(matrix: SVGMatrix): Scale = js.native
  def matrixToTransformString(matrix: Matrix): String = js.native
  def matrixToTransformString(matrix: SVGMatrix): String = js.native
  def matrixToTranslate(matrix: Matrix): Translation = js.native
  def matrixToTranslate(matrix: SVGMatrix): Translation = js.native
  def mergeAttrs(a: js.Any, b: js.Any): js.Any = js.native
  def normalizePathData(path: String): String = js.native
  def parseTransformString(transform: String): Transform = js.native
  def parseXML(data: String): XMLDocument = js.native
  def parseXML(data: String, opt: ParseXMLOptions): XMLDocument = js.native
  def qualifyAttr(name: String): QualifiedAttribute = js.native
  def rectToPath(r: RoundedRect): String = js.native
  def sanitizeText(text: String): String = js.native
  def shiftAnnotations(annotations: js.Array[TextAnnotation], index: Double, offset: Double): js.Array[TextAnnotation] = js.native
  def styleToObject(styleString: String): StringDictionary[String] = js.native
  def svgPointsToPath(points: js.Array[PlainPoint | SVGPoint]): String = js.native
  def toNode(el: js.Array[SVGElement]): SVGElement = js.native
  def toNode(el: Vectorizer): SVGElement = js.native
  def toNode(el: SVGElement): SVGElement = js.native
  def transformLine(p: Line, matrix: SVGMatrix): Line = js.native
  def transformPoint(p: PlainPoint, matrix: SVGMatrix): Point = js.native
  def transformPolyline(p: js.Array[PlainPoint], matrix: SVGMatrix): Polyline = js.native
  def transformPolyline(p: Polyline, matrix: SVGMatrix): Polyline = js.native
  def transformRect(r: PlainRect, matrix: SVGMatrix): Rect = js.native
  def transformStringToMatrix(transform: String): SVGMatrix = js.native
  def uniqueId(): String = js.native
}

