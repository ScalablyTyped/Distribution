package typings.jointjs.jointjsMod

import typings.jointjs.jointjsMod.anchorsNs.GenericAnchor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jointjs", "linkAnchors")
@js.native
object linkAnchorsNs extends js.Object {
  trait ConnectionClosestAnchorArguments extends js.Object {
    var fixedAt: js.UndefOr[Double | String] = js.undefined
  }
  
  trait ConnectionLengthAnchorArguments extends js.Object {
    var length: js.UndefOr[Double] = js.undefined
  }
  
  trait ConnectionPerpendicularAnchorArguments extends js.Object {
    var fallbackAt: js.UndefOr[Double | String] = js.undefined
    var fixedAt: js.UndefOr[Double | String] = js.undefined
  }
  
  trait ConnectionRatioAnchorArguments extends js.Object {
    var ratio: js.UndefOr[Double] = js.undefined
  }
  
  var connectionClosest: GenericAnchor[typings.jointjs.jointjsStrings.connectionClosest] = js.native
  var connectionLength: GenericAnchor[typings.jointjs.jointjsStrings.connectionLength] = js.native
  var connectionPerpendicular: GenericAnchor[typings.jointjs.jointjsStrings.connectionPerpendicular] = js.native
  var connectionRatio: GenericAnchor[typings.jointjs.jointjsStrings.connectionRatio] = js.native
}

