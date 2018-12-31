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
  
  val ANY: ANY with java.lang.String = js.native
  val DOM_MARKER: DOM_MARKER with java.lang.String = js.native
  val GROUP: GROUP with java.lang.String = js.native
  val MARKER: MARKER with java.lang.String = js.native
  val OVERLAY: OVERLAY with java.lang.String = js.native
  val SPATIAL: SPATIAL with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[heremapsLib.HNs.mapNs.ObjectNs.Type with java.lang.String] = js.native
}

