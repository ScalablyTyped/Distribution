package typings
package jointjsLib.jointjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jointjs", "g")
@js.native
object gNs extends js.Object {
  trait CardinalDirection extends js.Object
  
  @js.native
  class Curve protected () extends js.Object {
    def this(curve: Curve) = this()
    def this(p1: java.lang.String, p2: java.lang.String, p3: java.lang.String, p4: java.lang.String) = this()
    def this(p1: java.lang.String, p2: java.lang.String, p3: java.lang.String, p4: PlainPoint) = this()
    def this(p1: java.lang.String, p2: java.lang.String, p3: PlainPoint, p4: java.lang.String) = this()
    def this(p1: java.lang.String, p2: java.lang.String, p3: PlainPoint, p4: PlainPoint) = this()
    def this(p1: java.lang.String, p2: PlainPoint, p3: java.lang.String, p4: java.lang.String) = this()
    def this(p1: java.lang.String, p2: PlainPoint, p3: java.lang.String, p4: PlainPoint) = this()
    def this(p1: java.lang.String, p2: PlainPoint, p3: PlainPoint, p4: java.lang.String) = this()
    def this(p1: java.lang.String, p2: PlainPoint, p3: PlainPoint, p4: PlainPoint) = this()
    def this(p1: PlainPoint, p2: java.lang.String, p3: java.lang.String, p4: java.lang.String) = this()
    def this(p1: PlainPoint, p2: java.lang.String, p3: java.lang.String, p4: PlainPoint) = this()
    def this(p1: PlainPoint, p2: java.lang.String, p3: PlainPoint, p4: java.lang.String) = this()
    def this(p1: PlainPoint, p2: java.lang.String, p3: PlainPoint, p4: PlainPoint) = this()
    def this(p1: PlainPoint, p2: PlainPoint, p3: java.lang.String, p4: java.lang.String) = this()
    def this(p1: PlainPoint, p2: PlainPoint, p3: java.lang.String, p4: PlainPoint) = this()
    def this(p1: PlainPoint, p2: PlainPoint, p3: PlainPoint, p4: java.lang.String) = this()
    def this(p1: PlainPoint, p2: PlainPoint, p3: PlainPoint, p4: PlainPoint) = this()
    var controlPoint1: Point = js.native
    var controlPoint2: Point = js.native
    var end: Point = js.native
    var start: Point = js.native
    def bbox(): Rect = js.native
    def closestPoint(p: PlainPoint): Point = js.native
    def closestPoint(p: PlainPoint, opt: SubdivisionsOpt): Point = js.native
    def closestPointLength(p: PlainPoint): scala.Double = js.native
    def closestPointLength(p: PlainPoint, opt: SubdivisionsOpt): scala.Double = js.native
    def closestPointNormalizedLength(p: PlainPoint): scala.Double = js.native
    def closestPointNormalizedLength(p: PlainPoint, opt: SubdivisionsOpt): scala.Double = js.native
    def closestPointT(p: PlainPoint): scala.Double = js.native
    def closestPointT(p: PlainPoint, opt: SubdivisionsOpt): scala.Double = js.native
    def closestPointTangent(p: PlainPoint): Line | scala.Null = js.native
    def closestPointTangent(p: PlainPoint, opt: SubdivisionsOpt): Line | scala.Null = js.native
    def divide(t: scala.Double): js.Tuple2[Curve, Curve] = js.native
    def endpointDistance(): scala.Double = js.native
    def equals(c: Curve): scala.Boolean = js.native
    def getSkeletonPoints(t: scala.Double): js.Tuple5[Point, Point, Point, Point, Point] = js.native
    def getSubdivisions(): js.Array[Curve] = js.native
    def getSubdivisions(opt: PrecisionOpt): js.Array[Curve] = js.native
    def isDifferentiable(): scala.Boolean = js.native
    def length(): scala.Double = js.native
    def length(opt: SubdivisionsOpt): scala.Double = js.native
    def lengthAtT(t: scala.Double): scala.Double = js.native
    def lengthAtT(t: scala.Double, opt: PrecisionOpt): scala.Double = js.native
    def pointAt(ratio: scala.Double): Point = js.native
    def pointAt(ratio: scala.Double, opt: SubdivisionsOpt): Point = js.native
    def pointAtLength(length: scala.Double): Point = js.native
    def pointAtLength(length: scala.Double, opt: SubdivisionsOpt): Point = js.native
    def pointAtT(t: scala.Double): Point = js.native
    def scale(sx: scala.Double, sy: scala.Double): this.type = js.native
    def scale(sx: scala.Double, sy: scala.Double, origin: java.lang.String): this.type = js.native
    def scale(sx: scala.Double, sy: scala.Double, origin: PlainPoint): this.type = js.native
    def tAt(ratio: scala.Double): scala.Double = js.native
    def tAt(ratio: scala.Double, opt: SubdivisionsOpt): scala.Double = js.native
    def tAtLength(length: scala.Double): scala.Double = js.native
    def tAtLength(length: scala.Double, opt: SubdivisionsOpt): scala.Double = js.native
    def tangentAt(ratio: scala.Double): Line | scala.Null = js.native
    def tangentAt(ratio: scala.Double, opt: SubdivisionsOpt): Line | scala.Null = js.native
    def tangentAtLength(length: scala.Double): Line | scala.Null = js.native
    def tangentAtLength(length: scala.Double, opt: SubdivisionsOpt): Line | scala.Null = js.native
    def tangentAtT(t: scala.Double): Line | scala.Null = js.native
    def toPoints(): js.Array[Point] = js.native
    def toPoints(opt: SubdivisionsOpt): js.Array[Point] = js.native
    def toPolyline(): Polyline = js.native
    def toPolyline(opt: SubdivisionsOpt): Polyline = js.native
    def translate(): this.type = js.native
    def translate(tx: PlainPoint): this.type = js.native
    def translate(tx: scala.Double): this.type = js.native
    def translate(tx: scala.Double, ty: scala.Double): this.type = js.native
  }
  
