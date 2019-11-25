package typings.jquery

import typings.jquery.JQuery.HandleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HandleObjHandleObject[TTarget, TData] extends js.Object {
  var handleObj: HandleObject[TTarget, TData]
}

object Anon_HandleObjHandleObject {
  @scala.inline
  def apply[TTarget, TData](handleObj: HandleObject[TTarget, TData]): Anon_HandleObjHandleObject[TTarget, TData] = {
    val __obj = js.Dynamic.literal(handleObj = handleObj.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_HandleObjHandleObject[TTarget, TData]]
  }
}

