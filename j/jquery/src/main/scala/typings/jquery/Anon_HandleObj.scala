package typings.jquery

import typings.jquery.JQueryNs.HandleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HandleObj[TTarget, TData] extends js.Object {
  var handleObj: HandleObject[TTarget, TData]
}

object Anon_HandleObj {
  @scala.inline
  def apply[TTarget, TData](handleObj: HandleObject[TTarget, TData]): Anon_HandleObj[TTarget, TData] = {
    val __obj = js.Dynamic.literal(handleObj = handleObj)
  
    __obj.asInstanceOf[Anon_HandleObj[TTarget, TData]]
  }
}

