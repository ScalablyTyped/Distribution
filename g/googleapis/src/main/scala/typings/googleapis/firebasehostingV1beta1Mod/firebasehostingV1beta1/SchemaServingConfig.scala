package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The configuration for how incoming requests to a site should be routed and
  * processed before serving content. The patterns are matched and applied
  * according to a specific [priority
  * order](/docs/hosting/full-config#hosting_priority_order).
  */
@js.native
trait SchemaServingConfig extends StObject {
  
  /**
    * How to handle well known App Association files.
    */
  var appAssociation: js.UndefOr[String] = js.native
  
  /**
    * Defines whether to drop the file extension from uploaded files.
    */
  var cleanUrls: js.UndefOr[Boolean] = js.native
  
  /**
    * A list of custom response headers that are added to the content if the
    * request URL path matches the glob.
    */
  var headers: js.UndefOr[js.Array[SchemaHeader]] = js.native
  
  /**
    * A list of globs that will cause the response to redirect to another
    * location.
    */
  var redirects: js.UndefOr[js.Array[SchemaRedirect]] = js.native
  
  /**
    * A list of rewrites that will act as if the service were given the
    * destination URL.
    */
  var rewrites: js.UndefOr[js.Array[SchemaRewrite]] = js.native
  
  /**
    * Defines how to handle a trailing slash in the URL path.
    */
  var trailingSlashBehavior: js.UndefOr[String] = js.native
}
object SchemaServingConfig {
  
  @scala.inline
  def apply(): SchemaServingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServingConfig]
  }
  
  @scala.inline
  implicit class SchemaServingConfigMutableBuilder[Self <: SchemaServingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppAssociation(value: String): Self = StObject.set(x, "appAssociation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppAssociationUndefined: Self = StObject.set(x, "appAssociation", js.undefined)
    
    @scala.inline
    def setCleanUrls(value: Boolean): Self = StObject.set(x, "cleanUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCleanUrlsUndefined: Self = StObject.set(x, "cleanUrls", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Array[SchemaHeader]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setHeadersVarargs(value: SchemaHeader*): Self = StObject.set(x, "headers", js.Array(value :_*))
    
    @scala.inline
    def setRedirects(value: js.Array[SchemaRedirect]): Self = StObject.set(x, "redirects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectsUndefined: Self = StObject.set(x, "redirects", js.undefined)
    
    @scala.inline
    def setRedirectsVarargs(value: SchemaRedirect*): Self = StObject.set(x, "redirects", js.Array(value :_*))
    
    @scala.inline
    def setRewrites(value: js.Array[SchemaRewrite]): Self = StObject.set(x, "rewrites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRewritesUndefined: Self = StObject.set(x, "rewrites", js.undefined)
    
    @scala.inline
    def setRewritesVarargs(value: SchemaRewrite*): Self = StObject.set(x, "rewrites", js.Array(value :_*))
    
    @scala.inline
    def setTrailingSlashBehavior(value: String): Self = StObject.set(x, "trailingSlashBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrailingSlashBehaviorUndefined: Self = StObject.set(x, "trailingSlashBehavior", js.undefined)
  }
}
