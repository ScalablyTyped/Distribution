package typings.jointjs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.jointjs.mod.Vectorizer.GetBBoxOptions
import typings.jointjs.mod.Vectorizer.Matrix
import typings.jointjs.mod.Vectorizer.RotateOptions
import typings.jointjs.mod.Vectorizer.Rotation
import typings.jointjs.mod.Vectorizer.Sample
import typings.jointjs.mod.Vectorizer.Scale
import typings.jointjs.mod.Vectorizer.TextOptions
import typings.jointjs.mod.Vectorizer.TransformOptions
import typings.jointjs.mod.Vectorizer.Translation
import typings.jointjs.mod.g.Line
import typings.jointjs.mod.g.PlainPoint
import typings.jointjs.mod.g.PlainRect
import typings.jointjs.mod.g.Point
import typings.jointjs.mod.g.Polyline
import typings.jointjs.mod.g.Rect
import typings.std.Document
import typings.std.SVGElement
import typings.std.SVGGElement
import typings.std.SVGMatrix
import typings.std.SVGPoint
import typings.std.SVGTransform
import typings.std.XMLDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jointjs", "Vectorizer")
@js.native
class Vectorizer protected () extends StObject {
  def this(el: String) = this()
  def this(el: SVGElement) = this()
  def this(el: String, attrs: StringDictionary[js.Any]) = this()
  def this(el: SVGElement, attrs: StringDictionary[js.Any]) = this()
  def this(el: String, attrs: StringDictionary[js.Any], children: js.Array[SVGElement | Vectorizer]) = this()
  def this(el: String, attrs: StringDictionary[js.Any], children: Vectorizer) = this()
  def this(el: String, attrs: StringDictionary[js.Any], children: SVGElement) = this()
  def this(el: String, attrs: Unit, children: js.Array[SVGElement | Vectorizer]) = this()
  def this(el: String, attrs: Unit, children: Vectorizer) = this()
  def this(el: String, attrs: Unit, children: SVGElement) = this()
  def this(el: SVGElement, attrs: StringDictionary[js.Any], children: js.Array[SVGElement | Vectorizer]) = this()
  def this(el: SVGElement, attrs: StringDictionary[js.Any], children: Vectorizer) = this()
  def this(el: SVGElement, attrs: StringDictionary[js.Any], children: SVGElement) = this()
  def this(el: SVGElement, attrs: Unit, children: js.Array[SVGElement | Vectorizer]) = this()
  def this(el: SVGElement, attrs: Unit, children: Vectorizer) = this()
  def this(el: SVGElement, attrs: Unit, children: SVGElement) = this()
  
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
  def bbox(withoutTransformations: Unit, target: Vectorizer): Rect = js.native
  def bbox(withoutTransformations: Unit, target: SVGElement): Rect = js.native
  
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
  
  var id: String = js.native
  
  def index(): Double = js.native
  
  var node: SVGElement = js.native
  
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
  def rotate(angle: Double, cx: Double, cy: Unit, opt: RotateOptions): this.type = js.native
  def rotate(angle: Double, cx: Unit, cy: Double): this.type = js.native
  def rotate(angle: Double, cx: Unit, cy: Double, opt: RotateOptions): this.type = js.native
  def rotate(angle: Double, cx: Unit, cy: Unit, opt: RotateOptions): this.type = js.native
  
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
  def translate(tx: Double, ty: Unit, opt: TransformOptions): this.type = js.native
  
  def translateAndAutoOrient(position: PlainPoint, reference: PlainPoint): this.type = js.native
  def translateAndAutoOrient(position: PlainPoint, reference: PlainPoint, target: Vectorizer): this.type = js.native
  def translateAndAutoOrient(position: PlainPoint, reference: PlainPoint, target: SVGElement): this.type = js.native
  
  def translateCenterToPoint(p: PlainPoint): this.type = js.native
}
/* static members */
object Vectorizer {
  
  @JSImport("jointjs", "Vectorizer")
  @js.native
  val ^ : js.Any = js.native
  
