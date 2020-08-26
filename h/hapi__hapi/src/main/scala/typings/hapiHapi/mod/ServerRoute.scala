package typings.hapiHapi.mod

import typings.hapiHapi.mod.Lifecycle.Method
import typings.hapiHapi.mod.Lifecycle.ReturnValue
import typings.hapiHapi.mod.Util.HTTP_METHODS_PARTIAL
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerRoute extends js.Object {
  /**
    * (required when handler is not set) the route handler function called to generate the response after successful authentication and validation.
    */
  var handler: js.UndefOr[Method | HandlerDecorations] = js.native
  /**
    * (required) the HTTP method. Typically one of 'GET', 'POST', 'PUT', 'PATCH', 'DELETE', or 'OPTIONS'. Any HTTP method is allowed, except for 'HEAD'. Use '*' to match against any HTTP method
    * (only when an exact match was not found, and any match with a specific method will be given a higher priority over a wildcard match). Can be assigned an array of methods which has the same
    * result as adding the same route with different methods manually.
    */
  var method: HTTP_METHODS_PARTIAL | (js.Array[HTTP_METHODS_PARTIAL | String]) | String = js.native
  /**
    * additional route options. The options value can be an object or a function that returns an object using the signature function(server) where server is the server the route is being added to
    * and this is bound to the current realm's bind option.
    */
  var options: js.UndefOr[RouteOptions | (js.Function1[/* server */ Server_, RouteOptions])] = js.native
  /**
    * (required) the absolute path used to match incoming requests (must begin with '/'). Incoming requests are compared to the configured paths based on the server's router configuration. The path
    * can include named parameters enclosed in {} which will be matched against literal values in the request as described in Path parameters. For context [See
    * docs](https://github.com/hapijs/hapi/blob/master/API.md#-serverrouteroute) For context [See docs](https://github.com/hapijs/hapi/blob/master/API.md#path-parameters)
    */
  var path: String = js.native
  /**
    * route custom rules object. The object is passed to each rules processor registered with server.rules(). Cannot be used if route.options.rules is defined.
    */
  var rules: js.UndefOr[js.Object] = js.native
  /**
    * (optional) a domain string or an array of domain strings for limiting the route to only requests with a matching host header field. Matching is done against the hostname part of the header
    * only (excluding the port). Defaults to all hosts.
    */
  var vhost: js.UndefOr[String | js.Array[String]] = js.native
}

object ServerRoute {
  @scala.inline
  def apply(method: HTTP_METHODS_PARTIAL | (js.Array[HTTP_METHODS_PARTIAL | String]) | String, path: String): ServerRoute = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerRoute]
  }
  @scala.inline
  implicit class ServerRouteOps[Self <: ServerRoute] (val x: Self) extends AnyVal {
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
    def setMethodVarargs(value: (HTTP_METHODS_PARTIAL | String)*): Self = this.set("method", js.Array(value :_*))
    @scala.inline
    def setMethod(value: HTTP_METHODS_PARTIAL | (js.Array[HTTP_METHODS_PARTIAL | String]) | String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setHandlerFunction3(
      value: (/* request */ Request, /* h */ ResponseToolkit, /* err */ js.UndefOr[Error]) => ReturnValue
    ): Self = this.set("handler", js.Any.fromFunction3(value))
    @scala.inline
    def setHandler(value: Method | HandlerDecorations): Self = this.set("handler", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandler: Self = this.set("handler", js.undefined)
    @scala.inline
    def setOptionsFunction1(value: /* server */ Server_ => RouteOptions): Self = this.set("options", js.Any.fromFunction1(value))
    @scala.inline
    def setOptions(value: RouteOptions | (js.Function1[/* server */ Server_, RouteOptions])): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setRules(value: js.Object): Self = this.set("rules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
    @scala.inline
    def setVhostVarargs(value: String*): Self = this.set("vhost", js.Array(value :_*))
    @scala.inline
    def setVhost(value: String | js.Array[String]): Self = this.set("vhost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVhost: Self = this.set("vhost", js.undefined)
  }
  
}

