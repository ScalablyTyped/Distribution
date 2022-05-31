package typings.jointjs.global.joint

import org.scalablytyped.runtime.StringDictionary
import typings.jointjs.mod.Vectorizer.AnnotateStringOptions
import typings.jointjs.mod.Vectorizer.DecomposedTransformation
import typings.jointjs.mod.Vectorizer.Matrix
import typings.jointjs.mod.Vectorizer.ParseXMLOptions
import typings.jointjs.mod.Vectorizer.QualifiedAttribute
import typings.jointjs.mod.Vectorizer.Rotation
import typings.jointjs.mod.Vectorizer.RoundedRect
import typings.jointjs.mod.Vectorizer.Scale
import typings.jointjs.mod.Vectorizer.TextAnnotation
import typings.jointjs.mod.Vectorizer.Transform
import typings.jointjs.mod.Vectorizer.Translation
import typings.jointjs.mod.g.Line
import typings.jointjs.mod.g.PlainPoint
import typings.jointjs.mod.g.PlainRect
import typings.jointjs.mod.g.Point
import typings.jointjs.mod.g.Polyline
import typings.jointjs.mod.g.Rect
import typings.std.Document
import typings.std.SVGElement
import typings.std.SVGMatrix
import typings.std.SVGPoint
import typings.std.SVGTransform
import typings.std.XMLDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("joint.Vectorizer")
@js.native
class Vectorizer protected ()
  extends typings.jointjs.mod.Vectorizer {
  def this(el: String) = this()
  def this(el: SVGElement) = this()
  def this(el: String, attrs: StringDictionary[js.Any]) = this()
  def this(el: SVGElement, attrs: StringDictionary[js.Any]) = this()
  def this(
    el: String,
    attrs: StringDictionary[js.Any],
    children: js.Array[SVGElement | typings.jointjs.mod.Vectorizer]
  ) = this()
  def this(el: String, attrs: StringDictionary[js.Any], children: typings.jointjs.mod.Vectorizer) = this()
  def this(el: String, attrs: StringDictionary[js.Any], children: SVGElement) = this()
  def this(el: String, attrs: Unit, children: js.Array[SVGElement | typings.jointjs.mod.Vectorizer]) = this()
  def this(el: String, attrs: Unit, children: typings.jointjs.mod.Vectorizer) = this()
  def this(el: String, attrs: Unit, children: SVGElement) = this()
  def this(
    el: SVGElement,
    attrs: StringDictionary[js.Any],
    children: js.Array[SVGElement | typings.jointjs.mod.Vectorizer]
  ) = this()
  def this(el: SVGElement, attrs: StringDictionary[js.Any], children: typings.jointjs.mod.Vectorizer) = this()
  def this(el: SVGElement, attrs: StringDictionary[js.Any], children: SVGElement) = this()
  def this(el: SVGElement, attrs: Unit, children: js.Array[SVGElement | typings.jointjs.mod.Vectorizer]) = this()
  def this(el: SVGElement, attrs: Unit, children: typings.jointjs.mod.Vectorizer) = this()
  def this(el: SVGElement, attrs: Unit, children: SVGElement) = this()
}
/* static members */
object Vectorizer {
  
  @JSGlobal("joint.Vectorizer")
  @js.native
  val ^ : js.Any = js.native
  
