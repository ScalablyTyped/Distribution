package typings.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `Endpoint` describes a network endpoint that serves a set of APIs. A
  * service may expose any number of endpoints, and all endpoints share the
  * same service configuration, such as quota configuration and monitoring
  * configuration.  Example service configuration:      name:
  * library-example.googleapis.com     endpoints:       # Below entry makes
  * &#39;google.example.library.v1.Library&#39;       # API be served from
  * endpoint address library-example.googleapis.com.       # It also allows
  * HTTP OPTIONS calls to be passed to the backend, for       # it to decide
  * whether the subsequent cross-origin request is       # allowed to proceed.
  * - name: library-example.googleapis.com       allow_cors: true
  */
@js.native
trait SchemaEndpoint extends js.Object {
  /**
    * DEPRECATED: This field is no longer supported. Instead of using aliases,
    * please specify multiple google.api.Endpoint for each of the intended
    * aliases.  Additional names that this endpoint will be hosted on.
    */
  var aliases: js.UndefOr[js.Array[String]] = js.native
  /**
    * Allowing
    * [CORS](https://en.wikipedia.org/wiki/Cross-origin_resource_sharing), aka
    * cross-domain traffic, would allow the backends served from this endpoint
    * to receive and respond to HTTP OPTIONS requests. The response will be
    * used by the browser to determine whether the subsequent cross-origin
    * request is allowed to proceed.
    */
  var allowCors: js.UndefOr[Boolean] = js.native
  /**
    * The list of features enabled on this endpoint.
    */
  var features: js.UndefOr[js.Array[String]] = js.native
  /**
    * The canonical name of this endpoint.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The specification of an Internet routable address of API frontend that
    * will handle requests to this [API
    * Endpoint](https://cloud.google.com/apis/design/glossary). It should be
    * either a valid IPv4 address or a fully-qualified domain name. For
    * example, &quot;8.8.8.8&quot; or &quot;myservice.appspot.com&quot;.
    */
  var target: js.UndefOr[String] = js.native
}

object SchemaEndpoint {
  @scala.inline
  def apply(
    aliases: js.Array[String] = null,
    allowCors: js.UndefOr[Boolean] = js.undefined,
    features: js.Array[String] = null,
    name: String = null,
    target: String = null
  ): SchemaEndpoint = {
    val __obj = js.Dynamic.literal()
    if (aliases != null) __obj.updateDynamic("aliases")(aliases.asInstanceOf[js.Any])
    if (!js.isUndefined(allowCors)) __obj.updateDynamic("allowCors")(allowCors.asInstanceOf[js.Any])
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEndpoint]
  }
}

