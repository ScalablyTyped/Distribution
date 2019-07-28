package typings.heremaps.HNs.mapNs.HitAreaNs

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
  sealed trait CIRCLE extends ShapeType
  
  @js.native
  sealed trait NONE extends ShapeType
  
  @js.native
  sealed trait POLYGON extends ShapeType
  
  @js.native
  sealed trait RECT extends ShapeType
  
  /* 2 */ val CIRCLE: typings.heremaps.HNs.mapNs.HitAreaNs.ShapeType.CIRCLE with Double = js.native
  /* 0 */ val NONE: typings.heremaps.HNs.mapNs.HitAreaNs.ShapeType.NONE with Double = js.native
  /* 3 */ val POLYGON: typings.heremaps.HNs.mapNs.HitAreaNs.ShapeType.POLYGON with Double = js.native
  /* 1 */ val RECT: typings.heremaps.HNs.mapNs.HitAreaNs.ShapeType.RECT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ShapeType with Double] = js.native
}

