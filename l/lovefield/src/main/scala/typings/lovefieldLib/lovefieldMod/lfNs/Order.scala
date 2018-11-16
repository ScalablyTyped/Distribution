package typings
package lovefieldLib.lovefieldMod.lfNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Order extends js.Object

@JSImport("lovefield/lf", "Order")
@js.native
object Order extends js.Object {
  @js.native
  sealed trait ASC
    extends lovefieldLib.lovefieldMod.lfNs.Order
  
  @js.native
  sealed trait DESC
    extends lovefieldLib.lovefieldMod.lfNs.Order
  
}

