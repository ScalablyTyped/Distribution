package typings.loopback.mod

import typings.loopback.AnonAccessTokenIdLength
import typings.std.Date
import typings.std.Error
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
@JSImport("loopback", "AccessToken")
@js.native
class AccessToken () extends PersistedModel {
  /** When the token was created. */
  var created: Date = js.native
  /** Generated token ID */
  var id: String = js.native
  /** Extends the `Model.settings` object. */
  @JSName("settings")
  var settings_AccessToken: AnonAccessTokenIdLength = js.native
  /** Time to live in seconds, 2 weeks by default. */
  var ttl: Double = js.native
  /**
    * Validate the token.
    *
    * @callback {() => void} callback
    * @param {Error} err
    * @param {boolean} isValid
    */
  def validate(callback: js.Function2[/* err */ Error, /* isValid */ Boolean, Unit]): Unit = js.native
}

/* static members */
@JSImport("loopback", "AccessToken")
@js.native
object AccessToken extends js.Object {
  /**
    * Create a cryptographically random access token id
    * @callback {() => void} callback
    * @param {Error} err
    * @param {string} toke
    */
  def createAccessTokenId(callback: js.Function2[/* err */ Error, /* token */ String, Unit]): Unit = js.native
  /**
    * Find a token for the given `any`
    * @param {any} req
    * @param {any} [options] Options for finding the token
    * @callback {() => void} callback
    * @param {Error} err
    * @param {AccessToken} toke
    */
  def findForRequest(req: js.Any): Unit = js.native
  def findForRequest(req: js.Any, options: js.Any): Unit = js.native
  def findForRequest(req: js.Any, options: js.Any, callback: js.Function2[/* err */ Error, /* token */ this.type, Unit]): Unit = js.native
}

