package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.CommonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Contact extends js.Object {
  var emailAddress: java.lang.String
  var name: java.lang.String
}

object Contact {
  @scala.inline
  def apply(emailAddress: java.lang.String, name: java.lang.String): Contact = {
    val __obj = js.Dynamic.literal(emailAddress = emailAddress, name = name)
  
    __obj.asInstanceOf[Contact]
  }
}