  @js.native
  class Ellipse protected () extends js.Object {
    def this(ellipse: Ellipse) = this()
    def this(center: java.lang.String, a: scala.Double, b: scala.Double) = this()
    def this(center: PlainPoint, a: scala.Double, b: scala.Double) = this()
    var a: scala.Double = js.native
    var b: scala.Double = js.native
    var x: scala.Double = js.native
    var y: scala.Double = js.native
    def bbox(): Rect = js.native
    def center(): Point = js.native
    def containsPoint(p: PlainPoint): scala.Boolean = js.native
    def equals(ellipse: Ellipse): scala.Boolean = js.native
    def inflate(): this.type = js.native
    def inflate(dx: scala.Double): this.type = js.native
    def inflate(dx: scala.Double, dy: scala.Double): this.type = js.native
    def intersectionWithLine(l: Line): js.Array[Point] | scala.Null = js.native
    def intersectionWithLineFromCenterToPoint(p: PlainPoint): Point = js.native
    def intersectionWithLineFromCenterToPoint(p: PlainPoint, angle: scala.Double): Point = js.native
    def normalizedDistance(point: PlainPoint): scala.Double = js.native
    def tangentTheta(p: PlainPoint): scala.Double = js.native
  }
  
  @js.native
  class Line () extends js.Object {
    def this(line: Line) = this()
    def this(p1: java.lang.String, p2: java.lang.String) = this()
    def this(p1: java.lang.String, p2: PlainPoint) = this()
    def this(p1: PlainPoint, p2: java.lang.String) = this()
    def this(p1: PlainPoint, p2: PlainPoint) = this()
    var end: Point = js.native
    var start: Point = js.native
    def bbox(): Rect = js.native
    def bearing(): CardinalDirection = js.native
    def closestPoint(p: java.lang.String): Point = js.native
    def closestPoint(p: PlainPoint): Point = js.native
    def closestPointLength(p: java.lang.String): scala.Double = js.native
    def closestPointLength(p: PlainPoint): scala.Double = js.native
    def closestPointNormalizedLength(p: java.lang.String): scala.Double = js.native
    def closestPointNormalizedLength(p: PlainPoint): scala.Double = js.native
    def closestPointTangent(p: java.lang.String): Line | scala.Null = js.native
    def closestPointTangent(p: PlainPoint): Line | scala.Null = js.native
    def equals(line: Line): scala.Boolean = js.native
    def intersect(ellipse: Ellipse): js.Array[Point] | scala.Null = js.native
    def intersect(line: Line): Point | scala.Null = js.native
    def intersect(path: Path): js.Array[Point] | scala.Null = js.native
    def intersect(path: Path, opt: SegmentSubdivisionsOpt): js.Array[Point] | scala.Null = js.native
    def intersect(polyline: Polyline): js.Array[Point] | scala.Null = js.native
     // Backwards compatibility, should return an array
    def intersect(rect: Rect): js.Array[Point] | scala.Null = js.native
    def intersectionWithLine(l: Line): js.Array[Point] | scala.Null = js.native
    def isDifferentiable(): scala.Boolean = js.native
    def length(): scala.Double = js.native
    def midpoint(): Point = js.native
    def pointAt(t: scala.Double): Point = js.native
    def pointAtLength(length: scala.Double): Point = js.native
    def pointOffset(p: java.lang.String): scala.Double = js.native
    def pointOffset(p: PlainPoint): scala.Double = js.native
    def rotate(origin: PlainPoint, angle: scala.Double): this.type = js.native
    def round(): this.type = js.native
    def round(precision: scala.Double): this.type = js.native
    def scale(sx: scala.Double, sy: scala.Double): this.type = js.native
    def scale(sx: scala.Double, sy: scala.Double, origin: PlainPoint): this.type = js.native
    def setLength(length: scala.Double): this.type = js.native
    def squaredLength(): scala.Double = js.native
    def tangentAt(t: scala.Double): Line | scala.Null = js.native
    def tangentAtLength(length: scala.Double): Line | scala.Null = js.native
    def translate(): this.type = js.native
    def translate(tx: PlainPoint): this.type = js.native
    def translate(tx: scala.Double): this.type = js.native
    def translate(tx: scala.Double, ty: scala.Double): this.type = js.native
    def vector(): Point = js.native
  }
  
