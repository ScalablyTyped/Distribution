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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jointjs", "Vectorizer")
@js.native
class Vectorizer protected () extends StObject {
  def this(el: String) = this()
  def this(el: SVGElement) = this()
  def this(el: String, attrs: StringDictionary[js.Any]) = this()
  def this(el: SVGElement, attrs: StringDictionary[js.Any]) = this()
  def this(el: String, attrs: js.UndefOr[scala.Nothing], children: js.Array[SVGElement | Vectorizer]) = this()
  def this(el: String, attrs: js.UndefOr[scala.Nothing], children: Vectorizer) = this()
  def this(el: String, attrs: js.UndefOr[scala.Nothing], children: SVGElement) = this()
  def this(el: String, attrs: StringDictionary[js.Any], children: js.Array[SVGElement | Vectorizer]) = this()
  def this(el: String, attrs: StringDictionary[js.Any], children: Vectorizer) = this()
  def this(el: String, attrs: StringDictionary[js.Any], children: SVGElement) = this()
  def this(el: SVGElement, attrs: js.UndefOr[scala.Nothing], children: js.Array[SVGElement | Vectorizer]) = this()
  def this(el: SVGElement, attrs: js.UndefOr[scala.Nothing], children: Vectorizer) = this()
  def this(el: SVGElement, attrs: js.UndefOr[scala.Nothing], children: SVGElement) = this()
  def this(el: SVGElement, attrs: StringDictionary[js.Any], children: js.Array[SVGElement | Vectorizer]) = this()
  def this(el: SVGElement, attrs: StringDictionary[js.Any], children: Vectorizer) = this()
  def this(el: SVGElement, attrs: StringDictionary[js.Any], children: SVGElement) = this()
  
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
  def bbox(withoutTransformations: js.UndefOr[scala.Nothing], target: Vectorizer): Rect = js.native
  def bbox(withoutTransformations: js.UndefOr[scala.Nothing], target: SVGElement): Rect = js.native
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
  def rotate(angle: Double, cx: js.UndefOr[scala.Nothing], cy: js.UndefOr[scala.Nothing], opt: RotateOptions): this.type = js.native
  def rotate(angle: Double, cx: js.UndefOr[scala.Nothing], cy: Double): this.type = js.native
  def rotate(angle: Double, cx: js.UndefOr[scala.Nothing], cy: Double, opt: RotateOptions): this.type = js.native
  def rotate(angle: Double, cx: Double): this.type = js.native
  def rotate(angle: Double, cx: Double, cy: js.UndefOr[scala.Nothing], opt: RotateOptions): this.type = js.native
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
  def translate(tx: Double, ty: js.UndefOr[scala.Nothing], opt: TransformOptions): this.type = js.native
  def translate(tx: Double, ty: Double): this.type = js.native
  def translate(tx: Double, ty: Double, opt: TransformOptions): this.type = js.native
  
  def translateAndAutoOrient(position: PlainPoint, reference: PlainPoint): this.type = js.native
  def translateAndAutoOrient(position: PlainPoint, reference: PlainPoint, target: Vectorizer): this.type = js.native
  def translateAndAutoOrient(position: PlainPoint, reference: PlainPoint, target: SVGElement): this.type = js.native
  
  def translateCenterToPoint(p: PlainPoint): this.type = js.native
}
/* static members */
object Vectorizer {
  
  @JSImport("jointjs", "Vectorizer.annotateString")
  @js.native
  def annotateString(t: String, annotations: js.Array[TextAnnotation]): js.Array[String | StringDictionary[_]] = js.native
  @JSImport("jointjs", "Vectorizer.annotateString")
  @js.native
  def annotateString(t: String, annotations: js.Array[TextAnnotation], opt: AnnotateStringOptions): js.Array[String | StringDictionary[_]] = js.native
  
  @JSImport("jointjs", "Vectorizer.convertCircleToPathData")
  @js.native
  def convertCircleToPathData(circle: String): String = js.native
  @JSImport("jointjs", "Vectorizer.convertCircleToPathData")
  @js.native
  def convertCircleToPathData(circle: Vectorizer): String = js.native
  @JSImport("jointjs", "Vectorizer.convertCircleToPathData")
  @js.native
  def convertCircleToPathData(circle: SVGElement): String = js.native
  
