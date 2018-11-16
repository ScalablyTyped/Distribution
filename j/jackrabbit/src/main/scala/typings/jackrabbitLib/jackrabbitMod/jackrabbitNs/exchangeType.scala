package typings
package jackrabbitLib.jackrabbitMod.jackrabbitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait exchangeType extends js.Object

@JSImport("jackrabbit/jackrabbit", "exchangeType")
@js.native
object exchangeType extends js.Object {
  @js.native
  sealed trait direct
    extends jackrabbitLib.jackrabbitMod.jackrabbitNs.exchangeType
  
  @js.native
  sealed trait fanout
    extends jackrabbitLib.jackrabbitMod.jackrabbitNs.exchangeType
  
  @js.native
  sealed trait topic
    extends jackrabbitLib.jackrabbitMod.jackrabbitNs.exchangeType
  
}

