package typings
package ibmDashMobilefirstLib.WLAuthorizationManagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestObject extends js.Object {
  def setRequestHeader(header: java.lang.String, value: java.lang.String): scala.Unit
}

object RequestObject {
  @scala.inline
  def apply(setRequestHeader: (java.lang.String, java.lang.String) => scala.Unit): RequestObject = {
    val __obj = js.Dynamic.literal(setRequestHeader = js.Any.fromFunction2(setRequestHeader))
  
    __obj.asInstanceOf[RequestObject]
  }
}

