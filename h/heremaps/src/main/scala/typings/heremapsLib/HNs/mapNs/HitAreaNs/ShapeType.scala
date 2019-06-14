package typings
package heremapsLib.HNs.mapNs.HitAreaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShapeType extends js.Object

/**
  * Enumeration represents possible shape types that HitArea can have.
  */
@JSGlobal("H.map.HitArea.ShapeType")
@js.native
object ShapeType extends js.Object {
  @js.native
  sealed trait CIRCLE
    extends heremapsLib.HNs.mapNs.HitAreaNs.ShapeType
  
  @js.native
  sealed trait NONE
    extends heremapsLib.HNs.mapNs.HitAreaNs.ShapeType
  
  @js.native
  sealed trait POLYGON
    extends heremapsLib.HNs.mapNs.HitAreaNs.ShapeType
  
  @js.native
  sealed trait RECT
    extends heremapsLib.HNs.mapNs.HitAreaNs.ShapeType
  
  /* 2 */ val CIRCLE: CIRCLE with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  /* 3 */ val POLYGON: POLYGON with scala.Double = js.native
  /* 1 */ val RECT: RECT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[heremapsLib.HNs.mapNs.HitAreaNs.ShapeType with scala.Double] = js.native
}

