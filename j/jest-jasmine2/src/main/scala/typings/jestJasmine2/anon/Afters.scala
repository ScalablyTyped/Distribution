package typings.jestJasmine2.anon

import typings.jestJasmine2.queueRunnerMod.QueueableFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Afters extends js.Object {
  var afters: js.Array[QueueableFn]
  var befores: js.Array[QueueableFn]
}

object Afters {
  @scala.inline
  def apply(afters: js.Array[QueueableFn], befores: js.Array[QueueableFn]): Afters = {
    val __obj = js.Dynamic.literal(afters = afters.asInstanceOf[js.Any], befores = befores.asInstanceOf[js.Any])
    __obj.asInstanceOf[Afters]
  }
}