  @JSImport("jointjs", "Vectorizer.convertEllipseToPathData")
  @js.native
  def convertEllipseToPathData(ellipse: String): String = js.native
  @JSImport("jointjs", "Vectorizer.convertEllipseToPathData")
  @js.native
  def convertEllipseToPathData(ellipse: Vectorizer): String = js.native
  @JSImport("jointjs", "Vectorizer.convertEllipseToPathData")
  @js.native
  def convertEllipseToPathData(ellipse: SVGElement): String = js.native
  
  @JSImport("jointjs", "Vectorizer.convertLineToPathData")
  @js.native
  def convertLineToPathData(line: String): String = js.native
  @JSImport("jointjs", "Vectorizer.convertLineToPathData")
  @js.native
  def convertLineToPathData(line: Vectorizer): String = js.native
  @JSImport("jointjs", "Vectorizer.convertLineToPathData")
  @js.native
  def convertLineToPathData(line: SVGElement): String = js.native
  
  @JSImport("jointjs", "Vectorizer.convertPolygonToPathData")
  @js.native
  def convertPolygonToPathData(line: String): String = js.native
  @JSImport("jointjs", "Vectorizer.convertPolygonToPathData")
  @js.native
  def convertPolygonToPathData(line: Vectorizer): String = js.native
  @JSImport("jointjs", "Vectorizer.convertPolygonToPathData")
  @js.native
  def convertPolygonToPathData(line: SVGElement): String = js.native
  
  @JSImport("jointjs", "Vectorizer.convertPolylineToPathData")
  @js.native
  def convertPolylineToPathData(line: String): String = js.native
  @JSImport("jointjs", "Vectorizer.convertPolylineToPathData")
  @js.native
  def convertPolylineToPathData(line: Vectorizer): String = js.native
  @JSImport("jointjs", "Vectorizer.convertPolylineToPathData")
  @js.native
  def convertPolylineToPathData(line: SVGElement): String = js.native
  
  @JSImport("jointjs", "Vectorizer.convertRectToPathData")
  @js.native
  def convertRectToPathData(rect: String): String = js.native
  @JSImport("jointjs", "Vectorizer.convertRectToPathData")
  @js.native
  def convertRectToPathData(rect: Vectorizer): String = js.native
  @JSImport("jointjs", "Vectorizer.convertRectToPathData")
  @js.native
  def convertRectToPathData(rect: SVGElement): String = js.native
  
  @JSImport("jointjs", "Vectorizer.createSVGDocument")
  @js.native
  def createSVGDocument(content: String): Document = js.native
  
  @JSImport("jointjs", "Vectorizer.createSVGMatrix")
  @js.native
  def createSVGMatrix(matrix: Matrix): SVGMatrix = js.native
  @JSImport("jointjs", "Vectorizer.createSVGMatrix")
  @js.native
  def createSVGMatrix(matrix: SVGMatrix): SVGMatrix = js.native
  
  @JSImport("jointjs", "Vectorizer.createSVGPoint")
  @js.native
  def createSVGPoint(x: Double, y: Double): SVGPoint = js.native
  
  @JSImport("jointjs", "Vectorizer.createSVGTransform")
  @js.native
  def createSVGTransform(): SVGTransform = js.native
  @JSImport("jointjs", "Vectorizer.createSVGTransform")
  @js.native
  def createSVGTransform(matrix: Matrix): SVGTransform = js.native
  @JSImport("jointjs", "Vectorizer.createSVGTransform")
  @js.native
  def createSVGTransform(matrix: SVGMatrix): SVGTransform = js.native
  
  @JSImport("jointjs", "Vectorizer.createSlicePathData")
  @js.native
  def createSlicePathData(innerRadius: Double, outRadius: Double, startAngle: Double, endAngle: Double): String = js.native
  