  @js.native
   // getter
  class Path () extends js.Object {
    def this(curve: Curve) = this()
    def this(line: Line) = this()
    def this(pathData: java.lang.String) = this()
    def this(polyline: Polyline) = this()
    def this(segment: Segment) = this()
    def this(segments: js.Array[Curve | Line | Segment]) = this()
     // getter
    var end: Point | scala.Null = js.native
    var segments: js.Array[Segment] = js.native
    var start: Point | scala.Null = js.native
    def appendSegment(segment: Segment): scala.Unit = js.native
    def appendSegment(segments: js.Array[Segment]): scala.Unit = js.native
    def bbox(): Rect | scala.Null = js.native
    def closestPoint(p: Point): Point | scala.Null = js.native
    def closestPoint(p: Point, opt: SegmentSubdivisionsOpt): Point | scala.Null = js.native
    def closestPointLength(p: Point): scala.Double = js.native
    def closestPointLength(p: Point, opt: SegmentSubdivisionsOpt): scala.Double = js.native
    def closestPointNormalizedLength(p: Point): scala.Double = js.native
    def closestPointNormalizedLength(p: Point, opt: SegmentSubdivisionsOpt): scala.Double = js.native
    /* private */ def closestPointT(p: Point): PathT | scala.Null = js.native
    /* private */ def closestPointT(p: Point, opt: SegmentSubdivisionsOpt): PathT | scala.Null = js.native
    def closestPointTangent(p: Point): Line | scala.Null = js.native
    def closestPointTangent(p: Point, opt: SegmentSubdivisionsOpt): Line | scala.Null = js.native
    def equals(p: Path): scala.Boolean = js.native
    def getSegment(index: scala.Double): Segment | scala.Null = js.native
    def getSegmentSubdivisions(): js.Array[js.Array[Curve]] = js.native
    def getSegmentSubdivisions(opt: PrecisionOpt): js.Array[js.Array[Curve]] = js.native
    def insertSegment(index: scala.Double, segment: Segment): scala.Unit = js.native
    def insertSegment(index: scala.Double, segments: js.Array[Segment]): scala.Unit = js.native
    def intersectionWithLine(l: Line): js.Array[Point] | scala.Null = js.native
    def intersectionWithLine(l: Line, opt: SegmentSubdivisionsOpt): js.Array[Point] | scala.Null = js.native
    def isDifferentiable(): scala.Boolean = js.native
    def isValid(): scala.Boolean = js.native
    def length(): scala.Double = js.native
    def length(opt: SegmentSubdivisionsOpt): scala.Double = js.native
    /* private */ def lengthAtT(t: PathT): scala.Double = js.native
    /* private */ def lengthAtT(t: PathT, opt: SegmentSubdivisionsOpt): scala.Double = js.native
    def pointAt(ratio: scala.Double): Point | scala.Null = js.native
    def pointAt(ratio: scala.Double, opt: SegmentSubdivisionsOpt): Point | scala.Null = js.native
    def pointAtLength(length: scala.Double): Point | scala.Null = js.native
    def pointAtLength(length: scala.Double, opt: SegmentSubdivisionsOpt): Point | scala.Null = js.native
    /* private */ def pointAtT(t: PathT): Point | scala.Null = js.native
    /* private */ def prepareSegment(segment: Segment): Segment = js.native
    /* private */ def prepareSegment(segment: Segment, previousSegment: Segment): Segment = js.native
    /* private */ def prepareSegment(segment: Segment, previousSegment: Segment, nextSegment: Segment): Segment = js.native
    /* private */ def prepareSegment(segment: Segment, previousSegment: scala.Null, nextSegment: Segment): Segment = js.native
    def removeSegment(index: scala.Double): scala.Unit = js.native
    def replaceSegment(index: scala.Double, segment: Segment): scala.Unit = js.native
    def replaceSegment(index: scala.Double, segments: js.Array[Segment]): scala.Unit = js.native
    def scale(sx: scala.Double, sy: scala.Double): this.type = js.native
    def scale(sx: scala.Double, sy: scala.Double, origin: java.lang.String): this.type = js.native
    def scale(sx: scala.Double, sy: scala.Double, origin: PlainPoint): this.type = js.native
    def segmentAt(ratio: scala.Double): Segment | scala.Null = js.native
    def segmentAt(ratio: scala.Double, opt: SegmentSubdivisionsOpt): Segment | scala.Null = js.native
    def segmentAtLength(length: scala.Double): Segment | scala.Null = js.native
    def segmentAtLength(length: scala.Double, opt: SegmentSubdivisionsOpt): Segment | scala.Null = js.native
    def segmentIndexAt(ratio: scala.Double): scala.Double | scala.Null = js.native
    def segmentIndexAt(ratio: scala.Double, opt: SegmentSubdivisionsOpt): scala.Double | scala.Null = js.native
    def segmentIndexAtLength(length: scala.Double): scala.Double | scala.Null = js.native
    def segmentIndexAtLength(length: scala.Double, opt: SegmentSubdivisionsOpt): scala.Double | scala.Null = js.native
    def serialize(): java.lang.String = js.native
    def tangentAt(ratio: scala.Double): Line | scala.Null = js.native
    def tangentAt(ratio: scala.Double, opt: SegmentSubdivisionsOpt): Line | scala.Null = js.native
    def tangentAtLength(length: scala.Double): Line | scala.Null = js.native
    def tangentAtLength(length: scala.Double, opt: SegmentSubdivisionsOpt): Line | scala.Null = js.native
    /* private */ def tangentAtT(t: PathT): Line | scala.Null = js.native
    def toPoints(): js.Array[js.Array[Point]] | scala.Null = js.native
    def toPoints(opt: SegmentSubdivisionsOpt): js.Array[js.Array[Point]] | scala.Null = js.native
    def toPolylines(): js.Array[Polyline] | scala.Null = js.native
    def toPolylines(opt: SegmentSubdivisionsOpt): js.Array[Polyline] | scala.Null = js.native
    def translate(): this.type = js.native
    def translate(tx: PlainPoint): this.type = js.native
    def translate(tx: scala.Double): this.type = js.native
    def translate(tx: scala.Double, ty: scala.Double): this.type = js.native
    /* private */ def updateSubpathStartSegment(segment: Segment): scala.Unit = js.native
  }
  
