package typings.jestDashJasmine2

import typings.jestDashJasmine2.buildQueueRunnerMod.QueueableFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Afters extends js.Object {
  var afters: js.Array[QueueableFn]
  var befores: js.Array[QueueableFn]
}

object Anon_Afters {
  @scala.inline
  def apply(afters: js.Array[QueueableFn], befores: js.Array[QueueableFn]): Anon_Afters = {
    val __obj = js.Dynamic.literal(afters = afters, befores = befores)
  
    __obj.asInstanceOf[Anon_Afters]
  }
}

