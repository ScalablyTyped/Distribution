package typings.ltijs.providerMod

import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnConnectOptions extends js.Object {
  var invalidToken: js.UndefOr[
    js.Function2[
      /* request */ Request_[ParamsDictionary, _, _, Query], 
      /* response */ Response_[_], 
      Response_[_]
    ]
  ] = js.undefined
  var sessionTimeout: js.UndefOr[
    js.Function2[
      /* request */ Request_[ParamsDictionary, _, _, Query], 
      /* response */ Response_[_], 
      Response_[_]
    ]
  ] = js.undefined
}

object OnConnectOptions {
  @scala.inline
  def apply(
    invalidToken: (/* request */ Request_[ParamsDictionary, _, _, Query], /* response */ Response_[_]) => Response_[_] = null,
    sessionTimeout: (/* request */ Request_[ParamsDictionary, _, _, Query], /* response */ Response_[_]) => Response_[_] = null
  ): OnConnectOptions = {
    val __obj = js.Dynamic.literal()
    if (invalidToken != null) __obj.updateDynamic("invalidToken")(js.Any.fromFunction2(invalidToken))
    if (sessionTimeout != null) __obj.updateDynamic("sessionTimeout")(js.Any.fromFunction2(sessionTimeout))
    __obj.asInstanceOf[OnConnectOptions]
  }
}