  trait PathT extends js.Object {
    var segmentIndex: scala.Double
    var value: scala.Double
  }
  
  trait PlainPoint extends js.Object {
    var x: scala.Double
    var y: scala.Double
  }
  
  trait PlainRect extends js.Object {
    var height: scala.Double
    var width: scala.Double
    var x: scala.Double
    var y: scala.Double
  }
  
  @js.native
  class Point () extends PlainPoint {
    def this(p: java.lang.String) = this()
    def this(p: PlainPoint) = this()
    def this(x: scala.Double) = this()
    def this(x: scala.Double, y: scala.Double) = this()
    /* CompleteClass */
    override var x: scala.Double = js.native
    /* CompleteClass */
    override var y: scala.Double = js.native
    def adhereToRect(r: Rect): this.type = js.native
    def angleBetween(p1: PlainPoint, p2: PlainPoint): scala.Double = js.native
    def bearing(p: Point): CardinalDirection = js.native
    def changeInAngle(dx: scala.Double, dy: scala.Double, ref: java.lang.String): scala.Double = js.native
    def changeInAngle(dx: scala.Double, dy: scala.Double, ref: PlainPoint): scala.Double = js.native
    def cross(p1: PlainPoint, p2: PlainPoint): scala.Double = js.native
    def difference(): Point = js.native
    def difference(dx: scala.Double): Point = js.native
    def difference(dx: scala.Double, dy: scala.Double): Point = js.native
    def difference(p: PlainPoint): Point = js.native
    def distance(p: java.lang.String): scala.Double = js.native
    def distance(p: PlainPoint): scala.Double = js.native
    def dot(p: PlainPoint): scala.Double = js.native
    def equals(p: Point): scala.Boolean = js.native
    def lerp(p: Point, t: scala.Double): Point = js.native
    def magnitude(): scala.Double = js.native
    def manhattanDistance(p: PlainPoint): scala.Double = js.native
    def move(ref: java.lang.String, distance: scala.Double): this.type = js.native
    def move(ref: PlainPoint, distance: scala.Double): this.type = js.native
    def normalize(length: scala.Double): this.type = js.native
    def offset(): this.type = js.native
    def offset(dx: scala.Double): this.type = js.native
    def offset(dx: scala.Double, dy: scala.Double): this.type = js.native
    def offset(p: PlainPoint): this.type = js.native
    def reflection(ref: java.lang.String): Point = js.native
    def reflection(ref: PlainPoint): Point = js.native
    def rotate(origin: java.lang.String, angle: scala.Double): this.type = js.native
    def rotate(origin: PlainPoint, angle: scala.Double): this.type = js.native
    def round(): this.type = js.native
    def round(precision: scala.Double): this.type = js.native
    def scale(sx: scala.Double, sy: scala.Double): this.type = js.native
    def scale(sx: scala.Double, sy: scala.Double, origin: java.lang.String): this.type = js.native
    def scale(sx: scala.Double, sy: scala.Double, origin: PlainPoint): this.type = js.native
    def snapToGrid(gx: scala.Double): this.type = js.native
    def snapToGrid(gx: scala.Double, gy: scala.Double): this.type = js.native
    def squaredDistance(p: java.lang.String): scala.Double = js.native
    def squaredDistance(p: PlainPoint): scala.Double = js.native
    def theta(p: java.lang.String): scala.Double = js.native
    def theta(p: PlainPoint): scala.Double = js.native
    def toJSON(): PlainPoint = js.native
    def toPolar(): this.type = js.native
    def toPolar(origin: java.lang.String): this.type = js.native
    def toPolar(origin: PlainPoint): this.type = js.native
    def translate(): this.type = js.native
    def translate(tx: PlainPoint): this.type = js.native
    def translate(tx: scala.Double): this.type = js.native
    def translate(tx: scala.Double, ty: scala.Double): this.type = js.native
    def update(): this.type = js.native
    def update(x: scala.Double): this.type = js.native
    def update(x: scala.Double, y: scala.Double): this.type = js.native
    def vectorAngle(p: PlainPoint): scala.Double = js.native
  }
  
