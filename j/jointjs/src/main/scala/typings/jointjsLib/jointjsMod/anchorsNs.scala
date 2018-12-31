package typings
package jointjsLib.jointjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jointjs", "anchors")
@js.native
object anchorsNs extends js.Object {
  trait AnchorArgumentsMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[js.Any]] {
    var bottom: BBoxAnchorArguments
    var bottomLeft: BBoxAnchorArguments
    var bottomRight: BBoxAnchorArguments
    var center: BBoxAnchorArguments
    var left: BBoxAnchorArguments
    var midSide: MidSideAnchorArguments
    var modelCenter: ModelCenterAnchorArguments
    var perpendicular: PaddingAnchorArguments
    var right: BBoxAnchorArguments
    var top: BBoxAnchorArguments
    var topLeft: BBoxAnchorArguments
    var topRight: BBoxAnchorArguments
  }
  
  trait BBoxAnchorArguments extends RotateAnchorArguments {
    var dx: js.UndefOr[scala.Double | java.lang.String] = js.undefined
    var dy: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  }
  
  trait GenericAnchorJSON[K /* <: AnchorType */] extends js.Object {
    var args: /* import warning: ImportType.apply Failed type conversion: jointjs.jointjs.anchors.AnchorArgumentsMap[K] */ js.UndefOr[
        /* import warning: ImportType.apply Failed type conversion: jointjs.jointjs.anchors.AnchorArgumentsMap[K] */ js.Any
      ] = js.undefined
    var name: K
  }
  
  trait MidSideAnchorArguments
    extends RotateAnchorArguments
       with PaddingAnchorArguments
  
  trait ModelCenterAnchorArguments extends js.Object
  
  trait PaddingAnchorArguments extends js.Object {
    var padding: js.UndefOr[scala.Double] = js.undefined
  }
  
  trait RotateAnchorArguments extends js.Object {
    var rotate: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  var bottom: GenericAnchor[jointjsLib.jointjsLibStrings.bottom] = js.native
  var bottomLeft: GenericAnchor[jointjsLib.jointjsLibStrings.bottomLeft] = js.native
  var bottomRight: GenericAnchor[jointjsLib.jointjsLibStrings.bottomRight] = js.native
  var center: GenericAnchor[jointjsLib.jointjsLibStrings.center] = js.native
  var left: GenericAnchor[jointjsLib.jointjsLibStrings.left] = js.native
  var midSide: GenericAnchor[jointjsLib.jointjsLibStrings.midSide] = js.native
  var perpendicular: GenericAnchor[jointjsLib.jointjsLibStrings.perpendicular] = js.native
  var right: GenericAnchor[jointjsLib.jointjsLibStrings.right] = js.native
  var top: GenericAnchor[jointjsLib.jointjsLibStrings.top] = js.native
  var topLeft: GenericAnchor[jointjsLib.jointjsLibStrings.topLeft] = js.native
  var topRight: GenericAnchor[jointjsLib.jointjsLibStrings.topRight] = js.native
  type Anchor = GenericAnchor[AnchorType]
  type AnchorArguments = GenericAnchorArguments[AnchorType]
  type AnchorJSON = GenericAnchorJSON[AnchorType]
  type AnchorType = jointjsLib.jointjsLibStrings.center | jointjsLib.jointjsLibStrings.top | jointjsLib.jointjsLibStrings.bottom | jointjsLib.jointjsLibStrings.left | jointjsLib.jointjsLibStrings.right | jointjsLib.jointjsLibStrings.topLeft | jointjsLib.jointjsLibStrings.topRight | jointjsLib.jointjsLibStrings.bottomLeft | jointjsLib.jointjsLibStrings.bottomRight | jointjsLib.jointjsLibStrings.perpendicular | jointjsLib.jointjsLibStrings.midSide | jointjsLib.jointjsLibStrings.modelCenter
  type GenericAnchor[K /* <: AnchorType */] = js.Function4[
    /* endView */ jointjsLib.jointjsMod.diaNs.CellView, 
    /* endMagnet */ stdLib.SVGElement, 
    /* anchorReference */ jointjsLib.jointjsMod.gNs.Point | stdLib.SVGElement, 
    /* import warning: ImportType.apply Failed type conversion: jointjs.jointjs.anchors.AnchorArgumentsMap[K] */ /* opt */ js.Any, 
    jointjsLib.jointjsMod.gNs.Point
  ]
  type GenericAnchorArguments[K /* <: AnchorType */] = /* import warning: ImportType.apply Failed type conversion: jointjs.jointjs.anchors.AnchorArgumentsMap[K] */ js.Any
}

