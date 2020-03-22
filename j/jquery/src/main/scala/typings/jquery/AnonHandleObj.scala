package typings.jquery

import typings.jquery.JQuery_.HandleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHandleObj[TTarget, TData] extends js.Object {
  var handleObj: HandleObject[TTarget, TData]
}

object AnonHandleObj {
  @scala.inline
  def apply[TTarget, TData](handleObj: HandleObject[TTarget, TData]): AnonHandleObj[TTarget, TData] = {
    val __obj = js.Dynamic.literal(handleObj = handleObj.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHandleObj[TTarget, TData]]
  }
}

