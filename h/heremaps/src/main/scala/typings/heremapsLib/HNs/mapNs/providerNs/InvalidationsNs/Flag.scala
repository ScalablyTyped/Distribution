package typings
package heremapsLib.HNs.mapNs.providerNs.InvalidationsNs

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
  sealed trait ADD
    extends heremapsLib.HNs.mapNs.providerNs.InvalidationsNs.Flag
  
  @js.native
  sealed trait NONE
    extends heremapsLib.HNs.mapNs.providerNs.InvalidationsNs.Flag
  
  @js.native
  sealed trait REMOVE
    extends heremapsLib.HNs.mapNs.providerNs.InvalidationsNs.Flag
  
  @js.native
  sealed trait SPATIAL
    extends heremapsLib.HNs.mapNs.providerNs.InvalidationsNs.Flag
  
  @js.native
  sealed trait VISUAL
    extends heremapsLib.HNs.mapNs.providerNs.InvalidationsNs.Flag
  
  @js.native
  sealed trait Z_ORDER
    extends heremapsLib.HNs.mapNs.providerNs.InvalidationsNs.Flag
  
  /* 3 */ val ADD: ADD with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  /* 4 */ val REMOVE: REMOVE with scala.Double = js.native
  /* 2 */ val SPATIAL: SPATIAL with scala.Double = js.native
  /* 1 */ val VISUAL: VISUAL with scala.Double = js.native
  /* 5 */ val Z_ORDER: Z_ORDER with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[heremapsLib.HNs.mapNs.providerNs.InvalidationsNs.Flag with scala.Double] = js.native
}