  inline def annotateString(t: String, annotations: js.Array[TextAnnotation]): js.Array[String | StringDictionary[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("annotateString")(t.asInstanceOf[js.Any], annotations.asInstanceOf[js.Any])).asInstanceOf[js.Array[String | StringDictionary[js.Any]]]
  inline def annotateString(t: String, annotations: js.Array[TextAnnotation], opt: AnnotateStringOptions): js.Array[String | StringDictionary[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("annotateString")(t.asInstanceOf[js.Any], annotations.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[js.Array[String | StringDictionary[js.Any]]]
  
  inline def convertCircleToPathData(circle: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertCircleToPathData")(circle.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def convertCircleToPathData(circle: Vectorizer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertCircleToPathData")(circle.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def convertCircleToPathData(circle: SVGElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertCircleToPathData")(circle.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def convertEllipseToPathData(ellipse: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertEllipseToPathData")(ellipse.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def convertEllipseToPathData(ellipse: Vectorizer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertEllipseToPathData")(ellipse.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def convertEllipseToPathData(ellipse: SVGElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertEllipseToPathData")(ellipse.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def convertLineToPathData(line: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertLineToPathData")(line.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def convertLineToPathData(line: Vectorizer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertLineToPathData")(line.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def convertLineToPathData(line: SVGElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertLineToPathData")(line.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def convertPolygonToPathData(line: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertPolygonToPathData")(line.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def convertPolygonToPathData(line: Vectorizer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertPolygonToPathData")(line.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def convertPolygonToPathData(line: SVGElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertPolygonToPathData")(line.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def convertPolylineToPathData(line: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertPolylineToPathData")(line.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def convertPolylineToPathData(line: Vectorizer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertPolylineToPathData")(line.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def convertPolylineToPathData(line: SVGElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertPolylineToPathData")(line.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def convertRectToPathData(rect: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertRectToPathData")(rect.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def convertRectToPathData(rect: Vectorizer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertRectToPathData")(rect.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def convertRectToPathData(rect: SVGElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertRectToPathData")(rect.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def createSVGDocument(content: String): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("createSVGDocument")(content.asInstanceOf[js.Any]).asInstanceOf[Document]
  
  inline def createSVGMatrix(matrix: Matrix): SVGMatrix = ^.asInstanceOf[js.Dynamic].applyDynamic("createSVGMatrix")(matrix.asInstanceOf[js.Any]).asInstanceOf[SVGMatrix]
  inline def createSVGMatrix(matrix: SVGMatrix): SVGMatrix = ^.asInstanceOf[js.Dynamic].applyDynamic("createSVGMatrix")(matrix.asInstanceOf[js.Any]).asInstanceOf[SVGMatrix]
  
  inline def createSVGPoint(x: Double, y: Double): SVGPoint = (^.asInstanceOf[js.Dynamic].applyDynamic("createSVGPoint")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[SVGPoint]
  
  inline def createSVGTransform(): SVGTransform = ^.asInstanceOf[js.Dynamic].applyDynamic("createSVGTransform")().asInstanceOf[SVGTransform]
  inline def createSVGTransform(matrix: Matrix): SVGTransform = ^.asInstanceOf[js.Dynamic].applyDynamic("createSVGTransform")(matrix.asInstanceOf[js.Any]).asInstanceOf[SVGTransform]
  inline def createSVGTransform(matrix: SVGMatrix): SVGTransform = ^.asInstanceOf[js.Dynamic].applyDynamic("createSVGTransform")(matrix.asInstanceOf[js.Any]).asInstanceOf[SVGTransform]
  
  inline def createSlicePathData(innerRadius: Double, outRadius: Double, startAngle: Double, endAngle: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createSlicePathData")(innerRadius.asInstanceOf[js.Any], outRadius.asInstanceOf[js.Any], startAngle.asInstanceOf[js.Any], endAngle.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def decomposeMatrix(matrix: Matrix): DecomposedTransformation = ^.asInstanceOf[js.Dynamic].applyDynamic("decomposeMatrix")(matrix.asInstanceOf[js.Any]).asInstanceOf[DecomposedTransformation]
  inline def decomposeMatrix(matrix: SVGMatrix): DecomposedTransformation = ^.asInstanceOf[js.Dynamic].applyDynamic("decomposeMatrix")(matrix.asInstanceOf[js.Any]).asInstanceOf[DecomposedTransformation]
  
  inline def deltaTransformPoint(matrix: Matrix, point: PlainPoint): PlainPoint = (^.asInstanceOf[js.Dynamic].applyDynamic("deltaTransformPoint")(matrix.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[PlainPoint]
  inline def deltaTransformPoint(matrix: Matrix, point: SVGPoint): PlainPoint = (^.asInstanceOf[js.Dynamic].applyDynamic("deltaTransformPoint")(matrix.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[PlainPoint]
  inline def deltaTransformPoint(matrix: SVGMatrix, point: PlainPoint): PlainPoint = (^.asInstanceOf[js.Dynamic].applyDynamic("deltaTransformPoint")(matrix.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[PlainPoint]
  inline def deltaTransformPoint(matrix: SVGMatrix, point: SVGPoint): PlainPoint = (^.asInstanceOf[js.Dynamic].applyDynamic("deltaTransformPoint")(matrix.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[PlainPoint]
  
  inline def ensureId(node: Vectorizer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureId")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def ensureId(node: SVGElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureId")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def findAnnotationsAtIndex(annotations: js.Array[TextAnnotation], index: Double): js.Array[TextAnnotation] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAnnotationsAtIndex")(annotations.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Array[TextAnnotation]]
  
  inline def findAnnotationsBetweenIndexes(annotations: js.Array[TextAnnotation], start: Double, end: Double): js.Array[TextAnnotation] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAnnotationsBetweenIndexes")(annotations.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[TextAnnotation]]
  
  inline def getPointsFromSvgNode(node: Vectorizer): js.Array[SVGPoint] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPointsFromSvgNode")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[SVGPoint]]
  inline def getPointsFromSvgNode(node: SVGElement): js.Array[SVGPoint] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPointsFromSvgNode")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[SVGPoint]]
  
  inline def isArray(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isObject(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSVGGraphicsElement(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSVGGraphicsElement")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isString(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isUndefined(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUndefined")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isV(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isV")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isVElement(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVElement")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def matrixToRotate(matrix: Matrix): Rotation = ^.asInstanceOf[js.Dynamic].applyDynamic("matrixToRotate")(matrix.asInstanceOf[js.Any]).asInstanceOf[Rotation]
  inline def matrixToRotate(matrix: SVGMatrix): Rotation = ^.asInstanceOf[js.Dynamic].applyDynamic("matrixToRotate")(matrix.asInstanceOf[js.Any]).asInstanceOf[Rotation]
  
  inline def matrixToScale(matrix: Matrix): Scale = ^.asInstanceOf[js.Dynamic].applyDynamic("matrixToScale")(matrix.asInstanceOf[js.Any]).asInstanceOf[Scale]
  inline def matrixToScale(matrix: SVGMatrix): Scale = ^.asInstanceOf[js.Dynamic].applyDynamic("matrixToScale")(matrix.asInstanceOf[js.Any]).asInstanceOf[Scale]
  
  inline def matrixToTransformString(matrix: Matrix): String = ^.asInstanceOf[js.Dynamic].applyDynamic("matrixToTransformString")(matrix.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def matrixToTransformString(matrix: SVGMatrix): String = ^.asInstanceOf[js.Dynamic].applyDynamic("matrixToTransformString")(matrix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def matrixToTranslate(matrix: Matrix): Translation = ^.asInstanceOf[js.Dynamic].applyDynamic("matrixToTranslate")(matrix.asInstanceOf[js.Any]).asInstanceOf[Translation]
  inline def matrixToTranslate(matrix: SVGMatrix): Translation = ^.asInstanceOf[js.Dynamic].applyDynamic("matrixToTranslate")(matrix.asInstanceOf[js.Any]).asInstanceOf[Translation]
  
  inline def mergeAttrs(a: js.Any, b: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeAttrs")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def normalizePathData(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizePathData")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parseTransformString(transform: String): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTransformString")(transform.asInstanceOf[js.Any]).asInstanceOf[Transform]
  
  inline def parseXML(data: String): XMLDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("parseXML")(data.asInstanceOf[js.Any]).asInstanceOf[XMLDocument]
  inline def parseXML(data: String, opt: ParseXMLOptions): XMLDocument = (^.asInstanceOf[js.Dynamic].applyDynamic("parseXML")(data.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[XMLDocument]
  
  inline def qualifyAttr(name: String): QualifiedAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("qualifyAttr")(name.asInstanceOf[js.Any]).asInstanceOf[QualifiedAttribute]
  
  inline def rectToPath(r: RoundedRect): String = ^.asInstanceOf[js.Dynamic].applyDynamic("rectToPath")(r.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def sanitizeText(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeText")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def shiftAnnotations(annotations: js.Array[TextAnnotation], index: Double, offset: Double): js.Array[TextAnnotation] = (^.asInstanceOf[js.Dynamic].applyDynamic("shiftAnnotations")(annotations.asInstanceOf[js.Any], index.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Array[TextAnnotation]]
  
  inline def styleToObject(styleString: String): StringDictionary[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("styleToObject")(styleString.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[String]]
  
  inline def svgPointsToPath(points: js.Array[PlainPoint | SVGPoint]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("svgPointsToPath")(points.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toNode(el: js.Array[SVGElement]): SVGElement = ^.asInstanceOf[js.Dynamic].applyDynamic("toNode")(el.asInstanceOf[js.Any]).asInstanceOf[SVGElement]
  inline def toNode(el: Vectorizer): SVGElement = ^.asInstanceOf[js.Dynamic].applyDynamic("toNode")(el.asInstanceOf[js.Any]).asInstanceOf[SVGElement]
  inline def toNode(el: SVGElement): SVGElement = ^.asInstanceOf[js.Dynamic].applyDynamic("toNode")(el.asInstanceOf[js.Any]).asInstanceOf[SVGElement]
  
  inline def transformLine(p: Line, matrix: SVGMatrix): Line = (^.asInstanceOf[js.Dynamic].applyDynamic("transformLine")(p.asInstanceOf[js.Any], matrix.asInstanceOf[js.Any])).asInstanceOf[Line]
  
  inline def transformPoint(p: PlainPoint, matrix: SVGMatrix): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("transformPoint")(p.asInstanceOf[js.Any], matrix.asInstanceOf[js.Any])).asInstanceOf[Point]
  
  inline def transformPolyline(p: js.Array[PlainPoint], matrix: SVGMatrix): Polyline = (^.asInstanceOf[js.Dynamic].applyDynamic("transformPolyline")(p.asInstanceOf[js.Any], matrix.asInstanceOf[js.Any])).asInstanceOf[Polyline]
  inline def transformPolyline(p: Polyline, matrix: SVGMatrix): Polyline = (^.asInstanceOf[js.Dynamic].applyDynamic("transformPolyline")(p.asInstanceOf[js.Any], matrix.asInstanceOf[js.Any])).asInstanceOf[Polyline]
  
  inline def transformRect(r: PlainRect, matrix: SVGMatrix): Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("transformRect")(r.asInstanceOf[js.Any], matrix.asInstanceOf[js.Any])).asInstanceOf[Rect]
  
  inline def transformStringToMatrix(transform: String): SVGMatrix = ^.asInstanceOf[js.Dynamic].applyDynamic("transformStringToMatrix")(transform.asInstanceOf[js.Any]).asInstanceOf[SVGMatrix]
  
  inline def uniqueId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uniqueId")().asInstanceOf[String]
  
  trait AnnotateStringOptions extends StObject {
    
    var includeAnnotationIndices: js.UndefOr[Boolean] = js.undefined
    
    var offset: js.UndefOr[Double] = js.undefined
  }
  object AnnotateStringOptions {
    
    inline def apply(): AnnotateStringOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnnotateStringOptions]
    }
    
    extension [Self <: AnnotateStringOptions](x: Self) {
      
      inline def setIncludeAnnotationIndices(value: Boolean): Self = StObject.set(x, "includeAnnotationIndices", value.asInstanceOf[js.Any])
      
      inline def setIncludeAnnotationIndicesUndefined: Self = StObject.set(x, "includeAnnotationIndices", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    }
  }
  
  trait DecomposedTransformation extends StObject {
    
    var rotation: Double
    
    var scaleX: Double
    
    var scaleY: Double
    
    var skewX: Double
    
    var skewY: Double
    
    var translateX: Double
    
    var translateY: Double
  }
  object DecomposedTransformation {
    
    inline def apply(
      rotation: Double,
      scaleX: Double,
      scaleY: Double,
      skewX: Double,
      skewY: Double,
      translateX: Double,
      translateY: Double
    ): DecomposedTransformation = {
      val __obj = js.Dynamic.literal(rotation = rotation.asInstanceOf[js.Any], scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any], skewX = skewX.asInstanceOf[js.Any], skewY = skewY.asInstanceOf[js.Any], translateX = translateX.asInstanceOf[js.Any], translateY = translateY.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecomposedTransformation]
    }
    
    extension [Self <: DecomposedTransformation](x: Self) {
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
      
      inline def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
      
      inline def setSkewX(value: Double): Self = StObject.set(x, "skewX", value.asInstanceOf[js.Any])
      
      inline def setSkewY(value: Double): Self = StObject.set(x, "skewY", value.asInstanceOf[js.Any])
      
      inline def setTranslateX(value: Double): Self = StObject.set(x, "translateX", value.asInstanceOf[js.Any])
      
      inline def setTranslateY(value: Double): Self = StObject.set(x, "translateY", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetBBoxOptions extends StObject {
    
    var recursive: js.UndefOr[Boolean] = js.undefined
    
    var target: js.UndefOr[SVGElement | Vectorizer] = js.undefined
  }
  object GetBBoxOptions {
    
    inline def apply(): GetBBoxOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetBBoxOptions]
    }
    
    extension [Self <: GetBBoxOptions](x: Self) {
      
      inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
      
      inline def setTarget(value: SVGElement | Vectorizer): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  // modifiable Matrix. SVGMatrix doesn't allow set on properties or a constructor.
  trait Matrix extends StObject {
    
    var a: Double
    
    var b: Double
    
    var c: Double
    
    var d: Double
    
    var e: Double
    
    var f: Double
  }
  object Matrix {
    
    inline def apply(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): Matrix = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any])
      __obj.asInstanceOf[Matrix]
    }
    
    extension [Self <: Matrix](x: Self) {
      
      inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setC(value: Double): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
      
      inline def setD(value: Double): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      inline def setE(value: Double): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      inline def setF(value: Double): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParseXMLOptions extends StObject {
    
    var async: js.UndefOr[Boolean] = js.undefined
  }
  object ParseXMLOptions {
    
    inline def apply(): ParseXMLOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseXMLOptions]
    }
    
    extension [Self <: ParseXMLOptions](x: Self) {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    }
  }
  
  trait QualifiedAttribute extends StObject {
    
    var local: String
    
    var ns: String | Null
  }
  object QualifiedAttribute {
    
    inline def apply(local: String): QualifiedAttribute = {
      val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], ns = null)
      __obj.asInstanceOf[QualifiedAttribute]
    }
    
    extension [Self <: QualifiedAttribute](x: Self) {
      
      inline def setLocal(value: String): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      inline def setNs(value: String): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
      
      inline def setNsNull: Self = StObject.set(x, "ns", null)
    }
  }
  
  trait RotateOptions extends StObject {
    
    var absolute: js.UndefOr[Boolean] = js.undefined
  }
  object RotateOptions {
    
    inline def apply(): RotateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RotateOptions]
    }
    
    extension [Self <: RotateOptions](x: Self) {
      
      inline def setAbsolute(value: Boolean): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
      
      inline def setAbsoluteUndefined: Self = StObject.set(x, "absolute", js.undefined)
    }
  }
  
  trait Rotation extends StObject {
    
    var angle: Double
    
    var cx: js.UndefOr[Double] = js.undefined
    
    var cy: js.UndefOr[Double] = js.undefined
  }
  object Rotation {
    
    inline def apply(angle: Double): Rotation = {
      val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rotation]
    }
    
    extension [Self <: Rotation](x: Self) {
      
      inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setCx(value: Double): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
      
      inline def setCxUndefined: Self = StObject.set(x, "cx", js.undefined)
      
      inline def setCy(value: Double): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
      
      inline def setCyUndefined: Self = StObject.set(x, "cy", js.undefined)
    }
  }
  
  trait RoundedRect
    extends StObject
       with PlainRect {
    
    var `bottom-rx`: js.UndefOr[Double] = js.undefined
    
    var `bottom-ry`: js.UndefOr[Double] = js.undefined
    
    var rx: js.UndefOr[Double] = js.undefined
    
    var ry: js.UndefOr[Double] = js.undefined
    
    var `top-rx`: js.UndefOr[Double] = js.undefined
    
    var `top-ry`: js.UndefOr[Double] = js.undefined
  }
  object RoundedRect {
    
    inline def apply(height: Double, width: Double, x: Double, y: Double): RoundedRect = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoundedRect]
    }
    
    extension [Self <: RoundedRect](x: Self) {
      
      inline def `setBottom-rx`(value: Double): Self = StObject.set(x, "bottom-rx", value.asInstanceOf[js.Any])
      
      inline def `setBottom-rxUndefined`: Self = StObject.set(x, "bottom-rx", js.undefined)
      
      inline def `setBottom-ry`(value: Double): Self = StObject.set(x, "bottom-ry", value.asInstanceOf[js.Any])
      
      inline def `setBottom-ryUndefined`: Self = StObject.set(x, "bottom-ry", js.undefined)
      
      inline def setRx(value: Double): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
      
      inline def setRxUndefined: Self = StObject.set(x, "rx", js.undefined)
      
      inline def setRy(value: Double): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
      
      inline def setRyUndefined: Self = StObject.set(x, "ry", js.undefined)
      
      inline def `setTop-rx`(value: Double): Self = StObject.set(x, "top-rx", value.asInstanceOf[js.Any])
      
      inline def `setTop-rxUndefined`: Self = StObject.set(x, "top-rx", js.undefined)
      
      inline def `setTop-ry`(value: Double): Self = StObject.set(x, "top-ry", value.asInstanceOf[js.Any])
      
      inline def `setTop-ryUndefined`: Self = StObject.set(x, "top-ry", js.undefined)
    }
  }
  
  trait Sample extends StObject {
    
    var distance: Double
    
    var x: Double
    
    var y: Double
  }
  object Sample {
    
    inline def apply(distance: Double, x: Double, y: Double): Sample = {
      val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Sample]
    }
    
    extension [Self <: Sample](x: Self) {
      
      inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Scale extends StObject {
    
    var sx: Double
    
    var sy: Double
  }
  object Scale {
    
    inline def apply(sx: Double, sy: Double): Scale = {
      val __obj = js.Dynamic.literal(sx = sx.asInstanceOf[js.Any], sy = sy.asInstanceOf[js.Any])
      __obj.asInstanceOf[Scale]
    }
    
    extension [Self <: Scale](x: Self) {
      
      inline def setSx(value: Double): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
      
      inline def setSy(value: Double): Self = StObject.set(x, "sy", value.asInstanceOf[js.Any])
    }
  }
  
  trait TextAnnotation extends StObject {
    
    var attrs: StringDictionary[js.Any]
    
    var end: Double
    
    var start: Double
  }
  object TextAnnotation {
    
    inline def apply(attrs: StringDictionary[js.Any], end: Double, start: Double): TextAnnotation = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextAnnotation]
    }
    
    extension [Self <: TextAnnotation](x: Self) {
      
      inline def setAttrs(value: StringDictionary[js.Any]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait TextOptions extends StObject {
    
    var annotations: js.UndefOr[js.Array[TextAnnotation]] = js.undefined
    
    var displayEmpty: js.UndefOr[Boolean] = js.undefined
    
    var eol: js.UndefOr[String] = js.undefined
    
    var includeAnnotationIndices: js.UndefOr[Boolean] = js.undefined
    
    var lineHeight: js.UndefOr[Double | String] = js.undefined
    
    var textPath: js.UndefOr[String | StringDictionary[js.Any]] = js.undefined
    
    var textVerticalAnchor: js.UndefOr[TextVerticalAnchor | Double | String] = js.undefined
    
    var x: js.UndefOr[Double | String] = js.undefined
  }
  object TextOptions {
    
    inline def apply(): TextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextOptions]
    }
    
    extension [Self <: TextOptions](x: Self) {
      
      inline def setAnnotations(value: js.Array[TextAnnotation]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
      
      inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
      
      inline def setAnnotationsVarargs(value: TextAnnotation*): Self = StObject.set(x, "annotations", js.Array(value :_*))
      
      inline def setDisplayEmpty(value: Boolean): Self = StObject.set(x, "displayEmpty", value.asInstanceOf[js.Any])
      
      inline def setDisplayEmptyUndefined: Self = StObject.set(x, "displayEmpty", js.undefined)
      
      inline def setEol(value: String): Self = StObject.set(x, "eol", value.asInstanceOf[js.Any])
      
      inline def setEolUndefined: Self = StObject.set(x, "eol", js.undefined)
      
      inline def setIncludeAnnotationIndices(value: Boolean): Self = StObject.set(x, "includeAnnotationIndices", value.asInstanceOf[js.Any])
      
      inline def setIncludeAnnotationIndicesUndefined: Self = StObject.set(x, "includeAnnotationIndices", js.undefined)
      
      inline def setLineHeight(value: Double | String): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      inline def setTextPath(value: String | StringDictionary[js.Any]): Self = StObject.set(x, "textPath", value.asInstanceOf[js.Any])
      
      inline def setTextPathUndefined: Self = StObject.set(x, "textPath", js.undefined)
      
      inline def setTextVerticalAnchor(value: TextVerticalAnchor | Double | String): Self = StObject.set(x, "textVerticalAnchor", value.asInstanceOf[js.Any])
      
      inline def setTextVerticalAnchorUndefined: Self = StObject.set(x, "textVerticalAnchor", js.undefined)
      
      inline def setX(value: Double | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jointjs.jointjsStrings.top
    - typings.jointjs.jointjsStrings.bottom
    - typings.jointjs.jointjsStrings.middle
  */
  trait TextVerticalAnchor extends StObject
  object TextVerticalAnchor {
    
    inline def bottom: typings.jointjs.jointjsStrings.bottom = "bottom".asInstanceOf[typings.jointjs.jointjsStrings.bottom]
    
    inline def middle: typings.jointjs.jointjsStrings.middle = "middle".asInstanceOf[typings.jointjs.jointjsStrings.middle]
    
    inline def top: typings.jointjs.jointjsStrings.top = "top".asInstanceOf[typings.jointjs.jointjsStrings.top]
  }
  
  trait Transform extends StObject {
    
    var rotate: Rotation
    
    var scale: Scale
    
    var translate: Translation
    
    var value: String
  }
  object Transform {
    
    inline def apply(rotate: Rotation, scale: Scale, translate: Translation, value: String): Transform = {
      val __obj = js.Dynamic.literal(rotate = rotate.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], translate = translate.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Transform]
    }
    
    extension [Self <: Transform](x: Self) {
      
      inline def setRotate(value: Rotation): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setScale(value: Scale): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setTranslate(value: Translation): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait TransformOptions extends StObject {
    
    var absolute: js.UndefOr[Boolean] = js.undefined
  }
  object TransformOptions {
    
    inline def apply(): TransformOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransformOptions]
    }
    
    extension [Self <: TransformOptions](x: Self) {
      
      inline def setAbsolute(value: Boolean): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
      
      inline def setAbsoluteUndefined: Self = StObject.set(x, "absolute", js.undefined)
    }
  }
  
  trait Translation extends StObject {
    
    var tx: Double
    
    var ty: Double
  }
  object Translation {
    
    inline def apply(tx: Double, ty: Double): Translation = {
      val __obj = js.Dynamic.literal(tx = tx.asInstanceOf[js.Any], ty = ty.asInstanceOf[js.Any])
      __obj.asInstanceOf[Translation]
    }
    
    extension [Self <: Translation](x: Self) {
      
      inline def setTx(value: Double): Self = StObject.set(x, "tx", value.asInstanceOf[js.Any])
      
      inline def setTy(value: Double): Self = StObject.set(x, "ty", value.asInstanceOf[js.Any])
    }
  }
}
