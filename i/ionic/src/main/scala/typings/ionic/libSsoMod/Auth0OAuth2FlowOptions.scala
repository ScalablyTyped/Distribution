package typings.ionic.libSsoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof ionic.ionic/lib/sso.OAuth2FlowOptions ]:? ionic.ionic/lib/sso.OAuth2FlowOptions[P]} */ trait Auth0OAuth2FlowOptions extends js.Object {
  val audience: js.UndefOr[String] = js.undefined
  val connection: String
  val email: String
}

object Auth0OAuth2FlowOptions {
  @scala.inline
  def apply(connection: String, email: String, audience: String = null): Auth0OAuth2FlowOptions = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any])
    if (audience != null) __obj.updateDynamic("audience")(audience.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth0OAuth2FlowOptions]
  }
}

