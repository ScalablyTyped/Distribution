package typings.jointjs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.jointjs.jointjsStrings.anchor
import typings.jointjs.jointjsStrings.bbox
import typings.jointjs.jointjsStrings.boundary
import typings.jointjs.jointjsStrings.rectangle
import typings.jointjs.mod.dia.CellView
import typings.jointjs.mod.dia.Point
import typings.jointjs.mod.g.Line
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectionPoints {
  
  @JSImport("jointjs", "connectionPoints")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jointjs", "connectionPoints.anchor")
  @js.native
  def anchor: GenericConnectionPoint[typings.jointjs.jointjsStrings.anchor] = js.native
  inline def anchor_=(x: GenericConnectionPoint[anchor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("anchor")(x.asInstanceOf[js.Any])
  
  @JSImport("jointjs", "connectionPoints.bbox")
  @js.native
  def bbox: GenericConnectionPoint[typings.jointjs.jointjsStrings.bbox] = js.native
  inline def bbox_=(x: GenericConnectionPoint[bbox]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bbox")(x.asInstanceOf[js.Any])
  
  @JSImport("jointjs", "connectionPoints.boundary")
  @js.native
  def boundary: GenericConnectionPoint[typings.jointjs.jointjsStrings.boundary] = js.native
  inline def boundary_=(x: GenericConnectionPoint[boundary]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("boundary")(x.asInstanceOf[js.Any])
  
  @JSImport("jointjs", "connectionPoints.rectangle")
  @js.native
  def rectangle: GenericConnectionPoint[typings.jointjs.jointjsStrings.rectangle] = js.native
  inline def rectangle_=(x: GenericConnectionPoint[rectangle]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rectangle")(x.asInstanceOf[js.Any])
  
  trait AlignConnectionPointArguments
    extends StObject
       with DefaultConnectionPointArguments {
    
    var align: js.UndefOr[ConnectionPointAlignment | Null] = js.undefined
    
    var alignOffset: js.UndefOr[Double] = js.undefined
  }
  object AlignConnectionPointArguments {
    
    inline def apply(): AlignConnectionPointArguments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlignConnectionPointArguments]
    }
    
    extension [Self <: AlignConnectionPointArguments](x: Self) {
      
      inline def setAlign(value: ConnectionPointAlignment): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignNull: Self = StObject.set(x, "align", null)
      
      inline def setAlignOffset(value: Double): Self = StObject.set(x, "alignOffset", value.asInstanceOf[js.Any])
      
      inline def setAlignOffsetUndefined: Self = StObject.set(x, "alignOffset", js.undefined)
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    }
  }
  
  trait BoundaryConnectionPointArguments
    extends StObject
       with StrokeConnectionPointArguments {
    
    var extrapolate: js.UndefOr[Boolean] = js.undefined
    
    var insideout: js.UndefOr[Boolean] = js.undefined
    
    var precision: js.UndefOr[Double] = js.undefined
    
    var selector: js.UndefOr[(js.Array[String | Double]) | String] = js.undefined
    
    var sticky: js.UndefOr[Boolean] = js.undefined
  }
  object BoundaryConnectionPointArguments {
    
    inline def apply(): BoundaryConnectionPointArguments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BoundaryConnectionPointArguments]
    }
    
    extension [Self <: BoundaryConnectionPointArguments](x: Self) {
      
      inline def setExtrapolate(value: Boolean): Self = StObject.set(x, "extrapolate", value.asInstanceOf[js.Any])
      
      inline def setExtrapolateUndefined: Self = StObject.set(x, "extrapolate", js.undefined)
      
      inline def setInsideout(value: Boolean): Self = StObject.set(x, "insideout", value.asInstanceOf[js.Any])
      
      inline def setInsideoutUndefined: Self = StObject.set(x, "insideout", js.undefined)
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      inline def setSelector(value: (js.Array[String | Double]) | String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      inline def setSelectorVarargs(value: (String | Double)*): Self = StObject.set(x, "selector", js.Array(value :_*))
      
      inline def setSticky(value: Boolean): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
      
      inline def setStickyUndefined: Self = StObject.set(x, "sticky", js.undefined)
    }
  }
  
  type ConnectionPoint = GenericConnectionPoint[ConnectionPointType]
  
  /* Rewritten from type alias, can be one of: 
    - typings.jointjs.jointjsStrings.top
    - typings.jointjs.jointjsStrings.bottom
    - typings.jointjs.jointjsStrings.left
    - typings.jointjs.jointjsStrings.right
  */
  trait ConnectionPointAlignment extends StObject
  object ConnectionPointAlignment {
    
    inline def bottom: typings.jointjs.jointjsStrings.bottom = "bottom".asInstanceOf[typings.jointjs.jointjsStrings.bottom]
    
    inline def left: typings.jointjs.jointjsStrings.left = "left".asInstanceOf[typings.jointjs.jointjsStrings.left]
    
    inline def right: typings.jointjs.jointjsStrings.right = "right".asInstanceOf[typings.jointjs.jointjsStrings.right]
    
    inline def top: typings.jointjs.jointjsStrings.top = "top".asInstanceOf[typings.jointjs.jointjsStrings.top]
  }
  
  /* Inlined jointjs.jointjs.connectionPoints.GenericConnectionPointArguments<jointjs.jointjs.connectionPoints.ConnectionPointType> */
  /* Rewritten from type alias, can be one of: 
    - typings.jointjs.jointjsStrings.sticky
    - typings.jointjs.jointjsStrings.offset
    - typings.jointjs.jointjsStrings.extrapolate
    - typings.jointjs.jointjsStrings.insideout
    - typings.jointjs.jointjsStrings.stroke
    - typings.jointjs.jointjsStrings.precision
    - typings.jointjs.jointjsStrings.selector
  */
  trait ConnectionPointArguments extends StObject
  object ConnectionPointArguments {
    
    inline def extrapolate: typings.jointjs.jointjsStrings.extrapolate = "extrapolate".asInstanceOf[typings.jointjs.jointjsStrings.extrapolate]
    
    inline def insideout: typings.jointjs.jointjsStrings.insideout = "insideout".asInstanceOf[typings.jointjs.jointjsStrings.insideout]
    
    inline def offset: typings.jointjs.jointjsStrings.offset = "offset".asInstanceOf[typings.jointjs.jointjsStrings.offset]
    
    inline def precision: typings.jointjs.jointjsStrings.precision = "precision".asInstanceOf[typings.jointjs.jointjsStrings.precision]
    
    inline def selector: typings.jointjs.jointjsStrings.selector = "selector".asInstanceOf[typings.jointjs.jointjsStrings.selector]
    
    inline def sticky: typings.jointjs.jointjsStrings.sticky = "sticky".asInstanceOf[typings.jointjs.jointjsStrings.sticky]
    
    inline def stroke: typings.jointjs.jointjsStrings.stroke = "stroke".asInstanceOf[typings.jointjs.jointjsStrings.stroke]
  }
  
  trait ConnectionPointArgumentsMap
    extends StObject
       with /* key */ StringDictionary[StringDictionary[js.Any]] {
    
    var anchor: DefaultConnectionPointArguments
    
    var bbox: StrokeConnectionPointArguments
    
    var boundary: BoundaryConnectionPointArguments
    
    var rectangle: StrokeConnectionPointArguments
  }
  object ConnectionPointArgumentsMap {
    
    inline def apply(
      anchor: DefaultConnectionPointArguments,
      bbox: StrokeConnectionPointArguments,
      boundary: BoundaryConnectionPointArguments,
      rectangle: StrokeConnectionPointArguments
    ): ConnectionPointArgumentsMap = {
      val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], bbox = bbox.asInstanceOf[js.Any], boundary = boundary.asInstanceOf[js.Any], rectangle = rectangle.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionPointArgumentsMap]
    }
    
    extension [Self <: ConnectionPointArgumentsMap](x: Self) {
      
      inline def setAnchor(value: DefaultConnectionPointArguments): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setBbox(value: StrokeConnectionPointArguments): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
      
      inline def setBoundary(value: BoundaryConnectionPointArguments): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
      inline def setRectangle(value: StrokeConnectionPointArguments): Self = StObject.set(x, "rectangle", value.asInstanceOf[js.Any])
    }
  }
  
  type ConnectionPointJSON = GenericConnectionPointJSON[ConnectionPointType]
  
  /* Rewritten from type alias, can be one of: 
    - typings.jointjs.jointjsStrings.anchor
    - typings.jointjs.jointjsStrings.bbox
    - typings.jointjs.jointjsStrings.rectangle
    - typings.jointjs.jointjsStrings.boundary
  */
  trait ConnectionPointType extends StObject
  
  trait DefaultConnectionPointArguments extends StObject {
    
    var offset: js.UndefOr[Double | Point] = js.undefined
  }
  object DefaultConnectionPointArguments {
    
    inline def apply(): DefaultConnectionPointArguments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultConnectionPointArguments]
    }
    
    extension [Self <: DefaultConnectionPointArguments](x: Self) {
      
      inline def setOffset(value: Double | Point): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    }
  }
  
  type GenericConnectionPoint[K /* <: ConnectionPointType */] = js.Function4[
    /* endPathSegmentLine */ Line, 
    /* endView */ CellView, 
    /* endMagnet */ SVGElement, 
    /* import warning: importer.ImportType#apply Failed type conversion: jointjs.jointjs.connectionPoints.ConnectionPointArgumentsMap[K] */ /* opt */ js.Any, 
    typings.jointjs.mod.g.Point
  ]
  
  type GenericConnectionPointArguments[K /* <: ConnectionPointType */] = /* import warning: importer.ImportType#apply Failed type conversion: jointjs.jointjs.connectionPoints.ConnectionPointArgumentsMap[K] */ js.Any
  
  trait GenericConnectionPointJSON[K /* <: ConnectionPointType */] extends StObject {
    
    var args: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: jointjs.jointjs.connectionPoints.ConnectionPointArgumentsMap[K] */ js.Any
      ] = js.undefined
    
    var name: K
  }
  object GenericConnectionPointJSON {
    
    inline def apply[K /* <: ConnectionPointType */](name: K): GenericConnectionPointJSON[K] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenericConnectionPointJSON[K]]
    }
    
    extension [Self <: GenericConnectionPointJSON[?], K /* <: ConnectionPointType */](x: Self & GenericConnectionPointJSON[K]) {
      
      inline def setArgs(
        value: /* import warning: importer.ImportType#apply Failed type conversion: jointjs.jointjs.connectionPoints.ConnectionPointArgumentsMap[K] */ js.Any
      ): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setName(value: K): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait StrokeConnectionPointArguments
    extends StObject
       with DefaultConnectionPointArguments {
    
    var stroke: js.UndefOr[Boolean] = js.undefined
  }
  object StrokeConnectionPointArguments {
    
    inline def apply(): StrokeConnectionPointArguments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrokeConnectionPointArguments]
    }
    
    extension [Self <: StrokeConnectionPointArguments](x: Self) {
      
      inline def setStroke(value: Boolean): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    }
  }
}
