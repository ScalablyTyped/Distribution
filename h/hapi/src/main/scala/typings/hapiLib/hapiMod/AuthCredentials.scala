package typings
package hapiLib.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthCredentials extends js.Object {
  /**
    * If set, will only work with routes that set `access.entity` to `app`.
    */
  var app: js.UndefOr[AppCredentials] = js.undefined
  /**
    * The application scopes to be granted.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsauthaccessscope)
    */
  var scope: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * If set, will only work with routes that set `access.entity` to `user`.
    */
  var user: js.UndefOr[UserCredentials] = js.undefined
}

