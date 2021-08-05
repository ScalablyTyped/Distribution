package typings.jointjs.mod.g

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jointjs", "g.Path")
@js.native
// getter
class Path () extends StObject {
  def this(pathData: String) = this()
  def this(polyline: Polyline) = this()
  def this(segments: PathObjectUnit | PathSegmentUnit) = this()
  def this(segments: js.Array[PathObjectUnit | PathSegmentUnit]) = this()
  
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
  
  // getter
  var end: Point | Null = js.native
  
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
  /* private */ def prepareSegment(segment: Segment, previousSegment: Unit, nextSegment: Segment): Segment = js.native
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
  
  var segments: js.Array[Segment] = js.native
  
  def serialize(): String = js.native
  
  var start: Point | Null = js.native
  
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
  def translate(tx: Unit, ty: Double): this.type = js.native
  def translate(tx: PlainPoint): this.type = js.native
  
  /* private */ def updateSubpathStartSegment(segment: Segment): Unit = js.native
}
object Path {
  
  @JSImport("jointjs", "g.Path")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def createSegment(`type`: SegmentType, args: js.Any*): PathSegmentUnit = (^.asInstanceOf[js.Dynamic].applyDynamic("createSegment")(`type`.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[PathSegmentUnit]
  
  /* static member */
  inline def isDataSupported(pathData: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDataSupported")(pathData.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* static member */
  inline def parse(pathData: String): Path = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(pathData.asInstanceOf[js.Any]).asInstanceOf[Path]
  
  /* static member */
  @JSImport("jointjs", "g.Path.segmentTypes")
  @js.native
  def segmentTypes: SegmentTypes = js.native
  inline def segmentTypes_=(x: SegmentTypes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("segmentTypes")(x.asInstanceOf[js.Any])
}
