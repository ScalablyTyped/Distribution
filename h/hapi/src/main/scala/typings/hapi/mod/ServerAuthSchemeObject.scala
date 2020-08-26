package typings.hapi.mod

import typings.hapi.anon.Payload
import typings.hapi.mod.Lifecycle.ReturnValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerAuthSchemeObject extends js.Object {
  /**
    * optional object which is exposed via the [server.auth.api](https://github.com/hapijs/hapi/blob/master/API.md#server.auth.api) object.
    */
  var api: js.UndefOr[ServerAuthSchemeObjectApi] = js.native
  /**
    * An object with the following keys:
    * * payload
    */
  var options: js.UndefOr[Payload] = js.native
  /**
    * A lifecycle method to authenticate the request payload.
    * When the scheme payload() method returns an error with a message, it means payload validation failed due to bad
    * payload. If the error has no message but includes a scheme name (e.g. Boom.unauthorized(null, 'Custom')),
    * authentication may still be successful if the route auth.payload configuration is set to 'optional'.
    * @param request the request object.
    * @param h the ResponseToolkit
    * @return the Lifecycle.ReturnValue
    */
  var payload: js.UndefOr[js.Function2[/* request */ Request, /* h */ ResponseToolkit, ReturnValue]] = js.native
  /**
    * A lifecycle method to decorate the response with authentication headers before the response headers or payload is written.
    * @param request the request object.
    * @param h the ResponseToolkit
    * @return the Lifecycle.ReturnValue
    */
  var response: js.UndefOr[js.Function2[/* request */ Request, /* h */ ResponseToolkit, ReturnValue]] = js.native
  /**
    * a method used to verify the authentication credentials provided
    * are still valid (e.g. not expired or revoked after the initial authentication).
    * the method throws an `Error` when the credentials passed are no longer valid (e.g. expired or
    * revoked). Note that the method does not have access to the original request, only to the
    * credentials and artifacts produced by the `authenticate()` method.
    */
  var verify: js.UndefOr[js.Function1[/* auth */ RequestAuth, js.Promise[Unit]]] = js.native
  /**
    * A lifecycle method function called for each incoming request configured with the authentication scheme. The
    * method is provided with two special toolkit methods for returning an authenticated or an unauthenticate result:
    * * h.authenticated() - indicate request authenticated successfully.
    * * h.unauthenticated() - indicate request failed to authenticate.
    * @param request the request object.
    * @param h the ResponseToolkit
    * @return the Lifecycle.ReturnValue
    */
  def authenticate(request: Request, h: ResponseToolkit): ReturnValue = js.native
}

object ServerAuthSchemeObject {
  @scala.inline
  def apply(authenticate: (Request, ResponseToolkit) => ReturnValue): ServerAuthSchemeObject = {
    val __obj = js.Dynamic.literal(authenticate = js.Any.fromFunction2(authenticate))
    __obj.asInstanceOf[ServerAuthSchemeObject]
  }
  @scala.inline
  implicit class ServerAuthSchemeObjectOps[Self <: ServerAuthSchemeObject] (val x: Self) extends AnyVal {
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
    def setAuthenticate(value: (Request, ResponseToolkit) => ReturnValue): Self = this.set("authenticate", js.Any.fromFunction2(value))
    @scala.inline
    def setApi(value: ServerAuthSchemeObjectApi): Self = this.set("api", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApi: Self = this.set("api", js.undefined)
    @scala.inline
    def setOptions(value: Payload): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setPayload(value: (/* request */ Request, /* h */ ResponseToolkit) => ReturnValue): Self = this.set("payload", js.Any.fromFunction2(value))
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    @scala.inline
    def setResponse(value: (/* request */ Request, /* h */ ResponseToolkit) => ReturnValue): Self = this.set("response", js.Any.fromFunction2(value))
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
    @scala.inline
    def setVerify(value: /* auth */ RequestAuth => js.Promise[Unit]): Self = this.set("verify", js.Any.fromFunction1(value))
    @scala.inline
    def deleteVerify: Self = this.set("verify", js.undefined)
  }
  
}

