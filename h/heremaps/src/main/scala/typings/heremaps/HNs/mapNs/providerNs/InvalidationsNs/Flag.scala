package typings.heremaps.HNs.mapNs.providerNs.InvalidationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Flag extends js.Object

/**
  * This enumeration encapsulates bit flags for different invalidations of map objects.
  */
@JSGlobal("H.map.provider.Invalidations.Flag")
@js.native
object Flag extends js.Object {
  @js.native
  sealed trait ADD extends Flag
  
  @js.native
  sealed trait NONE extends Flag
  
  @js.native
  sealed trait REMOVE extends Flag
  
  @js.native
  sealed trait SPATIAL extends Flag
  
  @js.native
  sealed trait VISUAL extends Flag
  
  @js.native
  sealed trait Z_ORDER extends Flag
  
  /* 3 */ val ADD: typings.heremaps.HNs.mapNs.providerNs.InvalidationsNs.Flag.ADD with Double = js.native
  /* 0 */ val NONE: typings.heremaps.HNs.mapNs.providerNs.InvalidationsNs.Flag.NONE with Double = js.native
  /* 4 */ val REMOVE: typings.heremaps.HNs.mapNs.providerNs.InvalidationsNs.Flag.REMOVE with Double = js.native
  /* 2 */ val SPATIAL: typings.heremaps.HNs.mapNs.providerNs.InvalidationsNs.Flag.SPATIAL with Double = js.native
  /* 1 */ val VISUAL: typings.heremaps.HNs.mapNs.providerNs.InvalidationsNs.Flag.VISUAL with Double = js.native
  /* 5 */ val Z_ORDER: typings.heremaps.HNs.mapNs.providerNs.InvalidationsNs.Flag.Z_ORDER with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Flag with Double] = js.native
}

