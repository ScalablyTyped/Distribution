package typings.keycloakDashConnect.keycloakDashConnectMod

import typings.express.expressMod.Request
import typings.express.expressMod.Response
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Grant extends js.Object {
  var __raw: String
  var access_token: Token
  var expires_in: Double
  var id_token: Token
  var refresh_token: Token
  var token_type: String
  def isExpired(): Boolean
  def store(request: Request[ParamsDictionary], response: Response): Unit
  def update(grant: Grant): Unit
}

object Grant {
  @scala.inline
  def apply(
    __raw: String,
    access_token: Token,
    expires_in: Double,
    id_token: Token,
    isExpired: () => Boolean,
    refresh_token: Token,
    store: (Request[ParamsDictionary], Response) => Unit,
    token_type: String,
    update: Grant => Unit
  ): Grant = {
    val __obj = js.Dynamic.literal(__raw = __raw.asInstanceOf[js.Any], access_token = access_token.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any], id_token = id_token.asInstanceOf[js.Any], isExpired = js.Any.fromFunction0(isExpired), refresh_token = refresh_token.asInstanceOf[js.Any], store = js.Any.fromFunction2(store), token_type = token_type.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[Grant]
  }
}

