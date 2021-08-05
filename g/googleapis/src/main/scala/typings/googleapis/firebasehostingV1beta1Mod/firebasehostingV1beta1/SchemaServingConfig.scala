package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The configuration for how incoming requests to a site should be routed and
  * processed before serving content. The patterns are matched and applied
  * according to a specific [priority
  * order](/docs/hosting/full-config#hosting_priority_order).
  */
trait SchemaServingConfig extends StObject {
  
  /**
    * How to handle well known App Association files.
    */
  var appAssociation: js.UndefOr[String] = js.undefined
  
  /**
    * Defines whether to drop the file extension from uploaded files.
    */
  var cleanUrls: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of custom response headers that are added to the content if the
    * request URL path matches the glob.
    */
  var headers: js.UndefOr[js.Array[SchemaHeader]] = js.undefined
  
  /**
    * A list of globs that will cause the response to redirect to another
    * location.
    */
  var redirects: js.UndefOr[js.Array[SchemaRedirect]] = js.undefined
  
  /**
    * A list of rewrites that will act as if the service were given the
    * destination URL.
    */
  var rewrites: js.UndefOr[js.Array[SchemaRewrite]] = js.undefined
  
  /**
    * Defines how to handle a trailing slash in the URL path.
    */
  var trailingSlashBehavior: js.UndefOr[String] = js.undefined
}
object SchemaServingConfig {
  
  inline def apply(): SchemaServingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServingConfig]
  }
  
  extension [Self <: SchemaServingConfig](x: Self) {
    
    inline def setAppAssociation(value: String): Self = StObject.set(x, "appAssociation", value.asInstanceOf[js.Any])
    
    inline def setAppAssociationUndefined: Self = StObject.set(x, "appAssociation", js.undefined)
    
    inline def setCleanUrls(value: Boolean): Self = StObject.set(x, "cleanUrls", value.asInstanceOf[js.Any])
    
    inline def setCleanUrlsUndefined: Self = StObject.set(x, "cleanUrls", js.undefined)
    
    inline def setHeaders(value: js.Array[SchemaHeader]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHeadersVarargs(value: SchemaHeader*): Self = StObject.set(x, "headers", js.Array(value :_*))
    
    inline def setRedirects(value: js.Array[SchemaRedirect]): Self = StObject.set(x, "redirects", value.asInstanceOf[js.Any])
    
    inline def setRedirectsUndefined: Self = StObject.set(x, "redirects", js.undefined)
    
    inline def setRedirectsVarargs(value: SchemaRedirect*): Self = StObject.set(x, "redirects", js.Array(value :_*))
    
    inline def setRewrites(value: js.Array[SchemaRewrite]): Self = StObject.set(x, "rewrites", value.asInstanceOf[js.Any])
    
    inline def setRewritesUndefined: Self = StObject.set(x, "rewrites", js.undefined)
    
    inline def setRewritesVarargs(value: SchemaRewrite*): Self = StObject.set(x, "rewrites", js.Array(value :_*))
    
    inline def setTrailingSlashBehavior(value: String): Self = StObject.set(x, "trailingSlashBehavior", value.asInstanceOf[js.Any])
    
    inline def setTrailingSlashBehaviorUndefined: Self = StObject.set(x, "trailingSlashBehavior", js.undefined)
  }
}