  inline def annotateString(t: String, annotations: js.Array[TextAnnotation]): js.Array[String | StringDictionary[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("annotateString")(t.asInstanceOf[js.Any], annotations.asInstanceOf[js.Any])).asInstanceOf[js.Array[String | StringDictionary[js.Any]]]
  inline def annotateString(t: String, annotations: js.Array[TextAnnotation], opt: AnnotateStringOptions): js.Array[String | StringDictionary[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("annotateString")(t.asInstanceOf[js.Any], annotations.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[js.Array[String | StringDictionary[js.Any]]]
  
  inline def convertCircleToPathData(circle: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertCircleToPathData")(circle.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def convertCircleToPathData(circle: typings.jointjs.mod.Vectorizer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertCircleToPathData")(circle.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def convertCircleToPathData(circle: SVGElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertCircleToPathData")(circle.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def convertEllipseToPathData(ellipse: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertEllipseToPathData")(ellipse.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def convertEllipseToPathData(ellipse: typings.jointjs.mod.Vectorizer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertEllipseToPathData")(ellipse.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def convertEllipseToPathData(ellipse: SVGElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertEllipseToPathData")(ellipse.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def convertLineToPathData(line: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertLineToPathData")(line.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def convertLineToPathData(line: typings.jointjs.mod.Vectorizer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertLineToPathData")(line.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def convertLineToPathData(line: SVGElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertLineToPathData")(line.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def convertPolygonToPathData(line: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertPolygonToPathData")(line.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def convertPolygonToPathData(line: typings.jointjs.mod.Vectorizer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertPolygonToPathData")(line.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def convertPolygonToPathData(line: SVGElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertPolygonToPathData")(line.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def convertPolylineToPathData(line: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertPolylineToPathData")(line.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def convertPolylineToPathData(line: typings.jointjs.mod.Vectorizer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertPolylineToPathData")(line.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def convertPolylineToPathData(line: SVGElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertPolylineToPathData")(line.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def convertRectToPathData(rect: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertRectToPathData")(rect.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def convertRectToPathData(rect: typings.jointjs.mod.Vectorizer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertRectToPathData")(rect.asInstanceOf[js.Any]).asInstanceOf[String]
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
  
  inline def ensureId(node: typings.jointjs.mod.Vectorizer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureId")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def ensureId(node: SVGElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureId")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def findAnnotationsAtIndex(annotations: js.Array[TextAnnotation], index: Double): js.Array[TextAnnotation] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAnnotationsAtIndex")(annotations.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Array[TextAnnotation]]
  
  inline def findAnnotationsBetweenIndexes(annotations: js.Array[TextAnnotation], start: Double, end: Double): js.Array[TextAnnotation] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAnnotationsBetweenIndexes")(annotations.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[TextAnnotation]]
  
  inline def getPointsFromSvgNode(node: typings.jointjs.mod.Vectorizer): js.Array[SVGPoint] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPointsFromSvgNode")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[SVGPoint]]
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
  inline def toNode(el: typings.jointjs.mod.Vectorizer): SVGElement = ^.asInstanceOf[js.Dynamic].applyDynamic("toNode")(el.asInstanceOf[js.Any]).asInstanceOf[SVGElement]
  inline def toNode(el: SVGElement): SVGElement = ^.asInstanceOf[js.Dynamic].applyDynamic("toNode")(el.asInstanceOf[js.Any]).asInstanceOf[SVGElement]
  
  inline def transformLine(p: Line, matrix: SVGMatrix): Line = (^.asInstanceOf[js.Dynamic].applyDynamic("transformLine")(p.asInstanceOf[js.Any], matrix.asInstanceOf[js.Any])).asInstanceOf[Line]
  
  inline def transformPoint(p: PlainPoint, matrix: SVGMatrix): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("transformPoint")(p.asInstanceOf[js.Any], matrix.asInstanceOf[js.Any])).asInstanceOf[Point]
  
  inline def transformPolyline(p: js.Array[PlainPoint], matrix: SVGMatrix): Polyline = (^.asInstanceOf[js.Dynamic].applyDynamic("transformPolyline")(p.asInstanceOf[js.Any], matrix.asInstanceOf[js.Any])).asInstanceOf[Polyline]
  inline def transformPolyline(p: Polyline, matrix: SVGMatrix): Polyline = (^.asInstanceOf[js.Dynamic].applyDynamic("transformPolyline")(p.asInstanceOf[js.Any], matrix.asInstanceOf[js.Any])).asInstanceOf[Polyline]
  
  inline def transformRect(r: PlainRect, matrix: SVGMatrix): Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("transformRect")(r.asInstanceOf[js.Any], matrix.asInstanceOf[js.Any])).asInstanceOf[Rect]
  
  inline def transformStringToMatrix(transform: String): SVGMatrix = ^.asInstanceOf[js.Dynamic].applyDynamic("transformStringToMatrix")(transform.asInstanceOf[js.Any]).asInstanceOf[SVGMatrix]
  
  inline def uniqueId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uniqueId")().asInstanceOf[String]
}
