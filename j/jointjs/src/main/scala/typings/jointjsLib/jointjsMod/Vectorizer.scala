package typings
package jointjsLib.jointjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jointjs", "Vectorizer")
@js.native
class Vectorizer protected () extends js.Object {
  def this(el: java.lang.String) = this()
  def this(el: stdLib.SVGElement) = this()
  def this(el: java.lang.String, attrs: ScalablyTyped.runtime.StringDictionary[js.Any]) = this()
  def this(el: stdLib.SVGElement, attrs: ScalablyTyped.runtime.StringDictionary[js.Any]) = this()
  def this(el: java.lang.String, attrs: ScalablyTyped.runtime.StringDictionary[js.Any], children: Vectorizer) = this()
  def this(el: java.lang.String, attrs: ScalablyTyped.runtime.StringDictionary[js.Any], children: js.Array[Vectorizer | stdLib.SVGElement]) = this()
  def this(el: java.lang.String, attrs: ScalablyTyped.runtime.StringDictionary[js.Any], children: stdLib.SVGElement) = this()
  def this(el: stdLib.SVGElement, attrs: ScalablyTyped.runtime.StringDictionary[js.Any], children: Vectorizer) = this()
  def this(el: stdLib.SVGElement, attrs: ScalablyTyped.runtime.StringDictionary[js.Any], children: js.Array[Vectorizer | stdLib.SVGElement]) = this()
  def this(el: stdLib.SVGElement, attrs: ScalablyTyped.runtime.StringDictionary[js.Any], children: stdLib.SVGElement) = this()
  var id: java.lang.String = js.native
  var node: stdLib.SVGElement = js.native
  def addClass(className: java.lang.String): Vectorizer = js.native
  def animateAlongPath(attrs: ScalablyTyped.runtime.StringDictionary[js.Any], path: Vectorizer): scala.Unit = js.native
  def animateAlongPath(attrs: ScalablyTyped.runtime.StringDictionary[js.Any], path: stdLib.SVGElement): scala.Unit = js.native
  def append(els: Vectorizer): this.type = js.native
  def append(els: js.Array[Vectorizer | stdLib.SVGElement]): this.type = js.native
  def append(els: stdLib.SVGElement): this.type = js.native
  def appendTo(el: Vectorizer): this.type = js.native
  def appendTo(el: stdLib.SVGElement): this.type = js.native
  def attr(): ScalablyTyped.runtime.StringDictionary[java.lang.String] = js.native
  def attr(attrs: ScalablyTyped.runtime.StringDictionary[js.Any]): this.type = js.native
  def attr(name: java.lang.String): java.lang.String | scala.Null = js.native
  def attr(name: java.lang.String, value: js.Any): this.type = js.native
  def bbox(): jointjsLib.jointjsMod.gNs.Rect = js.native
  def bbox(withoutTransformations: scala.Boolean): jointjsLib.jointjsMod.gNs.Rect = js.native
  def bbox(withoutTransformations: scala.Boolean, target: Vectorizer): jointjsLib.jointjsMod.gNs.Rect = js.native
  def bbox(withoutTransformations: scala.Boolean, target: stdLib.SVGElement): jointjsLib.jointjsMod.gNs.Rect = js.native
  def before(els: Vectorizer): this.type = js.native
  def before(els: js.Array[Vectorizer | stdLib.SVGElement]): this.type = js.native
  def before(els: stdLib.SVGElement): this.type = js.native
  def children(): js.Array[Vectorizer] = js.native
  def contains(el: Vectorizer): scala.Boolean = js.native
  def contains(el: stdLib.SVGElement): scala.Boolean = js.native
  def convertToPath(): Vectorizer = js.native
  def convertToPathData(): java.lang.String = js.native
  def defs(): js.UndefOr[Vectorizer] = js.native
  def empty(): this.type = js.native
  def find(selector: java.lang.String): js.Array[Vectorizer] = js.native
  def findIntersection(ref: jointjsLib.jointjsMod.gNs.PlainPoint, target: Vectorizer): js.UndefOr[jointjsLib.jointjsMod.gNs.PlainPoint] = js.native
  def findIntersection(ref: jointjsLib.jointjsMod.gNs.PlainPoint, target: stdLib.SVGElement): js.UndefOr[jointjsLib.jointjsMod.gNs.PlainPoint] = js.native
  def findOne(selector: java.lang.String): js.UndefOr[Vectorizer] = js.native
  def findParentByClass(className: java.lang.String): Vectorizer | scala.Null = js.native
  def findParentByClass(className: java.lang.String, terminator: stdLib.SVGElement): Vectorizer | scala.Null = js.native
  def getBBox(): jointjsLib.jointjsMod.gNs.Rect = js.native
  def getBBox(opt: jointjsLib.jointjsMod.VectorizerNs.GetBBoxOptions): jointjsLib.jointjsMod.gNs.Rect = js.native
  def getTransformToElement(toElem: Vectorizer): stdLib.SVGMatrix = js.native
  def getTransformToElement(toElem: stdLib.SVGGElement): stdLib.SVGMatrix = js.native
  def hasClass(className: java.lang.String): scala.Boolean = js.native
  def index(): scala.Double = js.native
  def normalizePath(): this.type = js.native
  def prepend(els: Vectorizer): this.type = js.native
  def prepend(els: js.Array[Vectorizer | stdLib.SVGElement]): this.type = js.native
  def prepend(els: stdLib.SVGElement): this.type = js.native
  def remove(): this.type = js.native
  def removeAttr(name: java.lang.String): this.type = js.native
  def removeClass(className: java.lang.String): this.type = js.native
  def rotate(): jointjsLib.jointjsMod.VectorizerNs.Rotation = js.native
  def rotate(angle: scala.Double): this.type = js.native
  def rotate(angle: scala.Double, cx: scala.Double): this.type = js.native
  def rotate(angle: scala.Double, cx: scala.Double, cy: scala.Double): this.type = js.native
  def rotate(
    angle: scala.Double,
    cx: scala.Double,
    cy: scala.Double,
    opt: jointjsLib.jointjsMod.VectorizerNs.RotateOptions
  ): this.type = js.native
  def sample(): js.Array[jointjsLib.jointjsMod.VectorizerNs.Sample] = js.native
  def sample(interval: scala.Double): js.Array[jointjsLib.jointjsMod.VectorizerNs.Sample] = js.native
  def scale(): jointjsLib.jointjsMod.VectorizerNs.Scale = js.native
  def scale(sx: scala.Double): this.type = js.native
  def scale(sx: scala.Double, sy: scala.Double): this.type = js.native
  /* private */ def setAttribute(name: java.lang.String, value: java.lang.String): this.type = js.native
  /* private */ def setAttributes(attrs: ScalablyTyped.runtime.StringDictionary[js.Any]): this.type = js.native
  // returns either this or Vectorizer, no point in specifying this.
  def svg(): Vectorizer = js.native
  def tagName(): java.lang.String = js.native
  def text(content: java.lang.String): this.type = js.native
  def text(content: java.lang.String, opt: jointjsLib.jointjsMod.VectorizerNs.TextOptions): this.type = js.native
  def toLocalPoint(x: scala.Double, y: scala.Double): stdLib.SVGPoint = js.native
  def toggleClass(className: java.lang.String): this.type = js.native
  def toggleClass(className: java.lang.String, switchArg: scala.Boolean): this.type = js.native
  def transform(): stdLib.SVGMatrix = js.native
  def transform(matrix: jointjsLib.jointjsMod.VectorizerNs.Matrix): this.type = js.native
  def transform(
    matrix: jointjsLib.jointjsMod.VectorizerNs.Matrix,
    opt: jointjsLib.jointjsMod.VectorizerNs.TransformOptions
  ): this.type = js.native
  def transform(matrix: stdLib.SVGMatrix): this.type = js.native
  def transform(matrix: stdLib.SVGMatrix, opt: jointjsLib.jointjsMod.VectorizerNs.TransformOptions): this.type = js.native
  def translate(): jointjsLib.jointjsMod.VectorizerNs.Translation = js.native
  def translate(tx: scala.Double): this.type = js.native
  def translate(tx: scala.Double, ty: scala.Double): this.type = js.native
  def translate(tx: scala.Double, ty: scala.Double, opt: jointjsLib.jointjsMod.VectorizerNs.TransformOptions): this.type = js.native
  def translateAndAutoOrient(position: jointjsLib.jointjsMod.gNs.PlainPoint, reference: jointjsLib.jointjsMod.gNs.PlainPoint): this.type = js.native
  def translateAndAutoOrient(
    position: jointjsLib.jointjsMod.gNs.PlainPoint,
    reference: jointjsLib.jointjsMod.gNs.PlainPoint,
    target: Vectorizer
  ): this.type = js.native
  def translateAndAutoOrient(
    position: jointjsLib.jointjsMod.gNs.PlainPoint,
    reference: jointjsLib.jointjsMod.gNs.PlainPoint,
    target: stdLib.SVGElement
  ): this.type = js.native
  def translateCenterToPoint(p: jointjsLib.jointjsMod.gNs.PlainPoint): this.type = js.native
}