  @js.native
   // getter
  class Polyline () extends js.Object {
    def this(points: js.Array[Point]) = this()
    def this(svgString: java.lang.String) = this()
     // getter
    var end: Point | scala.Null = js.native
    var points: js.Array[Point] = js.native
    var start: Point | scala.Null = js.native
    def bbox(): Rect | scala.Null = js.native
    def closestPoint(p: java.lang.String): Point | scala.Null = js.native
    def closestPoint(p: PlainPoint): Point | scala.Null = js.native
    def closestPointLength(p: java.lang.String): scala.Double = js.native
    def closestPointLength(p: PlainPoint): scala.Double = js.native
    def closestPointNormalizedLength(p: java.lang.String): scala.Double = js.native
    def closestPointNormalizedLength(p: PlainPoint): scala.Double = js.native
    def closestPointTangent(p: java.lang.String): Line | scala.Null = js.native
    def closestPointTangent(p: PlainPoint): Line | scala.Null = js.native
    def convexHull(): Polyline = js.native
    def equals(p: Polyline): scala.Boolean = js.native
    def intersectionWithLine(l: Line): js.Array[Point] | scala.Null = js.native
    def isDifferentiable(): scala.Boolean = js.native
    def length(): scala.Double = js.native
    def pointAt(ratio: scala.Double): Point | scala.Null = js.native
    def pointAtLength(length: scala.Double): Point | scala.Null = js.native
    def scale(sx: scala.Double, sy: scala.Double): this.type = js.native
    def scale(sx: scala.Double, sy: scala.Double, origin: java.lang.String): this.type = js.native
    def scale(sx: scala.Double, sy: scala.Double, origin: PlainPoint): this.type = js.native
    def serialize(): java.lang.String = js.native
    def tangentAt(ratio: scala.Double): Line | scala.Null = js.native
    def tangentAtLength(length: scala.Double): Line | scala.Null = js.native
    def translate(): this.type = js.native
    def translate(tx: PlainPoint): this.type = js.native
    def translate(tx: scala.Double): this.type = js.native
    def translate(tx: scala.Double, ty: scala.Double): this.type = js.native
  }
  
  trait PrecisionOpt extends js.Object {
    var precision: js.UndefOr[scala.Double] = js.undefined
  }
  
  @js.native
  class Rect () extends PlainRect {
    def this(r: PlainRect) = this()
    def this(x: scala.Double) = this()
    def this(x: scala.Double, y: scala.Double) = this()
    def this(x: scala.Double, y: scala.Double, width: scala.Double) = this()
    def this(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double) = this()
    /* CompleteClass */
    override var height: scala.Double = js.native
    /* CompleteClass */
    override var width: scala.Double = js.native
    /* CompleteClass */
    override var x: scala.Double = js.native
    /* CompleteClass */
    override var y: scala.Double = js.native
    def bbox(): Rect = js.native
    def bbox(angle: scala.Double): Rect = js.native
    def bottomLeft(): Point = js.native
    def bottomLine(): Line = js.native
    def bottomMiddle(): Point = js.native
    def bottomRight(): Point = js.native
    def center(): Point = js.native
    def containsPoint(p: java.lang.String): scala.Boolean = js.native
    def containsPoint(p: PlainPoint): scala.Boolean = js.native
    def containsRect(r: PlainRect): scala.Boolean = js.native
    def corner(): Point = js.native
    def equals(r: PlainRect): scala.Boolean = js.native
    def inflate(): this.type = js.native
    def inflate(dx: scala.Double): this.type = js.native
    def inflate(dx: scala.Double, dy: scala.Double): this.type = js.native
    def intersect(r: Rect): Rect | scala.Null = js.native
    def intersectionWithLine(l: Line): js.Array[Point] | scala.Null = js.native
    def intersectionWithLineFromCenterToPoint(p: java.lang.String): Point = js.native
    def intersectionWithLineFromCenterToPoint(p: java.lang.String, angle: scala.Double): Point = js.native
    def intersectionWithLineFromCenterToPoint(p: PlainPoint): Point = js.native
    def intersectionWithLineFromCenterToPoint(p: PlainPoint, angle: scala.Double): Point = js.native
    def leftLine(): Line = js.native
    def leftMiddle(): Point = js.native
    def maxRectScaleToFit(rect: PlainRect): Scale = js.native
    def maxRectScaleToFit(rect: PlainRect, origin: PlainPoint): Scale = js.native
    def maxRectUniformScaleToFit(rect: PlainRect): scala.Double = js.native
    def maxRectUniformScaleToFit(rect: PlainRect, origin: PlainPoint): scala.Double = js.native
    def moveAndExpand(r: PlainRect): this.type = js.native
    def normalize(): this.type = js.native
    def offset(): this.type = js.native
    def offset(dx: scala.Double): this.type = js.native
    def offset(dx: scala.Double, dy: scala.Double): this.type = js.native
    def offset(p: PlainPoint): this.type = js.native
    def origin(): Point = js.native
    def pointNearestToPoint(point: java.lang.String): Point = js.native
    def pointNearestToPoint(point: PlainPoint): Point = js.native
    def rightLine(): Line = js.native
    def rightMiddle(): Point = js.native
    def round(): this.type = js.native
    def round(precision: scala.Double): this.type = js.native
    def scale(sx: scala.Double, sy: scala.Double): this.type = js.native
    def scale(sx: scala.Double, sy: scala.Double, origin: java.lang.String): this.type = js.native
    def scale(sx: scala.Double, sy: scala.Double, origin: PlainPoint): this.type = js.native
    def sideNearestToPoint(point: java.lang.String): RectangleSide = js.native
    def sideNearestToPoint(point: PlainPoint): RectangleSide = js.native
    def snapToGrid(gx: scala.Double): this.type = js.native
    def snapToGrid(gx: scala.Double, gy: scala.Double): this.type = js.native
    def toJSON(): PlainRect = js.native
    def topLeft(): Point = js.native
    def topLine(): Line = js.native
    def topMiddle(): Point = js.native
    def topRight(): Point = js.native
    def translate(): this.type = js.native
    def translate(tx: PlainPoint): this.type = js.native
    def translate(tx: scala.Double): this.type = js.native
    def translate(tx: scala.Double, ty: scala.Double): this.type = js.native
    def union(rect: PlainRect): Rect = js.native
  }
  
