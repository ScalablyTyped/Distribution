package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information on how a buyer or seller can be reached.
  */
@js.native
trait SchemaContactInformation extends js.Object {
  /**
    * Email address for the contact.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * The name of the contact.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaContactInformation {
  @scala.inline
  def apply(email: String = null, name: String = null): SchemaContactInformation = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaContactInformation]
  }
}

