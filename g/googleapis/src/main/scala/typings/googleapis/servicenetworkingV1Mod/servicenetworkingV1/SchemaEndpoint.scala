package typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
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
  def apply(): SchemaEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEndpoint]
  }
  
  @scala.inline
  implicit class SchemaEndpointOps[Self <: SchemaEndpoint] (val x: Self) extends AnyVal {
    
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
    def setAliasesVarargs(value: String*): Self = this.set("aliases", js.Array(value :_*))
    
    @scala.inline
    def setAliases(value: js.Array[String]): Self = this.set("aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAliases: Self = this.set("aliases", js.undefined)
    
    @scala.inline
    def setAllowCors(value: Boolean): Self = this.set("allowCors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowCors: Self = this.set("allowCors", js.undefined)
    
    @scala.inline
    def setFeaturesVarargs(value: String*): Self = this.set("features", js.Array(value :_*))
    
    @scala.inline
    def setFeatures(value: js.Array[String]): Self = this.set("features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatures: Self = this.set("features", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
}