  trait RectangleSide extends js.Object
  
  trait Scale extends js.Object {
    var sx: scala.Double
    var sy: scala.Double
  }
  
  @js.native
  trait Segment extends js.Object {
     // getter, `never` for Moveto
    var end: Point | scala.Null = js.native
    var isSegment: scala.Boolean = js.native
    var isSubpathStart: scala.Boolean = js.native
    var isVisible: scala.Boolean = js.native
    var nextSegment: Segment | scala.Null = js.native
    var previousSegment: Segment | scala.Null = js.native
    var start: Point | scala.Null | scala.Nothing = js.native
    var subpathStartSegment: Segment | scala.Null = js.native
    var `type`: SegmentType = js.native
     // getter or directly assigned
    def bbox(): Rect | scala.Null = js.native
    def closestPoint(p: Point): Point = js.native
    def closestPoint(p: Point, opt: SubdivisionsOpt): Point = js.native
    def closestPointLength(p: Point): scala.Double = js.native
    def closestPointLength(p: Point, opt: SubdivisionsOpt): scala.Double = js.native
    def closestPointNormalizedLength(p: Point): scala.Double = js.native
    def closestPointNormalizedLength(p: Point, opt: SubdivisionsOpt): scala.Double = js.native
    def closestPointT(p: Point): scala.Double = js.native
    def closestPointTangent(p: Point): Line | scala.Null = js.native
    def equals(segment: Segment): scala.Boolean = js.native
    def getSubdivisions(): js.Array[Curve] = js.native
    def isDifferentiable(): scala.Boolean = js.native
    def length(): scala.Double = js.native
    def lengthAtT(t: scala.Double): scala.Double = js.native
    def lengthAtT(t: scala.Double, opt: PrecisionOpt): scala.Double = js.native
    def pointAt(ratio: scala.Double): Point = js.native
    def pointAtLength(length: scala.Double): Point = js.native
    def pointAtT(t: scala.Double): Point = js.native
    def scale(sx: scala.Double, sy: scala.Double): this.type = js.native
    def scale(sx: scala.Double, sy: scala.Double, origin: PlainPoint): this.type = js.native
    def serialize(): java.lang.String = js.native
    def tangentAt(ratio: scala.Double): Line | scala.Null = js.native
    def tangentAtLength(length: scala.Double): Line | scala.Null = js.native
    def tangentAtT(t: scala.Double): Line | scala.Null = js.native
    def translate(): this.type = js.native
    def translate(tx: PlainPoint): this.type = js.native
    def translate(tx: scala.Double): this.type = js.native
    def translate(tx: scala.Double, ty: scala.Double): this.type = js.native
  }
  
  trait SegmentSubdivisionsOpt extends PrecisionOpt {
    var segmentSubdivisions: js.UndefOr[js.Array[js.Array[Curve]]] = js.undefined
  }
  
  trait SegmentType extends js.Object
  
  trait SegmentTypes
    extends /* key */ org.scalablytyped.runtime.StringDictionary[Segment]
  
  trait SubdivisionsOpt extends PrecisionOpt {
    var subdivisions: js.UndefOr[js.Array[Curve]] = js.undefined
  }
  
