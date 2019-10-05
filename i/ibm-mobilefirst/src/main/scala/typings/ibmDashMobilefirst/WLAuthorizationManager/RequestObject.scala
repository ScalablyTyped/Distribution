package typings.ibmDashMobilefirst.WLAuthorizationManager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestObject extends js.Object {
  def setRequestHeader(header: String, value: String): Unit
}

object RequestObject {
  @scala.inline
  def apply(setRequestHeader: (String, String) => Unit): RequestObject = {
    val __obj = js.Dynamic.literal(setRequestHeader = js.Any.fromFunction2(setRequestHeader))
  
    __obj.asInstanceOf[RequestObject]
  }
}

