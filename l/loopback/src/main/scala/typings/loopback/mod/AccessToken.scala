package typings.loopback.mod

import typings.loopback.anon.AccessTokenIdLength
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
open class AccessToken protected () extends PersistedModel {
  def this(data: Any) = this()
  
  /** When the token was created. */
  var created: js.Date = js.native
  
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
  def validate(callback: js.Function2[/* err */ js.Error, /* isValid */ Boolean, Unit]): Unit = js.native
}
object AccessToken {
  
  @JSImport("loopback", "AccessToken")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create a cryptographically random access token id
    * @callback {() => void} callback
    * @param {Error} err
    * @param {string} toke
    */
  /* static member */
  inline def createAccessTokenId(callback: js.Function2[/* err */ js.Error, /* token */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAccessTokenId")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Find a token for the given `any`
    * @param {any} req
    * @param {any} [options] Options for finding the token
    * @callback {() => void} callback
    * @param {Error} err
    * @param {AccessToken} toke
    */
  /* static member */
  inline def findForRequest(req: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("findForRequest")(req.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def findForRequest(req: Any, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("findForRequest")(req.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def findForRequest(req: Any, options: Any, callback: js.Function2[/* err */ js.Error, /* token */ AccessToken, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("findForRequest")(req.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def findForRequest(req: Any, options: Unit, callback: js.Function2[/* err */ js.Error, /* token */ AccessToken, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("findForRequest")(req.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
