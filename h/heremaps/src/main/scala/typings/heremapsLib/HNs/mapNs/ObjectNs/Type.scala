package typings
package heremapsLib.HNs.mapNs.ObjectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Type extends js.Object

/**
  * The major types of map objects
  */
@JSGlobal("H.map.Object.Type")
@js.native
object Type extends js.Object {
  /** spatial object */
  @js.native
  sealed trait ANY
    extends heremapsLib.HNs.mapNs.ObjectNs.Type
  
  /** DomMarker object */
  @js.native
  sealed trait DOM_MARKER
    extends heremapsLib.HNs.mapNs.ObjectNs.Type
  
  /** DomMarker object */
  @js.native
  sealed trait GROUP
    extends heremapsLib.HNs.mapNs.ObjectNs.Type
  
  /** Marker object */
  @js.native
  sealed trait MARKER
    extends heremapsLib.HNs.mapNs.ObjectNs.Type
  
  /** spatial object */
  @js.native
  sealed trait OVERLAY
    extends heremapsLib.HNs.mapNs.ObjectNs.Type
  
  /** spatial object */
  @js.native
  sealed trait SPATIAL
    extends heremapsLib.HNs.mapNs.ObjectNs.Type
  
  /* 0 */ val ANY: ANY with scala.Double = js.native
  /* 4 */ val DOM_MARKER: DOM_MARKER with scala.Double = js.native
  /* 5 */ val GROUP: GROUP with scala.Double = js.native
  /* 3 */ val MARKER: MARKER with scala.Double = js.native
  /* 1 */ val OVERLAY: OVERLAY with scala.Double = js.native
  /* 2 */ val SPATIAL: SPATIAL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[heremapsLib.HNs.mapNs.ObjectNs.Type with scala.Double] = js.native
}

