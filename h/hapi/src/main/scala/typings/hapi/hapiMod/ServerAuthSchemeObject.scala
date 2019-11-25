package typings.hapi.hapiMod

import typings.hapi.Anon_Payload
import typings.hapi.hapiMod.Lifecycle.ReturnValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerAuthSchemeObject extends js.Object {
  /**
    * optional object which is exposed via the [server.auth.api](https://github.com/hapijs/hapi/blob/master/API.md#server.auth.api) object.
    */
  var api: js.UndefOr[ServerAuthSchemeObjectApi] = js.undefined
  /**
    * An object with the following keys:
    * * payload
    */
  var options: js.UndefOr[Anon_Payload] = js.undefined
  /**
    * A lifecycle method to authenticate the request payload.
    * When the scheme payload() method returns an error with a message, it means payload validation failed due to bad
    * payload. If the error has no message but includes a scheme name (e.g. Boom.unauthorized(null, 'Custom')),
    * authentication may still be successful if the route auth.payload configuration is set to 'optional'.
    * @param request the request object.
    * @param h the ResponseToolkit
    * @return the Lifecycle.ReturnValue
    */
  var payload: js.UndefOr[js.Function2[/* request */ Request, /* h */ ResponseToolkit, ReturnValue]] = js.undefined
  /**
    * A lifecycle method to decorate the response with authentication headers before the response headers or payload is written.
    * @param request the request object.
    * @param h the ResponseToolkit
    * @return the Lifecycle.ReturnValue
    */
  var response: js.UndefOr[js.Function2[/* request */ Request, /* h */ ResponseToolkit, ReturnValue]] = js.undefined
  /**
    * a method used to verify the authentication credentials provided
    * are still valid (e.g. not expired or revoked after the initial authentication).
    * the method throws an `Error` when the credentials passed are no longer valid (e.g. expired or
    * revoked). Note that the method does not have access to the original request, only to the
    * credentials and artifacts produced by the `authenticate()` method.
    */
  var verify: js.UndefOr[js.Function1[/* auth */ RequestAuth, js.Promise[Unit]]] = js.undefined
  /**
    * A lifecycle method function called for each incoming request configured with the authentication scheme. The
    * method is provided with two special toolkit methods for returning an authenticated or an unauthenticate result:
    * * h.authenticated() - indicate request authenticated successfully.
    * * h.unauthenticated() - indicate request failed to authenticate.
    * @param request the request object.
    * @param h the ResponseToolkit
    * @return the Lifecycle.ReturnValue
    */
  def authenticate(request: Request, h: ResponseToolkit): ReturnValue
}

object ServerAuthSchemeObject {
  @scala.inline
  def apply(
    authenticate: (Request, ResponseToolkit) => ReturnValue,
    api: ServerAuthSchemeObjectApi = null,
    options: Anon_Payload = null,
    payload: (/* request */ Request, /* h */ ResponseToolkit) => ReturnValue = null,
    response: (/* request */ Request, /* h */ ResponseToolkit) => ReturnValue = null,
    verify: /* auth */ RequestAuth => js.Promise[Unit] = null
  ): ServerAuthSchemeObject = {
    val __obj = js.Dynamic.literal(authenticate = js.Any.fromFunction2(authenticate))
    if (api != null) __obj.updateDynamic("api")(api.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(js.Any.fromFunction2(payload))
    if (response != null) __obj.updateDynamic("response")(js.Any.fromFunction2(response))
    if (verify != null) __obj.updateDynamic("verify")(js.Any.fromFunction1(verify))
    __obj.asInstanceOf[ServerAuthSchemeObject]
  }
}

