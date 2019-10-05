package typings.inboxsdk.inboxsdkMod.Common

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Contact extends js.Object {
  var emailAddress: String
  var name: String
}

object Contact {
  @scala.inline
  def apply(emailAddress: String, name: String): Contact = {
    val __obj = js.Dynamic.literal(emailAddress = emailAddress, name = name)
  
    __obj.asInstanceOf[Contact]
  }
}