  @JSImport("jointjs", "Vectorizer.decomposeMatrix")
  @js.native
  def decomposeMatrix(matrix: Matrix): DecomposedTransformation = js.native
  @JSImport("jointjs", "Vectorizer.decomposeMatrix")
  @js.native
  def decomposeMatrix(matrix: SVGMatrix): DecomposedTransformation = js.native
  
  @JSImport("jointjs", "Vectorizer.deltaTransformPoint")
  @js.native
  def deltaTransformPoint(matrix: Matrix, point: PlainPoint): PlainPoint = js.native
  @JSImport("jointjs", "Vectorizer.deltaTransformPoint")
  @js.native
  def deltaTransformPoint(matrix: Matrix, point: SVGPoint): PlainPoint = js.native
  @JSImport("jointjs", "Vectorizer.deltaTransformPoint")
  @js.native
  def deltaTransformPoint(matrix: SVGMatrix, point: PlainPoint): PlainPoint = js.native
  @JSImport("jointjs", "Vectorizer.deltaTransformPoint")
  @js.native
  def deltaTransformPoint(matrix: SVGMatrix, point: SVGPoint): PlainPoint = js.native
  
  @JSImport("jointjs", "Vectorizer.ensureId")
  @js.native
  def ensureId(node: Vectorizer): String = js.native
  @JSImport("jointjs", "Vectorizer.ensureId")
  @js.native
  def ensureId(node: SVGElement): String = js.native
  
  @JSImport("jointjs", "Vectorizer.findAnnotationsAtIndex")
  @js.native
  def findAnnotationsAtIndex(annotations: js.Array[TextAnnotation], index: Double): js.Array[TextAnnotation] = js.native
  
  @JSImport("jointjs", "Vectorizer.findAnnotationsBetweenIndexes")
  @js.native
  def findAnnotationsBetweenIndexes(annotations: js.Array[TextAnnotation], start: Double, end: Double): js.Array[TextAnnotation] = js.native
  
  @JSImport("jointjs", "Vectorizer.getPointsFromSvgNode")
  @js.native
  def getPointsFromSvgNode(node: Vectorizer): js.Array[SVGPoint] = js.native
  @JSImport("jointjs", "Vectorizer.getPointsFromSvgNode")
  @js.native
  def getPointsFromSvgNode(node: SVGElement): js.Array[SVGPoint] = js.native
  
  @JSImport("jointjs", "Vectorizer.isArray")
  @js.native
  def isArray(value: js.Any): Boolean = js.native
  
  @JSImport("jointjs", "Vectorizer.isObject")
  @js.native
  def isObject(value: js.Any): Boolean = js.native
  
  @JSImport("jointjs", "Vectorizer.isSVGGraphicsElement")
  @js.native
  def isSVGGraphicsElement(value: js.Any): Boolean = js.native
  
  @JSImport("jointjs", "Vectorizer.isString")
  @js.native
  def isString(value: js.Any): Boolean = js.native
  
  @JSImport("jointjs", "Vectorizer.isUndefined")
  @js.native
  def isUndefined(value: js.Any): Boolean = js.native
  
  @JSImport("jointjs", "Vectorizer.isV")
  @js.native
  def isV(value: js.Any): Boolean = js.native
  
  @JSImport("jointjs", "Vectorizer.isVElement")
  @js.native
  def isVElement(value: js.Any): Boolean = js.native
  
  @JSImport("jointjs", "Vectorizer.matrixToRotate")
  @js.native
  def matrixToRotate(matrix: Matrix): Rotation = js.native
  @JSImport("jointjs", "Vectorizer.matrixToRotate")
  @js.native
  def matrixToRotate(matrix: SVGMatrix): Rotation = js.native
  
  @JSImport("jointjs", "Vectorizer.matrixToScale")
  @js.native
  def matrixToScale(matrix: Matrix): Scale = js.native
  @JSImport("jointjs", "Vectorizer.matrixToScale")
  @js.native
  def matrixToScale(matrix: SVGMatrix): Scale = js.native
  
  @JSImport("jointjs", "Vectorizer.matrixToTransformString")
  @js.native
  def matrixToTransformString(matrix: Matrix): String = js.native
  @JSImport("jointjs", "Vectorizer.matrixToTransformString")
  @js.native
  def matrixToTransformString(matrix: SVGMatrix): String = js.native
  
