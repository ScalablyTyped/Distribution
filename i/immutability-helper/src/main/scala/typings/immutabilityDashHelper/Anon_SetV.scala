package typings.immutabilityDashHelper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SetV[V] extends js.Object {
  @JSName("$set")
  var $set: V
}

object Anon_SetV {
  @scala.inline
  def apply[V]($set: V): Anon_SetV[V] = {
    val __obj = js.Dynamic.literal($set = $set.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_SetV[V]]
  }
}

