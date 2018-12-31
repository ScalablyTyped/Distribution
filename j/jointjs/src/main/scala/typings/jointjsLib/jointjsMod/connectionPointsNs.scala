package typings
package jointjsLib.jointjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jointjs", "connectionPoints")
@js.native
object connectionPointsNs extends js.Object {
  trait BoundaryConnectionPointArguments extends StrokeConnectionPointArguments {
    var extrapolate: js.UndefOr[scala.Boolean] = js.undefined
    var insideout: js.UndefOr[scala.Boolean] = js.undefined
    var precision: js.UndefOr[scala.Double] = js.undefined
    var selector: js.UndefOr[(js.Array[java.lang.String | scala.Double]) | java.lang.String] = js.undefined
    var sticky: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  trait ConnectionPointArgumentsMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[js.Any]] {
    var anchor: DefaultConnectionPointArguments
    var bbox: StrokeConnectionPointArguments
    var boundary: BoundaryConnectionPointArguments
    var rectangle: StrokeConnectionPointArguments
  }
  
  trait DefaultConnectionPointArguments extends js.Object {
    var offset: js.UndefOr[scala.Double] = js.undefined
  }
  
  trait GenericConnectionPointJSON[K /* <: ConnectionPointType */] extends js.Object {
    var args: /* import warning: ImportType.apply Failed type conversion: jointjs.jointjs.connectionPoints.ConnectionPointArgumentsMap[K] */ js.UndefOr[
        /* import warning: ImportType.apply Failed type conversion: jointjs.jointjs.connectionPoints.ConnectionPointArgumentsMap[K] */ js.Any
      ] = js.undefined
    var name: K
  }
  
  trait StrokeConnectionPointArguments extends DefaultConnectionPointArguments {
    var stroke: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  var anchor: GenericConnectionPoint[jointjsLib.jointjsLibStrings.anchor] = js.native
  var bbox: GenericConnectionPoint[jointjsLib.jointjsLibStrings.bbox] = js.native
  var boundary: GenericConnectionPoint[jointjsLib.jointjsLibStrings.boundary] = js.native
  var rectangle: GenericConnectionPoint[jointjsLib.jointjsLibStrings.rectangle] = js.native
  type ConnectionPoint = GenericConnectionPoint[ConnectionPointType]
  type ConnectionPointArguments = GenericConnectionPointArguments[ConnectionPointType]
  type ConnectionPointJSON = GenericConnectionPointJSON[ConnectionPointType]
  type ConnectionPointType = jointjsLib.jointjsLibStrings.anchor | jointjsLib.jointjsLibStrings.bbox | jointjsLib.jointjsLibStrings.rectangle | jointjsLib.jointjsLibStrings.boundary
  type GenericConnectionPoint[K /* <: ConnectionPointType */] = js.Function4[
    /* endPathSegmentLine */ jointjsLib.jointjsMod.gNs.Line, 
    /* endView */ jointjsLib.jointjsMod.diaNs.CellView, 
    /* endMagnet */ stdLib.SVGElement, 
    /* import warning: ImportType.apply Failed type conversion: jointjs.jointjs.connectionPoints.ConnectionPointArgumentsMap[K] */ /* opt */ js.Any, 
    jointjsLib.jointjsMod.gNs.Point
  ]
  type GenericConnectionPointArguments[K /* <: ConnectionPointType */] = /* import warning: ImportType.apply Failed type conversion: jointjs.jointjs.connectionPoints.ConnectionPointArgumentsMap[K] */ js.Any
}

