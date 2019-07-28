package typings.jointjs.jointjsMod

import org.scalablytyped.runtime.StringDictionary
import typings.jointjs.jointjsMod.gNs.CardinalDirection
import typings.jointjs.jointjsMod.gNs.Curve
import typings.jointjs.jointjsMod.gNs.Ellipse
import typings.jointjs.jointjsMod.gNs.Line
import typings.jointjs.jointjsMod.gNs.Path
import typings.jointjs.jointjsMod.gNs.PathObjectUnit
import typings.jointjs.jointjsMod.gNs.PathSegmentUnit
import typings.jointjs.jointjsMod.gNs.PathT
import typings.jointjs.jointjsMod.gNs.PlainPoint
import typings.jointjs.jointjsMod.gNs.PlainRect
import typings.jointjs.jointjsMod.gNs.Point
import typings.jointjs.jointjsMod.gNs.Polyline
import typings.jointjs.jointjsMod.gNs.PrecisionOpt
import typings.jointjs.jointjsMod.gNs.Rect
import typings.jointjs.jointjsMod.gNs.RectangleSide
import typings.jointjs.jointjsMod.gNs.Scale
import typings.jointjs.jointjsMod.gNs.Segment
import typings.jointjs.jointjsMod.gNs.SegmentSubdivisionsOpt
import typings.jointjs.jointjsMod.gNs.SegmentType
import typings.jointjs.jointjsMod.gNs.SegmentTypes
import typings.jointjs.jointjsMod.gNs.SubdivisionsOpt
import typings.jointjs.jointjsMod.gNs._PathObjectUnit
import typings.jointjs.jointjsMod.gNs.bezierNs.IBezierCurve
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jointjs", "g")
@js.native
object gNs extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.jointjs.jointjsStrings.NE
    - typings.jointjs.jointjsStrings.E
    - typings.jointjs.jointjsStrings.SE
    - typings.jointjs.jointjsStrings.S
    - typings.jointjs.jointjsStrings.SW
    - typings.jointjs.jointjsStrings.W
    - typings.jointjs.jointjsStrings.NW
    - typings.jointjs.jointjsStrings.N
  */
  trait CardinalDirection extends js.Object
  
  @js.native
  class Curve protected () extends _PathObjectUnit {
    def this(curve: Curve) = this()
    def this(p1: String, p2: String, p3: String, p4: String) = this()
    def this(p1: String, p2: String, p3: String, p4: PlainPoint) = this()
    def this(p1: String, p2: String, p3: PlainPoint, p4: String) = this()
    def this(p1: String, p2: String, p3: PlainPoint, p4: PlainPoint) = this()
    def this(p1: String, p2: PlainPoint, p3: String, p4: String) = this()
    def this(p1: String, p2: PlainPoint, p3: String, p4: PlainPoint) = this()
    def this(p1: String, p2: PlainPoint, p3: PlainPoint, p4: String) = this()
    def this(p1: String, p2: PlainPoint, p3: PlainPoint, p4: PlainPoint) = this()
    def this(p1: PlainPoint, p2: String, p3: String, p4: String) = this()
    def this(p1: PlainPoint, p2: String, p3: String, p4: PlainPoint) = this()
    def this(p1: PlainPoint, p2: String, p3: PlainPoint, p4: String) = this()
    def this(p1: PlainPoint, p2: String, p3: PlainPoint, p4: PlainPoint) = this()
    def this(p1: PlainPoint, p2: PlainPoint, p3: String, p4: String) = this()
    def this(p1: PlainPoint, p2: PlainPoint, p3: String, p4: PlainPoint) = this()
    def this(p1: PlainPoint, p2: PlainPoint, p3: PlainPoint, p4: String) = this()
    def this(p1: PlainPoint, p2: PlainPoint, p3: PlainPoint, p4: PlainPoint) = this()
    var controlPoint1: Point = js.native
    var controlPoint2: Point = js.native
    var end: Point = js.native
    var start: Point = js.native
    def bbox(): Rect = js.native
    def closestPoint(p: PlainPoint): Point = js.native
    def closestPoint(p: PlainPoint, opt: SubdivisionsOpt): Point = js.native
    def closestPointLength(p: PlainPoint): Double = js.native
    def closestPointLength(p: PlainPoint, opt: SubdivisionsOpt): Double = js.native
    def closestPointNormalizedLength(p: PlainPoint): Double = js.native
    def closestPointNormalizedLength(p: PlainPoint, opt: SubdivisionsOpt): Double = js.native
    def closestPointT(p: PlainPoint): Double = js.native
    def closestPointT(p: PlainPoint, opt: SubdivisionsOpt): Double = js.native
    def closestPointTangent(p: PlainPoint): Line | Null = js.native
    def closestPointTangent(p: PlainPoint, opt: SubdivisionsOpt): Line | Null = js.native
    def containsPoint(p: PlainPoint): Boolean = js.native
    def containsPoint(p: PlainPoint, opt: SubdivisionsOpt): Boolean = js.native
    def divide(t: Double): js.Tuple2[Curve, Curve] = js.native
    def divideAt(ratio: Double): js.Tuple2[Curve, Curve] = js.native
    def divideAt(ratio: Double, opt: SubdivisionsOpt): js.Tuple2[Curve, Curve] = js.native
    def divideAtLength(length: Double): js.Tuple2[Curve, Curve] = js.native
    def divideAtLength(length: Double, opt: SubdivisionsOpt): js.Tuple2[Curve, Curve] = js.native
    def divideAtT(t: Double): js.Tuple2[Curve, Curve] = js.native
     // alias to `divideAtT`
    def endpointDistance(): Double = js.native
    def equals(c: Curve): Boolean = js.native
    def getSkeletonPoints(t: Double): js.Tuple5[Point, Point, Point, Point, Point] = js.native
    def getSubdivisions(): js.Array[Curve] = js.native
    def getSubdivisions(opt: PrecisionOpt): js.Array[Curve] = js.native
    def isDifferentiable(): Boolean = js.native
    def length(): Double = js.native
    def length(opt: SubdivisionsOpt): Double = js.native
    def lengthAtT(t: Double): Double = js.native
    def lengthAtT(t: Double, opt: PrecisionOpt): Double = js.native
    def pointAt(ratio: Double): Point = js.native
    def pointAt(ratio: Double, opt: SubdivisionsOpt): Point = js.native
    def pointAtLength(length: Double): Point = js.native
    def pointAtLength(length: Double, opt: SubdivisionsOpt): Point = js.native
    def pointAtT(t: Double): Point = js.native
    def scale(sx: Double, sy: Double): this.type = js.native
    def scale(sx: Double, sy: Double, origin: String): this.type = js.native
    def scale(sx: Double, sy: Double, origin: PlainPoint): this.type = js.native
    def tAt(ratio: Double): Double = js.native
    def tAt(ratio: Double, opt: SubdivisionsOpt): Double = js.native
    def tAtLength(length: Double): Double = js.native
    def tAtLength(length: Double, opt: SubdivisionsOpt): Double = js.native
    def tangentAt(ratio: Double): Line | Null = js.native
    def tangentAt(ratio: Double, opt: SubdivisionsOpt): Line | Null = js.native
    def tangentAtLength(length: Double): Line | Null = js.native
    def tangentAtLength(length: Double, opt: SubdivisionsOpt): Line | Null = js.native
    def tangentAtT(t: Double): Line | Null = js.native
    def toPoints(): js.Array[Point] = js.native
    def toPoints(opt: SubdivisionsOpt): js.Array[Point] = js.native
    def toPolyline(): Polyline = js.native
    def toPolyline(opt: SubdivisionsOpt): Polyline = js.native
    def translate(): this.type = js.native
    def translate(tx: Double): this.type = js.native
    def translate(tx: Double, ty: Double): this.type = js.native
    def translate(tx: PlainPoint): this.type = js.native
  }
  
  @js.native
  class Ellipse protected () extends js.Object {
    def this(ellipse: Ellipse) = this()
    def this(center: String, a: Double, b: Double) = this()
    def this(center: PlainPoint, a: Double, b: Double) = this()
    var a: Double = js.native
    var b: Double = js.native
    var x: Double = js.native
    var y: Double = js.native
    def bbox(): Rect = js.native
    def center(): Point = js.native
    def containsPoint(p: PlainPoint): Boolean = js.native
    def equals(ellipse: Ellipse): Boolean = js.native
    def inflate(): this.type = js.native
    def inflate(dx: Double): this.type = js.native
    def inflate(dx: Double, dy: Double): this.type = js.native
    def intersectionWithLine(l: Line): js.Array[Point] | Null = js.native
    def intersectionWithLineFromCenterToPoint(p: PlainPoint): Point = js.native
    def intersectionWithLineFromCenterToPoint(p: PlainPoint, angle: Double): Point = js.native
    def normalizedDistance(point: PlainPoint): Double = js.native
    def tangentTheta(p: PlainPoint): Double = js.native
  }
  
  @js.native
  class Line () extends _PathObjectUnit {
    def this(line: Line) = this()
    def this(p1: String, p2: String) = this()
    def this(p1: String, p2: PlainPoint) = this()
    def this(p1: PlainPoint, p2: String) = this()
    def this(p1: PlainPoint, p2: PlainPoint) = this()
    var end: Point = js.native
    var start: Point = js.native
    def angle(): Double = js.native
    def bbox(): Rect = js.native
    def bearing(): CardinalDirection = js.native
    def closestPoint(p: String): Point = js.native
    def closestPoint(p: PlainPoint): Point = js.native
    def closestPointLength(p: String): Double = js.native
    def closestPointLength(p: PlainPoint): Double = js.native
    def closestPointNormalizedLength(p: String): Double = js.native
    def closestPointNormalizedLength(p: PlainPoint): Double = js.native
    def closestPointTangent(p: String): Line | Null = js.native
    def closestPointTangent(p: PlainPoint): Line | Null = js.native
    def containsPoint(p: PlainPoint): Boolean = js.native
    def divideAt(t: Double): js.Tuple2[Line, Line] = js.native
    def divideAtLength(length: Double): js.Tuple2[Line, Line] = js.native
    def equals(line: Line): Boolean = js.native
    def intersect(ellipse: Ellipse): js.Array[Point] | Null = js.native
    def intersect(line: Line): Point | Null = js.native
    def intersect(path: Path): js.Array[Point] | Null = js.native
    def intersect(path: Path, opt: SegmentSubdivisionsOpt): js.Array[Point] | Null = js.native
    def intersect(polyline: Polyline): js.Array[Point] | Null = js.native
     // Backwards compatibility, should return an array
    def intersect(rect: Rect): js.Array[Point] | Null = js.native
    def intersectionWithLine(l: Line): js.Array[Point] | Null = js.native
    def isDifferentiable(): Boolean = js.native
    def length(): Double = js.native
    def midpoint(): Point = js.native
    def pointAt(t: Double): Point = js.native
    def pointAtLength(length: Double): Point = js.native
    def pointOffset(p: String): Double = js.native
    def pointOffset(p: PlainPoint): Double = js.native
    def rotate(origin: PlainPoint, angle: Double): this.type = js.native
    def round(): this.type = js.native
    def round(precision: Double): this.type = js.native
    def scale(sx: Double, sy: Double): this.type = js.native
    def scale(sx: Double, sy: Double, origin: PlainPoint): this.type = js.native
    def setLength(length: Double): this.type = js.native
    def squaredLength(): Double = js.native
    def tangentAt(t: Double): Line | Null = js.native
    def tangentAtLength(length: Double): Line | Null = js.native
    def translate(): this.type = js.native
    def translate(tx: Double): this.type = js.native
    def translate(tx: Double, ty: Double): this.type = js.native
    def translate(tx: PlainPoint): this.type = js.native
    def vector(): Point = js.native
  }
  
  @js.native
   // getter
  class Path () extends js.Object {
    def this(pathData: String) = this()
    def this(polyline: Polyline) = this()
    def this(segments: PathObjectUnit | PathSegmentUnit) = this()
    def this(segments: js.Array[PathObjectUnit | PathSegmentUnit]) = this()
     // getter
    var end: Point | Null = js.native
    var segments: js.Array[Segment] = js.native
    var start: Point | Null = js.native
    def appendSegment(segments: js.Array[PathSegmentUnit]): Unit = js.native
    def appendSegment(segments: PathSegmentUnit): Unit = js.native
    def bbox(): Rect | Null = js.native
    def closestPoint(p: Point): Point | Null = js.native
    def closestPoint(p: Point, opt: SegmentSubdivisionsOpt): Point | Null = js.native
    def closestPointLength(p: Point): Double = js.native
    def closestPointLength(p: Point, opt: SegmentSubdivisionsOpt): Double = js.native
    def closestPointNormalizedLength(p: Point): Double = js.native
    def closestPointNormalizedLength(p: Point, opt: SegmentSubdivisionsOpt): Double = js.native
    /* private */ def closestPointT(p: Point): PathT | Null = js.native
    /* private */ def closestPointT(p: Point, opt: SegmentSubdivisionsOpt): PathT | Null = js.native
    def closestPointTangent(p: Point): Line | Null = js.native
    def closestPointTangent(p: Point, opt: SegmentSubdivisionsOpt): Line | Null = js.native
    def containsPoint(p: PlainPoint): Boolean = js.native
    def containsPoint(p: PlainPoint, opt: SegmentSubdivisionsOpt): Boolean = js.native
    def divideAt(ratio: Double): (js.Tuple2[Path, Path]) | Null = js.native
    def divideAt(ratio: Double, opt: SegmentSubdivisionsOpt): (js.Tuple2[Path, Path]) | Null = js.native
    def divideAtLength(length: Double): (js.Tuple2[Path, Path]) | Null = js.native
    def divideAtLength(length: Double, opt: SegmentSubdivisionsOpt): (js.Tuple2[Path, Path]) | Null = js.native
    def equals(p: Path): Boolean = js.native
    def getSegment(index: Double): Segment | Null = js.native
    def getSegmentSubdivisions(): js.Array[js.Array[Curve]] = js.native
    def getSegmentSubdivisions(opt: PrecisionOpt): js.Array[js.Array[Curve]] = js.native
    def insertSegment(index: Double, segments: js.Array[PathSegmentUnit]): Unit = js.native
    def insertSegment(index: Double, segments: PathSegmentUnit): Unit = js.native
    def intersectionWithLine(l: Line): js.Array[Point] | Null = js.native
    def intersectionWithLine(l: Line, opt: SegmentSubdivisionsOpt): js.Array[Point] | Null = js.native
    def isDifferentiable(): Boolean = js.native
    def isValid(): Boolean = js.native
    def length(): Double = js.native
    def length(opt: SegmentSubdivisionsOpt): Double = js.native
    /* private */ def lengthAtT(t: PathT): Double = js.native
    /* private */ def lengthAtT(t: PathT, opt: SegmentSubdivisionsOpt): Double = js.native
    def pointAt(ratio: Double): Point | Null = js.native
    def pointAt(ratio: Double, opt: SegmentSubdivisionsOpt): Point | Null = js.native
    def pointAtLength(length: Double): Point | Null = js.native
    def pointAtLength(length: Double, opt: SegmentSubdivisionsOpt): Point | Null = js.native
    /* private */ def pointAtT(t: PathT): Point | Null = js.native
    /* private */ def prepareSegment(segment: Segment): Segment = js.native
    /* private */ def prepareSegment(segment: Segment, previousSegment: Null, nextSegment: Segment): Segment = js.native
    /* private */ def prepareSegment(segment: Segment, previousSegment: Segment): Segment = js.native
    /* private */ def prepareSegment(segment: Segment, previousSegment: Segment, nextSegment: Segment): Segment = js.native
    def removeSegment(index: Double): Unit = js.native
    def replaceSegment(index: Double, segments: js.Array[PathSegmentUnit]): Unit = js.native
    def replaceSegment(index: Double, segments: PathSegmentUnit): Unit = js.native
    def scale(sx: Double, sy: Double): this.type = js.native
    def scale(sx: Double, sy: Double, origin: String): this.type = js.native
    def scale(sx: Double, sy: Double, origin: PlainPoint): this.type = js.native
    def segmentAt(ratio: Double): Segment | Null = js.native
    def segmentAt(ratio: Double, opt: SegmentSubdivisionsOpt): Segment | Null = js.native
    def segmentAtLength(length: Double): Segment | Null = js.native
    def segmentAtLength(length: Double, opt: SegmentSubdivisionsOpt): Segment | Null = js.native
    def segmentIndexAt(ratio: Double): Double | Null = js.native
    def segmentIndexAt(ratio: Double, opt: SegmentSubdivisionsOpt): Double | Null = js.native
    def segmentIndexAtLength(length: Double): Double | Null = js.native
    def segmentIndexAtLength(length: Double, opt: SegmentSubdivisionsOpt): Double | Null = js.native
    def serialize(): String = js.native
    def tangentAt(ratio: Double): Line | Null = js.native
    def tangentAt(ratio: Double, opt: SegmentSubdivisionsOpt): Line | Null = js.native
    def tangentAtLength(length: Double): Line | Null = js.native
    def tangentAtLength(length: Double, opt: SegmentSubdivisionsOpt): Line | Null = js.native
    /* private */ def tangentAtT(t: PathT): Line | Null = js.native
    def toPoints(): js.Array[js.Array[Point]] | Null = js.native
    def toPoints(opt: SegmentSubdivisionsOpt): js.Array[js.Array[Point]] | Null = js.native
    def toPolylines(): js.Array[Polyline] | Null = js.native
    def toPolylines(opt: SegmentSubdivisionsOpt): js.Array[Polyline] | Null = js.native
    def translate(): this.type = js.native
    def translate(tx: Double): this.type = js.native
    def translate(tx: Double, ty: Double): this.type = js.native
    def translate(tx: PlainPoint): this.type = js.native
    /* private */ def updateSubpathStartSegment(segment: Segment): Unit = js.native
  }
  
  trait PathT extends js.Object {
    var segmentIndex: Double
    var value: Double
  }
  
  trait PlainPoint extends js.Object {
    var x: Double
    var y: Double
  }
  
  trait PlainRect extends js.Object {
    var height: Double
    var width: Double
    var x: Double
    var y: Double
  }
  
  @js.native
  class Point () extends PlainPoint {
    def this(p: String) = this()
    def this(p: PlainPoint) = this()
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    /* CompleteClass */
    override var x: Double = js.native
    /* CompleteClass */
    override var y: Double = js.native
    def adhereToRect(r: Rect): this.type = js.native
    def angleBetween(p1: PlainPoint, p2: PlainPoint): Double = js.native
    def bearing(p: Point): CardinalDirection = js.native
    def changeInAngle(dx: Double, dy: Double, ref: String): Double = js.native
    def changeInAngle(dx: Double, dy: Double, ref: PlainPoint): Double = js.native
    def chooseClosest(points: js.Array[PlainPoint]): Point | Null = js.native
    def cross(p1: PlainPoint, p2: PlainPoint): Double = js.native
    def difference(): Point = js.native
    def difference(dx: Double): Point = js.native
    def difference(dx: Double, dy: Double): Point = js.native
    def difference(p: PlainPoint): Point = js.native
    def distance(p: String): Double = js.native
    def distance(p: PlainPoint): Double = js.native
    def dot(p: PlainPoint): Double = js.native
    def equals(p: Point): Boolean = js.native
    def lerp(p: Point, t: Double): Point = js.native
    def magnitude(): Double = js.native
    def manhattanDistance(p: PlainPoint): Double = js.native
    def move(ref: String, distance: Double): this.type = js.native
    def move(ref: PlainPoint, distance: Double): this.type = js.native
    def normalize(length: Double): this.type = js.native
    def offset(): this.type = js.native
    def offset(dx: Double): this.type = js.native
    def offset(dx: Double, dy: Double): this.type = js.native
    def offset(p: PlainPoint): this.type = js.native
    def reflection(ref: String): Point = js.native
    def reflection(ref: PlainPoint): Point = js.native
    def rotate(origin: String, angle: Double): this.type = js.native
    def rotate(origin: PlainPoint, angle: Double): this.type = js.native
    def round(): this.type = js.native
    def round(precision: Double): this.type = js.native
    def scale(sx: Double, sy: Double): this.type = js.native
    def scale(sx: Double, sy: Double, origin: String): this.type = js.native
    def scale(sx: Double, sy: Double, origin: PlainPoint): this.type = js.native
    def snapToGrid(gx: Double): this.type = js.native
    def snapToGrid(gx: Double, gy: Double): this.type = js.native
    def squaredDistance(p: String): Double = js.native
    def squaredDistance(p: PlainPoint): Double = js.native
    def theta(p: String): Double = js.native
    def theta(p: PlainPoint): Double = js.native
    def toJSON(): PlainPoint = js.native
    def toPolar(): this.type = js.native
    def toPolar(origin: String): this.type = js.native
    def toPolar(origin: PlainPoint): this.type = js.native
    def translate(): this.type = js.native
    def translate(tx: Double): this.type = js.native
    def translate(tx: Double, ty: Double): this.type = js.native
    def translate(tx: PlainPoint): this.type = js.native
    def update(): this.type = js.native
    def update(x: Double): this.type = js.native
    def update(x: Double, y: Double): this.type = js.native
    def vectorAngle(p: PlainPoint): Double = js.native
  }
  
  @js.native
   // getter
  class Polyline () extends js.Object {
    def this(points: js.Array[Point]) = this()
    def this(svgString: String) = this()
     // getter
    var end: Point | Null = js.native
    var points: js.Array[Point] = js.native
    var start: Point | Null = js.native
    def bbox(): Rect | Null = js.native
    def closestPoint(p: String): Point | Null = js.native
    def closestPoint(p: PlainPoint): Point | Null = js.native
    def closestPointLength(p: String): Double = js.native
    def closestPointLength(p: PlainPoint): Double = js.native
    def closestPointNormalizedLength(p: String): Double = js.native
    def closestPointNormalizedLength(p: PlainPoint): Double = js.native
    def closestPointTangent(p: String): Line | Null = js.native
    def closestPointTangent(p: PlainPoint): Line | Null = js.native
    def containsPoint(p: PlainPoint): Boolean = js.native
    def convexHull(): Polyline = js.native
    def equals(p: Polyline): Boolean = js.native
    def intersectionWithLine(l: Line): js.Array[Point] | Null = js.native
    def isDifferentiable(): Boolean = js.native
    def length(): Double = js.native
    def pointAt(ratio: Double): Point | Null = js.native
    def pointAtLength(length: Double): Point | Null = js.native
    def scale(sx: Double, sy: Double): this.type = js.native
    def scale(sx: Double, sy: Double, origin: String): this.type = js.native
    def scale(sx: Double, sy: Double, origin: PlainPoint): this.type = js.native
    def serialize(): String = js.native
    def tangentAt(ratio: Double): Line | Null = js.native
    def tangentAtLength(length: Double): Line | Null = js.native
    def translate(): this.type = js.native
    def translate(tx: Double): this.type = js.native
    def translate(tx: Double, ty: Double): this.type = js.native
    def translate(tx: PlainPoint): this.type = js.native
  }
  
  trait PrecisionOpt extends js.Object {
    var precision: js.UndefOr[Double] = js.undefined
  }
  
  @js.native
  class Rect () extends PlainRect {
    def this(r: PlainRect) = this()
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Double, y: Double, width: Double) = this()
    def this(x: Double, y: Double, width: Double, height: Double) = this()
    /* CompleteClass */
    override var height: Double = js.native
    /* CompleteClass */
    override var width: Double = js.native
    /* CompleteClass */
    override var x: Double = js.native
    /* CompleteClass */
    override var y: Double = js.native
    def bbox(): Rect = js.native
    def bbox(angle: Double): Rect = js.native
    def bottomLeft(): Point = js.native
    def bottomLine(): Line = js.native
    def bottomMiddle(): Point = js.native
    def bottomRight(): Point = js.native
    def center(): Point = js.native
    def containsPoint(p: String): Boolean = js.native
    def containsPoint(p: PlainPoint): Boolean = js.native
    def containsRect(r: PlainRect): Boolean = js.native
    def corner(): Point = js.native
    def equals(r: PlainRect): Boolean = js.native
    def inflate(): this.type = js.native
    def inflate(dx: Double): this.type = js.native
    def inflate(dx: Double, dy: Double): this.type = js.native
    def intersect(r: Rect): Rect | Null = js.native
    def intersectionWithLine(l: Line): js.Array[Point] | Null = js.native
    def intersectionWithLineFromCenterToPoint(p: String): Point = js.native
    def intersectionWithLineFromCenterToPoint(p: String, angle: Double): Point = js.native
    def intersectionWithLineFromCenterToPoint(p: PlainPoint): Point = js.native
    def intersectionWithLineFromCenterToPoint(p: PlainPoint, angle: Double): Point = js.native
    def leftLine(): Line = js.native
    def leftMiddle(): Point = js.native
    def maxRectScaleToFit(rect: PlainRect): Scale = js.native
    def maxRectScaleToFit(rect: PlainRect, origin: PlainPoint): Scale = js.native
    def maxRectUniformScaleToFit(rect: PlainRect): Double = js.native
    def maxRectUniformScaleToFit(rect: PlainRect, origin: PlainPoint): Double = js.native
    def moveAndExpand(r: PlainRect): this.type = js.native
    def normalize(): this.type = js.native
    def offset(): this.type = js.native
    def offset(dx: Double): this.type = js.native
    def offset(dx: Double, dy: Double): this.type = js.native
    def offset(p: PlainPoint): this.type = js.native
    def origin(): Point = js.native
    def pointNearestToPoint(point: String): Point = js.native
    def pointNearestToPoint(point: PlainPoint): Point = js.native
    def rightLine(): Line = js.native
    def rightMiddle(): Point = js.native
    def round(): this.type = js.native
    def round(precision: Double): this.type = js.native
    def scale(sx: Double, sy: Double): this.type = js.native
    def scale(sx: Double, sy: Double, origin: String): this.type = js.native
    def scale(sx: Double, sy: Double, origin: PlainPoint): this.type = js.native
    def sideNearestToPoint(point: String): RectangleSide = js.native
    def sideNearestToPoint(point: PlainPoint): RectangleSide = js.native
    def snapToGrid(gx: Double): this.type = js.native
    def snapToGrid(gx: Double, gy: Double): this.type = js.native
    def toJSON(): PlainRect = js.native
    def topLeft(): Point = js.native
    def topLine(): Line = js.native
    def topMiddle(): Point = js.native
    def topRight(): Point = js.native
    def translate(): this.type = js.native
    def translate(tx: Double): this.type = js.native
    def translate(tx: Double, ty: Double): this.type = js.native
    def translate(tx: PlainPoint): this.type = js.native
    def union(rect: PlainRect): Rect = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jointjs.jointjsStrings.left
    - typings.jointjs.jointjsStrings.right
    - typings.jointjs.jointjsStrings.top
    - typings.jointjs.jointjsStrings.bottom
  */
  trait RectangleSide extends js.Object
  
  trait Scale extends js.Object {
    var sx: Double
    var sy: Double
  }
  
  @js.native
  trait Segment extends js.Object {
     // getter, `never` for Moveto
    var end: Point | Null = js.native
    var isSegment: Boolean = js.native
    var isSubpathStart: Boolean = js.native
    var isVisible: Boolean = js.native
    var nextSegment: Segment | Null = js.native
    var previousSegment: Segment | Null = js.native
    var start: Point | Null | scala.Nothing = js.native
    var subpathStartSegment: Segment | Null = js.native
    var `type`: SegmentType = js.native
     // getter or directly assigned
    def bbox(): Rect | Null = js.native
    def closestPoint(p: Point): Point = js.native
    def closestPoint(p: Point, opt: SubdivisionsOpt): Point = js.native
    def closestPointLength(p: Point): Double = js.native
    def closestPointLength(p: Point, opt: SubdivisionsOpt): Double = js.native
    def closestPointNormalizedLength(p: Point): Double = js.native
    def closestPointNormalizedLength(p: Point, opt: SubdivisionsOpt): Double = js.native
    def closestPointT(p: Point): Double = js.native
    def closestPointTangent(p: Point): Line | Null = js.native
    def divideAt(ratio: Double): js.Tuple2[Segment, Segment] = js.native
    def divideAt(ratio: Double, opt: SubdivisionsOpt): js.Tuple2[Segment, Segment] = js.native
    def divideAtLength(length: Double): js.Tuple2[Segment, Segment] = js.native
    def divideAtLength(length: Double, opt: SubdivisionsOpt): js.Tuple2[Segment, Segment] = js.native
    def divideAtT(t: Double): js.Tuple2[Segment, Segment] = js.native
    def equals(segment: Segment): Boolean = js.native
    def getSubdivisions(): js.Array[Curve] = js.native
    def isDifferentiable(): Boolean = js.native
    def length(): Double = js.native
    def lengthAtT(t: Double): Double = js.native
    def lengthAtT(t: Double, opt: PrecisionOpt): Double = js.native
    def pointAt(ratio: Double): Point = js.native
    def pointAtLength(length: Double): Point = js.native
    def pointAtT(t: Double): Point = js.native
    def scale(sx: Double, sy: Double): this.type = js.native
    def scale(sx: Double, sy: Double, origin: PlainPoint): this.type = js.native
    def serialize(): String = js.native
    def tangentAt(ratio: Double): Line | Null = js.native
    def tangentAtLength(length: Double): Line | Null = js.native
    def tangentAtT(t: Double): Line | Null = js.native
    def translate(): this.type = js.native
    def translate(tx: Double): this.type = js.native
    def translate(tx: Double, ty: Double): this.type = js.native
    def translate(tx: PlainPoint): this.type = js.native
  }
  
  trait SegmentSubdivisionsOpt extends PrecisionOpt {
    var segmentSubdivisions: js.UndefOr[js.Array[js.Array[Curve]]] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jointjs.jointjsStrings.L
    - typings.jointjs.jointjsStrings.C
    - typings.jointjs.jointjsStrings.M
    - typings.jointjs.jointjsStrings.Z
    - typings.jointjs.jointjsStrings.z
  */
  trait SegmentType extends js.Object
  
  trait SubdivisionsOpt extends PrecisionOpt {
    var subdivisions: js.UndefOr[js.Array[Curve]] = js.undefined
  }
  
  trait _PathObjectUnit extends js.Object
  
  def normalizeAngle(angle: Double): Double = js.native
  def random(): Double = js.native
  def random(min: Double): Double = js.native
  def random(min: Double, max: Double): Double = js.native
  def snapToGrid(`val`: Double, gridSize: Double): Double = js.native
  def toDeg(rad: Double): Double = js.native
  def toRad(deg: Double): Double = js.native
  def toRad(deg: Double, over360: Boolean): Double = js.native
  /* static members */
  @js.native
  object Curve extends js.Object {
    def throughPoints(points: js.Array[PlainPoint]): js.Array[Curve] = js.native
  }
  
  /* static members */
  @js.native
  object Ellipse extends js.Object {
    def fromRect(rect: PlainRect): Ellipse = js.native
  }
  
  /* static members */
  @js.native
  object Path extends js.Object {
    var segmentTypes: SegmentTypes = js.native
    def createSegment(`type`: SegmentType, args: js.Any*): PathSegmentUnit = js.native
    def isDataSupported(pathData: String): Boolean = js.native
    def parse(pathData: String): Path = js.native
  }
  
  /* static members */
  @js.native
  object Point extends js.Object {
    def fromPolar(distance: Double, angle: Double): Point = js.native
    def fromPolar(distance: Double, angle: Double, origin: String): Point = js.native
    def fromPolar(distance: Double, angle: Double, origin: PlainPoint): Point = js.native
    def random(x1: Double, x2: Double, y1: Double, y2: Double): Point = js.native
  }
  
  /* static members */
  @js.native
  object Polyline extends js.Object {
    def parse(svgString: String): Polyline = js.native
  }
  
  /* static members */
  @js.native
  object Rect extends js.Object {
    def fromEllipse(e: Ellipse): Rect = js.native
  }
  
  @JSName("bezier")
  @js.native
  object bezierNs extends js.Object {
    trait IBezierCurve extends js.Object {
      var p0: Point
      var p1: Point
      var p2: Point
      var p3: Point
    }
    
    def curveThroughPoints(points: js.Array[PlainPoint | Point]): js.Array[String] = js.native
    def getCurveControlPoints(points: js.Array[PlainPoint | Point]): js.Tuple2[js.Array[Point], js.Array[Point]] = js.native
    def getCurveDivider(p0: String, p1: String, p2: String, p3: String): js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]] = js.native
    def getCurveDivider(p0: String, p1: String, p2: String, p3: PlainPoint): js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]] = js.native
    def getCurveDivider(p0: String, p1: String, p2: PlainPoint, p3: String): js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]] = js.native
    def getCurveDivider(p0: String, p1: String, p2: PlainPoint, p3: PlainPoint): js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]] = js.native
    def getCurveDivider(p0: String, p1: PlainPoint, p2: String, p3: String): js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]] = js.native
    def getCurveDivider(p0: String, p1: PlainPoint, p2: String, p3: PlainPoint): js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]] = js.native
    def getCurveDivider(p0: String, p1: PlainPoint, p2: PlainPoint, p3: String): js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]] = js.native
    def getCurveDivider(p0: String, p1: PlainPoint, p2: PlainPoint, p3: PlainPoint): js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]] = js.native
    def getCurveDivider(p0: PlainPoint, p1: String, p2: String, p3: String): js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]] = js.native
    def getCurveDivider(p0: PlainPoint, p1: String, p2: String, p3: PlainPoint): js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]] = js.native
    def getCurveDivider(p0: PlainPoint, p1: String, p2: PlainPoint, p3: String): js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]] = js.native
    def getCurveDivider(p0: PlainPoint, p1: String, p2: PlainPoint, p3: PlainPoint): js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]] = js.native
    def getCurveDivider(p0: PlainPoint, p1: PlainPoint, p2: String, p3: String): js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]] = js.native
    def getCurveDivider(p0: PlainPoint, p1: PlainPoint, p2: String, p3: PlainPoint): js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]] = js.native
    def getCurveDivider(p0: PlainPoint, p1: PlainPoint, p2: PlainPoint, p3: String): js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]] = js.native
    def getCurveDivider(p0: PlainPoint, p1: PlainPoint, p2: PlainPoint, p3: PlainPoint): js.Function1[/* t */ Double, js.Tuple2[IBezierCurve, IBezierCurve]] = js.native
    def getFirectControlPoints(rhs: js.Array[Double]): js.Array[Double] = js.native
    def getInversionSolver(p0: PlainPoint, p1: PlainPoint, p2: PlainPoint, p3: PlainPoint): js.Function1[/* p */ PlainPoint, Double] = js.native
  }
  
  @JSName("scale")
  @js.native
  object scaleNs extends js.Object {
    def linear(domain: js.Tuple2[Double, Double], range: js.Tuple2[Double, Double], value: Double): Double = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jointjs.jointjsMod.gNs.Line
    - js.Array[typings.jointjs.jointjsMod.gNs.Curve | typings.jointjs.jointjsMod.gNs.Line]
    - typings.jointjs.jointjsMod.gNs.Curve
  */
  type PathObjectUnit = _PathObjectUnit | (js.Array[Curve | Line])
  type PathSegmentUnit = Segment | js.Array[Segment]
  type SegmentTypes = StringDictionary[Segment]
}

