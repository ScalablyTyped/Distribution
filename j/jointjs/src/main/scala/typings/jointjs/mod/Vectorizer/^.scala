package typings.jointjs.mod.Vectorizer

import org.scalablytyped.runtime.StringDictionary
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jointjs", "Vectorizer")
@js.native
object ^ extends js.Object {
  
  def annotateString(t: String, annotations: js.Array[TextAnnotation]): js.Array[String | StringDictionary[_]] = js.native
  def annotateString(t: String, annotations: js.Array[TextAnnotation], opt: AnnotateStringOptions): js.Array[String | StringDictionary[_]] = js.native
  
  def convertCircleToPathData(circle: String): String = js.native
  def convertCircleToPathData(circle: typings.jointjs.mod.Vectorizer): String = js.native
  def convertCircleToPathData(circle: SVGElement): String = js.native
  
  def convertEllipseToPathData(ellipse: String): String = js.native
  def convertEllipseToPathData(ellipse: typings.jointjs.mod.Vectorizer): String = js.native
  def convertEllipseToPathData(ellipse: SVGElement): String = js.native
  
  def convertLineToPathData(line: String): String = js.native
  def convertLineToPathData(line: typings.jointjs.mod.Vectorizer): String = js.native
  def convertLineToPathData(line: SVGElement): String = js.native
  
  def convertPolygonToPathData(line: String): String = js.native
  def convertPolygonToPathData(line: typings.jointjs.mod.Vectorizer): String = js.native
  def convertPolygonToPathData(line: SVGElement): String = js.native
  
  def convertPolylineToPathData(line: String): String = js.native
  def convertPolylineToPathData(line: typings.jointjs.mod.Vectorizer): String = js.native
  def convertPolylineToPathData(line: SVGElement): String = js.native
  
  def convertRectToPathData(rect: String): String = js.native
  def convertRectToPathData(rect: typings.jointjs.mod.Vectorizer): String = js.native
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
  
  def ensureId(node: typings.jointjs.mod.Vectorizer): String = js.native
  def ensureId(node: SVGElement): String = js.native
  
  def findAnnotationsAtIndex(annotations: js.Array[TextAnnotation], index: Double): js.Array[TextAnnotation] = js.native
  
  def findAnnotationsBetweenIndexes(annotations: js.Array[TextAnnotation], start: Double, end: Double): js.Array[TextAnnotation] = js.native
  
  def getPointsFromSvgNode(node: typings.jointjs.mod.Vectorizer): js.Array[SVGPoint] = js.native
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
  def toNode(el: typings.jointjs.mod.Vectorizer): SVGElement = js.native
  def toNode(el: SVGElement): SVGElement = js.native
  
  def transformLine(p: Line, matrix: SVGMatrix): Line = js.native
  
  def transformPoint(p: PlainPoint, matrix: SVGMatrix): Point = js.native
  
  def transformPolyline(p: js.Array[PlainPoint], matrix: SVGMatrix): Polyline = js.native
  def transformPolyline(p: Polyline, matrix: SVGMatrix): Polyline = js.native
  
  def transformRect(r: PlainRect, matrix: SVGMatrix): Rect = js.native
  
  def transformStringToMatrix(transform: String): SVGMatrix = js.native
  
  def uniqueId(): String = js.native
}