  @JSImport("jointjs", "Vectorizer.matrixToTranslate")
  @js.native
  def matrixToTranslate(matrix: Matrix): Translation = js.native
  @JSImport("jointjs", "Vectorizer.matrixToTranslate")
  @js.native
  def matrixToTranslate(matrix: SVGMatrix): Translation = js.native
  
  @JSImport("jointjs", "Vectorizer.mergeAttrs")
  @js.native
  def mergeAttrs(a: js.Any, b: js.Any): js.Any = js.native
  
  @JSImport("jointjs", "Vectorizer.normalizePathData")
  @js.native
  def normalizePathData(path: String): String = js.native
  
  @JSImport("jointjs", "Vectorizer.parseTransformString")
  @js.native
  def parseTransformString(transform: String): Transform = js.native
  
  @JSImport("jointjs", "Vectorizer.parseXML")
  @js.native
  def parseXML(data: String): XMLDocument = js.native
  @JSImport("jointjs", "Vectorizer.parseXML")
  @js.native
  def parseXML(data: String, opt: ParseXMLOptions): XMLDocument = js.native
  
  @JSImport("jointjs", "Vectorizer.qualifyAttr")
  @js.native
  def qualifyAttr(name: String): QualifiedAttribute = js.native
  
  @JSImport("jointjs", "Vectorizer.rectToPath")
  @js.native
  def rectToPath(r: RoundedRect): String = js.native
  
  @JSImport("jointjs", "Vectorizer.sanitizeText")
  @js.native
  def sanitizeText(text: String): String = js.native
  
  @JSImport("jointjs", "Vectorizer.shiftAnnotations")
  @js.native
  def shiftAnnotations(annotations: js.Array[TextAnnotation], index: Double, offset: Double): js.Array[TextAnnotation] = js.native
  
  @JSImport("jointjs", "Vectorizer.styleToObject")
  @js.native
  def styleToObject(styleString: String): StringDictionary[String] = js.native
  
  @JSImport("jointjs", "Vectorizer.svgPointsToPath")
  @js.native
  def svgPointsToPath(points: js.Array[PlainPoint | SVGPoint]): String = js.native
  
  @JSImport("jointjs", "Vectorizer.toNode")
  @js.native
  def toNode(el: js.Array[SVGElement]): SVGElement = js.native
  @JSImport("jointjs", "Vectorizer.toNode")
  @js.native
  def toNode(el: Vectorizer): SVGElement = js.native
  @JSImport("jointjs", "Vectorizer.toNode")
  @js.native
  def toNode(el: SVGElement): SVGElement = js.native
  
  @JSImport("jointjs", "Vectorizer.transformLine")
  @js.native
  def transformLine(p: Line, matrix: SVGMatrix): Line = js.native
  
  @JSImport("jointjs", "Vectorizer.transformPoint")
  @js.native
  def transformPoint(p: PlainPoint, matrix: SVGMatrix): Point = js.native
  
  @JSImport("jointjs", "Vectorizer.transformPolyline")
  @js.native
  def transformPolyline(p: js.Array[PlainPoint], matrix: SVGMatrix): Polyline = js.native
  @JSImport("jointjs", "Vectorizer.transformPolyline")
  @js.native
  def transformPolyline(p: Polyline, matrix: SVGMatrix): Polyline = js.native
  
  @JSImport("jointjs", "Vectorizer.transformRect")
  @js.native
  def transformRect(r: PlainRect, matrix: SVGMatrix): Rect = js.native
  
  @JSImport("jointjs", "Vectorizer.transformStringToMatrix")
  @js.native
  def transformStringToMatrix(transform: String): SVGMatrix = js.native
  
  @JSImport("jointjs", "Vectorizer.uniqueId")
  @js.native
  def uniqueId(): String = js.native
  
  @js.native
  trait AnnotateStringOptions extends StObject {
    
    var includeAnnotationIndices: js.UndefOr[Boolean] = js.native
    
    var offset: js.UndefOr[Double] = js.native
  }
  object AnnotateStringOptions {
    
