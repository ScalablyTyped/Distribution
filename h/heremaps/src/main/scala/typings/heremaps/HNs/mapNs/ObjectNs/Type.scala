package typings.heremaps.HNs.mapNs.ObjectNs

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
  sealed trait ANY extends Type
  
  /** DomMarker object */
  @js.native
  sealed trait DOM_MARKER extends Type
  
  /** DomMarker object */
  @js.native
  sealed trait GROUP extends Type
  
  /** Marker object */
  @js.native
  sealed trait MARKER extends Type
  
  /** spatial object */
  @js.native
  sealed trait OVERLAY extends Type
  
  /** spatial object */
  @js.native
  sealed trait SPATIAL extends Type
  
  /* 0 */ val ANY: typings.heremaps.HNs.mapNs.ObjectNs.Type.ANY with Double = js.native
  /* 4 */ val DOM_MARKER: typings.heremaps.HNs.mapNs.ObjectNs.Type.DOM_MARKER with Double = js.native
  /* 5 */ val GROUP: typings.heremaps.HNs.mapNs.ObjectNs.Type.GROUP with Double = js.native
  /* 3 */ val MARKER: typings.heremaps.HNs.mapNs.ObjectNs.Type.MARKER with Double = js.native
  /* 1 */ val OVERLAY: typings.heremaps.HNs.mapNs.ObjectNs.Type.OVERLAY with Double = js.native
  /* 2 */ val SPATIAL: typings.heremaps.HNs.mapNs.ObjectNs.Type.SPATIAL with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Type with Double] = js.native
}