@JSImport("jointjs", "Vectorizer")
@js.native
object Vectorizer extends js.Object {
  def annotateString(t: java.lang.String, annotations: js.Array[jointjsLib.jointjsMod.VectorizerNs.TextAnnotation]): js.Array[java.lang.String | ScalablyTyped.runtime.StringDictionary[_]] = js.native
  def annotateString(
    t: java.lang.String,
    annotations: js.Array[jointjsLib.jointjsMod.VectorizerNs.TextAnnotation],
    opt: jointjsLib.jointjsMod.VectorizerNs.AnnotateStringOptions
  ): js.Array[java.lang.String | ScalablyTyped.runtime.StringDictionary[_]] = js.native
  def convertCircleToPathData(circle: java.lang.String): java.lang.String = js.native
  def convertCircleToPathData(circle: jointjsLib.jointjsMod.Vectorizer): java.lang.String = js.native
  def convertCircleToPathData(circle: stdLib.SVGElement): java.lang.String = js.native
  def convertEllipseToPathData(ellipse: java.lang.String): java.lang.String = js.native
  def convertEllipseToPathData(ellipse: jointjsLib.jointjsMod.Vectorizer): java.lang.String = js.native
  def convertEllipseToPathData(ellipse: stdLib.SVGElement): java.lang.String = js.native
  def convertLineToPathData(line: java.lang.String): java.lang.String = js.native
  def convertLineToPathData(line: jointjsLib.jointjsMod.Vectorizer): java.lang.String = js.native
  def convertLineToPathData(line: stdLib.SVGElement): java.lang.String = js.native
  def convertPolygonToPathData(line: java.lang.String): java.lang.String = js.native
  def convertPolygonToPathData(line: jointjsLib.jointjsMod.Vectorizer): java.lang.String = js.native
  def convertPolygonToPathData(line: stdLib.SVGElement): java.lang.String = js.native
  def convertPolylineToPathData(line: java.lang.String): java.lang.String = js.native
  def convertPolylineToPathData(line: jointjsLib.jointjsMod.Vectorizer): java.lang.String = js.native
  def convertPolylineToPathData(line: stdLib.SVGElement): java.lang.String = js.native
  def convertRectToPathData(rect: java.lang.String): java.lang.String = js.native
  def convertRectToPathData(rect: jointjsLib.jointjsMod.Vectorizer): java.lang.String = js.native
  def convertRectToPathData(rect: stdLib.SVGElement): java.lang.String = js.native
  def createSVGDocument(content: java.lang.String): stdLib.Document = js.native
  def createSVGMatrix(matrix: jointjsLib.jointjsMod.VectorizerNs.Matrix): stdLib.SVGMatrix = js.native
  def createSVGMatrix(matrix: stdLib.SVGMatrix): stdLib.SVGMatrix = js.native
  def createSVGPoint(x: scala.Double, y: scala.Double): stdLib.SVGPoint = js.native
  def createSVGTransform(): stdLib.SVGTransform = js.native
  def createSVGTransform(matrix: jointjsLib.jointjsMod.VectorizerNs.Matrix): stdLib.SVGTransform = js.native
  def createSVGTransform(matrix: stdLib.SVGMatrix): stdLib.SVGTransform = js.native
  def createSlicePathData(
    innerRadius: scala.Double,
    outRadius: scala.Double,
    startAngle: scala.Double,
    endAngle: scala.Double
  ): java.lang.String = js.native
  def decomposeMatrix(matrix: jointjsLib.jointjsMod.VectorizerNs.Matrix): jointjsLib.jointjsMod.VectorizerNs.DecomposedTransformation = js.native
  def decomposeMatrix(matrix: stdLib.SVGMatrix): jointjsLib.jointjsMod.VectorizerNs.DecomposedTransformation = js.native
  def deltaTransformPoint(matrix: jointjsLib.jointjsMod.VectorizerNs.Matrix, point: jointjsLib.jointjsMod.gNs.PlainPoint): jointjsLib.jointjsMod.gNs.PlainPoint = js.native
  def deltaTransformPoint(matrix: jointjsLib.jointjsMod.VectorizerNs.Matrix, point: stdLib.SVGPoint): jointjsLib.jointjsMod.gNs.PlainPoint = js.native
  def deltaTransformPoint(matrix: stdLib.SVGMatrix, point: jointjsLib.jointjsMod.gNs.PlainPoint): jointjsLib.jointjsMod.gNs.PlainPoint = js.native
  def deltaTransformPoint(matrix: stdLib.SVGMatrix, point: stdLib.SVGPoint): jointjsLib.jointjsMod.gNs.PlainPoint = js.native
  def ensureId(node: jointjsLib.jointjsMod.Vectorizer): java.lang.String = js.native
  def ensureId(node: stdLib.SVGElement): java.lang.String = js.native
  def findAnnotationsAtIndex(annotations: js.Array[jointjsLib.jointjsMod.VectorizerNs.TextAnnotation], index: scala.Double): js.Array[jointjsLib.jointjsMod.VectorizerNs.TextAnnotation] = js.native
  def findAnnotationsBetweenIndexes(
    annotations: js.Array[jointjsLib.jointjsMod.VectorizerNs.TextAnnotation],
    start: scala.Double,
    end: scala.Double
  ): js.Array[jointjsLib.jointjsMod.VectorizerNs.TextAnnotation] = js.native
  def getPointsFromSvgNode(node: jointjsLib.jointjsMod.Vectorizer): js.Array[stdLib.SVGPoint] = js.native
  def getPointsFromSvgNode(node: stdLib.SVGElement): js.Array[stdLib.SVGPoint] = js.native
  def isArray(value: js.Any): scala.Boolean = js.native
  def isObject(value: js.Any): scala.Boolean = js.native
  def isSVGGraphicsElement(value: js.Any): scala.Boolean = js.native
  def isString(value: js.Any): scala.Boolean = js.native
  def isUndefined(value: js.Any): scala.Boolean = js.native
  def isV(value: js.Any): scala.Boolean = js.native
  def isVElement(value: js.Any): scala.Boolean = js.native
  def matrixToRotate(matrix: jointjsLib.jointjsMod.VectorizerNs.Matrix): jointjsLib.jointjsMod.VectorizerNs.Rotation = js.native
  def matrixToRotate(matrix: stdLib.SVGMatrix): jointjsLib.jointjsMod.VectorizerNs.Rotation = js.native
  def matrixToScale(matrix: jointjsLib.jointjsMod.VectorizerNs.Matrix): jointjsLib.jointjsMod.VectorizerNs.Scale = js.native
  def matrixToScale(matrix: stdLib.SVGMatrix): jointjsLib.jointjsMod.VectorizerNs.Scale = js.native
  def matrixToTransformString(matrix: jointjsLib.jointjsMod.VectorizerNs.Matrix): java.lang.String = js.native
  def matrixToTransformString(matrix: stdLib.SVGMatrix): java.lang.String = js.native
  def matrixToTranslate(matrix: jointjsLib.jointjsMod.VectorizerNs.Matrix): jointjsLib.jointjsMod.VectorizerNs.Translation = js.native
  def matrixToTranslate(matrix: stdLib.SVGMatrix): jointjsLib.jointjsMod.VectorizerNs.Translation = js.native
  def mergeAttrs(a: js.Any, b: js.Any): js.Any = js.native
  def normalizePathData(path: java.lang.String): java.lang.String = js.native
  def parseTransformString(transform: java.lang.String): jointjsLib.jointjsMod.VectorizerNs.Transform = js.native
  def parseXML(data: java.lang.String): stdLib.XMLDocument = js.native
  def parseXML(data: java.lang.String, opt: jointjsLib.jointjsMod.VectorizerNs.ParseXMLOptions): stdLib.XMLDocument = js.native
  def qualifyAttr(name: java.lang.String): jointjsLib.jointjsMod.VectorizerNs.QualifiedAttribute = js.native
  def rectToPath(r: jointjsLib.jointjsMod.VectorizerNs.RoundedRect): java.lang.String = js.native
  def sanitizeText(text: java.lang.String): java.lang.String = js.native
  def shiftAnnotations(
    annotations: js.Array[jointjsLib.jointjsMod.VectorizerNs.TextAnnotation],
    index: scala.Double,
    offset: scala.Double
  ): js.Array[jointjsLib.jointjsMod.VectorizerNs.TextAnnotation] = js.native
  def styleToObject(styleString: java.lang.String): ScalablyTyped.runtime.StringDictionary[java.lang.String] = js.native
  def svgPointsToPath(points: js.Array[jointjsLib.jointjsMod.gNs.PlainPoint | stdLib.SVGPoint]): java.lang.String = js.native
  def toNode(el: jointjsLib.jointjsMod.Vectorizer): stdLib.SVGElement = js.native
  def toNode(el: js.Array[stdLib.SVGElement]): stdLib.SVGElement = js.native
  def toNode(el: stdLib.SVGElement): stdLib.SVGElement = js.native
  def transformLine(p: jointjsLib.jointjsMod.gNs.Line, matrix: stdLib.SVGMatrix): jointjsLib.jointjsMod.gNs.Line = js.native
  def transformPoint(p: jointjsLib.jointjsMod.gNs.PlainPoint, matrix: stdLib.SVGMatrix): jointjsLib.jointjsMod.gNs.Point = js.native
  def transformPolyline(p: jointjsLib.jointjsMod.gNs.Polyline, matrix: stdLib.SVGMatrix): jointjsLib.jointjsMod.gNs.Polyline = js.native
  def transformPolyline(p: js.Array[jointjsLib.jointjsMod.gNs.PlainPoint], matrix: stdLib.SVGMatrix): jointjsLib.jointjsMod.gNs.Polyline = js.native
  def transformRect(r: jointjsLib.jointjsMod.gNs.PlainRect, matrix: stdLib.SVGMatrix): jointjsLib.jointjsMod.gNs.Rect = js.native
  def transformStringToMatrix(transform: java.lang.String): stdLib.SVGMatrix = js.native
  def uniqueId(): java.lang.String = js.native
}

