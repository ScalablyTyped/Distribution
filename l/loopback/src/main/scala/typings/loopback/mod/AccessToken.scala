package typings.loopback.mod

import typings.loopback.anon.AccessTokenIdLength
import typings.std.Date
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
class AccessToken protected () extends PersistedModel {
  def this(data: js.Any) = this()
  
  /** When the token was created. */
  var created: Date = js.native
  
  /** Generated token ID */
  var id: String = js.native
  
  /** Extends the `Model.settings` object. */
  @JSName("settings")
  var settings_AccessToken: AccessTokenIdLength = js.native
  
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
object AccessToken {
  
  /**
    * Create a cryptographically random access token id
    * @callback {() => void} callback
    * @param {Error} err
    * @param {string} toke
    */
  /* static member */
  @JSImport("loopback", "AccessToken.createAccessTokenId")
  @js.native
  def createAccessTokenId(callback: js.Function2[/* err */ Error, /* token */ String, Unit]): Unit = js.native
  
  /**
    * Find a token for the given `any`
    * @param {any} req
    * @param {any} [options] Options for finding the token
    * @callback {() => void} callback
    * @param {Error} err
    * @param {AccessToken} toke
    */
  /* static member */
  @JSImport("loopback", "AccessToken.findForRequest")
  @js.native
  def findForRequest(req: js.Any): Unit = js.native
  @JSImport("loopback", "AccessToken.findForRequest")
  @js.native
  def findForRequest(
    req: js.Any,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ Error, /* token */ AccessToken, Unit]
  ): Unit = js.native
  @JSImport("loopback", "AccessToken.findForRequest")
  @js.native
  def findForRequest(req: js.Any, options: js.Any): Unit = js.native
  @JSImport("loopback", "AccessToken.findForRequest")
  @js.native
  def findForRequest(
    req: js.Any,
    options: js.Any,
    callback: js.Function2[/* err */ Error, /* token */ AccessToken, Unit]
  ): Unit = js.native
}
