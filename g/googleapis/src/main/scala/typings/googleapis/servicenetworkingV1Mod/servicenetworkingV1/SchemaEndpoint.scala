package typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait SchemaEndpoint extends StObject {
  
  /**
    * DEPRECATED: This field is no longer supported. Instead of using aliases,
    * please specify multiple google.api.Endpoint for each of the intended
    * aliases.  Additional names that this endpoint will be hosted on.
    */
  var aliases: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Allowing
    * [CORS](https://en.wikipedia.org/wiki/Cross-origin_resource_sharing), aka
    * cross-domain traffic, would allow the backends served from this endpoint
    * to receive and respond to HTTP OPTIONS requests. The response will be
    * used by the browser to determine whether the subsequent cross-origin
    * request is allowed to proceed.
    */
  var allowCors: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The list of features enabled on this endpoint.
    */
  var features: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The canonical name of this endpoint.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The specification of an Internet routable address of API frontend that
    * will handle requests to this [API
    * Endpoint](https://cloud.google.com/apis/design/glossary). It should be
    * either a valid IPv4 address or a fully-qualified domain name. For
    * example, &quot;8.8.8.8&quot; or &quot;myservice.appspot.com&quot;.
    */
  var target: js.UndefOr[String] = js.undefined
}
object SchemaEndpoint {
  
  @scala.inline
  def apply(): SchemaEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEndpoint]
  }
  
  @scala.inline
  implicit class SchemaEndpointMutableBuilder[Self <: SchemaEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    @scala.inline
    def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value :_*))
    
    @scala.inline
    def setAllowCors(value: Boolean): Self = StObject.set(x, "allowCors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowCorsUndefined: Self = StObject.set(x, "allowCors", js.undefined)
    
    @scala.inline
    def setFeatures(value: js.Array[String]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    @scala.inline
    def setFeaturesVarargs(value: String*): Self = StObject.set(x, "features", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
