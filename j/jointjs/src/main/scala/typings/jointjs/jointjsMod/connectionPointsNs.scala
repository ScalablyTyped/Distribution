package typings.jointjs.jointjsMod

import org.scalablytyped.runtime.StringDictionary
import typings.jointjs.jointjsMod.connectionPointsNs.BoundaryConnectionPointArguments
import typings.jointjs.jointjsMod.connectionPointsNs.ConnectionPointType
import typings.jointjs.jointjsMod.connectionPointsNs.DefaultConnectionPointArguments
import typings.jointjs.jointjsMod.connectionPointsNs.GenericConnectionPoint
import typings.jointjs.jointjsMod.connectionPointsNs.GenericConnectionPointArguments
import typings.jointjs.jointjsMod.connectionPointsNs.GenericConnectionPointJSON
import typings.jointjs.jointjsMod.connectionPointsNs.StrokeConnectionPointArguments
import typings.jointjs.jointjsMod.diaNs.CellView
import typings.jointjs.jointjsMod.gNs.Line
import typings.jointjs.jointjsMod.gNs.Point
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jointjs", "connectionPoints")
@js.native
object connectionPointsNs extends js.Object {
  trait BoundaryConnectionPointArguments extends StrokeConnectionPointArguments {
    var extrapolate: js.UndefOr[Boolean] = js.undefined
    var insideout: js.UndefOr[Boolean] = js.undefined
    var precision: js.UndefOr[Double] = js.undefined
    var selector: js.UndefOr[(js.Array[String | Double]) | String] = js.undefined
    var sticky: js.UndefOr[Boolean] = js.undefined
  }
  
  trait ConnectionPointArgumentsMap
    extends /* key */ StringDictionary[StringDictionary[js.Any]] {
    var anchor: DefaultConnectionPointArguments
    var bbox: StrokeConnectionPointArguments
    var boundary: BoundaryConnectionPointArguments
    var rectangle: StrokeConnectionPointArguments
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jointjs.jointjsStrings.anchor
    - typings.jointjs.jointjsStrings.bbox
    - typings.jointjs.jointjsStrings.rectangle
    - typings.jointjs.jointjsStrings.boundary
  */
  trait ConnectionPointType extends js.Object
  
  trait DefaultConnectionPointArguments extends js.Object {
    var offset: js.UndefOr[Double] = js.undefined
  }
  
  trait GenericConnectionPointJSON[K /* <: ConnectionPointType */] extends js.Object {
    var args: js.UndefOr[
        /* import warning: ImportType.apply Failed type conversion: jointjs.jointjs.connectionPoints.ConnectionPointArgumentsMap[K] */ js.Any
      ] = js.undefined
    var name: K
  }
  
  trait StrokeConnectionPointArguments extends DefaultConnectionPointArguments {
    var stroke: js.UndefOr[Boolean] = js.undefined
  }
  
  var anchor: GenericConnectionPoint[typings.jointjs.jointjsStrings.anchor] = js.native
  var bbox: GenericConnectionPoint[typings.jointjs.jointjsStrings.bbox] = js.native
  var boundary: GenericConnectionPoint[typings.jointjs.jointjsStrings.boundary] = js.native
  var rectangle: GenericConnectionPoint[typings.jointjs.jointjsStrings.rectangle] = js.native
  type ConnectionPoint = GenericConnectionPoint[ConnectionPointType]
  type ConnectionPointArguments = GenericConnectionPointArguments[ConnectionPointType]
  type ConnectionPointJSON = GenericConnectionPointJSON[ConnectionPointType]
  type GenericConnectionPoint[K /* <: ConnectionPointType */] = js.Function4[
    /* endPathSegmentLine */ Line, 
    /* endView */ CellView, 
    /* endMagnet */ SVGElement, 
    /* import warning: ImportType.apply Failed type conversion: jointjs.jointjs.connectionPoints.ConnectionPointArgumentsMap[K] */ /* opt */ js.Any, 
    Point
  ]
  type GenericConnectionPointArguments[K /* <: ConnectionPointType */] = /* import warning: ImportType.apply Failed type conversion: jointjs.jointjs.connectionPoints.ConnectionPointArgumentsMap[K] */ js.Any
}

