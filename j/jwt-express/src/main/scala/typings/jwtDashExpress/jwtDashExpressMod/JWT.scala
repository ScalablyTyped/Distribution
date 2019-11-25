package typings.jwtDashExpress.jwtDashExpressMod

import typings.express.expressMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JWT extends js.Object {
  /**
    * Indicates if the JWT is expired. valid will always be false if this is true.
    */
  var expired: Boolean
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
  var secret: String
  /**
    * Indicates if the JWT is stale. The default timeout before a JWT is considered stale is 15 minutes.
    */
  var stale: Boolean
  /**
    * The signed token of the JWT.
    */
  var token: String
  /**
    * Indicates if this JWT is valid. This means that the payload hasn't been tampered with and that the JWT hasn't expired yet.
    */
  var valid: Boolean
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
  def store(res: Response): JWT
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
  def verify(token: String): JWT
}

object JWT {
  @scala.inline
  def apply(
    expired: Boolean,
    options: JWTExpressOptions,
    payload: js.Any,
    resign: () => JWT,
    revoke: () => JWT,
    secret: String,
    sign: js.Any => JWT,
    stale: Boolean,
    store: Response => JWT,
    toJSON: () => js.Any,
    token: String,
    valid: Boolean,
    verify: String => JWT
  ): JWT = {
    val __obj = js.Dynamic.literal(expired = expired.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], resign = js.Any.fromFunction0(resign), revoke = js.Any.fromFunction0(revoke), secret = secret.asInstanceOf[js.Any], sign = js.Any.fromFunction1(sign), stale = stale.asInstanceOf[js.Any], store = js.Any.fromFunction1(store), toJSON = js.Any.fromFunction0(toJSON), token = token.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], verify = js.Any.fromFunction1(verify))
  
    __obj.asInstanceOf[JWT]
  }
}

