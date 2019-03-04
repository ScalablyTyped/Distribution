package typings
package jwtDashExpressLib.jwtDashExpressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JWT extends js.Object {
  /**
    * Indicates if the JWT is expired. valid will always be false if this is true.
    */
  var expired: scala.Boolean
  /**
    * The jwt-express options.
    */
  var options: JWTExpressOptions
  /**
    * The payload of the JWT (must be an object). jwt-express will add a stales key-value pair to the payload for stale.
    */
  var payload: js.Any
  /**
    * The secret used to sign /verify the JWT.
    */
  var secret: java.lang.String
  /**
    * Indicates if the JWT is stale. The default timeout before a JWT is considered stale is 15 minutes.
    */
  var stale: scala.Boolean
  /**
    * The signed token of the JWT.
    */
  var token: java.lang.String
  /**
    * Indicates if this JWT is valid. This means that the payload hasn't been tampered with and that the JWT hasn't expired yet.
    */
  var valid: scala.Boolean
  /**
    * Resigns this JWT Objects's payload.
    *
    * @return this
    */
  def resign(): JWT
  /**
    * Calls the revoke function defined in the jwt.init() options with this JWT Object as the first parameter.
    *
    * @return this
    */
  def revoke(): JWT
  /**
    * Generates a signed token from the payload.
    *
    * @param payload The payload of the JWT (must be an object).
    * @return this
    */
  def sign(payload: js.Any): JWT
  /**
    * Stores this JWT in the cookie (if configured to use cookies).
    *
    * @param res The response in which to store the JWT.
    * @return this
    */
  def store(res: expressLib.expressMod.eNs.Response): JWT
  /**
    * This function is called when the jwt is passed through JSON.stringify.
    * We don't want the secret or options to be stringified.
    *
    * @return The JSON form of the object.
    */
  def toJSON(): js.Any
  /**
    * Verify the token and load the info into this JWT.
    *
    * @param token The signed token to verify.
    * @return this
    */
  def verify(token: java.lang.String): JWT
}

object JWT {
  @scala.inline
  def apply(
    expired: scala.Boolean,
    options: JWTExpressOptions,
    payload: js.Any,
    resign: js.Function0[JWT],
    revoke: js.Function0[JWT],
    secret: java.lang.String,
    sign: js.Function1[js.Any, JWT],
    stale: scala.Boolean,
    store: js.Function1[expressLib.expressMod.eNs.Response, JWT],
    toJSON: js.Function0[js.Any],
    token: java.lang.String,
    valid: scala.Boolean,
    verify: js.Function1[java.lang.String, JWT]
  ): JWT = {
    val __obj = js.Dynamic.literal(expired = expired, options = options, payload = payload, resign = resign, revoke = revoke, secret = secret, sign = sign, stale = stale, store = store, toJSON = toJSON, token = token, valid = valid, verify = verify)
  
    __obj.asInstanceOf[JWT]
  }
}

