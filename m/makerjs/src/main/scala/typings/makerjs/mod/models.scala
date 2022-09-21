package typings.makerjs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.makerjs.MakerJs.IFindChainsOptions
import typings.makerjs.MakerJs.IMeasure
import typings.makerjs.MakerJs.IModel
import typings.makerjs.MakerJs.IModelMap
import typings.makerjs.MakerJs.IPath
import typings.makerjs.MakerJs.IPathArc
import typings.makerjs.MakerJs.IPathBezierSeed
import typings.makerjs.MakerJs.IPathMap
import typings.makerjs.MakerJs.IPoint
import typings.opentypeJs.mod.Font
import typings.opentypeJs.mod.Glyph
import typings.opentypeJs.mod.RenderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object models {
  
  @JSImport("makerjs", "models.Belt")
  @js.native
  open class Belt protected ()
    extends StObject
       with typings.makerjs.MakerJs.models.Belt {
    def this(leftRadius: Double, distance: Double, rightRadius: Double) = this()
    
    /* CompleteClass */
    @JSName("paths")
    var paths_Belt: IPathMap = js.native
  }
  
  @JSImport("makerjs", "models.BezierCurve")
  @js.native
  open class BezierCurve protected ()
    extends StObject
       with typings.makerjs.MakerJs.models.BezierCurve {
    def this(points: js.Array[IPoint]) = this()
    def this(seed: IPathBezierSeed) = this()
    def this(points: js.Array[IPoint], accuracy: Double) = this()
    def this(seed: IPathBezierSeed, accuracy: Double) = this()
    def this(origin: IPoint, controls: js.Array[IPoint], end: IPoint) = this()
    def this(origin: IPoint, control: IPoint, end: IPoint) = this()
    def this(origin: IPoint, control1: IPoint, control2: IPoint, end: IPoint) = this()
    def this(origin: IPoint, controls: js.Array[IPoint], end: IPoint, accuracy: Double) = this()
    def this(origin: IPoint, control: IPoint, end: IPoint, accuracy: Double) = this()
    def this(origin: IPoint, control1: IPoint, control2: IPoint, end: IPoint, accuracy: Double) = this()
    
    /* CompleteClass */
    var accuracy: Double = js.native
    
    /* CompleteClass */
    @JSName("models")
    var models_BezierCurve: IModelMap = js.native
    
    /* CompleteClass */
    @JSName("origin")
    var origin_BezierCurve: IPoint = js.native
    
    /* CompleteClass */
    @JSName("paths")
    var paths_BezierCurve: IPathMap = js.native
    
    /* CompleteClass */
    var seed: IPathBezierSeed = js.native
    
    /* CompleteClass */
    @JSName("type")
    var type_BezierCurve: String = js.native
  }
  object BezierCurve {
    
    @JSImport("makerjs", "models.BezierCurve")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def computeLength(seed: IPathBezierSeed): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computeLength")(seed.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /* static member */
    inline def computePoint(seed: IPathBezierSeed, t: Double): IPoint = (^.asInstanceOf[js.Dynamic].applyDynamic("computePoint")(seed.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[IPoint]
    
    /* static member */
    inline def getBezierSeeds(curve: typings.makerjs.MakerJs.models.BezierCurve): js.Array[IPath] | StringDictionary[js.Array[IPath]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBezierSeeds")(curve.asInstanceOf[js.Any]).asInstanceOf[js.Array[IPath] | StringDictionary[js.Array[IPath]]]
    inline def getBezierSeeds(curve: typings.makerjs.MakerJs.models.BezierCurve, options: IFindChainsOptions): js.Array[IPath] | StringDictionary[js.Array[IPath]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBezierSeeds")(curve.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[IPath] | StringDictionary[js.Array[IPath]]]
    
    /* static member */
    @JSImport("makerjs", "models.BezierCurve.typeName")
    @js.native
    def typeName: String = js.native
    inline def typeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("typeName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("makerjs", "models.BoltCircle")
  @js.native
  open class BoltCircle protected ()
    extends StObject
       with typings.makerjs.MakerJs.models.BoltCircle {
    def this(boltRadius: Double, holeRadius: Double, boltCount: Double) = this()
    def this(boltRadius: Double, holeRadius: Double, boltCount: Double, firstBoltAngleInDegrees: Double) = this()
    
    /* CompleteClass */
    @JSName("paths")
    var paths_BoltCircle: IPathMap = js.native
  }
  
  @JSImport("makerjs", "models.BoltRectangle")
  @js.native
  open class BoltRectangle protected ()
    extends StObject
       with typings.makerjs.MakerJs.models.BoltRectangle {
    def this(width: Double, height: Double, holeRadius: Double) = this()
    
    /* CompleteClass */
    @JSName("paths")
    var paths_BoltRectangle: IPathMap = js.native
  }
  
  @JSImport("makerjs", "models.ConnectTheDots")
  @js.native
  open class ConnectTheDots protected ()
    extends StObject
       with typings.makerjs.MakerJs.models.ConnectTheDots {
    /**
      * Create a model by connecting points designated in a numeric array. The model will be 'closed' - i.e. the last point will connect to the first point.
      *
      * Example:
      * ```
      * var c = new makerjs.models.ConnectTheDots([-10, 0, 10, 0, 0, 20]); // 3 coordinates to form a triangle
      * ```
      *
      * @param coords Array of coordinates.
      */
    def this(coords: js.Array[Double]) = this()
    /**
      * Create a model by connecting points designated in a string. The model will be 'closed' - i.e. the last point will connect to the first point.
      *
      * Example:
      * ```
      * var c = new makerjs.models.ConnectTheDots('-10 0 10 0 0 20'); // 3 coordinates to form a triangle
      * ```
      *
      * @param numericList String containing a list of numbers which can be delimited by spaces, commas, or anything non-numeric (Note: [exponential notation](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/toExponential) is allowed).
      */
    def this(numericList: String) = this()
    /**
      * Create a model by connecting points designated in a numeric array. The model may be closed, or left open.
      *
      * Example:
      * ```
      * var c = new makerjs.models.ConnectTheDots(false, [-10, 0, 10, 0, 0, 20]); // 3 coordinates to form a polyline
      * ```
      *
      * @param isClosed Flag to specify if last point should connect to the first point.
      * @param coords Array of coordinates.
      */
    /**
      * Create a model by connecting points designated in an array of points. The model may be closed, or left open.
      *
      * Example:
      * ```
      * var c = new makerjs.models.ConnectTheDots(false, [[-10, 0], [10, 0], [0, 20]]); // 3 coordinates left open
      * ```
      *
      * @param isClosed Flag to specify if last point should connect to the first point.
      * @param points Array of IPoints.
      */
    def this(isClosed: Boolean, coords: js.Array[Double | IPoint]) = this()
    /**
      * Create a model by connecting points designated in a string. The model may be closed, or left open.
      *
      * Example:
      * ```
      * var c = new makerjs.models.ConnectTheDots(false, '-10 0 10 0 0 20'); // 3 coordinates to form a polyline
      * ```
      *
      * @param isClosed Flag to specify if last point should connect to the first point.
      * @param numericList String containing a list of numbers which can be delimited by spaces, commas, or anything non-numeric (Note: [exponential notation](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/toExponential) is allowed).
      */
    def this(isClosed: Boolean, numericList: String) = this()
    
    /* CompleteClass */
    @JSName("paths")
    var paths_ConnectTheDots: IPathMap = js.native
  }
  
  @JSImport("makerjs", "models.Dogbone")
  @js.native
  open class Dogbone protected ()
    extends StObject
       with typings.makerjs.MakerJs.models.Dogbone {
    /**
      * Create a dogbone from width, height, corner radius, style, and bottomless flag.
      *
      * Example:
      * ```
      * var d = new makerjs.models.Dogbone(50, 100, 5);
      * ```
      *
      * @param width Width of the rectangle.
      * @param height Height of the rectangle.
      * @param radius Corner radius.
      * @param style Optional corner style: 0 (default) for dogbone, 1 for vertical, -1 for horizontal.
      * @param bottomless Optional flag to omit the bottom line and bottom corners (default false).
      */
    def this(width: Double, height: Double, radius: Double) = this()
    def this(width: Double, height: Double, radius: Double, style: Double) = this()
    def this(width: Double, height: Double, radius: Double, style: Double, bottomless: Boolean) = this()
    def this(width: Double, height: Double, radius: Double, style: Unit, bottomless: Boolean) = this()
    
    /* CompleteClass */
    @JSName("paths")
    var paths_Dogbone: IPathMap = js.native
  }
  
  @JSImport("makerjs", "models.Dome")
  @js.native
  open class Dome protected ()
    extends StObject
       with typings.makerjs.MakerJs.models.Dome {
    def this(width: Double, height: Double) = this()
    def this(width: Double, height: Double, radius: Double) = this()
    def this(width: Double, height: Double, radius: Double, bottomless: Boolean) = this()
    def this(width: Double, height: Double, radius: Unit, bottomless: Boolean) = this()
    
    /* CompleteClass */
    @JSName("paths")
    var paths_Dome: IPathMap = js.native
  }
  
  @JSImport("makerjs", "models.Ellipse")
  @js.native
  open class Ellipse protected ()
    extends StObject
       with typings.makerjs.MakerJs.models.Ellipse {
    /**
      * Class for Ellipse created with 2 radii.
      *
      * @param radiusX The x radius of the ellipse.
      * @param radiusY The y radius of the ellipse.
      * @param accuracy Optional accuracy of the underlying BezierCurve.
      */
    def this(radiusX: Double, radiusY: Double) = this()
    /**
      * Class for Ellipse created at a specific origin and 2 radii.
      *
      * @param origin The center of the ellipse.
      * @param radiusX The x radius of the ellipse.
      * @param radiusY The y radius of the ellipse.
      * @param accuracy Optional accuracy of the underlying BezierCurve.
      */
    def this(origin: IPoint, radiusX: Double, radiusY: Double) = this()
    def this(radiusX: Double, radiusY: Double, accuracy: Double) = this()
    /**
      * Class for Ellipse created at a specific x, y and 2 radii.
      *
      * @param cx The x coordinate of the center of the ellipse.
      * @param cy The y coordinate of the center of the ellipse.
      * @param rX The x radius of the ellipse.
      * @param rY The y radius of the ellipse.
      * @param accuracy Optional accuracy of the underlying BezierCurve.
      */
    def this(cx: Double, cy: Double, rx: Double, ry: Double) = this()
    def this(origin: IPoint, radiusX: Double, radiusY: Double, accuracy: Double) = this()
    def this(cx: Double, cy: Double, rx: Double, ry: Double, accuracy: Double) = this()
    
    /* CompleteClass */
    @JSName("models")
    var models_Ellipse: IModelMap = js.native
    
    /* CompleteClass */
    @JSName("origin")
    var origin_Ellipse: IPoint = js.native
  }
  
  @JSImport("makerjs", "models.EllipticArc")
  @js.native
  open class EllipticArc protected ()
    extends StObject
       with typings.makerjs.MakerJs.models.EllipticArc {
    /**
      * Class for Elliptic Arc created by distorting a circular arc.
      *
      * @param arc The circular arc to use as the basis of the elliptic arc.
      * @param distortX The x scale of the ellipse.
      * @param distortY The y scale of the ellipse.
      * @param accuracy Optional accuracy of the underlying BezierCurve.
      */
    def this(arc: IPathArc, distortX: Double, distortY: Double) = this()
    def this(arc: IPathArc, distortX: Double, distortY: Double, accuracy: Double) = this()
    /**
      * Class for Elliptic Arc created by distorting a circular arc.
      *
      * @param arc The circular arc to use as the basis of the elliptic arc.
      * @param radiusX The x radius of the ellipse.
      * @param radiusY The y radius of the ellipse.
      * @param accuracy Optional accuracy of the underlying BezierCurve.
      */
    def this(startAngle: Double, endAngle: Double, radiusX: Double, radiusY: Double) = this()
    def this(startAngle: Double, endAngle: Double, radiusX: Double, radiusY: Double, accuracy: Double) = this()
    
    /* CompleteClass */
    @JSName("models")
    var models_EllipticArc: IModelMap = js.native
  }
  
  @JSImport("makerjs", "models.Holes")
  @js.native
  open class Holes protected ()
    extends StObject
       with typings.makerjs.MakerJs.models.Holes {
    /**
      * Create an array of circles of the same radius from an array of center points.
      *
      * Example:
      * ```
      * //Create some holes from an array of points
      * var makerjs = require('makerjs');
      * var model = new makerjs.models.Holes(10, [[0, 0],[50, 0],[25, 40]]);
      * var svg = makerjs.exporter.toSVG(model);
      * document.write(svg);
      * ```
      *
      * @param holeRadius Hole radius.
      * @param points Array of points for origin of each hole.
      * @param ids Optional array of corresponding path ids for the holes.
      */
    def this(holeRadius: Double, points: js.Array[IPoint]) = this()
    def this(holeRadius: Double, points: js.Array[IPoint], ids: js.Array[String]) = this()
    
    /* CompleteClass */
    @JSName("paths")
    var paths_Holes: IPathMap = js.native
  }
  
  @JSImport("makerjs", "models.Oval")
  @js.native
  open class Oval protected ()
    extends StObject
       with typings.makerjs.MakerJs.models.Oval {
    def this(width: Double, height: Double) = this()
    
    /* CompleteClass */
    @JSName("paths")
    var paths_Oval: IPathMap = js.native
  }
  
  @JSImport("makerjs", "models.OvalArc")
  @js.native
  open class OvalArc protected ()
    extends StObject
       with typings.makerjs.MakerJs.models.OvalArc {
    def this(startAngle: Double, endAngle: Double, sweepRadius: Double, slotRadius: Double) = this()
    def this(
      startAngle: Double,
      endAngle: Double,
      sweepRadius: Double,
      slotRadius: Double,
      selfIntersect: Boolean
    ) = this()
    def this(
      startAngle: Double,
      endAngle: Double,
      sweepRadius: Double,
      slotRadius: Double,
      selfIntersect: Boolean,
      isolateCaps: Boolean
    ) = this()
    def this(
      startAngle: Double,
      endAngle: Double,
      sweepRadius: Double,
      slotRadius: Double,
      selfIntersect: Unit,
      isolateCaps: Boolean
    ) = this()
    
    /* CompleteClass */
    @JSName("models")
    var models_OvalArc: IModelMap = js.native
    
    /* CompleteClass */
    @JSName("paths")
    var paths_OvalArc: IPathMap = js.native
  }
  
  @JSImport("makerjs", "models.Polygon")
  @js.native
  open class Polygon protected ()
    extends StObject
       with typings.makerjs.MakerJs.models.Polygon {
    def this(numberOfSides: Double, radius: Double) = this()
    def this(numberOfSides: Double, radius: Double, firstCornerAngleInDegrees: Double) = this()
    def this(numberOfSides: Double, radius: Double, firstCornerAngleInDegrees: Double, circumscribed: Boolean) = this()
    def this(numberOfSides: Double, radius: Double, firstCornerAngleInDegrees: Unit, circumscribed: Boolean) = this()
    
    /* CompleteClass */
    @JSName("paths")
    var paths_Polygon: IPathMap = js.native
  }
  object Polygon {
    
    @JSImport("makerjs", "models.Polygon")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def circumscribedRadius(radius: Double, angleInRadians: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("circumscribedRadius")(radius.asInstanceOf[js.Any], angleInRadians.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /* static member */
    inline def getPoints(numberOfSides: Double, radius: Double): js.Array[IPoint] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPoints")(numberOfSides.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[js.Array[IPoint]]
    inline def getPoints(numberOfSides: Double, radius: Double, firstCornerAngleInDegrees: Double): js.Array[IPoint] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPoints")(numberOfSides.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], firstCornerAngleInDegrees.asInstanceOf[js.Any])).asInstanceOf[js.Array[IPoint]]
    inline def getPoints(numberOfSides: Double, radius: Double, firstCornerAngleInDegrees: Double, circumscribed: Boolean): js.Array[IPoint] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPoints")(numberOfSides.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], firstCornerAngleInDegrees.asInstanceOf[js.Any], circumscribed.asInstanceOf[js.Any])).asInstanceOf[js.Array[IPoint]]
    inline def getPoints(numberOfSides: Double, radius: Double, firstCornerAngleInDegrees: Unit, circumscribed: Boolean): js.Array[IPoint] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPoints")(numberOfSides.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], firstCornerAngleInDegrees.asInstanceOf[js.Any], circumscribed.asInstanceOf[js.Any])).asInstanceOf[js.Array[IPoint]]
  }
  
  @JSImport("makerjs", "models.Rectangle")
  @js.native
  open class Rectangle protected ()
    extends StObject
       with typings.makerjs.MakerJs.models.Rectangle {
    /**
      * Create a rectangle from a measurement.
      *
      * Example:
      * ```
      * //Create a rectangle from a measurement.
      * var makerjs = require('makerjs');
      * var e = new makerjs.models.Ellipse(17, 10); // draw an ellipse so we have something to measure.
      * var m = makerjs.measure.modelExtents(e);    // measure the ellipse.
      * var r = new makerjs.models.Rectangle(m);    // draws a rectangle surrounding the ellipse.
      * var svg = makerjs.exporter.toSVG({ models: { e: e, r: r }});
      * document.write(svg);
      * ```
      *
      * @param measurement IMeasure object. See http://maker.js.org/docs/api/modules/makerjs.measure.html#pathextents and http://maker.js.org/docs/api/modules/makerjs.measure.html#modelextents to get measurements of paths and models.
      */
    def this(measurement: IMeasure) = this()
    /**
      * Create a rectangle which will surround a model.
      *
      * Example:
      * ```
      * //Create a rectangle which will surround a model
      * var makerjs = require('makerjs');
      * var e = new makerjs.models.Ellipse(17, 10); // draw an ellipse so we have something to surround.
      * var r = new makerjs.models.Rectangle(e, 3); // draws a rectangle surrounding the ellipse by 3 units.
      * var svg = makerjs.exporter.toSVG({ models: { e: e, r: r }});
      * document.write(svg);
      * ```
      *
      * @param modelToSurround IModel object.
      * @param margin Optional distance from the model.
      */
    def this(modelToSurround: IModel) = this()
    def this(modelToSurround: IModel, margin: Double) = this()
    /**
      * Create a rectangle from width and height.
      *
      * Example:
      * ```
      * //Create a rectangle from width and height
      * var makerjs = require('makerjs');
      * var model = new makerjs.models.Rectangle(50, 100);
      * var svg = makerjs.exporter.toSVG(model);
      * document.write(svg);
      * ```
      *
      * @param width Width of the rectangle.
      * @param height Height of the rectangle.
      */
    def this(width: Double, height: Double) = this()
    
    /* CompleteClass */
    @JSName("origin")
    var origin_Rectangle: IPoint = js.native
    
    /* CompleteClass */
    @JSName("paths")
    var paths_Rectangle: IPathMap = js.native
  }
  
  @JSImport("makerjs", "models.Ring")
  @js.native
  open class Ring protected ()
    extends StObject
       with typings.makerjs.MakerJs.models.Ring {
    def this(outerRadius: Double) = this()
    def this(outerRadius: Double, innerRadius: Double) = this()
    
    /* CompleteClass */
    @JSName("paths")
    var paths_Ring: IPathMap = js.native
  }
  
  @JSImport("makerjs", "models.RoundRectangle")
  @js.native
  open class RoundRectangle protected ()
    extends StObject
       with typings.makerjs.MakerJs.models.RoundRectangle {
    /**
      * Create a round rectangle which will surround a model.
      *
      * Example:
      * ```
      * var b = new makerjs.models.BoltRectangle(30, 20, 1); //draw a bolt rectangle so we have something to surround
      * var r = new makerjs.models.RoundRectangle(b, 2.5);   //surround it
      * ```
      *
      * @param modelToSurround IModel object.
      * @param margin Distance from the model. This will also become the corner radius.
      */
    def this(modelToSurround: IModel, margin: Double) = this()
    /**
      * Create a round rectangle from width, height, and corner radius.
      *
      * Example:
      * ```
      * var r = new makerjs.models.RoundRectangle(100, 50, 5);
      * ```
      *
      * @param width Width of the rectangle.
      * @param height Height of the rectangle.
      * @param radius Corner radius.
      */
    def this(width: Double, height: Double, radius: Double) = this()
    
    /* CompleteClass */
    @JSName("origin")
    var origin_RoundRectangle: IPoint = js.native
    
    /* CompleteClass */
    @JSName("paths")
    var paths_RoundRectangle: IPathMap = js.native
  }
  
  @JSImport("makerjs", "models.SCurve")
  @js.native
  open class SCurve protected ()
    extends StObject
       with typings.makerjs.MakerJs.models.SCurve {
    def this(width: Double, height: Double) = this()
    
    /* CompleteClass */
    @JSName("paths")
    var paths_SCurve: IPathMap = js.native
  }
  
  @JSImport("makerjs", "models.Slot")
  @js.native
  open class Slot protected ()
    extends StObject
       with typings.makerjs.MakerJs.models.Slot {
    def this(origin: IPoint, endPoint: IPoint, radius: Double) = this()
    def this(origin: IPoint, endPoint: IPoint, radius: Double, isolateCaps: Boolean) = this()
    
    /* CompleteClass */
    @JSName("models")
    var models_Slot: IModelMap = js.native
    
    /* CompleteClass */
    @JSName("origin")
    var origin_Slot: IPoint = js.native
    
    /* CompleteClass */
    @JSName("paths")
    var paths_Slot: IPathMap = js.native
  }
  
  @JSImport("makerjs", "models.Square")
  @js.native
  open class Square protected ()
    extends StObject
       with typings.makerjs.MakerJs.models.Square {
    def this(side: Double) = this()
    
    /* CompleteClass */
    @JSName("paths")
    var paths_Square: IPathMap = js.native
  }
  
  @JSImport("makerjs", "models.Star")
  @js.native
  open class Star protected ()
    extends StObject
       with typings.makerjs.MakerJs.models.Star {
    def this(numberOfPoints: Double, outerRadius: Double) = this()
    def this(numberOfPoints: Double, outerRadius: Double, innerRadius: Double) = this()
    def this(numberOfPoints: Double, outerRadius: Double, innerRadius: Double, skipPoints: Double) = this()
    def this(numberOfPoints: Double, outerRadius: Double, innerRadius: Unit, skipPoints: Double) = this()
    
    /* CompleteClass */
    @JSName("paths")
    var paths_Star: IPathMap = js.native
  }
  object Star {
    
    @JSImport("makerjs", "models.Star")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def InnerRadiusRatio(numberOfPoints: Double, skipPoints: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("InnerRadiusRatio")(numberOfPoints.asInstanceOf[js.Any], skipPoints.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  @JSImport("makerjs", "models.Text")
  @js.native
  open class Text protected ()
    extends StObject
       with typings.makerjs.MakerJs.models.Text {
    /**
      * Renders text in a given font to a model.
      * @param font OpenType.Font object.
      * @param text String of text to render.
      * @param fontSize Font size.
      * @param combine Flag (default false) to perform a combineUnion upon each character with characters to the left and right.
      * @param centerCharacterOrigin Flag (default false) to move the x origin of each character to the center. Useful for rotating text characters.
      * @param bezierAccuracy Optional accuracy of Bezier curves.
      * @param opentypeOptions Optional opentype.RenderOptions object.
      * @returns Model of the text.
      */
    def this(font: Font, text: String, fontSize: Double) = this()
    def this(font: Font, text: String, fontSize: Double, combine: Boolean) = this()
    def this(font: Font, text: String, fontSize: Double, combine: Boolean, centerCharacterOrigin: Boolean) = this()
    def this(font: Font, text: String, fontSize: Double, combine: Unit, centerCharacterOrigin: Boolean) = this()
    def this(
      font: Font,
      text: String,
      fontSize: Double,
      combine: Boolean,
      centerCharacterOrigin: Boolean,
      bezierAccuracy: Double
    ) = this()
    def this(
      font: Font,
      text: String,
      fontSize: Double,
      combine: Boolean,
      centerCharacterOrigin: Unit,
      bezierAccuracy: Double
    ) = this()
    def this(
      font: Font,
      text: String,
      fontSize: Double,
      combine: Unit,
      centerCharacterOrigin: Boolean,
      bezierAccuracy: Double
    ) = this()
    def this(
      font: Font,
      text: String,
      fontSize: Double,
      combine: Unit,
      centerCharacterOrigin: Unit,
      bezierAccuracy: Double
    ) = this()
    def this(
      font: Font,
      text: String,
      fontSize: Double,
      combine: Boolean,
      centerCharacterOrigin: Boolean,
      bezierAccuracy: Double,
      opentypeOptions: RenderOptions
    ) = this()
    def this(
      font: Font,
      text: String,
      fontSize: Double,
      combine: Boolean,
      centerCharacterOrigin: Boolean,
      bezierAccuracy: Unit,
      opentypeOptions: RenderOptions
    ) = this()
    def this(
      font: Font,
      text: String,
      fontSize: Double,
      combine: Boolean,
      centerCharacterOrigin: Unit,
      bezierAccuracy: Double,
      opentypeOptions: RenderOptions
    ) = this()
    def this(
      font: Font,
      text: String,
      fontSize: Double,
      combine: Boolean,
      centerCharacterOrigin: Unit,
      bezierAccuracy: Unit,
      opentypeOptions: RenderOptions
    ) = this()
    def this(
      font: Font,
      text: String,
      fontSize: Double,
      combine: Unit,
      centerCharacterOrigin: Boolean,
      bezierAccuracy: Double,
      opentypeOptions: RenderOptions
    ) = this()
    def this(
      font: Font,
      text: String,
      fontSize: Double,
      combine: Unit,
      centerCharacterOrigin: Boolean,
      bezierAccuracy: Unit,
      opentypeOptions: RenderOptions
    ) = this()
    def this(
      font: Font,
      text: String,
      fontSize: Double,
      combine: Unit,
      centerCharacterOrigin: Unit,
      bezierAccuracy: Double,
      opentypeOptions: RenderOptions
    ) = this()
    def this(
      font: Font,
      text: String,
      fontSize: Double,
      combine: Unit,
      centerCharacterOrigin: Unit,
      bezierAccuracy: Unit,
      opentypeOptions: RenderOptions
    ) = this()
    
    /* CompleteClass */
    @JSName("models")
    var models_Text: IModelMap = js.native
  }
  object Text {
    
    @JSImport("makerjs", "models.Text")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Convert an opentype glyph to a model.
      * @param glyph Opentype.Glyph object.
      * @param fontSize Font size.
      * @param bezierAccuracy Optional accuracy of Bezier curves.
      * @returns Model of the glyph.
      */
    /* static member */
    inline def glyphToModel(glyph: Glyph, fontSize: Double): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("glyphToModel")(glyph.asInstanceOf[js.Any], fontSize.asInstanceOf[js.Any])).asInstanceOf[IModel]
    inline def glyphToModel(glyph: Glyph, fontSize: Double, bezierAccuracy: Double): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("glyphToModel")(glyph.asInstanceOf[js.Any], fontSize.asInstanceOf[js.Any], bezierAccuracy.asInstanceOf[js.Any])).asInstanceOf[IModel]
  }
}
