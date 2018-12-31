package typings
package loopbackLib.loopbackMod

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
class AccessToken ()
  extends loopbackLib.loopbackMod.lNs.AccessToken {
  /** Contains additional model settings. */
  /* CompleteClass */
  override var settings: loopbackLib.loopbackMod.lNs.Settings = js.native
  /* CompleteClass */
  override def afterRemote(
    method: java.lang.String,
    callback: js.Function3[
      /* ctx */ loopbackLib.loopbackMod.lNs.Context, 
      /* modelInstanceOrNext */ this.type | expressLib.expressMod.eNs.NextFunction, 
      /* next */ js.UndefOr[expressLib.expressMod.eNs.NextFunction], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /* CompleteClass */
  override def afterRemoteError(method: java.lang.String, callback: expressLib.expressMod.eNs.NextFunction): scala.Unit = js.native
  /**
    * loopback 3.x Remote hooks
    * http://loopback.io/doc/en/lb3/Remote-hooks.html
    * @param method
    * @param backback
    */
  /* CompleteClass */
  override def beforeRemote(
    method: java.lang.String,
    callback: js.Function3[
      /* ctx */ loopbackLib.loopbackMod.lNs.Context, 
      /* modelInstanceOrNext */ this.type | expressLib.expressMod.eNs.NextFunction, 
      /* next */ js.UndefOr[expressLib.expressMod.eNs.NextFunction], 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

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
object AccessToken extends js.Object {
  /**
    * Create a cryptographically random access token id
    * @callback {() => void} callback
    * @param {Error} err
    * @param {string} toke
    */
  def createAccessTokenId(callback: js.Function2[/* err */ nodeLib.Error, /* token */ java.lang.String, scala.Unit]): scala.Unit = js.native
  /**
    * Find a token for the given `any`
    * @param {any} req
    * @param {any} [options] Options for finding the token
    * @callback {() => void} callback
    * @param {Error} err
    * @param {AccessToken} toke
    */
  def findForRequest(req: js.Any): scala.Unit = js.native
  def findForRequest(req: js.Any, options: js.Any): scala.Unit = js.native
  def findForRequest(
    req: js.Any,
    options: js.Any,
    callback: js.Function2[/* err */ nodeLib.Error, /* token */ this.type, scala.Unit]
  ): scala.Unit = js.native
}

