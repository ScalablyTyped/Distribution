package typings.jointjs.jointjsMod

import org.scalablytyped.runtime.StringDictionary
import typings.jointjs.jointjsMod.anchorsNs.AnchorType
import typings.jointjs.jointjsMod.anchorsNs.BBoxAnchorArguments
import typings.jointjs.jointjsMod.anchorsNs.GenericAnchor
import typings.jointjs.jointjsMod.anchorsNs.GenericAnchorArguments
import typings.jointjs.jointjsMod.anchorsNs.GenericAnchorJSON
import typings.jointjs.jointjsMod.anchorsNs.MidSideAnchorArguments
import typings.jointjs.jointjsMod.anchorsNs.ModelCenterAnchorArguments
import typings.jointjs.jointjsMod.anchorsNs.PaddingAnchorArguments
import typings.jointjs.jointjsMod.anchorsNs.RotateAnchorArguments
import typings.jointjs.jointjsMod.diaNs.CellView
import typings.jointjs.jointjsMod.gNs.Point
import typings.jointjs.jointjsMod.linkAnchorsNs.ConnectionClosestAnchorArguments
import typings.jointjs.jointjsMod.linkAnchorsNs.ConnectionLengthAnchorArguments
import typings.jointjs.jointjsMod.linkAnchorsNs.ConnectionPerpendicularAnchorArguments
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jointjs", "anchors")
@js.native
object anchorsNs extends js.Object {
  trait AnchorArgumentsMap
    extends /* key */ StringDictionary[StringDictionary[js.Any]] {
    var bottom: BBoxAnchorArguments
    var bottomLeft: BBoxAnchorArguments
    var bottomRight: BBoxAnchorArguments
    var center: BBoxAnchorArguments
    var connectionClosest: ConnectionClosestAnchorArguments
    var connectionLength: ConnectionLengthAnchorArguments
    var connectionPerpendicular: ConnectionPerpendicularAnchorArguments
    var connectionRatio: ConnectionLengthAnchorArguments
    var left: BBoxAnchorArguments
    var midSide: MidSideAnchorArguments
    var modelCenter: ModelCenterAnchorArguments
    var perpendicular: PaddingAnchorArguments
    var right: BBoxAnchorArguments
    var top: BBoxAnchorArguments
    var topLeft: BBoxAnchorArguments
    var topRight: BBoxAnchorArguments
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jointjs.jointjsStrings.center
    - typings.jointjs.jointjsStrings.top
    - typings.jointjs.jointjsStrings.bottom
    - typings.jointjs.jointjsStrings.left
    - typings.jointjs.jointjsStrings.right
    - typings.jointjs.jointjsStrings.topLeft
    - typings.jointjs.jointjsStrings.topRight
    - typings.jointjs.jointjsStrings.bottomLeft
    - typings.jointjs.jointjsStrings.bottomRight
    - typings.jointjs.jointjsStrings.perpendicular
    - typings.jointjs.jointjsStrings.midSide
    - typings.jointjs.jointjsStrings.modelCenter
    - typings.jointjs.jointjsStrings.connectionRatio
    - typings.jointjs.jointjsStrings.connectionLength
    - typings.jointjs.jointjsStrings.connectionPerpendicular
    - typings.jointjs.jointjsStrings.connectionClosest
  */
  trait AnchorType extends js.Object
  
  trait BBoxAnchorArguments extends RotateAnchorArguments {
    var dx: js.UndefOr[Double | String] = js.undefined
    var dy: js.UndefOr[Double | String] = js.undefined
  }
  
  trait GenericAnchorJSON[K /* <: AnchorType */] extends js.Object {
    var args: js.UndefOr[
        /* import warning: ImportType.apply Failed type conversion: jointjs.jointjs.anchors.AnchorArgumentsMap[K] */ js.Any
      ] = js.undefined
    var name: K
  }
  
  trait MidSideAnchorArguments
    extends RotateAnchorArguments
       with PaddingAnchorArguments
  
  trait ModelCenterAnchorArguments extends js.Object {
    var dx: js.UndefOr[Double] = js.undefined
    var dy: js.UndefOr[Double] = js.undefined
  }
  
  trait PaddingAnchorArguments extends js.Object {
    var padding: js.UndefOr[Double] = js.undefined
  }
  
  trait RotateAnchorArguments extends js.Object {
    var rotate: js.UndefOr[Boolean] = js.undefined
  }
  
  var bottom: GenericAnchor[typings.jointjs.jointjsStrings.bottom] = js.native
  var bottomLeft: GenericAnchor[typings.jointjs.jointjsStrings.bottomLeft] = js.native
  var bottomRight: GenericAnchor[typings.jointjs.jointjsStrings.bottomRight] = js.native
  var center: GenericAnchor[typings.jointjs.jointjsStrings.center] = js.native
  var left: GenericAnchor[typings.jointjs.jointjsStrings.left] = js.native
  var midSide: GenericAnchor[typings.jointjs.jointjsStrings.midSide] = js.native
  var perpendicular: GenericAnchor[typings.jointjs.jointjsStrings.perpendicular] = js.native
  var right: GenericAnchor[typings.jointjs.jointjsStrings.right] = js.native
  var top: GenericAnchor[typings.jointjs.jointjsStrings.top] = js.native
  var topLeft: GenericAnchor[typings.jointjs.jointjsStrings.topLeft] = js.native
  var topRight: GenericAnchor[typings.jointjs.jointjsStrings.topRight] = js.native
  type Anchor = GenericAnchor[AnchorType]
  type AnchorArguments = GenericAnchorArguments[AnchorType]
  type AnchorJSON = GenericAnchorJSON[AnchorType]
  type GenericAnchor[K /* <: AnchorType */] = js.Function4[
    /* endView */ CellView, 
    /* endMagnet */ SVGElement, 
    /* anchorReference */ Point | SVGElement, 
    /* import warning: ImportType.apply Failed type conversion: jointjs.jointjs.anchors.AnchorArgumentsMap[K] */ /* opt */ js.Any, 
    Point
  ]
  type GenericAnchorArguments[K /* <: AnchorType */] = /* import warning: ImportType.apply Failed type conversion: jointjs.jointjs.anchors.AnchorArgumentsMap[K] */ js.Any
}

