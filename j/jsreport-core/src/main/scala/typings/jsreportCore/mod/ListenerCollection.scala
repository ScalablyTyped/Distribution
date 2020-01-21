package typings.jsreportCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListenerCollection extends js.Object {
  def add(
    `type`: String,
    callback: js.Function3[
      /* req */ Request, 
      /* res */ Response, 
      /* err */ js.UndefOr[js.Any], 
      js.Promise[_] | Unit
    ]
  ): Unit
}

object ListenerCollection {
  @scala.inline
  def apply(
    add: (String, js.Function3[
      /* req */ Request, 
      /* res */ Response, 
      /* err */ js.UndefOr[js.Any], 
      js.Promise[_] | Unit
    ]) => Unit
  ): ListenerCollection = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add))
  
    __obj.asInstanceOf[ListenerCollection]
  }
}

