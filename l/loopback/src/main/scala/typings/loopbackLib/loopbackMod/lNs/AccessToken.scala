package typings
package loopbackLib.loopbackMod.lNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Token based authentication and access control
  * **Default ACLs*
  *  - DENY EVERYONE `*`
  *  - ALLOW EVERYONE creat
  * @property {string} id Generated token ID.
  * @property {number} ttl Time to live in seconds, 2 weeks by default.
  * @property {Date} created When the token was created.
  * @property {any} settings Extends the `Model.settings` object.
  * @property {number} settings.accessTokenIdLength Length of the base64-encoded string access token. Default value is 64.
  * Increase the length for a more secure access token
  * @class AccessToken
  * @inherits {PersistedModel}
  */
@js.native
trait AccessToken extends PersistedModel {
  /** When the token was created. */
  var created: stdLib.Date = js.native
  /** Generated token ID */
  var id: java.lang.String = js.native
  /** Extends the `Model.settings` object. */
  @JSName("settings")
  var settings_AccessToken: loopbackLib.Anon_AccessTokenIdLength = js.native
  /** Time to live in seconds, 2 weeks by default. */
  var ttl: scala.Double = js.native
  /**
    * Validate the token.
    *
    * @callback {() => void} callback
    * @param {Error} err
    * @param {boolean} isValid
    */
  def validate(callback: js.Function2[/* err */ nodeLib.Error, /* isValid */ scala.Boolean, scala.Unit]): scala.Unit = js.native
}