    @scala.inline
    def apply(): AnnotateStringOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnnotateStringOptions]
    }
    
    @scala.inline
    implicit class AnnotateStringOptionsMutableBuilder[Self <: AnnotateStringOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncludeAnnotationIndices(value: Boolean): Self = StObject.set(x, "includeAnnotationIndices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeAnnotationIndicesUndefined: Self = StObject.set(x, "includeAnnotationIndices", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    }
  }
  
  @js.native
  trait DecomposedTransformation extends StObject {
    
    var rotation: Double = js.native
    
    var scaleX: Double = js.native
    
    var scaleY: Double = js.native
    
    var skewX: Double = js.native
    
    var skewY: Double = js.native
    
    var translateX: Double = js.native
    
    var translateY: Double = js.native
  }
  object DecomposedTransformation {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class DecomposedTransformationMutableBuilder[Self <: DecomposedTransformation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkewX(value: Double): Self = StObject.set(x, "skewX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkewY(value: Double): Self = StObject.set(x, "skewY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslateX(value: Double): Self = StObject.set(x, "translateX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslateY(value: Double): Self = StObject.set(x, "translateY", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetBBoxOptions extends StObject {
    
    var recursive: js.UndefOr[Boolean] = js.native
    
    var target: js.UndefOr[SVGElement | Vectorizer] = js.native
  }
  object GetBBoxOptions {
    
    @scala.inline
    def apply(): GetBBoxOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetBBoxOptions]
    }
    
    @scala.inline
    implicit class GetBBoxOptionsMutableBuilder[Self <: GetBBoxOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
      
      @scala.inline
      def setTarget(value: SVGElement | Vectorizer): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  // modifiable Matrix. SVGMatrix doesn't allow set on properties or a constructor.
  @js.native
  trait Matrix extends StObject {
    
    var a: Double = js.native
    
    var b: Double = js.native
    
    var c: Double = js.native
    
    var d: Double = js.native
    
    var e: Double = js.native
    
    var f: Double = js.native
  }
  object Matrix {
    
    @scala.inline
    def apply(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): Matrix = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any])
      __obj.asInstanceOf[Matrix]
    }
    
    @scala.inline
    implicit class MatrixMutableBuilder[Self <: Matrix] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setC(value: Double): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setD(value: Double): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setE(value: Double): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setF(value: Double): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ParseXMLOptions extends StObject {
    
    var async: js.UndefOr[Boolean] = js.native
  }
  object ParseXMLOptions {
    
    @scala.inline
    def apply(): ParseXMLOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseXMLOptions]
    }
    
    @scala.inline
    implicit class ParseXMLOptionsMutableBuilder[Self <: ParseXMLOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    }
  }
  
  @js.native
  trait QualifiedAttribute extends StObject {
    
    var local: String = js.native
    
    var ns: String | Null = js.native
  }
  object QualifiedAttribute {
    
    @scala.inline
    def apply(local: String): QualifiedAttribute = {
      val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any])
      __obj.asInstanceOf[QualifiedAttribute]
    }
    
    @scala.inline
    implicit class QualifiedAttributeMutableBuilder[Self <: QualifiedAttribute] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocal(value: String): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNs(value: String): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNsNull: Self = StObject.set(x, "ns", null)
    }
  }
  
  @js.native
  trait RotateOptions extends StObject {
    
    var absolute: js.UndefOr[Boolean] = js.native
  }
  object RotateOptions {
    
    @scala.inline
    def apply(): RotateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RotateOptions]
    }
    
    @scala.inline
    implicit class RotateOptionsMutableBuilder[Self <: RotateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbsolute(value: Boolean): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbsoluteUndefined: Self = StObject.set(x, "absolute", js.undefined)
    }
  }
  
  @js.native
  trait Rotation extends StObject {
    
    var angle: Double = js.native
    
    var cx: js.UndefOr[Double] = js.native
    
    var cy: js.UndefOr[Double] = js.native
  }
  object Rotation {
    
    @scala.inline
    def apply(angle: Double): Rotation = {
      val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rotation]
    }
    
    @scala.inline
    implicit class RotationMutableBuilder[Self <: Rotation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCx(value: Double): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCxUndefined: Self = StObject.set(x, "cx", js.undefined)
      
      @scala.inline
      def setCy(value: Double): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCyUndefined: Self = StObject.set(x, "cy", js.undefined)
    }
  }
  
  @js.native
  trait RoundedRect extends PlainRect {
    
    var `bottom-rx`: js.UndefOr[Double] = js.native
    
    var `bottom-ry`: js.UndefOr[Double] = js.native
    
    var rx: js.UndefOr[Double] = js.native
    
    var ry: js.UndefOr[Double] = js.native
    
    var `top-rx`: js.UndefOr[Double] = js.native
    
    var `top-ry`: js.UndefOr[Double] = js.native
  }
  object RoundedRect {
    
    @scala.inline
    def apply(height: Double, width: Double, x: Double, y: Double): RoundedRect = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoundedRect]
    }
    
    @scala.inline
    implicit class RoundedRectMutableBuilder[Self <: RoundedRect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setBottom-rx`(value: Double): Self = StObject.set(x, "bottom-rx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBottom-rxUndefined`: Self = StObject.set(x, "bottom-rx", js.undefined)
      
      @scala.inline
      def `setBottom-ry`(value: Double): Self = StObject.set(x, "bottom-ry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBottom-ryUndefined`: Self = StObject.set(x, "bottom-ry", js.undefined)
      
      @scala.inline
      def setRx(value: Double): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRxUndefined: Self = StObject.set(x, "rx", js.undefined)
      
      @scala.inline
      def setRy(value: Double): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRyUndefined: Self = StObject.set(x, "ry", js.undefined)
      
      @scala.inline
      def `setTop-rx`(value: Double): Self = StObject.set(x, "top-rx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setTop-rxUndefined`: Self = StObject.set(x, "top-rx", js.undefined)
      
      @scala.inline
      def `setTop-ry`(value: Double): Self = StObject.set(x, "top-ry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setTop-ryUndefined`: Self = StObject.set(x, "top-ry", js.undefined)
    }
  }
  
  @js.native
  trait Sample extends StObject {
    
    var distance: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object Sample {
    
    @scala.inline
    def apply(distance: Double, x: Double, y: Double): Sample = {
      val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Sample]
    }
    
    @scala.inline
    implicit class SampleMutableBuilder[Self <: Sample] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Scale extends StObject {
    
    var sx: Double = js.native
    
    var sy: Double = js.native
  }
  object Scale {
    
    @scala.inline
    def apply(sx: Double, sy: Double): Scale = {
      val __obj = js.Dynamic.literal(sx = sx.asInstanceOf[js.Any], sy = sy.asInstanceOf[js.Any])
      __obj.asInstanceOf[Scale]
    }
    
    @scala.inline
    implicit class ScaleMutableBuilder[Self <: Scale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSx(value: Double): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSy(value: Double): Self = StObject.set(x, "sy", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TextAnnotation extends StObject {
    
    var attrs: StringDictionary[js.Any] = js.native
    
    var end: Double = js.native
    
    var start: Double = js.native
  }
  object TextAnnotation {
    
    @scala.inline
    def apply(attrs: StringDictionary[js.Any], end: Double, start: Double): TextAnnotation = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextAnnotation]
    }
    
    @scala.inline
    implicit class TextAnnotationMutableBuilder[Self <: TextAnnotation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttrs(value: StringDictionary[js.Any]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TextOptions extends StObject {
    
    var annotations: js.UndefOr[js.Array[TextAnnotation]] = js.native
    
    var displayEmpty: js.UndefOr[Boolean] = js.native
    
    var eol: js.UndefOr[String] = js.native
    
    var includeAnnotationIndices: js.UndefOr[Boolean] = js.native
    
    var lineHeight: js.UndefOr[Double | String] = js.native
    
    var textPath: js.UndefOr[String | StringDictionary[js.Any]] = js.native
    
    var textVerticalAnchor: js.UndefOr[TextVerticalAnchor | Double | String] = js.native
    
    var x: js.UndefOr[Double | String] = js.native
  }
  object TextOptions {
    
    @scala.inline
    def apply(): TextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextOptions]
    }
    
    @scala.inline
    implicit class TextOptionsMutableBuilder[Self <: TextOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnnotations(value: js.Array[TextAnnotation]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
      
      @scala.inline
      def setAnnotationsVarargs(value: TextAnnotation*): Self = StObject.set(x, "annotations", js.Array(value :_*))
      
      @scala.inline
      def setDisplayEmpty(value: Boolean): Self = StObject.set(x, "displayEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayEmptyUndefined: Self = StObject.set(x, "displayEmpty", js.undefined)
      
      @scala.inline
      def setEol(value: String): Self = StObject.set(x, "eol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEolUndefined: Self = StObject.set(x, "eol", js.undefined)
      
      @scala.inline
      def setIncludeAnnotationIndices(value: Boolean): Self = StObject.set(x, "includeAnnotationIndices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeAnnotationIndicesUndefined: Self = StObject.set(x, "includeAnnotationIndices", js.undefined)
      
      @scala.inline
      def setLineHeight(value: Double | String): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      @scala.inline
      def setTextPath(value: String | StringDictionary[js.Any]): Self = StObject.set(x, "textPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextPathUndefined: Self = StObject.set(x, "textPath", js.undefined)
      
      @scala.inline
      def setTextVerticalAnchor(value: TextVerticalAnchor | Double | String): Self = StObject.set(x, "textVerticalAnchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextVerticalAnchorUndefined: Self = StObject.set(x, "textVerticalAnchor", js.undefined)
      
      @scala.inline
      def setX(value: Double | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jointjs.jointjsStrings.top
    - typings.jointjs.jointjsStrings.bottom
    - typings.jointjs.jointjsStrings.middle
  */
  trait TextVerticalAnchor extends StObject
  object TextVerticalAnchor {
    
    @scala.inline
    def bottom: typings.jointjs.jointjsStrings.bottom = "bottom".asInstanceOf[typings.jointjs.jointjsStrings.bottom]
    
    @scala.inline
    def middle: typings.jointjs.jointjsStrings.middle = "middle".asInstanceOf[typings.jointjs.jointjsStrings.middle]
    
    @scala.inline
    def top: typings.jointjs.jointjsStrings.top = "top".asInstanceOf[typings.jointjs.jointjsStrings.top]
  }
  
  @js.native
  trait Transform extends StObject {
    
    var rotate: Rotation = js.native
    
    var scale: Scale = js.native
    
    var translate: Translation = js.native
    
    var value: String = js.native
  }
  object Transform {
    
    @scala.inline
    def apply(rotate: Rotation, scale: Scale, translate: Translation, value: String): Transform = {
      val __obj = js.Dynamic.literal(rotate = rotate.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], translate = translate.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Transform]
    }
    
    @scala.inline
    implicit class TransformMutableBuilder[Self <: Transform] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRotate(value: Rotation): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScale(value: Scale): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslate(value: Translation): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TransformOptions extends StObject {
    
    var absolute: js.UndefOr[Boolean] = js.native
  }
  object TransformOptions {
    
    @scala.inline
    def apply(): TransformOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransformOptions]
    }
    
    @scala.inline
    implicit class TransformOptionsMutableBuilder[Self <: TransformOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbsolute(value: Boolean): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbsoluteUndefined: Self = StObject.set(x, "absolute", js.undefined)
    }
  }
  
  @js.native
  trait Translation extends StObject {
    
    var tx: Double = js.native
    
    var ty: Double = js.native
  }
  object Translation {
    
    @scala.inline
    def apply(tx: Double, ty: Double): Translation = {
      val __obj = js.Dynamic.literal(tx = tx.asInstanceOf[js.Any], ty = ty.asInstanceOf[js.Any])
      __obj.asInstanceOf[Translation]
    }
    
    @scala.inline
    implicit class TranslationMutableBuilder[Self <: Translation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTx(value: Double): Self = StObject.set(x, "tx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTy(value: Double): Self = StObject.set(x, "ty", value.asInstanceOf[js.Any])
    }
  }
}
