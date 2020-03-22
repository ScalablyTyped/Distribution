package typings.jackrabbit.mod.jackrabbit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait exchangeType extends js.Object

@JSImport("jackrabbit", "jackrabbit.exchangeType")
@js.native
object exchangeType extends js.Object {
  @js.native
  sealed trait direct extends exchangeType
  
  @js.native
  sealed trait fanout extends exchangeType
  
  @js.native
  sealed trait topic extends exchangeType
  
}

