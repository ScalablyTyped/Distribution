package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotTiledwebmapProviderOptions extends StObject {
  
  /**
    * (Highmaps) API key for providers that require using one.
    */
  var apiKey: js.UndefOr[String] = js.undefined
  
  /**
    * (Highmaps) Subdomain required by each provider. Check the providers
    * documentation for available subdomains.
    */
  var subdomain: js.UndefOr[String] = js.undefined
  
  /**
    * (Highmaps) Set a tiles theme. Check the providers documentation for
    * official list of available themes.
    */
  var theme: js.UndefOr[String] = js.undefined
  
  /**
    * (Highmaps) Provider type to pull data (tiles) from.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * (Highmaps) Custom URL for providers not specified in providers type.
    * Available variables to use in URL are: `{x}`, `{y}`, `{z}` or `{zoom}`.
    * Remember to always specify a projection, when using a custom URL.
    */
  var url: js.UndefOr[String] = js.undefined
}
object PlotTiledwebmapProviderOptions {
  
  inline def apply(): PlotTiledwebmapProviderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotTiledwebmapProviderOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotTiledwebmapProviderOptions] (val x: Self) extends AnyVal {
    
    inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    
    inline def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
    
    inline def setSubdomain(value: String): Self = StObject.set(x, "subdomain", value.asInstanceOf[js.Any])
    
    inline def setSubdomainUndefined: Self = StObject.set(x, "subdomain", js.undefined)
    
    inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
