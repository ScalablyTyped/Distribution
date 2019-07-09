package typings
package jointjsLib.jointjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jointjs", "linkAnchors")
@js.native
object linkAnchorsNs extends js.Object {
  trait ConnectionClosestAnchorArguments extends js.Object {
    var fixedAt: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  }
  
  trait ConnectionLengthAnchorArguments extends js.Object {
    var length: js.UndefOr[scala.Double] = js.undefined
  }
  
  trait ConnectionPerpendicularAnchorArguments extends js.Object {
    var fallbackAt: js.UndefOr[scala.Double | java.lang.String] = js.undefined
    var fixedAt: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  }
  
  trait ConnectionRatioAnchorArguments extends js.Object {
    var ratio: js.UndefOr[scala.Double] = js.undefined
  }
  
  var connectionClosest: jointjsLib.jointjsMod.anchorsNs.GenericAnchor[jointjsLib.jointjsLibStrings.connectionClosest] = js.native
  var connectionLength: jointjsLib.jointjsMod.anchorsNs.GenericAnchor[jointjsLib.jointjsLibStrings.connectionLength] = js.native
  var connectionPerpendicular: jointjsLib.jointjsMod.anchorsNs.GenericAnchor[jointjsLib.jointjsLibStrings.connectionPerpendicular] = js.native
  var connectionRatio: jointjsLib.jointjsMod.anchorsNs.GenericAnchor[jointjsLib.jointjsLibStrings.connectionRatio] = js.native
}

