package typings.jwtExpress.mod

import typings.express.mod.Response_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JWT extends js.Object {
  /**
    * Indicates if the JWT is expired. valid will always be false if this is true.
    */
  var expired: Boolean = js.native
  /**
    * The jwt-express options.
    */
  var options: JWTExpressOptions = js.native
  /**
    * The payload of the JWT (must be an object). jwt-express will add a stales key-value pair to the payload for stale.
    */
  var payload: js.Any = js.native
  /**
    * The secret used to sign /verify the JWT.
    */
  var secret: String = js.native
  /**
    * Indicates if the JWT is stale. The default timeout before a JWT is considered stale is 15 minutes.
    */
  var stale: Boolean = js.native
  /**
    * The signed token of the JWT.
    */
  var token: String = js.native
  /**
    * Indicates if this JWT is valid. This means that the payload hasn't been tampered with and that the JWT hasn't expired yet.
    */
  var valid: Boolean = js.native
  /**
    * Resigns this JWT Objects's payload.
    *
    * @return this
    */
  def resign(): JWT = js.native
  /**
    * Calls the revoke function defined in the jwt.init() options with this JWT Object as the first parameter.
    *
    * @return this
    */
  def revoke(): JWT = js.native
  /**
    * Generates a signed token from the payload.
    *
    * @param payload The payload of the JWT (must be an object).
    * @return this
    */
  def sign(payload: js.Any): JWT = js.native
  /**
    * Stores this JWT in the cookie (if configured to use cookies).
    *
    * @param res The response in which to store the JWT.
    * @return this
    */
  def store(res: Response_[_]): JWT = js.native
  /**
    * This function is called when the jwt is passed through JSON.stringify.
    * We don't want the secret or options to be stringified.
    *
    * @return The JSON form of the object.
    */
  def toJSON(): js.Any = js.native
  /**
    * Verify the token and load the info into this JWT.
    *
    * @param token The signed token to verify.
    * @return this
    */
  def verify(token: String): JWT = js.native
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
    store: Response_[_] => JWT,
    toJSON: () => js.Any,
    token: String,
    valid: Boolean,
    verify: String => JWT
  ): JWT = {
    val __obj = js.Dynamic.literal(expired = expired.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], resign = js.Any.fromFunction0(resign), revoke = js.Any.fromFunction0(revoke), secret = secret.asInstanceOf[js.Any], sign = js.Any.fromFunction1(sign), stale = stale.asInstanceOf[js.Any], store = js.Any.fromFunction1(store), toJSON = js.Any.fromFunction0(toJSON), token = token.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], verify = js.Any.fromFunction1(verify))
    __obj.asInstanceOf[JWT]
  }
  @scala.inline
  implicit class JWTOps[Self <: JWT] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExpired(value: Boolean): Self = this.set("expired", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: JWTExpressOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setPayload(value: js.Any): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def setResign(value: () => JWT): Self = this.set("resign", js.Any.fromFunction0(value))
    @scala.inline
    def setRevoke(value: () => JWT): Self = this.set("revoke", js.Any.fromFunction0(value))
    @scala.inline
    def setSecret(value: String): Self = this.set("secret", value.asInstanceOf[js.Any])
    @scala.inline
    def setSign(value: js.Any => JWT): Self = this.set("sign", js.Any.fromFunction1(value))
    @scala.inline
    def setStale(value: Boolean): Self = this.set("stale", value.asInstanceOf[js.Any])
    @scala.inline
    def setStore(value: Response_[_] => JWT): Self = this.set("store", js.Any.fromFunction1(value))
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def setValid(value: Boolean): Self = this.set("valid", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerify(value: String => JWT): Self = this.set("verify", js.Any.fromFunction1(value))
  }
  
}

