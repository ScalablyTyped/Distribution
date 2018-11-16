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
  
  val ADD: ADD with java.lang.String = js.native
  val NONE: NONE with java.lang.String = js.native
  val REMOVE: REMOVE with java.lang.String = js.native
  val SPATIAL: SPATIAL with java.lang.String = js.native
  val VISUAL: VISUAL with java.lang.String = js.native
  val Z_ORDER: Z_ORDER with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[heremapsLib.HNs.mapNs.providerNs.InvalidationsNs.Flag with java.lang.String] = js.native
}

