package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaServingConfig extends StObject {
  
  /**
    * How to handle well known App Association files.
    */
  var appAssociation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Defines whether to drop the file extension from uploaded files.
    */
  var cleanUrls: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * An array of objects, where each object specifies a URL pattern that, if matched to the request URL path, triggers Hosting to apply the specified custom response headers.
    */
  var headers: js.UndefOr[js.Array[SchemaHeader]] = js.undefined
  
  /**
    * Optional. Defines i18n rewrite behavior.
    */
  var i18n: js.UndefOr[SchemaI18nConfig] = js.undefined
  
  /**
    * An array of objects (called redirect rules), where each rule specifies a URL pattern that, if matched to the request URL path, triggers Hosting to respond with a redirect to the specified destination path.
    */
  var redirects: js.UndefOr[js.Array[SchemaRedirect]] = js.undefined
  
  /**
    * An array of objects (called rewrite rules), where each rule specifies a URL pattern that, if matched to the request URL path, triggers Hosting to respond as if the service were given the specified destination URL.
    */
  var rewrites: js.UndefOr[js.Array[SchemaRewrite]] = js.undefined
  
  /**
    * Defines how to handle a trailing slash in the URL path.
    */
  var trailingSlashBehavior: js.UndefOr[String | Null] = js.undefined
}
object SchemaServingConfig {
  
  inline def apply(): SchemaServingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServingConfig]
  }
  
  extension [Self <: SchemaServingConfig](x: Self) {
    
    inline def setAppAssociation(value: String): Self = StObject.set(x, "appAssociation", value.asInstanceOf[js.Any])
    
    inline def setAppAssociationNull: Self = StObject.set(x, "appAssociation", null)
    
    inline def setAppAssociationUndefined: Self = StObject.set(x, "appAssociation", js.undefined)
    
    inline def setCleanUrls(value: Boolean): Self = StObject.set(x, "cleanUrls", value.asInstanceOf[js.Any])
    
    inline def setCleanUrlsNull: Self = StObject.set(x, "cleanUrls", null)
    
    inline def setCleanUrlsUndefined: Self = StObject.set(x, "cleanUrls", js.undefined)
    
    inline def setHeaders(value: js.Array[SchemaHeader]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHeadersVarargs(value: SchemaHeader*): Self = StObject.set(x, "headers", js.Array(value*))
    
    inline def setI18n(value: SchemaI18nConfig): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
    
    inline def setI18nUndefined: Self = StObject.set(x, "i18n", js.undefined)
    
    inline def setRedirects(value: js.Array[SchemaRedirect]): Self = StObject.set(x, "redirects", value.asInstanceOf[js.Any])
    
    inline def setRedirectsUndefined: Self = StObject.set(x, "redirects", js.undefined)
    
    inline def setRedirectsVarargs(value: SchemaRedirect*): Self = StObject.set(x, "redirects", js.Array(value*))
    
    inline def setRewrites(value: js.Array[SchemaRewrite]): Self = StObject.set(x, "rewrites", value.asInstanceOf[js.Any])
    
    inline def setRewritesUndefined: Self = StObject.set(x, "rewrites", js.undefined)
    
    inline def setRewritesVarargs(value: SchemaRewrite*): Self = StObject.set(x, "rewrites", js.Array(value*))
    
    inline def setTrailingSlashBehavior(value: String): Self = StObject.set(x, "trailingSlashBehavior", value.asInstanceOf[js.Any])
    
    inline def setTrailingSlashBehaviorNull: Self = StObject.set(x, "trailingSlashBehavior", null)
    
    inline def setTrailingSlashBehaviorUndefined: Self = StObject.set(x, "trailingSlashBehavior", js.undefined)
  }
}