  def normalizeAngle(angle: scala.Double): scala.Double = js.native
  def snapToGrid(`val`: scala.Double, gridSize: scala.Double): scala.Double = js.native
  def toDeg(rad: scala.Double): scala.Double = js.native
  def toRad(deg: scala.Double): scala.Double = js.native
  def toRad(deg: scala.Double, over360: scala.Boolean): scala.Double = js.native
  /* static members */
  @js.native
  object Curve extends js.Object {
    def throughPoints(points: js.Array[jointjsLib.jointjsMod.gNs.PlainPoint]): js.Array[jointjsLib.jointjsMod.gNs.Curve] = js.native
  }
  
  /* static members */
  @js.native
  object Ellipse extends js.Object {
    def fromRect(rect: jointjsLib.jointjsMod.gNs.PlainRect): jointjsLib.jointjsMod.gNs.Ellipse = js.native
  }
  
  /* static members */
  @js.native
  object Path extends js.Object {
    var segmentTypes: jointjsLib.jointjsMod.gNs.SegmentTypes = js.native
    def createSegment(`type`: jointjsLib.jointjsMod.gNs.SegmentType, args: js.Any*): jointjsLib.jointjsMod.gNs.Segment = js.native
    def isDataSupported(pathData: java.lang.String): scala.Boolean = js.native
    def parse(pathData: java.lang.String): jointjsLib.jointjsMod.gNs.Path = js.native
  }
  
  /* static members */
  @js.native
  object Point extends js.Object {
    def fromPolar(distance: scala.Double, angle: scala.Double): jointjsLib.jointjsMod.gNs.Point = js.native
    def fromPolar(distance: scala.Double, angle: scala.Double, origin: java.lang.String): jointjsLib.jointjsMod.gNs.Point = js.native
    def fromPolar(distance: scala.Double, angle: scala.Double, origin: jointjsLib.jointjsMod.gNs.PlainPoint): jointjsLib.jointjsMod.gNs.Point = js.native
    def random(x1: scala.Double, x2: scala.Double, y1: scala.Double, y2: scala.Double): jointjsLib.jointjsMod.gNs.Point = js.native
  }
  
  /* static members */
  @js.native
  object Polyline extends js.Object {
    def parse(svgString: java.lang.String): jointjsLib.jointjsMod.gNs.Polyline = js.native
  }
  
  /* static members */
  @js.native
  object Rect extends js.Object {
    def fromEllipse(e: jointjsLib.jointjsMod.gNs.Ellipse): jointjsLib.jointjsMod.gNs.Rect = js.native
  }
  
  @JSName("bezier")
  @js.native
  object bezierNs extends js.Object {
    trait IBezierCurve extends js.Object {
      var p0: jointjsLib.jointjsMod.gNs.Point
      var p1: jointjsLib.jointjsMod.gNs.Point
      var p2: jointjsLib.jointjsMod.gNs.Point
      var p3: jointjsLib.jointjsMod.gNs.Point
    }
    
