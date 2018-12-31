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
  
  val CIRCLE: CIRCLE with java.lang.String = js.native
  val NONE: NONE with java.lang.String = js.native
  val POLYGON: POLYGON with java.lang.String = js.native
  val RECT: RECT with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[heremapsLib.HNs.mapNs.HitAreaNs.ShapeType with java.lang.String] = js.native
}