    def curveThroughPoints(points: js.Array[jointjsLib.jointjsMod.gNs.PlainPoint | jointjsLib.jointjsMod.gNs.Point]): js.Array[java.lang.String] = js.native
    def getCurveControlPoints(points: js.Array[jointjsLib.jointjsMod.gNs.PlainPoint | jointjsLib.jointjsMod.gNs.Point]): js.Tuple2[
        js.Array[jointjsLib.jointjsMod.gNs.Point], 
        js.Array[jointjsLib.jointjsMod.gNs.Point]
      ] = js.native
    def getCurveDivider(p0: java.lang.String, p1: java.lang.String, p2: java.lang.String, p3: java.lang.String): js.Function1[/* t */ scala.Double, js.Tuple2[IBezierCurve, IBezierCurve]] = js.native
    def getCurveDivider(
      p0: java.lang.String,
      p1: java.lang.String,
      p2: java.lang.String,
      p3: jointjsLib.jointjsMod.gNs.PlainPoint
    ): js.Function1[/* t */ scala.Double, js.Tuple2[IBezierCurve, IBezierCurve]] = js.native
    def getCurveDivider(
      p0: java.lang.String,
      p1: java.lang.String,
      p2: jointjsLib.jointjsMod.gNs.PlainPoint,
      p3: java.lang.String
    ): js.Function1[/* t */ scala.Double, js.Tuple2[IBezierCurve, IBezierCurve]] = js.native
    def getCurveDivider(
      p0: java.lang.String,
      p1: java.lang.String,
      p2: jointjsLib.jointjsMod.gNs.PlainPoint,
      p3: jointjsLib.jointjsMod.gNs.PlainPoint
    ): js.Function1[/* t */ scala.Double, js.Tuple2[IBezierCurve, IBezierCurve]] = js.native
    def getCurveDivider(
      p0: java.lang.String,
      p1: jointjsLib.jointjsMod.gNs.PlainPoint,
      p2: java.lang.String,
      p3: java.lang.String
    ): js.Function1[/* t */ scala.Double, js.Tuple2[IBezierCurve, IBezierCurve]] = js.native
    def getCurveDivider(
      p0: java.lang.String,
      p1: jointjsLib.jointjsMod.gNs.PlainPoint,
      p2: java.lang.String,
      p3: jointjsLib.jointjsMod.gNs.PlainPoint
    ): js.Function1[/* t */ scala.Double, js.Tuple2[IBezierCurve, IBezierCurve]] = js.native
    def getCurveDivider(
      p0: java.lang.String,
      p1: jointjsLib.jointjsMod.gNs.PlainPoint,
      p2: jointjsLib.jointjsMod.gNs.PlainPoint,
      p3: java.lang.String
    ): js.Function1[/* t */ scala.Double, js.Tuple2[IBezierCurve, IBezierCurve]] = js.native
    def getCurveDivider(
      p0: java.lang.String,
      p1: jointjsLib.jointjsMod.gNs.PlainPoint,
      p2: jointjsLib.jointjsMod.gNs.PlainPoint,
      p3: jointjsLib.jointjsMod.gNs.PlainPoint
    ): js.Function1[/* t */ scala.Double, js.Tuple2[IBezierCurve, IBezierCurve]] = js.native
    def getCurveDivider(
      p0: jointjsLib.jointjsMod.gNs.PlainPoint,
      p1: java.lang.String,
      p2: java.lang.String,
      p3: java.lang.String
    ): js.Function1[/* t */ scala.Double, js.Tuple2[IBezierCurve, IBezierCurve]] = js.native
    def getCurveDivider(
      p0: jointjsLib.jointjsMod.gNs.PlainPoint,
      p1: java.lang.String,
      p2: java.lang.String,
      p3: jointjsLib.jointjsMod.gNs.PlainPoint
    ): js.Function1[/* t */ scala.Double, js.Tuple2[IBezierCurve, IBezierCurve]] = js.native
    def getCurveDivider(
      p0: jointjsLib.jointjsMod.gNs.PlainPoint,
      p1: java.lang.String,
      p2: jointjsLib.jointjsMod.gNs.PlainPoint,
      p3: java.lang.String
    ): js.Function1[/* t */ scala.Double, js.Tuple2[IBezierCurve, IBezierCurve]] = js.native
    def getCurveDivider(
      p0: jointjsLib.jointjsMod.gNs.PlainPoint,
      p1: java.lang.String,
      p2: jointjsLib.jointjsMod.gNs.PlainPoint,
      p3: jointjsLib.jointjsMod.gNs.PlainPoint
    ): js.Function1[/* t */ scala.Double, js.Tuple2[IBezierCurve, IBezierCurve]] = js.native
    def getCurveDivider(
      p0: jointjsLib.jointjsMod.gNs.PlainPoint,
      p1: jointjsLib.jointjsMod.gNs.PlainPoint,
      p2: java.lang.String,
      p3: java.lang.String
    ): js.Function1[/* t */ scala.Double, js.Tuple2[IBezierCurve, IBezierCurve]] = js.native
    def getCurveDivider(
      p0: jointjsLib.jointjsMod.gNs.PlainPoint,
      p1: jointjsLib.jointjsMod.gNs.PlainPoint,
      p2: java.lang.String,
      p3: jointjsLib.jointjsMod.gNs.PlainPoint
    ): js.Function1[/* t */ scala.Double, js.Tuple2[IBezierCurve, IBezierCurve]] = js.native
    def getCurveDivider(
      p0: jointjsLib.jointjsMod.gNs.PlainPoint,
      p1: jointjsLib.jointjsMod.gNs.PlainPoint,
      p2: jointjsLib.jointjsMod.gNs.PlainPoint,
      p3: java.lang.String
    ): js.Function1[/* t */ scala.Double, js.Tuple2[IBezierCurve, IBezierCurve]] = js.native
    def getCurveDivider(
      p0: jointjsLib.jointjsMod.gNs.PlainPoint,
      p1: jointjsLib.jointjsMod.gNs.PlainPoint,
      p2: jointjsLib.jointjsMod.gNs.PlainPoint,
      p3: jointjsLib.jointjsMod.gNs.PlainPoint
    ): js.Function1[/* t */ scala.Double, js.Tuple2[IBezierCurve, IBezierCurve]] = js.native
    def getFirectControlPoints(rhs: js.Array[scala.Double]): js.Array[scala.Double] = js.native
    def getInversionSolver(
      p0: jointjsLib.jointjsMod.gNs.PlainPoint,
      p1: jointjsLib.jointjsMod.gNs.PlainPoint,
      p2: jointjsLib.jointjsMod.gNs.PlainPoint,
      p3: jointjsLib.jointjsMod.gNs.PlainPoint
    ): js.Function1[/* p */ jointjsLib.jointjsMod.gNs.PlainPoint, scala.Double] = js.native
  }
  
  @JSName("scale")
  @js.native
  object scaleNs extends js.Object {
    def linear(
      domain: js.Tuple2[scala.Double, scala.Double],
      range: js.Tuple2[scala.Double, scala.Double],
      value: scala.Double
    ): scala.Double = js.native
  }
  
}

